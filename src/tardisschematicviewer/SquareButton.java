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
import javax.swing.JButton;

/**
 * @author eccentric_nz
 */
public final class SquareButton extends JButton {

	private static final long serialVersionUID = 7623333770238989633L;

	private final int size;

	public SquareButton(int size, Color c) {
		this.size = size;
		this.setPreferredSize(getPreferredSize());
		this.setSize(getPreferredSize());
		if (c != null) {
			this.setBackground(c);
		}
		this.setOpaque(true);
	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(size, size);
	}
}
