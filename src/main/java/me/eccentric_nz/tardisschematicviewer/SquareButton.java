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

import javax.swing.*;
import java.awt.*;
import java.io.Serial;

/**
 * @author eccentric_nz
 */
public final class SquareButton extends JButton {

    @Serial
    private static final long serialVersionUID = 7623333770238989633L;

    private final int size;

    public SquareButton(int size, Color color) {
        this.size = size;
        this.setPreferredSize(getPreferredSize());
        this.setSize(getPreferredSize());
        if (color != null) {
            this.setBackground(color);
        }
        this.setOpaque(true);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(size, size);
    }
}
