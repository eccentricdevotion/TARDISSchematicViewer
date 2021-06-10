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
 * @author eccentric_nz
 */
public class Colour {

    private static final HashMap<Byte, Color> stained = new HashMap<>();
    private static final HashMap<Byte, Color> log = new HashMap<>();
    private static final HashMap<Byte, Color> leaves = new HashMap<>();
    private static final HashMap<Byte, Color> log_2 = new HashMap<>();
    private static final HashMap<Byte, Color> leaves_2 = new HashMap<>();
    private static final HashMap<Byte, Color> wood = new HashMap<>();
    private static final HashMap<Byte, Color> slab = new HashMap<>();
    private static final HashMap<Byte, Color> prismarine = new HashMap<>();

    static {
        // WOOL, CARPET, STAINED_GLASS, STAINED_CLAY
        Colour.stained.put((byte) 0, Color.white);
        Colour.stained.put((byte) 1, Color.getHSBColor(0.03f, 0.87f, 0.92f));
        Colour.stained.put((byte) 2, Color.getHSBColor(0.82f, 0.75f, 0.75f));
        Colour.stained.put((byte) 3, Color.getHSBColor(0.61f, 0.65f, 0.8f));
        Colour.stained.put((byte) 4, Color.yellow);
        Colour.stained.put((byte) 5, Color.getHSBColor(0.32f, 0.65f, 0.8f));
        Colour.stained.put((byte) 6, Color.getHSBColor(0.95f, 0.45f, 0.9f));
        Colour.stained.put((byte) 7, Color.darkGray);
        Colour.stained.put((byte) 8, Color.gray);
        Colour.stained.put((byte) 9, Color.getHSBColor(0.55f, 0.9f, 0.75f));
        Colour.stained.put((byte) 10, Color.getHSBColor(0.76f, 0.65f, 0.8f));
        Colour.stained.put((byte) 11, Color.getHSBColor(0.64f, 0.75f, 0.65f));
        Colour.stained.put((byte) 12, Color.getHSBColor(0.07f, 0.75f, 0.35f));
        Colour.stained.put((byte) 13, Color.getHSBColor(0.24f, 0.75f, 0.35f));
        Colour.stained.put((byte) 14, Color.getHSBColor(0, 0.8f, 0.6f));
        Colour.stained.put((byte) 15, Color.black);
        // LOG
        Colour.log.put((byte) 0, Color.getHSBColor(0.06f, 0.75f, 0.6f));
        Colour.log.put((byte) 1, Color.getHSBColor(0.08f, 0.64f, 0.51f));
        Colour.log.put((byte) 2, Color.getHSBColor(0.09f, 0.39f, 0.44f));
        Colour.log.put((byte) 3, Color.getHSBColor(0.08f, 0.78f, 0.56f));
        Colour.log.put((byte) 4, Color.getHSBColor(0.06f, 0.75f, 0.6f));
        Colour.log.put((byte) 5, Color.getHSBColor(0.08f, 0.64f, 0.51f));
        Colour.log.put((byte) 6, Color.getHSBColor(0.09f, 0.39f, 0.44f));
        Colour.log.put((byte) 7, Color.getHSBColor(0.08f, 0.78f, 0.56f));
        Colour.log.put((byte) 8, Color.getHSBColor(0.06f, 0.75f, 0.6f));
        Colour.log.put((byte) 9, Color.getHSBColor(0.08f, 0.64f, 0.51f));
        Colour.log.put((byte) 10, Color.getHSBColor(0.09f, 0.39f, 0.44f));
        Colour.log.put((byte) 11, Color.getHSBColor(0.08f, 0.78f, 0.56f));
        Colour.log.put((byte) 12, Color.getHSBColor(0.06f, 0.75f, 0.6f));
        Colour.log.put((byte) 13, Color.getHSBColor(0.08f, 0.64f, 0.51f));
        Colour.log.put((byte) 14, Color.getHSBColor(0.09f, 0.39f, 0.44f));
        Colour.log.put((byte) 15, Color.getHSBColor(0.08f, 0.78f, 0.56f));
        // LOG_2
        Colour.log_2.put((byte) 0, Color.getHSBColor(0.01f, 0.53f, 0.58f));
        Colour.log_2.put((byte) 1, Color.getHSBColor(0.06f, 0.76f, 0.48f));
        Colour.log_2.put((byte) 4, Color.getHSBColor(0.01f, 0.53f, 0.58f));
        Colour.log_2.put((byte) 5, Color.getHSBColor(0.06f, 0.76f, 0.48f));
        Colour.log_2.put((byte) 8, Color.getHSBColor(0.01f, 0.53f, 0.58f));
        Colour.log_2.put((byte) 9, Color.getHSBColor(0.06f, 0.76f, 0.48f));
        Colour.log_2.put((byte) 12, Color.getHSBColor(0.01f, 0.53f, 0.58f));
        Colour.log_2.put((byte) 13, Color.getHSBColor(0.06f, 0.76f, 0.48f));
        // WOOD (planks)
        Colour.wood.put((byte) 0, Color.getHSBColor(0.06f, 0.75f, 0.6f));
        Colour.wood.put((byte) 1, Color.getHSBColor(0.08f, 0.64f, 0.51f));
        Colour.wood.put((byte) 2, Color.getHSBColor(0.09f, 0.39f, 0.44f));
        Colour.wood.put((byte) 3, Color.getHSBColor(0.08f, 0.78f, 0.56f));
        Colour.wood.put((byte) 4, Color.getHSBColor(0.01f, 0.53f, 0.58f));
        Colour.wood.put((byte) 5, Color.getHSBColor(0.06f, 0.76f, 0.48f));
        Colour.wood.put((byte) 8, Color.getHSBColor(0.06f, 0.75f, 0.6f));
        Colour.wood.put((byte) 9, Color.getHSBColor(0.08f, 0.64f, 0.51f));
        Colour.wood.put((byte) 10, Color.getHSBColor(0.09f, 0.39f, 0.44f));
        Colour.wood.put((byte) 11, Color.getHSBColor(0.08f, 0.78f, 0.56f));
        Colour.wood.put((byte) 12, Color.getHSBColor(0.01f, 0.53f, 0.58f));
        Colour.wood.put((byte) 13, Color.getHSBColor(0.06f, 0.76f, 0.48f));
        // LEAVES
        Colour.leaves.put((byte) 0, Color.getHSBColor(0.2f, 0.79f, 0.84f));
        Colour.leaves.put((byte) 1, Color.getHSBColor(0.29f, 0.82f, 0.6f));
        Colour.leaves.put((byte) 2, Color.getHSBColor(0.2f, 0.76f, 0.71f));
        Colour.leaves.put((byte) 3, Color.getHSBColor(0.16f, 0.77f, 0.68f));
        Colour.leaves.put((byte) 4, Color.getHSBColor(0.2f, 0.79f, 0.84f));
        Colour.leaves.put((byte) 5, Color.getHSBColor(0.29f, 0.82f, 0.6f));
        Colour.leaves.put((byte) 6, Color.getHSBColor(0.2f, 0.76f, 0.71f));
        Colour.leaves.put((byte) 7, Color.getHSBColor(0.16f, 0.77f, 0.68f));
        Colour.leaves.put((byte) 8, Color.getHSBColor(0.2f, 0.79f, 0.84f));
        Colour.leaves.put((byte) 9, Color.getHSBColor(0.29f, 0.82f, 0.6f));
        Colour.leaves.put((byte) 10, Color.getHSBColor(0.2f, 0.76f, 0.71f));
        Colour.leaves.put((byte) 11, Color.getHSBColor(0.16f, 0.77f, 0.68f));
        Colour.leaves.put((byte) 12, Color.getHSBColor(0.2f, 0.79f, 0.84f));
        Colour.leaves.put((byte) 13, Color.getHSBColor(0.29f, 0.82f, 0.6f));
        Colour.leaves.put((byte) 14, Color.getHSBColor(0.2f, 0.76f, 0.71f));
        Colour.leaves.put((byte) 15, Color.getHSBColor(0.16f, 0.77f, 0.68f));
        // LEAVES_2
        Colour.leaves_2.put((byte) 0, Color.getHSBColor(0.25f, 0.79f, 0.65f));
        Colour.leaves_2.put((byte) 1, Color.getHSBColor(0.34f, 0.9f, 0.41f));
        Colour.leaves_2.put((byte) 4, Color.getHSBColor(0.25f, 0.79f, 0.65f));
        Colour.leaves_2.put((byte) 5, Color.getHSBColor(0.34f, 0.9f, 0.41f));
        Colour.leaves_2.put((byte) 8, Color.getHSBColor(0.25f, 0.79f, 0.65f));
        Colour.leaves_2.put((byte) 9, Color.getHSBColor(0.34f, 0.9f, 0.41f));
        Colour.leaves_2.put((byte) 12, Color.getHSBColor(0.25f, 0.79f, 0.65f));
        Colour.leaves_2.put((byte) 13, Color.getHSBColor(0.34f, 0.9f, 0.41f));
        // STEP
        Colour.slab.put((byte) 0, Color.getHSBColor(0f, 0f, 0.67f));
        Colour.slab.put((byte) 1, Color.getHSBColor(0.15f, 0.19f, 0.96f));
        Colour.slab.put((byte) 2, Color.getHSBColor(0.06f, 0.75f, 0.6f));
        Colour.slab.put((byte) 3, Color.getHSBColor(0f, 0f, 0.61f));
        Colour.slab.put((byte) 4, Color.getHSBColor(0.01f, 0.83f, 0.62f));
        Colour.slab.put((byte) 5, Color.getHSBColor(0f, 0f, 0.75f));
        Colour.slab.put((byte) 6, Color.getHSBColor(0.99f, 1f, 0.46f));
        Colour.slab.put((byte) 7, Color.getHSBColor(0.04f, 0.05f, 0.98f));
        Colour.slab.put((byte) 8, Color.getHSBColor(0f, 0f, 0.67f));
        Colour.slab.put((byte) 9, Color.getHSBColor(0.15f, 0.19f, 0.96f));
        Colour.slab.put((byte) 10, Color.getHSBColor(0.06f, 0.75f, 0.6f));
        Colour.slab.put((byte) 11, Color.getHSBColor(0f, 0f, 0.61f));
        Colour.slab.put((byte) 12, Color.getHSBColor(0.01f, 0.83f, 0.62f));
        Colour.slab.put((byte) 13, Color.getHSBColor(0f, 0f, 0.75f));
        Colour.slab.put((byte) 14, Color.getHSBColor(0.99f, 1f, 0.46f));
        Colour.slab.put((byte) 15, Color.getHSBColor(0.04f, 0.05f, 0.98f));
        // PRISMARINE
        Colour.prismarine.put((byte) 0, Color.getHSBColor(0.55f, 0.56f, 0.74f));
        Colour.prismarine.put((byte) 1, Color.getHSBColor(0.55f, 0.56f, 0.62f));
        Colour.prismarine.put((byte) 2, Color.getHSBColor(0.53f, 0.57f, 0.43f));
    }

    public static HashMap<Byte, Color> getStained() {
        return stained;
    }

    public static HashMap<Byte, Color> getLog() {
        return log;
    }

    public static HashMap<Byte, Color> getLeaves() {
        return leaves;
    }

    public static HashMap<Byte, Color> getLog_2() {
        return log_2;
    }

    public static HashMap<Byte, Color> getLeaves_2() {
        return leaves_2;
    }

    public static HashMap<Byte, Color> getWood() {
        return wood;
    }

    public static HashMap<Byte, Color> getSlab() {
        return slab;
    }

    public static HashMap<Byte, Color> getPrismarine() {
        return prismarine;
    }
}
