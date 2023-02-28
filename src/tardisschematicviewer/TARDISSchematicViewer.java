/*
 *  Copyright 2015 eccentric_nz.
 */
package tardisschematicviewer;

import com.jogamp.opengl.util.FPSAnimator;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;
import java.util.List;
import javax.media.opengl.GL;
import javax.media.opengl.GL2;
import static javax.media.opengl.GL2ES1.GL_PERSPECTIVE_CORRECTION_HINT;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.GLProfile;
import javax.media.opengl.awt.GLJPanel;
import javax.media.opengl.fixedfunc.GLLightingFunc;
import static javax.media.opengl.fixedfunc.GLLightingFunc.GL_AMBIENT;
import static javax.media.opengl.fixedfunc.GLLightingFunc.GL_COLOR_MATERIAL;
import static javax.media.opengl.fixedfunc.GLLightingFunc.GL_DIFFUSE;
import static javax.media.opengl.fixedfunc.GLLightingFunc.GL_LIGHT1;
import static javax.media.opengl.fixedfunc.GLLightingFunc.GL_LIGHTING;
import static javax.media.opengl.fixedfunc.GLLightingFunc.GL_POSITION;
import javax.media.opengl.fixedfunc.GLMatrixFunc;
import javax.media.opengl.glu.GLU;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author eccentric_nz
 */
public class TARDISSchematicViewer implements GLEventListener, KeyListener, MouseMotionListener {

    private GLU glu;  // for the GL Utility
    private static float angleX = 45.0f; // rotational angle for x-axis in degree
    private static float angleY = 45.0f; // rotational angle for y-axis in degree
    private float z = -60.0f;     // z-location
    private static final int FRAME_WIDTH = 1024;
    private static final int FRAME_HEIGHT = 768;
    private int mouseX = FRAME_WIDTH / 2;
    private int mouseY = FRAME_HEIGHT / 2;
    private static final int CAMERA_ROTATE_STEP_DEGREES = 5;
    private int hei, wid, len, max;
    private JSONObject schm;
    private JSONArray arr;
    private static final float ZERO_F = 0.0f;
    private static final float ONE_F = 1.0f;
    private static final float CUBIE_TRANSLATION_FACTOR = 2.0f;
    private float[] columnAnglesX;
    private float[] rowAnglesY;
    private float[] faceAnglesZ;
    private final List<Material> notThese = Arrays.asList(Material.air, Material.sponge, Material.moving_piston);
    private String path;
    private boolean isPathSet = false;
    private boolean isSchematicParsed = false;
    public static JPanel editor;

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
            TARDISSchematicViewer m = new TARDISSchematicViewer();
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
        gl.glEnable(GL.GL_DEPTH_TEST); // enables depth testing
        gl.glDepthFunc(GL.GL_LEQUAL);  // the type of depth test to do
        gl.glHint(GL_PERSPECTIVE_CORRECTION_HINT, GL.GL_NICEST); // best perspective correction
        gl.glShadeModel(GLLightingFunc.GL_SMOOTH); // blends colors nicely, and smoothes out lighting
        glad.getGL().setSwapInterval(1);
        // Set up the lighting for Light-1
        // Ambient light does not come from a particular direction. Need some ambient
        // light to light up the scene. Ambient's value in RGBA
        float[] lightAmbientValue = {0.1f, 0.1f, 0.1f, 1.0f};
        // Diffuse light comes from a particular location. Diffuse's value in RGBA
        float[] lightDiffuseValue = {0.75f, 0.75f, 0.75f, 1.0f};
        // Diffuse light location xyz (in front of the screen).
        float lightDiffusePosition[] = {8.0f, 0.0f, 8.0f, 1.0f};

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
        render(glad);
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

