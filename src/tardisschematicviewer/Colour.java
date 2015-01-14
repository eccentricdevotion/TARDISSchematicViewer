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

    private static final HashMap<Byte, Color> stainedByByte = new HashMap<>();
    private static final HashMap<Byte, Color> logByByte = new HashMap<>();
    private static final HashMap<Byte, Color> leavesByByte = new HashMap<>();
    private static final HashMap<Byte, Color> log2ByByte = new HashMap<>();
    private static final HashMap<Byte, Color> leaves2ByByte = new HashMap<>();
    private static final HashMap<Byte, Color> woodByByte = new HashMap<>();

    static {
        // WOOL, CARPET, STAINED_GLASS, STAINED_CLAY
        Colour.stainedByByte.put((byte) 0, Color.white);
        Colour.stainedByByte.put((byte) 1, Color.getHSBColor(0.03f, 0.87f, 0.92f));
        Colour.stainedByByte.put((byte) 2, Color.getHSBColor(0.82f, 0.75f, 0.75f));
        Colour.stainedByByte.put((byte) 3, Color.getHSBColor(0.61f, 0.65f, 0.8f));
        Colour.stainedByByte.put((byte) 4, Color.yellow);
        Colour.stainedByByte.put((byte) 5, Color.getHSBColor(0.32f, 0.65f, 0.8f));
        Colour.stainedByByte.put((byte) 6, Color.getHSBColor(0.95f, 0.45f, 0.9f));
        Colour.stainedByByte.put((byte) 7, Color.darkGray);
        Colour.stainedByByte.put((byte) 8, Color.gray);
        Colour.stainedByByte.put((byte) 9, Color.getHSBColor(0.55f, 0.9f, 0.75f));
        Colour.stainedByByte.put((byte) 10, Color.getHSBColor(0.76f, 0.65f, 0.8f));
        Colour.stainedByByte.put((byte) 11, Color.getHSBColor(0.64f, 0.75f, 0.65f));
        Colour.stainedByByte.put((byte) 12, Color.getHSBColor(0.07f, 0.75f, 0.35f));
        Colour.stainedByByte.put((byte) 13, Color.getHSBColor(0.24f, 0.75f, 0.35f));
        Colour.stainedByByte.put((byte) 14, Color.getHSBColor(0, 0.8f, 0.6f));
        Colour.stainedByByte.put((byte) 15, Color.black);
        // LOG
        Colour.logByByte.put((byte) 0, Color.getHSBColor(0.06f, 0.75f, 0.6f));
        Colour.logByByte.put((byte) 1, Color.getHSBColor(0.08f, 0.64f, 0.51f));
        Colour.logByByte.put((byte) 2, Color.getHSBColor(0.09f, 0.39f, 0.44f));
        Colour.logByByte.put((byte) 3, Color.getHSBColor(0.08f, 0.78f, 0.56f));
        Colour.logByByte.put((byte) 4, Color.getHSBColor(0.06f, 0.75f, 0.6f));
        Colour.logByByte.put((byte) 5, Color.getHSBColor(0.08f, 0.64f, 0.51f));
        Colour.logByByte.put((byte) 6, Color.getHSBColor(0.09f, 0.39f, 0.44f));
        Colour.logByByte.put((byte) 7, Color.getHSBColor(0.08f, 0.78f, 0.56f));
        Colour.logByByte.put((byte) 8, Color.getHSBColor(0.06f, 0.75f, 0.6f));
        Colour.logByByte.put((byte) 9, Color.getHSBColor(0.08f, 0.64f, 0.51f));
        Colour.logByByte.put((byte) 10, Color.getHSBColor(0.09f, 0.39f, 0.44f));
        Colour.logByByte.put((byte) 11, Color.getHSBColor(0.08f, 0.78f, 0.56f));
        Colour.logByByte.put((byte) 12, Color.getHSBColor(0.06f, 0.75f, 0.6f));
        Colour.logByByte.put((byte) 13, Color.getHSBColor(0.08f, 0.64f, 0.51f));
        Colour.logByByte.put((byte) 14, Color.getHSBColor(0.09f, 0.39f, 0.44f));
        Colour.logByByte.put((byte) 15, Color.getHSBColor(0.08f, 0.78f, 0.56f));
        // LOG_2
        Colour.log2ByByte.put((byte) 0, Color.getHSBColor(0.01f, 0.53f, 0.58f));
        Colour.log2ByByte.put((byte) 1, Color.getHSBColor(0.06f, 0.76f, 0.48f));
        Colour.log2ByByte.put((byte) 4, Color.getHSBColor(0.01f, 0.53f, 0.58f));
        Colour.log2ByByte.put((byte) 5, Color.getHSBColor(0.06f, 0.76f, 0.48f));
        Colour.log2ByByte.put((byte) 8, Color.getHSBColor(0.01f, 0.53f, 0.58f));
        Colour.log2ByByte.put((byte) 9, Color.getHSBColor(0.06f, 0.76f, 0.48f));
        Colour.log2ByByte.put((byte) 12, Color.getHSBColor(0.01f, 0.53f, 0.58f));
        Colour.log2ByByte.put((byte) 13, Color.getHSBColor(0.06f, 0.76f, 0.48f));
        // WOOD (planks)
        Colour.woodByByte.put((byte) 0, Color.getHSBColor(0.06f, 0.75f, 0.6f));
        Colour.woodByByte.put((byte) 1, Color.getHSBColor(0.08f, 0.64f, 0.51f));
        Colour.woodByByte.put((byte) 2, Color.getHSBColor(0.09f, 0.39f, 0.44f));
        Colour.woodByByte.put((byte) 3, Color.getHSBColor(0.08f, 0.78f, 0.56f));
        Colour.woodByByte.put((byte) 4, Color.getHSBColor(0.01f, 0.53f, 0.58f));
        Colour.woodByByte.put((byte) 5, Color.getHSBColor(0.06f, 0.76f, 0.48f));
        Colour.woodByByte.put((byte) 8, Color.getHSBColor(0.06f, 0.75f, 0.6f));
        Colour.woodByByte.put((byte) 9, Color.getHSBColor(0.08f, 0.64f, 0.51f));
        Colour.woodByByte.put((byte) 10, Color.getHSBColor(0.09f, 0.39f, 0.44f));
        Colour.woodByByte.put((byte) 11, Color.getHSBColor(0.08f, 0.78f, 0.56f));
        Colour.woodByByte.put((byte) 12, Color.getHSBColor(0.01f, 0.53f, 0.58f));
        Colour.woodByByte.put((byte) 13, Color.getHSBColor(0.06f, 0.76f, 0.48f));
        // LEAVES
        Colour.leavesByByte.put((byte) 0, Color.getHSBColor(0.2f, 0.79f, 0.84f));
        Colour.leavesByByte.put((byte) 1, Color.getHSBColor(0.29f, 0.82f, 0.6f));
        Colour.leavesByByte.put((byte) 2, Color.getHSBColor(0.2f, 0.76f, 0.71f));
        Colour.leavesByByte.put((byte) 3, Color.getHSBColor(0.16f, 0.77f, 0.68f));
        Colour.leavesByByte.put((byte) 4, Color.getHSBColor(0.2f, 0.79f, 0.84f));
        Colour.leavesByByte.put((byte) 5, Color.getHSBColor(0.29f, 0.82f, 0.6f));
        Colour.leavesByByte.put((byte) 6, Color.getHSBColor(0.2f, 0.76f, 0.71f));
        Colour.leavesByByte.put((byte) 7, Color.getHSBColor(0.16f, 0.77f, 0.68f));
        Colour.leavesByByte.put((byte) 8, Color.getHSBColor(0.2f, 0.79f, 0.84f));
        Colour.leavesByByte.put((byte) 9, Color.getHSBColor(0.29f, 0.82f, 0.6f));
        Colour.leavesByByte.put((byte) 10, Color.getHSBColor(0.2f, 0.76f, 0.71f));
        Colour.leavesByByte.put((byte) 11, Color.getHSBColor(0.16f, 0.77f, 0.68f));
        Colour.leavesByByte.put((byte) 12, Color.getHSBColor(0.2f, 0.79f, 0.84f));
        Colour.leavesByByte.put((byte) 13, Color.getHSBColor(0.29f, 0.82f, 0.6f));
        Colour.leavesByByte.put((byte) 14, Color.getHSBColor(0.2f, 0.76f, 0.71f));
        Colour.leavesByByte.put((byte) 15, Color.getHSBColor(0.16f, 0.77f, 0.68f));
        // LEAVES_2
        Colour.leaves2ByByte.put((byte) 0, Color.getHSBColor(0.25f, 0.79f, 0.65f));
        Colour.leaves2ByByte.put((byte) 1, Color.getHSBColor(0.34f, 0.9f, 0.41f));
        Colour.leaves2ByByte.put((byte) 4, Color.getHSBColor(0.25f, 0.79f, 0.65f));
        Colour.leaves2ByByte.put((byte) 5, Color.getHSBColor(0.34f, 0.9f, 0.41f));
        Colour.leaves2ByByte.put((byte) 8, Color.getHSBColor(0.25f, 0.79f, 0.65f));
        Colour.leaves2ByByte.put((byte) 9, Color.getHSBColor(0.34f, 0.9f, 0.41f));
        Colour.leaves2ByByte.put((byte) 12, Color.getHSBColor(0.25f, 0.79f, 0.65f));
        Colour.leaves2ByByte.put((byte) 13, Color.getHSBColor(0.34f, 0.9f, 0.41f));
    }

    public static HashMap<Byte, Color> getStainedByByte() {
        return stainedByByte;
    }

    public static HashMap<Byte, Color> getLogByByte() {
        return logByByte;
    }

    public static HashMap<Byte, Color> getLeavesByByte() {
        return leavesByByte;
    }

    public static HashMap<Byte, Color> getLog2ByByte() {
        return log2ByByte;
    }

    public static HashMap<Byte, Color> getLeaves2ByByte() {
        return leaves2ByByte;
    }

    public static HashMap<Byte, Color> getWoodByByte() {
        return woodByByte;
    }
}
