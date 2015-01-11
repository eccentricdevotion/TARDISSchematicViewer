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
 * along with Colour program. If not, see <http://www.gnu.org/licenses/>.
 */
package tardisschematicviewer;

import java.awt.Color;
import java.util.HashMap;

/**
 *
 * @author eccentric_nz
 */
public class Colour {

    private static final HashMap<Byte, Color> byByte = new HashMap<>();

    static {
        Colour.byByte.put((byte) 0, Color.white);
        Colour.byByte.put((byte) 1, Color.getHSBColor(0.11f, 0.95f, 0.95f));
        Colour.byByte.put((byte) 2, Color.getHSBColor(0.82f, 0.75f, 0.75f));
        Colour.byByte.put((byte) 3, Color.getHSBColor(0.61f, 0.65f, 0.8f));
        Colour.byByte.put((byte) 4, Color.yellow);
        Colour.byByte.put((byte) 5, Color.getHSBColor(0.32f, 0.65f, 0.8f));
        Colour.byByte.put((byte) 6, Color.getHSBColor(0.95f, 0.45f, 0.9f));
        Colour.byByte.put((byte) 7, Color.darkGray);
        Colour.byByte.put((byte) 8, Color.gray);
        Colour.byByte.put((byte) 9, Color.getHSBColor(0.55f, 0.9f, 0.75f));
        Colour.byByte.put((byte) 10, Color.getHSBColor(0.76f, 0.65f, 0.8f));
        Colour.byByte.put((byte) 11, Color.getHSBColor(0.64f, 0.75f, 0.65f));
        Colour.byByte.put((byte) 12, Color.getHSBColor(0.07f, 0.75f, 0.35f));
        Colour.byByte.put((byte) 13, Color.getHSBColor(0.24f, 0.75f, 0.35f));
        Colour.byByte.put((byte) 14, Color.getHSBColor(0, 0.8f, 0.6f));
        Colour.byByte.put((byte) 15, Color.black);
    }

    public static HashMap<Byte, Color> getByByte() {
        return byByte;
    }
}
