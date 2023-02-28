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

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author eccentric_nz
 */
public class StairRotation {

    private static final String facing = "facing=([a-z]+?),";
    private static final String half = "half=([a-z]+?),";
    private static final Pattern facingPattern = Pattern.compile(facing, Pattern.MULTILINE);
    private static final Pattern halfPattern = Pattern.compile(half, Pattern.MULTILINE);

    public static float getFacingFromData(String data) {
        // "minecraft:cobblestone_stairs[facing=east,half=top,shape=straight,waterlogged=false]"
        Matcher matcher = facingPattern.matcher(data);
        String facing = matcher.group(0);
        switch (facing) {
            case "east" -> {
                return 90.0f;
            }
            case "west" -> {
                return -90.0f;
            }
            case "south" -> {
                return 180.0f;
            }
            default -> { // north
                return 0;
            }
        }
    }

    public static boolean isTopHalf(String data) {
        // "minecraft:cobblestone_stairs[facing=east,half=top,shape=straight,waterlogged=false]"
        Matcher matcher = halfPattern.matcher(data);
        String half = matcher.group(0);
        return half.equals("top");
    }
}
