/*
 * Copyright (C) 2021 eccentric_nz
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package me.eccentric_nz.tardisschematicviewer;

import com.jogamp.opengl.*;
import com.jogamp.opengl.awt.GLJPanel;
import com.jogamp.opengl.fixedfunc.GLLightingFunc;
import com.jogamp.opengl.fixedfunc.GLMatrixFunc;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.util.FPSAnimator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.List;

import static com.jogamp.opengl.GL.*;
import static com.jogamp.opengl.GL2ES1.GL_PERSPECTIVE_CORRECTION_HINT;
import static com.jogamp.opengl.fixedfunc.GLLightingFunc.*;

/**
 * @author eccentric_nz
 */
public class TardisSchematicViewer implements GLEventListener, KeyListener, MouseMotionListener {

    private static final int FRAME_WIDTH = 1024;
    private static final int FRAME_HEIGHT = 768;
    private static final int CAMERA_ROTATE_STEP_DEGREES = 5;
    private static final float ZERO_F = 0.0f;
    private static final float ONE_F = 1.0f;
    private static final float CUBIE_TRANSLATION_FACTOR = 2.0f;
    public static JPanel editor;
    private static float angleX = 45.0f; // rotational angle for x-axis in degree
    private static float angleY = 45.0f; // rotational angle for y-axis in degree
    private final List<Material> notThese = Arrays.asList(Material.AIR, Material.SPONGE, Material.PISTON_EXTENSION);
    private GLU glu;  // for the GL Utility
    private float z = -60.0f;     // z-location
    private int mouseX = FRAME_WIDTH / 2;
    private int mouseY = FRAME_HEIGHT / 2;
    private int height, width, length, max;
    private JsonObject schematic;
    private JsonArray array;
    private float[] columnAnglesX;
    private float[] rowAnglesY;
    private float[] faceAnglesZ;
    private String path;
    private boolean isPathSet = false;
    private boolean isSchematicParsed = false;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GLProfile glp = GLProfile.getDefault();
            GLCapabilities caps = new GLCapabilities(glp);
            GLJPanel canvas = new GLJPanel(caps);
            canvas.setBackground(Color.gray);
            JFrame frame = new JFrame();
            TardisSchematicViewer m = new TardisSchematicViewer();
            JPanel ui = new UserInterface(m);
            ui.setSize(1024, 85);
            ui.setVisible(true);
            editor = new Editor(m);
            editor.setSize(1024, 666);
            editor.setVisible(false);
            frame.getContentPane().add(ui, BorderLayout.PAGE_START);
            frame.getContentPane().add(editor, BorderLayout.SOUTH);
            frame.setTitle("TARDIS Schematic Viewer");
            frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
            frame.getContentPane().add(canvas, BorderLayout.CENTER);
            frame.setVisible(true);
            FPSAnimator animator = new FPSAnimator(canvas, 30, true);

