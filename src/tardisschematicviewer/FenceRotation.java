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

import java.util.HashMap;

/**
 *
 * @author eccentric_nz
 */
public class FenceRotation {

    private static final HashMap<Byte, Float> byByte = new HashMap<>();

    static {
        FenceRotation.byByte.put((byte) 0, 0.0f);
        FenceRotation.byByte.put((byte) 1, 90.0f);
        FenceRotation.byByte.put((byte) 2, 0.0f);
        FenceRotation.byByte.put((byte) 3, 90.0f);
        FenceRotation.byByte.put((byte) 4, 0.0f);
        FenceRotation.byByte.put((byte) 5, 90.0f);
        FenceRotation.byByte.put((byte) 6, 0.0f);
        FenceRotation.byByte.put((byte) 7, 90.0f);
        FenceRotation.byByte.put((byte) 8, 0.0f);
        FenceRotation.byByte.put((byte) 9, 90.0f);
        FenceRotation.byByte.put((byte) 10, 0.0f);
        FenceRotation.byByte.put((byte) 11, 90.0f);
        FenceRotation.byByte.put((byte) 12, 0.0f);
        FenceRotation.byByte.put((byte) 13, 90.0f);
        FenceRotation.byByte.put((byte) 14, 0.0f);
        FenceRotation.byByte.put((byte) 15, 90.0f);
    }

    public static HashMap<Byte, Float> getByByte() {
        return byByte;
    }

    public static float getRotationFromData(String data) {
        // "minecraft:nether_brick_fence[east=true,north=false,south=true,waterlogged=false,west=false]"
        return data.contains("east=true") ? 90.0f : 0;
    }
}
