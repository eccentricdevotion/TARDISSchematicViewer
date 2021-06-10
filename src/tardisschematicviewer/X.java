/*
 * Copyright (C) 2015 eccentric_nz
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
package tardisschematicviewer;

import java.awt.Color;
import javax.media.opengl.GL2;

import static javax.media.opengl.GL2GL3.GL_QUADS;

/**
 * @author eccentric_nz
 */
public class X {

    public static void drawX(GL2 gl, Color c, float size, float thickness, float height) {

        float h = -size + height;
        float[] componenets = c.getColorComponents(null);
        // rotate 45 degrees
        gl.glRotatef(45.0f, 0.0f, 1.0f, 0.0f);

        gl.glBegin(GL_QUADS);

        // Front Face wide
        gl.glColor3f(componenets[0], componenets[1], componenets[2]);
        gl.glNormal3f(0.0f, 0.0f, size);
        gl.glVertex3f(-size, -size, thickness); // bottom-left of the quad
        gl.glVertex3f(size, -size, thickness);  // bottom-right of the quad
        gl.glVertex3f(size, h, thickness);   // top-right of the quad
        gl.glVertex3f(-size, h, thickness);  // top-left of the quad

        // Back Face wide
        gl.glColor3f(componenets[0], componenets[1], componenets[2]);
        gl.glNormal3f(0.0f, 0.0f, -size);
        gl.glVertex3f(-size, -size, -thickness);
        gl.glVertex3f(-size, h, -thickness);
        gl.glVertex3f(size, h, -thickness);
        gl.glVertex3f(size, -size, -thickness);

        // Front Face thin
        gl.glColor3f(componenets[0], componenets[1], componenets[2]);
        gl.glNormal3f(0.0f, 0.0f, size);
        gl.glVertex3f(-thickness, -size, size); // bottom-left of the quad
        gl.glVertex3f(thickness, -size, size);  // bottom-right of the quad
        gl.glVertex3f(thickness, h, size);   // top-right of the quad
        gl.glVertex3f(-thickness, h, size);  // top-left of the quad

        // Back Face thin
        gl.glColor3f(componenets[0], componenets[1], componenets[2]);
        gl.glNormal3f(0.0f, 0.0f, -size);
        gl.glVertex3f(-thickness, -size, -size);
        gl.glVertex3f(-thickness, h, -size);
        gl.glVertex3f(thickness, h, -size);
        gl.glVertex3f(thickness, -size, -size);

        // Top Face LR
        gl.glColor3f(componenets[0], componenets[1], componenets[2]);
        gl.glNormal3f(0.0f, size, 0.0f);
        gl.glVertex3f(-size, h, -thickness);
        gl.glVertex3f(-size, h, thickness);
        gl.glVertex3f(size, h, thickness);
        gl.glVertex3f(size, h, -thickness);

        // Top Face FB
        gl.glColor3f(componenets[0], componenets[1], componenets[2]);
        gl.glNormal3f(0.0f, size, 0.0f);
        gl.glVertex3f(-thickness, h, -size);
        gl.glVertex3f(-thickness, h, size);
        gl.glVertex3f(thickness, h, size);
        gl.glVertex3f(thickness, h, -size);

        // Bottom Face LR
        gl.glColor3f(componenets[0], componenets[1], componenets[2]);
        gl.glNormal3f(0.0f, -size, 0.0f);
        gl.glVertex3f(-size, -size, -thickness);
        gl.glVertex3f(size, -size, -thickness);
        gl.glVertex3f(size, -size, thickness);
        gl.glVertex3f(-size, -size, thickness);

        // Bottom Face FB
        gl.glColor3f(componenets[0], componenets[1], componenets[2]);
        gl.glNormal3f(0.0f, -size, 0.0f);
        gl.glVertex3f(-thickness, -size, -size);
        gl.glVertex3f(thickness, -size, -size);
        gl.glVertex3f(thickness, -size, size);
        gl.glVertex3f(-thickness, -size, size);

        // Right face LR
        gl.glColor3f(componenets[0], componenets[1], componenets[2]);
        gl.glNormal3f(size, 0.0f, 0.0f);
        gl.glVertex3f(size, -size, -thickness);
        gl.glVertex3f(size, h, -thickness);
        gl.glVertex3f(size, h, thickness);
        gl.glVertex3f(size, -size, thickness);

        // Right face FB
        gl.glColor3f(componenets[0], componenets[1], componenets[2]);
        gl.glNormal3f(size, 0.0f, 0.0f);
        gl.glVertex3f(thickness, -size, -size);
        gl.glVertex3f(thickness, h, -size);
        gl.glVertex3f(thickness, h, size);
        gl.glVertex3f(thickness, -size, size);

        // Left Face LR
        gl.glColor3f(componenets[0], componenets[1], componenets[2]);
        gl.glNormal3f(-size, 0.0f, 0.0f);
        gl.glVertex3f(-size, -size, -thickness);
        gl.glVertex3f(-size, -size, thickness);
        gl.glVertex3f(-size, h, thickness);
        gl.glVertex3f(-size, h, -thickness);

        // Left Face FB
        gl.glColor3f(componenets[0], componenets[1], componenets[2]);
        gl.glNormal3f(-size, 0.0f, 0.0f);
        gl.glVertex3f(-thickness, -size, -size);
        gl.glVertex3f(-thickness, -size, size);
        gl.glVertex3f(-thickness, h, size);
        gl.glVertex3f(-thickness, h, -size);

        gl.glEnd();
    }
}
