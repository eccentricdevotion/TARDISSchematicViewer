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

import java.awt.*;
import java.util.HashMap;

/**
 * @author eccentric_nz
 */
public class BlockColor {

    private static final HashMap<Byte, Color> STAINED = new HashMap<>();
    private static final HashMap<Byte, Color> LOG = new HashMap<>();
    private static final HashMap<Byte, Color> LEAVES = new HashMap<>();
    private static final HashMap<Byte, Color> LOG_2 = new HashMap<>();
    private static final HashMap<Byte, Color> LEAVES_2 = new HashMap<>();
    private static final HashMap<Byte, Color> WOOD = new HashMap<>();
    private static final HashMap<Byte, Color> SLAB = new HashMap<>();
    private static final HashMap<Byte, Color> PRISMARINE = new HashMap<>();

    static {
        // WOOL, CARPET, STAINED_GLASS, STAINED_CLAY
        BlockColor.STAINED.put((byte) 0, Color.white);
        BlockColor.STAINED.put((byte) 1, Color.getHSBColor(0.03f, 0.87f, 0.92f));
        BlockColor.STAINED.put((byte) 2, Color.getHSBColor(0.82f, 0.75f, 0.75f));
        BlockColor.STAINED.put((byte) 3, Color.getHSBColor(0.61f, 0.65f, 0.8f));
        BlockColor.STAINED.put((byte) 4, Color.yellow);
        BlockColor.STAINED.put((byte) 5, Color.getHSBColor(0.32f, 0.65f, 0.8f));
        BlockColor.STAINED.put((byte) 6, Color.getHSBColor(0.95f, 0.45f, 0.9f));
        BlockColor.STAINED.put((byte) 7, Color.darkGray);
        BlockColor.STAINED.put((byte) 8, Color.gray);
        BlockColor.STAINED.put((byte) 9, Color.getHSBColor(0.55f, 0.9f, 0.75f));
        BlockColor.STAINED.put((byte) 10, Color.getHSBColor(0.76f, 0.65f, 0.8f));
        BlockColor.STAINED.put((byte) 11, Color.getHSBColor(0.64f, 0.75f, 0.65f));
        BlockColor.STAINED.put((byte) 12, Color.getHSBColor(0.07f, 0.75f, 0.35f));
        BlockColor.STAINED.put((byte) 13, Color.getHSBColor(0.24f, 0.75f, 0.35f));
        BlockColor.STAINED.put((byte) 14, Color.getHSBColor(0, 0.8f, 0.6f));
        BlockColor.STAINED.put((byte) 15, Color.black);
        // LOG
        BlockColor.LOG.put((byte) 0, Color.getHSBColor(0.06f, 0.75f, 0.6f));
        BlockColor.LOG.put((byte) 1, Color.getHSBColor(0.08f, 0.64f, 0.51f));
        BlockColor.LOG.put((byte) 2, Color.getHSBColor(0.09f, 0.39f, 0.44f));
        BlockColor.LOG.put((byte) 3, Color.getHSBColor(0.08f, 0.78f, 0.56f));
        BlockColor.LOG.put((byte) 4, Color.getHSBColor(0.06f, 0.75f, 0.6f));
        BlockColor.LOG.put((byte) 5, Color.getHSBColor(0.08f, 0.64f, 0.51f));
        BlockColor.LOG.put((byte) 6, Color.getHSBColor(0.09f, 0.39f, 0.44f));
        BlockColor.LOG.put((byte) 7, Color.getHSBColor(0.08f, 0.78f, 0.56f));
        BlockColor.LOG.put((byte) 8, Color.getHSBColor(0.06f, 0.75f, 0.6f));
        BlockColor.LOG.put((byte) 9, Color.getHSBColor(0.08f, 0.64f, 0.51f));
        BlockColor.LOG.put((byte) 10, Color.getHSBColor(0.09f, 0.39f, 0.44f));
        BlockColor.LOG.put((byte) 11, Color.getHSBColor(0.08f, 0.78f, 0.56f));
        BlockColor.LOG.put((byte) 12, Color.getHSBColor(0.06f, 0.75f, 0.6f));
        BlockColor.LOG.put((byte) 13, Color.getHSBColor(0.08f, 0.64f, 0.51f));
        BlockColor.LOG.put((byte) 14, Color.getHSBColor(0.09f, 0.39f, 0.44f));
        BlockColor.LOG.put((byte) 15, Color.getHSBColor(0.08f, 0.78f, 0.56f));
        // LOG_2
        BlockColor.LOG_2.put((byte) 0, Color.getHSBColor(0.01f, 0.53f, 0.58f));
        BlockColor.LOG_2.put((byte) 1, Color.getHSBColor(0.06f, 0.76f, 0.48f));
        BlockColor.LOG_2.put((byte) 4, Color.getHSBColor(0.01f, 0.53f, 0.58f));
        BlockColor.LOG_2.put((byte) 5, Color.getHSBColor(0.06f, 0.76f, 0.48f));
        BlockColor.LOG_2.put((byte) 8, Color.getHSBColor(0.01f, 0.53f, 0.58f));
        BlockColor.LOG_2.put((byte) 9, Color.getHSBColor(0.06f, 0.76f, 0.48f));
        BlockColor.LOG_2.put((byte) 12, Color.getHSBColor(0.01f, 0.53f, 0.58f));
        BlockColor.LOG_2.put((byte) 13, Color.getHSBColor(0.06f, 0.76f, 0.48f));
        // WOOD (planks)
        BlockColor.WOOD.put((byte) 0, Color.getHSBColor(0.06f, 0.75f, 0.6f));
        BlockColor.WOOD.put((byte) 1, Color.getHSBColor(0.08f, 0.64f, 0.51f));
        BlockColor.WOOD.put((byte) 2, Color.getHSBColor(0.09f, 0.39f, 0.44f));
        BlockColor.WOOD.put((byte) 3, Color.getHSBColor(0.08f, 0.78f, 0.56f));
        BlockColor.WOOD.put((byte) 4, Color.getHSBColor(0.01f, 0.53f, 0.58f));
        BlockColor.WOOD.put((byte) 5, Color.getHSBColor(0.06f, 0.76f, 0.48f));
        BlockColor.WOOD.put((byte) 8, Color.getHSBColor(0.06f, 0.75f, 0.6f));
        BlockColor.WOOD.put((byte) 9, Color.getHSBColor(0.08f, 0.64f, 0.51f));
        BlockColor.WOOD.put((byte) 10, Color.getHSBColor(0.09f, 0.39f, 0.44f));
        BlockColor.WOOD.put((byte) 11, Color.getHSBColor(0.08f, 0.78f, 0.56f));
        BlockColor.WOOD.put((byte) 12, Color.getHSBColor(0.01f, 0.53f, 0.58f));
        BlockColor.WOOD.put((byte) 13, Color.getHSBColor(0.06f, 0.76f, 0.48f));
        // LEAVES
        BlockColor.LEAVES.put((byte) 0, Color.getHSBColor(0.2f, 0.79f, 0.84f));
        BlockColor.LEAVES.put((byte) 1, Color.getHSBColor(0.29f, 0.82f, 0.6f));
        BlockColor.LEAVES.put((byte) 2, Color.getHSBColor(0.2f, 0.76f, 0.71f));
        BlockColor.LEAVES.put((byte) 3, Color.getHSBColor(0.16f, 0.77f, 0.68f));
        BlockColor.LEAVES.put((byte) 4, Color.getHSBColor(0.2f, 0.79f, 0.84f));
        BlockColor.LEAVES.put((byte) 5, Color.getHSBColor(0.29f, 0.82f, 0.6f));
        BlockColor.LEAVES.put((byte) 6, Color.getHSBColor(0.2f, 0.76f, 0.71f));
        BlockColor.LEAVES.put((byte) 7, Color.getHSBColor(0.16f, 0.77f, 0.68f));
        BlockColor.LEAVES.put((byte) 8, Color.getHSBColor(0.2f, 0.79f, 0.84f));
        BlockColor.LEAVES.put((byte) 9, Color.getHSBColor(0.29f, 0.82f, 0.6f));
        BlockColor.LEAVES.put((byte) 10, Color.getHSBColor(0.2f, 0.76f, 0.71f));
        BlockColor.LEAVES.put((byte) 11, Color.getHSBColor(0.16f, 0.77f, 0.68f));
        BlockColor.LEAVES.put((byte) 12, Color.getHSBColor(0.2f, 0.79f, 0.84f));
        BlockColor.LEAVES.put((byte) 13, Color.getHSBColor(0.29f, 0.82f, 0.6f));
        BlockColor.LEAVES.put((byte) 14, Color.getHSBColor(0.2f, 0.76f, 0.71f));
        BlockColor.LEAVES.put((byte) 15, Color.getHSBColor(0.16f, 0.77f, 0.68f));
        // LEAVES_2
        BlockColor.LEAVES_2.put((byte) 0, Color.getHSBColor(0.25f, 0.79f, 0.65f));
        BlockColor.LEAVES_2.put((byte) 1, Color.getHSBColor(0.34f, 0.9f, 0.41f));
        BlockColor.LEAVES_2.put((byte) 4, Color.getHSBColor(0.25f, 0.79f, 0.65f));
        BlockColor.LEAVES_2.put((byte) 5, Color.getHSBColor(0.34f, 0.9f, 0.41f));
        BlockColor.LEAVES_2.put((byte) 8, Color.getHSBColor(0.25f, 0.79f, 0.65f));
        BlockColor.LEAVES_2.put((byte) 9, Color.getHSBColor(0.34f, 0.9f, 0.41f));
        BlockColor.LEAVES_2.put((byte) 12, Color.getHSBColor(0.25f, 0.79f, 0.65f));
        BlockColor.LEAVES_2.put((byte) 13, Color.getHSBColor(0.34f, 0.9f, 0.41f));
        // STEP
        BlockColor.SLAB.put((byte) 0, Color.getHSBColor(0f, 0f, 0.67f));
        BlockColor.SLAB.put((byte) 1, Color.getHSBColor(0.15f, 0.19f, 0.96f));
        BlockColor.SLAB.put((byte) 2, Color.getHSBColor(0.06f, 0.75f, 0.6f));
        BlockColor.SLAB.put((byte) 3, Color.getHSBColor(0f, 0f, 0.61f));
        BlockColor.SLAB.put((byte) 4, Color.getHSBColor(0.01f, 0.83f, 0.62f));
        BlockColor.SLAB.put((byte) 5, Color.getHSBColor(0f, 0f, 0.75f));
        BlockColor.SLAB.put((byte) 6, Color.getHSBColor(0.99f, 1f, 0.46f));
        BlockColor.SLAB.put((byte) 7, Color.getHSBColor(0.04f, 0.05f, 0.98f));
        BlockColor.SLAB.put((byte) 8, Color.getHSBColor(0f, 0f, 0.67f));
        BlockColor.SLAB.put((byte) 9, Color.getHSBColor(0.15f, 0.19f, 0.96f));
        BlockColor.SLAB.put((byte) 10, Color.getHSBColor(0.06f, 0.75f, 0.6f));
        BlockColor.SLAB.put((byte) 11, Color.getHSBColor(0f, 0f, 0.61f));
        BlockColor.SLAB.put((byte) 12, Color.getHSBColor(0.01f, 0.83f, 0.62f));
        BlockColor.SLAB.put((byte) 13, Color.getHSBColor(0f, 0f, 0.75f));
        BlockColor.SLAB.put((byte) 14, Color.getHSBColor(0.99f, 1f, 0.46f));
        BlockColor.SLAB.put((byte) 15, Color.getHSBColor(0.04f, 0.05f, 0.98f));
        // PRISMARINE
        BlockColor.PRISMARINE.put((byte) 0, Color.getHSBColor(0.55f, 0.56f, 0.74f));
        BlockColor.PRISMARINE.put((byte) 1, Color.getHSBColor(0.55f, 0.56f, 0.62f));
        BlockColor.PRISMARINE.put((byte) 2, Color.getHSBColor(0.53f, 0.57f, 0.43f));
    }

    public static HashMap<Byte, Color> getStained() {
        return STAINED;
    }

    public static HashMap<Byte, Color> getLog() {
        return LOG;
    }

    public static HashMap<Byte, Color> getLeaves() {
        return LEAVES;
    }

    public static HashMap<Byte, Color> getLog2() {
        return LOG_2;
    }

    public static HashMap<Byte, Color> getLeaves2() {
        return LEAVES_2;
    }

    public static HashMap<Byte, Color> getWood() {
        return WOOD;
    }

    public static HashMap<Byte, Color> getSlab() {
        return SLAB;
    }

    public static HashMap<Byte, Color> getPrismarine() {
        return PRISMARINE;
    }
}
