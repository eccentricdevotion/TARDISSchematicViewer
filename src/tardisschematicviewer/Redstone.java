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

import java.util.ArrayList;
import java.util.List;
import javax.media.opengl.GL2;
import static javax.media.opengl.GL2GL3.GL_QUADS;

/**
 *
 * @author eccentric_nz
 */
public class Redstone {

    static List<Float[]> translations;

    static {
        Redstone.translations = new ArrayList<>();
        Redstone.translations.add(new Float[]{0.0f, 0.0f, 0.0f});
        Redstone.translations.add(new Float[]{0.0f, 0.0f, -0.75f});
        Redstone.translations.add(new Float[]{0.75f, 0.0f, 0.75f});
        Redstone.translations.add(new Float[]{-0.75f, 0.0f, 0.75f});
        Redstone.translations.add(new Float[]{-0.75f, 0.0f, -0.75f});
    }

    public static void drawWire(GL2 gl, float size) {

        float quarter = size / 4;
        float height = -size + quarter / 2;

        gl.glPushMatrix();

        for (Float[] t : translations) {

            gl.glTranslatef(t[0], t[1], t[2]);

            gl.glBegin(GL_QUADS);

            // Front Face
            gl.glColor3f(0.8f, 0.07f, 0.11f);
            gl.glNormal3f(0.0f, 0.0f, size);
            gl.glVertex3f(-quarter, -size, quarter); // bottom-left of the quad
            gl.glVertex3f(quarter, -size, quarter);  // bottom-right of the quad
            gl.glVertex3f(quarter, height, quarter);   // top-right of the quad
            gl.glVertex3f(-quarter, height, quarter);  // top-left of the quad

            // Back Face
            gl.glColor3f(0.8f, 0.07f, 0.11f);
            gl.glNormal3f(0.0f, 0.0f, -size);
            gl.glVertex3f(-quarter, -size, -quarter);
            gl.glVertex3f(-quarter, height, -quarter);
            gl.glVertex3f(quarter, height, -quarter);
            gl.glVertex3f(quarter, -size, -quarter);

            // Top Face
            gl.glColor3f(0.8f, 0.07f, 0.11f);
            gl.glNormal3f(0.0f, size, 0.0f);
            gl.glVertex3f(-quarter, height, -quarter);
            gl.glVertex3f(-quarter, height, quarter);
            gl.glVertex3f(quarter, height, quarter);
            gl.glVertex3f(quarter, height, -quarter);

            // Bottom Face
            gl.glColor3f(0.8f, 0.07f, 0.11f);
            gl.glNormal3f(0.0f, -size, 0.0f);
            gl.glVertex3f(-quarter, -size, -quarter);
            gl.glVertex3f(quarter, -size, -quarter);
            gl.glVertex3f(quarter, -size, quarter);
            gl.glVertex3f(-quarter, -size, quarter);

            // Right face
            gl.glColor3f(0.8f, 0.07f, 0.11f);
            gl.glNormal3f(size, 0.0f, 0.0f);
            gl.glVertex3f(quarter, -size, -quarter);
            gl.glVertex3f(quarter, height, -quarter);
            gl.glVertex3f(quarter, height, quarter);
            gl.glVertex3f(quarter, -size, quarter);

            // Left Face
            gl.glColor3f(0.8f, 0.07f, 0.11f);
            gl.glNormal3f(-size, 0.0f, 0.0f);
            gl.glVertex3f(-quarter, -size, -quarter);
            gl.glVertex3f(-quarter, -size, quarter);
            gl.glVertex3f(-quarter, height, quarter);
            gl.glVertex3f(-quarter, height, -quarter);

            gl.glEnd();
        }
        gl.glPopMatrix();
    }
}
