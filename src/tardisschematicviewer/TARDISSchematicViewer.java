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
    private float z = -15.0f;     // z-location
    private static final int FRAME_WIDTH = 1024;
    private static final int FRAME_HEIGHT = 768;
    private int mouseX = FRAME_WIDTH / 2;
    private int mouseY = FRAME_HEIGHT / 2;
    private static final int CAMERA_ROTATE_STEP_DEGREES = 5;
    private int hei, wid, len, max;
    private JSONArray arr;
    private static final float ZERO_F = 0.0f;
    private static final float ONE_F = 1.0f;
    private static final float CUBIE_TRANSLATION_FACTOR = 0.5f;
    private float[] columnAnglesX;
    private float[] rowAnglesY;
    private float[] faceAnglesZ;
    private final List<Material> notThese = Arrays.asList(Material.AIR, Material.SPONGE, Material.PISTON_EXTENSION);
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
            TARDISSchematicViewer m = new TARDISSchematicViewer();
            JPanel ui = new UserInterface(m);
            ui.setSize(1024, 85);
            ui.setVisible(true);
            frame.getContentPane().add(ui, BorderLayout.PAGE_START);
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
                    new Thread() {
                        @Override
                        public void run() {
                            if (animator.isStarted()) {
                                animator.stop();
                            }
                            frame.dispose();
                            System.exit(0);
                        }
                    }.start();
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
        float[] lightAmbientValue = {0.5f, 0.5f, 0.5f, 1.0f};
        // Diffuse light comes from a particular location. Diffuse's value in RGBA
        float[] lightDiffuseValue = {1.0f, 1.0f, 1.0f, 1.0f};
        // Diffuse light location xyz (in front of the screen).
        float lightDiffusePosition[] = {0.0f, 0.0f, 2.0f, 1.0f};

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

                        Material m = Material.valueOf((String) col.get("type"));
                        byte d = col.getByte("data");
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
                            Color color;
                            if (m.isStained()) {
                                color = Colour.getStainedByByte().get(d);
                            } else if (m.equals(Material.LEAVES)) {
                                color = Colour.getLeavesByByte().get(d);
                            } else if (m.equals(Material.LEAVES_2)) {
                                color = Colour.getLeaves2ByByte().get(d);
                            } else if (m.equals(Material.LOG)) {
                                color = Colour.getLogByByte().get(d);
                            } else if (m.equals(Material.LOG_2)) {
                                color = Colour.getLog2ByByte().get(d);
                            } else if (m.equals(Material.WOOD) || m.equals(Material.WOOD_STEP)) {
                                color = Colour.getWoodByByte().get(d);
                            } else {
                                color = m.getColor();
                            }
                            if (m.isSlab()) {
                                if (d < 8) {
                                    Slab.drawSlab(gl, color, 0.25f, 0);
                                } else {
                                    SlabUpper.drawUpperSlab(gl, color, 0.25f);
                                }
                            } else if (m.isThin()) {
                                Slab.drawSlab(gl, color, 0.25f, 0.2f);
                            } else if (m.isStair()) {
                                Stair.drawStair(gl, color, 0.25f, d);
                            } else if (m.isPlantLike()) {
                                float thickness;
                                float height;
                                switch (m) {
                                    case BROWN_MUSHROOM:
                                    case RED_MUSHROOM:
                                    case CARROT:
                                    case DEAD_BUSH:
                                    case LONG_GRASS:
                                    case NETHER_WARTS:
                                    case POTATO:
                                        thickness = 0.025f;
                                        height = 0.125f;
                                        break;
                                    case CROPS:
                                    case RED_ROSE:
                                    case YELLOW_FLOWER:
                                        thickness = 0.025f;
                                        height = 0.2f;
                                        break;
                                    default:
                                        thickness = 0.0625f;
                                        height = 0.25f;
                                }
                                X.drawX(gl, color, 0.25f, thickness, height);
                            } else if (m.isFence()) {
                                float thickness;
                                float height;
                                switch (m) {
                                    case ACACIA_FENCE:
                                    case ACACIA_FENCE_GATE:
                                    case BIRCH_FENCE:
                                    case BIRCH_FENCE_GATE:
                                    case COBBLE_WALL:
                                    case DARK_OAK_FENCE:
                                    case DARK_OAK_FENCE_GATE:
                                    case FENCE:
                                    case FENCE_GATE:
                                    case IRON_FENCE:
                                    case JUNGLE_FENCE:
                                    case JUNGLE_FENCE_GATE:
                                    case NETHER_FENCE:
                                    case PORTAL:
                                    case SIGN_POST:
                                    case SPRUCE_FENCE:
                                    case SPRUCE_FENCE_GATE:
                                    case STAINED_GLASS_PANE:
                                    case STANDING_BANNER:
                                    case THIN_GLASS:
                                    default:
                                        thickness = 0.0625f;
                                        height = 0.25f;
                                }
                                Fence.drawFence(gl, color, 0.25f, thickness, height, FenceRotation.getByByte().get(d));
                            } else {
                                Cube.drawCube(gl, color, 0.25f);
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
        JSONObject schm = GZip.unzip(path);
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
}
