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
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author eccentric_nz
 */
public class Rectangle extends JPanel {

    private final int w;
    private final int h;

    public Rectangle(int w, int h) {
        this.w = w;
        this.h = h;
    }

    protected void paintComponent(Graphics g, Color c) {
        super.paintComponent(g);
        g.drawRect(230, 80, 10, 10);
        g.setColor(c);
        g.fillRect(230, 80, 10, 10);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(w, h);
    }
}
