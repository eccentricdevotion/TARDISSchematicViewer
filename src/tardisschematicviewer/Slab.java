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
 *
 * @author eccentric_nz
 */
public class Slab {

    public static void drawSlab(GL2 gl, Color c, float size, float depth) {

        float[] componenets = c.getColorComponents(null);

        gl.glBegin(GL_QUADS);

        // Front Face
        gl.glColor3f(componenets[0], componenets[1], componenets[2]);
        gl.glNormal3f(0.0f, 0.0f, size);
        gl.glVertex3f(-size, -size, size); // bottom-left of the quad
        gl.glVertex3f(size, -size, size);  // bottom-right of the quad
        gl.glVertex3f(size, -depth, size);   // top-right of the quad
        gl.glVertex3f(-size, -depth, size);  // top-left of the quad

        // Back Face
        gl.glColor3f(componenets[0], componenets[1], componenets[2]);
        gl.glNormal3f(0.0f, 0.0f, -size);
        gl.glVertex3f(-size, -size, -size);
        gl.glVertex3f(-size, -depth, -size);
        gl.glVertex3f(size, -depth, -size);
        gl.glVertex3f(size, -size, -size);

        // Top Face
        gl.glColor3f(componenets[0], componenets[1], componenets[2]);
        gl.glNormal3f(0.0f, size, 0.0f);
        gl.glVertex3f(-size, -depth, -size);
        gl.glVertex3f(-size, -depth, size);
        gl.glVertex3f(size, -depth, size);
        gl.glVertex3f(size, -depth, -size);

        // Bottom Face
        gl.glColor3f(componenets[0], componenets[1], componenets[2]);
        gl.glNormal3f(0.0f, -size, 0.0f);
        gl.glVertex3f(-size, -size, -size);
        gl.glVertex3f(size, -size, -size);
        gl.glVertex3f(size, -size, size);
        gl.glVertex3f(-size, -size, size);

        // Right face
        gl.glColor3f(componenets[0], componenets[1], componenets[2]);
        gl.glNormal3f(size, 0.0f, 0.0f);
        gl.glVertex3f(size, -size, -size);
        gl.glVertex3f(size, -depth, -size);
        gl.glVertex3f(size, -depth, size);
        gl.glVertex3f(size, -size, size);

        // Left Face
        gl.glColor3f(componenets[0], componenets[1], componenets[2]);
        gl.glNormal3f(-size, 0.0f, 0.0f);
        gl.glVertex3f(-size, -size, -size);
        gl.glVertex3f(-size, -size, size);
        gl.glVertex3f(-size, -depth, size);
        gl.glVertex3f(-size, -depth, -size);

        gl.glEnd();
    }
}