            // by default, an AWT Frame doesn't do anything when you click
            // the close button; this bit of code will terminate the program when
            // the window is asked to close
            frame.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {

                    // Use a dedicate thread to run the stop() to ensure that the
                    // animator stops before program exits.
                    new Thread(() -> {
                        if (animator.isStarted()) {
                            animator.stop();
                        }
                        frame.dispose();
                        System.exit(0);
                    }).start();
                }
            });
            canvas.addGLEventListener(m);
            // For handling KeyEvents
            canvas.addKeyListener(m);
            canvas.addMouseMotionListener(m);
            canvas.setFocusable(true);
            canvas.requestFocus();
            canvas.setVisible(true);
            animator.start();
        });
    }

    @Override
    public void init(GLAutoDrawable glad) {
        GL2 gl = glad.getGL().getGL2();      // get the OpenGL graphics context
        glu = new GLU();                         // get GL Utilities
        gl.glClearColor(0.8f, 0.8f, 0.8f, 0.0f); // set background (grey) color
        gl.glClearDepth(1.0f);      // set clear depth value to farthest
        gl.glEnable(GL_DEPTH_TEST); // enables depth testing
        gl.glDepthFunc(GL_LEQUAL);  // the type of depth test to do
        gl.glHint(GL_PERSPECTIVE_CORRECTION_HINT, GL_NICEST); // best perspective correction
        gl.glShadeModel(GLLightingFunc.GL_SMOOTH); // blends colors nicely, and smoothes out lighting
        glad.getGL().setSwapInterval(1);
        // Set up the lighting for Light-1
        // Ambient light does not come from a particular direction. Need some ambient
        // light to light up the scene. Ambient's value in RGBA
        float[] lightAmbientValue = {0.1f, 0.1f, 0.1f, 1.0f};
        // Diffuse light comes from a particular location. Diffuse's value in RGBA
        float[] lightDiffuseValue = {0.75f, 0.75f, 0.75f, 1.0f};
        // Diffuse light location xyz (in front of the screen).
        float[] lightDiffusePosition = {8.0f, 0.0f, 8.0f, 1.0f};

        gl.glLightfv(GL_LIGHT1, GL_AMBIENT, lightAmbientValue, 0);
        gl.glLightfv(GL_LIGHT1, GL_DIFFUSE, lightDiffuseValue, 0);
        gl.glLightfv(GL_LIGHT1, GL_POSITION, lightDiffusePosition, 0);
        gl.glEnable(GL_LIGHTING); // enable lighting
        gl.glEnable(GL_LIGHT1);    // Enable Light-1
        gl.glEnable(GL_COLOR_MATERIAL); // allow color on faces
    }

    @Override
    public void dispose(GLAutoDrawable glad) {
    }

    @Override
    public void display(GLAutoDrawable glad) {
        if (!isSchematicParsed) {
            if (isPathSet) {
                setSchematic(path);
                isSchematicParsed = true;
            }
        } else {
            GL2 gl = glad.getGL().getGL2();
            gl.glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
            gl.glLoadIdentity();  // reset the model-view matrix
            gl.glTranslatef(0.0f, 0.0f, z);         // translate into the screen
            gl.glRotatef(angleX, 1.0f, 0.0f, 0.0f); // rotate about the x-axis
            gl.glRotatef(angleY, 0.0f, 1.0f, 0.0f); // rotate about the y-axis
            // draw a cube
            int lastIndexX = width - 1;
            int lastIndexY = height - 1;
            int lastIndexZ = length - 1;
            for (int h = 0; h < height; h++) {
                JsonArray level = (JsonArray) array.get(h);
                for (int w = 0; w < width; w++) {
                    JsonArray row = (JsonArray) level.get(w);
                    for (int l = 0; l < length; l++) {
                        JsonObject col = (JsonObject) row.get(l);

                        Material material = Material.valueOf((String) col.get("type"));
                        byte data = col.getByte("data");
                        if (!notThese.contains(material)) {
                            gl.glPushMatrix();

                            gl.glRotatef(columnAnglesX[w], ONE_F, ZERO_F, ZERO_F);
                            gl.glRotatef(rowAnglesY[h], ZERO_F, ONE_F, ZERO_F);
                            gl.glRotatef(faceAnglesZ[l], ZERO_F, ZERO_F, ONE_F);

                            // bottom-left-front corner of cube is (0,0,0) so we need to center it at the origin
                            float tx = (float) lastIndexX / 2.0f;
                            float ty = (float) lastIndexY / 2.0f;
                            float tz = (float) lastIndexZ / 2.0f;
                            gl.glTranslatef((w - tx) * CUBIE_TRANSLATION_FACTOR, (h - ty) * CUBIE_TRANSLATION_FACTOR, -(l - tz) * CUBIE_TRANSLATION_FACTOR);
                            Color color;
                            if (material.isStained()) {
                                color = BlockColor.getStained().get(data);
                            } else if (material.equals(Material.LEAVES)) {
                                color = BlockColor.getLeaves().get(data);
                            } else if (material.equals(Material.LEAVES_2)) {
                                color = BlockColor.getLeaves2().get(data);
                            } else if (material.equals(Material.LOG)) {
                                color = BlockColor.getLog().get(data);
                            } else if (material.equals(Material.LOG_2)) {
                                color = BlockColor.getLog2().get(data);
                            } else if (material.equals(Material.WOOD) || material.equals(Material.WOOD_STEP)) {
                                color = BlockColor.getWood().get(data);
                            } else if (material.equals(Material.PRISMARINE)) {
                                color = BlockColor.getPrismarine().get(data);
                            } else if (material.equals(Material.STEP)) {
                                color = BlockColor.getSlab().get(data);
                            } else {
                                color = material.getColor();
                            }
                            if (material.isSlab()) {
                                if (data < 8) {
                                    Slab.drawSlab(gl, color, ONE_F, 0);
                                } else {
                                    SlabUpper.drawUpperSlab(gl, color, ONE_F);
                                }
                            } else if (material.isThin()) {
                                if (material.equals(Material.REDSTONE_WIRE)) {
                                    Redstone.drawWire(gl, ONE_F);
                                } else {
                                    Slab.drawSlab(gl, color, ONE_F, 0.8f);
                                }
                            } else if (material.isStair()) {
                                Stair.drawStair(gl, color, ONE_F, data);
                            } else if (material.isPlantLike()) {
                                float thickness;
                                float height;
                                switch (material) {
                                    case BROWN_MUSHROOM, RED_MUSHROOM, CARROT, DEAD_BUSH, LONG_GRASS, NETHER_WARTS, POTATO -> {
                                        thickness = 0.125f;
                                        height = 0.5f;
                                    }
                                    case CROPS, RED_ROSE, YELLOW_FLOWER -> {
                                        thickness = 0.125f;
                                        height = 0.8f;
                                    }
                                    default -> {
                                        thickness = 0.25f;
                                        height = ONE_F;
                                    }
                                }
                                X.drawX(gl, color, ONE_F, thickness, height);
                            } else if (material.isFence()) {
                                float thickness;
                                float height;
                                switch (material) {
                                    case ACACIA_FENCE, BIRCH_FENCE, COBBLE_WALL, DARK_OAK_FENCE, FENCE, IRON_FENCE, JUNGLE_FENCE, NETHER_FENCE, SPRUCE_FENCE -> {
                                        thickness = 0.25f;
                                        height = 1.9f;
                                    }
                                    case ACACIA_FENCE_GATE, BIRCH_FENCE_GATE, DARK_OAK_FENCE_GATE, FENCE_GATE, JUNGLE_FENCE_GATE, SPRUCE_FENCE_GATE -> {
                                        thickness = 0.25f;
                                        height = 1.7f;
                                    }
                                    case PORTAL, SIGN_POST, STAINED_GLASS_PANE, STANDING_BANNER, THIN_GLASS -> {
                                        thickness = 0.125f;
                                        height = 2.0f;
                                    }
                                    default -> {
                                        thickness = 0.25f;
                                        height = ONE_F;
                                    }
                                }
                                Fence.drawFence(gl, color, ONE_F, thickness, height, FenceRotation.getByByte().get(data), material.isGlass());
                            } else {
                                Cube.drawCube(gl, color, ONE_F, material.isGlass());
                            }
                            gl.glPopMatrix();
                        }
                    }
                }
            }
        }
    }

    @Override
    public void reshape(GLAutoDrawable glad, int x, int z, int width, int height) {
        GL2 gl = glad.getGL().getGL2();  // get the OpenGL 2 graphics context
        if (height == 0) {
            height = 1;   // prevent divide by zero
        }
        float aspect = (float) width / height;
        // Set the view port (display area) to cover the entire window
        gl.glViewport(0, 0, width, height);
        // Setup perspective projection, with aspect ratio matches viewport
        gl.glMatrixMode(GLMatrixFunc.GL_PROJECTION);  // choose projection matrix
        gl.glLoadIdentity();             // reset projection matrix
        glu.gluPerspective(45.0, aspect, 0.1, 100.0); // fovy, aspect, zNear, zFar
        // Enable the model-view transform
        gl.glMatrixMode(GLMatrixFunc.GL_MODELVIEW);
        gl.glLoadIdentity(); // reset
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_UP -> z++;
            case KeyEvent.VK_DOWN -> z--;
            case KeyEvent.VK_LEFT -> {
                height--;
                if (height < 0) {
                    height = 0;
                }
            }
            case KeyEvent.VK_RIGHT -> {
                height++;
                if (height > max) {
                    height = max;
                }
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // change the camera angle
        final int buffer = 2;
        if (e.getX() < mouseX - buffer) {
            angleY -= CAMERA_ROTATE_STEP_DEGREES;
        } else if (e.getX() > mouseX + buffer) {
            angleY += CAMERA_ROTATE_STEP_DEGREES;
        }
        if (e.getY() < mouseY - buffer) {
            angleX -= CAMERA_ROTATE_STEP_DEGREES;
        } else if (e.getY() > mouseY + buffer) {
            angleX += CAMERA_ROTATE_STEP_DEGREES;
        }
        mouseX = e.getX();
        mouseY = e.getY();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getMax() {
        return max;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
        this.isSchematicParsed = false;
        this.isPathSet = true;
    }

    public JsonObject getSchematic() {
        return schematic;
    }

    private void setSchematic(String path) {
        // Use URL so that can read from JAR and disk file.
        // Filename relative to the project root.
        schematic = GZip.unzip(path);
        // get dimensions
        JsonObject d = (JsonObject) schematic.get("dimensions");
        height = d.getInt("height");
        max = height;
        width = d.getInt("width");
        length = d.getInt("length");
        columnAnglesX = new float[width];
        rowAnglesY = new float[height];
        faceAnglesZ = new float[length];
        array = (JsonArray) schematic.get("input");
    }
}
