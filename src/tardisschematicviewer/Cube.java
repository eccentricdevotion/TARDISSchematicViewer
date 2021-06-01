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

import static javax.media.opengl.GL.GL_LINES;

import javax.media.opengl.GL2;

import static javax.media.opengl.GL2GL3.GL_QUADS;

/**
 * @author eccentric_nz
 */
public class Cube {

	public static void drawCube(GL2 gl, Color c, float size, boolean glass) {

		float[] componenets = c.getColorComponents(null);

		if (glass) {
			gl.glLineWidth(size * 2);
			gl.glBegin(GL_LINES);
		} else {
			gl.glBegin(GL_QUADS);
		}

		// Front Face
		gl.glColor3f(componenets[0], componenets[1], componenets[2]);
		gl.glNormal3f(0.0f, 0.0f, size);
		gl.glVertex3f(-size, -size, size); // bottom-left of the quad
		gl.glVertex3f(size, -size, size);  // bottom-right of the quad
		gl.glVertex3f(size, size, size);   // top-right of the quad
		gl.glVertex3f(-size, size, size);  // top-left of the quad

		// Back Face
		gl.glColor3f(componenets[0], componenets[1], componenets[2]);
		gl.glNormal3f(0.0f, 0.0f, -size);
		gl.glVertex3f(-size, -size, -size);
		gl.glVertex3f(-size, size, -size);
		gl.glVertex3f(size, size, -size);
		gl.glVertex3f(size, -size, -size);

		// Top Face
		gl.glColor3f(componenets[0], componenets[1], componenets[2]);
		gl.glNormal3f(0.0f, size, 0.0f);
		gl.glVertex3f(-size, size, -size);
		gl.glVertex3f(-size, size, size);
		gl.glVertex3f(size, size, size);
		gl.glVertex3f(size, size, -size);

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
		gl.glVertex3f(size, size, -size);
		gl.glVertex3f(size, size, size);
		gl.glVertex3f(size, -size, size);

		// Left Face
		gl.glColor3f(componenets[0], componenets[1], componenets[2]);
		gl.glNormal3f(-size, 0.0f, 0.0f);
		gl.glVertex3f(-size, -size, -size);
		gl.glVertex3f(-size, -size, size);
		gl.glVertex3f(-size, size, size);
		gl.glVertex3f(-size, size, -size);

		gl.glEnd();
	}
}
