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

import java.util.HashMap;

/**
 * @author eccentric_nz
 */
public class FenceRotation {

    private static final HashMap<Byte, Float> BY_BYTE = new HashMap<>();

    static {
        FenceRotation.BY_BYTE.put((byte) 0, 0.0f);
        FenceRotation.BY_BYTE.put((byte) 1, 90.0f);
        FenceRotation.BY_BYTE.put((byte) 2, 0.0f);
        FenceRotation.BY_BYTE.put((byte) 3, 90.0f);
        FenceRotation.BY_BYTE.put((byte) 4, 0.0f);
        FenceRotation.BY_BYTE.put((byte) 5, 90.0f);
        FenceRotation.BY_BYTE.put((byte) 6, 0.0f);
        FenceRotation.BY_BYTE.put((byte) 7, 90.0f);
        FenceRotation.BY_BYTE.put((byte) 8, 0.0f);
        FenceRotation.BY_BYTE.put((byte) 9, 90.0f);
        FenceRotation.BY_BYTE.put((byte) 10, 0.0f);
        FenceRotation.BY_BYTE.put((byte) 11, 90.0f);
        FenceRotation.BY_BYTE.put((byte) 12, 0.0f);
        FenceRotation.BY_BYTE.put((byte) 13, 90.0f);
        FenceRotation.BY_BYTE.put((byte) 14, 0.0f);
        FenceRotation.BY_BYTE.put((byte) 15, 90.0f);
    }

    public static HashMap<Byte, Float> getByByte() {
        return BY_BYTE;
    }
}