    private void render(GLAutoDrawable drawable) {

        if (!isSchematicParsed) {
            if (isPathSet) {
                setSchematic(path);
                isSchematicParsed = true;
            }
        } else {
            GL2 gl = drawable.getGL().getGL2();
            gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
            gl.glLoadIdentity();  // reset the model-view matrix
            gl.glTranslatef(0.0f, 0.0f, z);         // translate into the screen
            gl.glRotatef(angleX, 1.0f, 0.0f, 0.0f); // rotate about the x-axis
            gl.glRotatef(angleY, 0.0f, 1.0f, 0.0f); // rotate about the y-axis
            // draw a cube
            int lastIndexX = wid - 1;
            int lastIndexY = hei - 1;
            int lastIndexZ = len - 1;
            for (int h = 0; h < hei; h++) {
                JSONArray level = (JSONArray) arr.get(h);
                for (int w = 0; w < wid; w++) {
                    JSONArray row = (JSONArray) level.get(w);
                    for (int l = 0; l < len; l++) {
                        JSONObject col = (JSONObject) row.get(l);
                        String data = col.getString("data");
                        // "minecraft:cobblestone_stairs[facing=east,half=top,shape=straight,waterlogged=false]"
                        Material m = Material.fromDataString(data);
//                        byte d = col.getByte("data");
                        if (!notThese.contains(m)) {
                            gl.glPushMatrix();

                            gl.glRotatef(columnAnglesX[w], ONE_F, ZERO_F, ZERO_F);
                            gl.glRotatef(rowAnglesY[h], ZERO_F, ONE_F, ZERO_F);
                            gl.glRotatef(faceAnglesZ[l], ZERO_F, ZERO_F, ONE_F);

                            // bottom-left-front corner of cube is (0,0,0) so we need to center it at the origin
                            float tx = (float) lastIndexX / 2.0f;
                            float ty = (float) lastIndexY / 2.0f;
                            float tz = (float) lastIndexZ / 2.0f;
                            gl.glTranslatef((w - tx) * CUBIE_TRANSLATION_FACTOR, (h - ty) * CUBIE_TRANSLATION_FACTOR, -(l - tz) * CUBIE_TRANSLATION_FACTOR);
                            Color color = m.getColor();
                            if (m.isSlab()) {
                                // TODO get whether slab is top half or bottom half
                                if (StairRotation.isTopHalf(data)) {
                                    Slab.drawSlab(gl, color, ONE_F, 0);
                                } else {
                                    SlabUpper.drawUpperSlab(gl, color, ONE_F);
                                }
                            } else if (m.isThin()) {
                                if (m.equals(Material.redstone_wire)) {
                                    Redstone.drawWire(gl, ONE_F);
                                } else {
                                    Slab.drawSlab(gl, color, ONE_F, 0.8f);
                                }
                            } else if (m.isStair()) {
                                Stair.drawStair(gl, color, ONE_F, data);
                            } else if (m.isPlantLike()) {
                                float thickness;
                                float height;
                                switch (m) {
                                    case brown_mushroom:
                                    case red_mushroom:
                                    case carrots:
                                    case dead_bush:
                                    case tall_grass:
                                    case nether_wart:
                                    case potatoes:
                                        thickness = 0.125f;
                                        height = 0.5f;
                                        break;
                                    case wheat:
                                    case poppy:
                                    case dandelion:
                                        thickness = 0.125f;
                                        height = 0.8f;
                                        break;
                                    default:
                                        thickness = 0.25f;
                                        height = ONE_F;
                                }
                                X.drawX(gl, color, ONE_F, thickness, height);
                            } else if (m.isFence()) {
                                float thickness;
                                float height;
                                switch (m) {
                                    case acacia_fence:
                                    case birch_fence:
                                    case cobblestone_wall:
                                    case dark_oak_fence:
                                    case oak_fence:
                                    case iron_bars:
                                    case jungle_fence:
                                    case nether_brick_fence:
                                    case spruce_fence:
                                        thickness = 0.25f;
                                        height = 1.9f;
                                        break;
                                    case acacia_fence_gate:
                                    case birch_fence_gate:
                                    case dark_oak_fence_gate:
                                    case oak_fence_gate:
                                    case jungle_fence_gate:
                                    case spruce_fence_gate:
                                        thickness = 0.25f;
                                        height = 1.7f;
                                        break;
                                    case nether_portal:
                                    case oak_sign:
                                    case white_stained_glass_pane:
                                    case green_banner:
                                    case glass_pane:
                                        thickness = 0.125f;
                                        height = 2.0f;
                                        break;
                                    default:
                                        thickness = 0.25f;
                                        height = ONE_F;
                                }
                                Fence.drawFence(gl, color, ONE_F, thickness, height, FenceRotation.getRotationFromData(data), m.isGlass());
                            } else {
                                Cube.drawCube(gl, color, ONE_F, m.isGlass());
                            }
                            gl.glPopMatrix();
                        }
                    }
                }
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_UP:
                z++;
                break;
            case KeyEvent.VK_DOWN:
                z--;
                break;
            case KeyEvent.VK_LEFT:
                hei--;
                if (hei < 0) {
                    hei = 0;
                }
                break;
            case KeyEvent.VK_RIGHT:
                hei++;
                if (hei > max) {
                    hei = max;
                }
                break;
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

    public int getHei() {
        return hei;
    }

    public void setHei(int hei) {
        this.hei = hei;
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

    private void setSchematic(String path) {
        // Use URL so that can read from JAR and disk file.
        // Filename relative to the project root.
        schm = GZip.unzip(path);
        // get dimensions
        JSONObject d = (JSONObject) schm.get("dimensions");
        hei = d.getInt("height");
        max = hei;
        wid = d.getInt("width");
        len = d.getInt("length");
        columnAnglesX = new float[wid];
        rowAnglesY = new float[hei];
        faceAnglesZ = new float[len];
        arr = (JSONArray) schm.get("input");
    }

    public JSONObject getSchm() {
        return schm;
    }
}
