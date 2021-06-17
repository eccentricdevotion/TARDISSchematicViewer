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

/**
 * An enum of all materials accepted by the official server and client
 */
public enum Material {

    ACACIA_DOOR(Color.getHSBColor(0.01f, 0.52f, 0.59f)),
    ACACIA_FENCE(Color.getHSBColor(0.01f, 0.52f, 0.59f)),
    ACACIA_FENCE_GATE(Color.getHSBColor(0.01f, 0.52f, 0.59f)),
    ACACIA_STAIRS(Color.getHSBColor(0.01f, 0.52f, 0.59f)),
    ACTIVATOR_RAIL(Color.red),
    AIR(Color.green),
    ANVIL(Color.black),
    BARRIER(Color.white),
    BEACON(Color.cyan),
    BEDROCK(Color.black),
    BED_BLOCK(Color.getHSBColor(0.99f, 0.96f, 0.88f)),
    BIRCH_DOOR(Color.getHSBColor(0.07f, 0.71f, 0.64f)),
    BIRCH_FENCE(Color.getHSBColor(0.07f, 0.71f, 0.64f)),
    BIRCH_FENCE_GATE(Color.getHSBColor(0.07f, 0.71f, 0.64f)),
    BIRCH_WOOD_STAIRS(Color.getHSBColor(0.07f, 0.71f, 0.64f)),
    BOOKSHELF(Color.getHSBColor(0.11f, 1.0f, 0.4f)),
    BREWING_STAND(Color.getHSBColor(0.1f, 0.78f, 0.98f)),
    BRICK(Color.getHSBColor(0.01f, 0.83f, 0.62f)),
    BRICK_STAIRS(Color.getHSBColor(0.01f, 0.83f, 0.62f)),
    BROWN_MUSHROOM(Color.getHSBColor(0.09f, 0.17f, 0.8f)),
    BURNING_FURNACE(Color.lightGray),
    CACTUS(Color.getHSBColor(0.41f, 0.93f, 0.29f)),
    CAKE_BLOCK(Color.getHSBColor(0.06f, 0.59f, 0.79f)),
    CARPET(Color.pink),
    CARROT(Color.getHSBColor(0.1f, 0.83f, 0.99f)),
    CAULDRON(Color.darkGray),
    CHEST(Color.getHSBColor(0.11f, 1.0f, 0.4f)),
    CLAY(Color.getHSBColor(0.09f, 0.24f, 0.73f)),
    COAL_BLOCK(Color.black),
    COAL_ORE(Color.black),
    COBBLESTONE(Color.lightGray),
    COBBLESTONE_STAIRS(Color.lightGray),
    COBBLE_WALL(Color.lightGray),
    COCOA(Color.getHSBColor(0.11f, 1.0f, 0.4f)),
    COMMAND(Color.darkGray),
    CROPS(Color.getHSBColor(0.14f, 0.76f, 0.7f)),
    DARK_OAK_DOOR(Color.getHSBColor(0.04f, 0.75f, 0.37f)),
    DARK_OAK_FENCE(Color.getHSBColor(0.04f, 0.75f, 0.37f)),
    DARK_OAK_FENCE_GATE(Color.getHSBColor(0.04f, 0.75f, 0.37f)),
    DARK_OAK_STAIRS(Color.getHSBColor(0.04f, 0.75f, 0.37f)),
    DAYLIGHT_DETECTOR(Color.getHSBColor(0.0f, 0.0f, 0.78f)),
    DAYLIGHT_DETECTOR_INVERTED(Color.white),
    DEAD_BUSH(Color.getHSBColor(0.13f, 0.15f, 0.98f)),
    DETECTOR_RAIL(Color.gray),
    DIAMOND_BLOCK(Color.getHSBColor(0.48f, 0.45f, 0.98f)),
    DIAMOND_ORE(Color.getHSBColor(0.48f, 0.45f, 0.98f)),
    DIODE_BLOCK_OFF(Color.red),
    DIODE_BLOCK_ON(Color.red),
    DIRT(Color.getHSBColor(0.09f, 0.52f, 0.58f)),
    DISPENSER(Color.lightGray),
    DOUBLE_PLANT(Color.green),
    DOUBLE_STEP(Color.lightGray),
    DOUBLE_STONE_SLAB2(Color.lightGray),
    DRAGON_EGG(Color.getHSBColor(0.84f, 0.85f, 0.49f)),
    DROPPER(Color.gray),
    EMERALD_BLOCK(Color.green),
    EMERALD_ORE(Color.green),
    ENCHANTMENT_TABLE(Color.cyan),
    ENDER_CHEST(Color.green),
    ENDER_PORTAL(Color.black),
    ENDER_PORTAL_FRAME(Color.white),
    ENDER_STONE(Color.getHSBColor(0.09f, 0.14f, 0.87f)),
    FENCE(Color.getHSBColor(0.04f, 0.72f, 0.64f)),
    FENCE_GATE(Color.getHSBColor(0.04f, 0.72f, 0.64f)),//
    FIRE(Color.orange),
    FLOWER_POT(Color.red),
    FURNACE(Color.lightGray),
    GLASS(Color.white),
    GLOWING_REDSTONE_ORE(Color.red),
    GLOWSTONE(Color.yellow),
    GOLD_BLOCK(Color.orange),
    GOLD_ORE(Color.orange),
    GOLD_PLATE(Color.orange),
    GRASS(Color.green),
    GRAVEL(Color.darkGray),
    HARD_CLAY(Color.getHSBColor(0.11f, 1.0f, 0.4f)),
    HAY_BLOCK(Color.yellow),
    HOPPER(Color.black),
    HUGE_MUSHROOM_1(Color.green),
    HUGE_MUSHROOM_2(Color.red),
    ICE(Color.cyan),
    IRON_BLOCK(Color.lightGray),
    IRON_DOOR_BLOCK(Color.lightGray),
    IRON_FENCE(Color.getHSBColor(0f, 0f, 0.6f)),
    IRON_ORE(Color.gray),
    IRON_PLATE(Color.lightGray),
    IRON_TRAPDOOR(Color.lightGray),
    JACK_O_LANTERN(Color.orange),
    JUKEBOX(Color.getHSBColor(0.11f, 1.0f, 0.4f)),
    JUNGLE_DOOR(Color.getHSBColor(0.1f, 0.7f, 0.64f)),
    JUNGLE_FENCE(Color.getHSBColor(0.1f, 0.7f, 0.64f)),
    JUNGLE_FENCE_GATE(Color.getHSBColor(0.1f, 0.7f, 0.64f)),
    JUNGLE_WOOD_STAIRS(Color.getHSBColor(0.1f, 0.7f, 0.64f)),
    LADDER(Color.getHSBColor(0.11f, 1.0f, 0.4f)),
    LAPIS_BLOCK(Color.blue),
    LAPIS_ORE(Color.blue),
    LAVA(Color.orange),
    LEAVES(Color.green),
    LEAVES_2(Color.green),
    LEVER(Color.getHSBColor(0.11f, 1.0f, 0.4f)),
    LOG(Color.getHSBColor(0.11f, 1.0f, 0.4f)),
    LOG_2(Color.getHSBColor(0.11f, 1.0f, 0.4f)),
    LONG_GRASS(Color.green),
    MELON_BLOCK(Color.green),
    MELON_STEM(Color.green),
    MOB_SPAWNER(Color.gray),
    MONSTER_EGGS(Color.lightGray),
    MOSSY_COBBLESTONE(Color.lightGray),
    MYCEL(Color.pink),
    NETHERRACK(Color.getHSBColor(0.99f, 1f, 0.46f)),
    NETHER_BRICK(Color.getHSBColor(0.99f, 1f, 0.46f)),
    NETHER_BRICK_STAIRS(Color.getHSBColor(0.99f, 1f, 0.46f)),
    NETHER_FENCE(Color.getHSBColor(0.99f, 1f, 0.46f)),
    NETHER_WARTS(Color.getHSBColor(0.93f, 0.96f, 0.62f)),
    NOTE_BLOCK(Color.getHSBColor(0.11f, 1.0f, 0.4f)),
    OBSIDIAN(Color.getHSBColor(0.87f, 1f, 0.09f)),
    PACKED_ICE(Color.getHSBColor(0.57f, 0.35f, 0.97f)),
    PISTON_BASE(Color.gray),
    PISTON_EXTENSION(Color.gray),
    PISTON_MOVING_PIECE(Color.gray),
    PISTON_STICKY_BASE(Color.gray),
    PORTAL(Color.magenta),
    POTATO(Color.green),
    POWERED_RAIL(Color.red),
    PRISMARINE(Color.getHSBColor(0.55f, 0.56f, 0.74f)),
    PUMPKIN(Color.orange),
    PUMPKIN_STEM(Color.green),
    QUARTZ_BLOCK(Color.getHSBColor(0.04f, 0.05f, 0.98f)),
    QUARTZ_ORE(Color.getHSBColor(0.99f, 1f, 0.46f)),
    QUARTZ_STAIRS(Color.getHSBColor(0.04f, 0.05f, 0.98f)),
    RAILS(Color.gray),
    REDSTONE_BLOCK(Color.getHSBColor(0.01f, 0.68f, 0.97f)),
    REDSTONE_COMPARATOR_OFF(Color.red),
    REDSTONE_COMPARATOR_ON(Color.red),
    REDSTONE_LAMP_OFF(Color.yellow),
    REDSTONE_LAMP_ON(Color.yellow),
    REDSTONE_ORE(Color.red),
    REDSTONE_TORCH_OFF(Color.red),
    REDSTONE_TORCH_ON(Color.red),
    REDSTONE_WIRE(Color.red),
    RED_MUSHROOM(Color.red),
    RED_ROSE(Color.red),
    RED_SANDSTONE(Color.getHSBColor(0.06f, 0.64f, 0.66f)),
    RED_SANDSTONE_STAIRS(Color.getHSBColor(0.06f, 0.64f, 0.66f)),
    SAND(Color.getHSBColor(0.15f, 0.27f, 1f)),
    SANDSTONE(Color.getHSBColor(0.15f, 0.19f, 0.96f)),
    SANDSTONE_STAIRS(Color.getHSBColor(0.15f, 0.19f, 0.96f)),
    SAPLING(Color.green),
    SEA_LANTERN(Color.getHSBColor(0.52f, 0.04f, 0.96f)),
    SIGN_POST(Color.getHSBColor(0.11f, 1.0f, 0.4f)),
    SKULL(Color.gray),
    SLIME_BLOCK(Color.green),
    SMOOTH_BRICK(Color.getHSBColor(0f, 0f, 0.46f)),
    SMOOTH_STAIRS(Color.getHSBColor(0f, 0f, 0.46f)),
    SNOW(Color.white),
    SNOW_BLOCK(Color.white),
    SOIL(Color.getHSBColor(0.11f, 1.0f, 0.4f)),
    SOUL_SAND(Color.darkGray),
    SPONGE(Color.yellow),
    SPRUCE_DOOR(Color.getHSBColor(0.07f, 0.58f, 0.5f)),
    SPRUCE_FENCE(Color.getHSBColor(0.07f, 0.58f, 0.5f)),
    SPRUCE_FENCE_GATE(Color.getHSBColor(0.07f, 0.58f, 0.5f)),
    SPRUCE_WOOD_STAIRS(Color.getHSBColor(0.07f, 0.58f, 0.5f)),
    STAINED_CLAY(Color.pink),
    STAINED_GLASS(Color.green),
    STAINED_GLASS_PANE(Color.green),
    STANDING_BANNER(Color.black),
    STATIONARY_LAVA(Color.orange),
    STATIONARY_WATER(Color.blue),
    STEP(Color.lightGray),
    STONE(Color.lightGray),
    STONE_BUTTON(Color.lightGray),
    STONE_PLATE(Color.lightGray),
    STONE_SLAB2(Color.getHSBColor(0.06f, 0.64f, 0.66f)),
    SUGAR_CANE_BLOCK(Color.green),
    THIN_GLASS(Color.white),
    TNT(Color.red),
    TORCH(Color.yellow),
    TRAPPED_CHEST(Color.getHSBColor(0.11f, 1.0f, 0.4f)),
    TRAP_DOOR(Color.getHSBColor(0.04f, 0.72f, 0.64f)),
    TRIPWIRE(Color.pink),
    TRIPWIRE_HOOK(Color.lightGray),
    VINE(Color.green),
    WALL_BANNER(Color.black),
    WALL_SIGN(Color.getHSBColor(0.11f, 1.0f, 0.4f)),
    WATER(Color.blue),
    WATER_LILY(Color.green),
    WEB(Color.white),
    WOOD(Color.getHSBColor(0.04f, 0.72f, 0.64f)),
    WOODEN_DOOR(Color.getHSBColor(0.04f, 0.72f, 0.64f)),
    WOOD_BUTTON(Color.getHSBColor(0.04f, 0.72f, 0.64f)),
    WOOD_DOUBLE_STEP(Color.getHSBColor(0.04f, 0.72f, 0.64f)),
    WOOD_PLATE(Color.getHSBColor(0.04f, 0.72f, 0.64f)),
    WOOD_STAIRS(Color.getHSBColor(0.04f, 0.72f, 0.64f)),
    WOOD_STEP(Color.getHSBColor(0.04f, 0.72f, 0.64f)),
    WOOL(Color.white),
    WORKBENCH(Color.getHSBColor(0.11f, 1.0f, 0.4f)),
    YELLOW_FLOWER(Color.yellow),
    ;

    private final Color color;

    Material(Color color) {
        this.color = color;
    }

    static String[] strings() {
        String[] m = new String[values().length];
        int i = 0;
        for (Material material : values()) {
            m[i] = material.toString();
            i++;
        }
        return m;
    }

    /**
     * Gets the Color of this Material
     *
     * @return Color of this material
     */
    public Color getColor() {
        return color;
    }

    /**
     * Gets whether this material has multiple colours.
     *
     * @return true if the material has multiple colours
     */
    public boolean isStained() {
        return switch (this) {
            case CARPET, WOOL, STAINED_CLAY, STAINED_GLASS, STAINED_GLASS_PANE -> true;
            default -> false;
        };
    }

    /**
     * Gets whether this material is glass.
     *
     * @return true if the material is glass
     */
    public boolean isGlass() {
        return switch (this) {
            case GLASS, STAINED_GLASS, STAINED_GLASS_PANE, THIN_GLASS -> true;
            default -> false;
        };
    }

    /**
     * Gets whether this Material is a cube.
     *
     * @return true if the Material is represented as a 3D cube.
     */
    public boolean isCube() {
        return switch (this) {
            case ANVIL, BARRIER, BEACON, BEDROCK, BOOKSHELF, BRICK, BURNING_FURNACE, CACTUS, CAULDRON, CHEST, CLAY, COAL_BLOCK, COAL_ORE, COBBLESTONE, COMMAND, DIAMOND_BLOCK, DIAMOND_ORE, DIRT, DISPENSER, DOUBLE_STEP, DOUBLE_STONE_SLAB2, DRAGON_EGG, DROPPER, EMERALD_BLOCK, EMERALD_ORE, ENCHANTMENT_TABLE, ENDER_CHEST, ENDER_PORTAL, ENDER_PORTAL_FRAME, ENDER_STONE, FURNACE, GLASS, GLOWING_REDSTONE_ORE, GLOWSTONE, GOLD_BLOCK, GOLD_ORE, GRASS, GRAVEL, HARD_CLAY, HAY_BLOCK, HOPPER, HUGE_MUSHROOM_1, HUGE_MUSHROOM_2, ICE, IRON_BLOCK, IRON_ORE, JACK_O_LANTERN, JUKEBOX, LAPIS_BLOCK, LAPIS_ORE, LAVA, LEAVES, LEAVES_2, LOG, LOG_2, MELON_BLOCK, MOB_SPAWNER, MONSTER_EGGS, MOSSY_COBBLESTONE, MYCEL, NETHERRACK, NETHER_BRICK, NOTE_BLOCK, OBSIDIAN, PACKED_ICE, PISTON_BASE, PISTON_STICKY_BASE, PRISMARINE, PUMPKIN, QUARTZ_BLOCK, QUARTZ_ORE, REDSTONE_BLOCK, REDSTONE_LAMP_OFF, REDSTONE_LAMP_ON, REDSTONE_ORE, RED_SANDSTONE, SAND, SANDSTONE, SEA_LANTERN, SLIME_BLOCK, SMOOTH_BRICK, SNOW_BLOCK, SOIL, SOUL_SAND, SPONGE, STAINED_CLAY, STAINED_GLASS, STATIONARY_LAVA, STATIONARY_WATER, STONE, SUGAR_CANE_BLOCK, TNT, TRAPPED_CHEST, WATER, WEB, WOOD, WOOD_DOUBLE_STEP, WOOL, WORKBENCH -> true;
            default -> false;
        };
    }

    /**
     * Gets whether this material is stair shaped.
     *
     * @return true if stairs
     */
    public boolean isStair() {
        return switch (this) {
            case ACACIA_STAIRS, BIRCH_WOOD_STAIRS, BRICK_STAIRS, COBBLESTONE_STAIRS, DARK_OAK_STAIRS, JUNGLE_WOOD_STAIRS, NETHER_BRICK_STAIRS, QUARTZ_STAIRS, RED_SANDSTONE_STAIRS, SANDSTONE_STAIRS, SMOOTH_STAIRS, SPRUCE_WOOD_STAIRS, WOOD_STAIRS -> true;
            default -> false;
        };
    }

    /**
     * Gets whether this material is stair shaped.
     *
     * @return true if stairs
     */
    public boolean isSlab() {
        return switch (this) {
            case BED_BLOCK, CAKE_BLOCK, DAYLIGHT_DETECTOR, DAYLIGHT_DETECTOR_INVERTED, STEP, STONE_SLAB2, WOOD_STEP -> true;
            default -> false;
        };
    }

    /**
     * Gets whether this material is thin.
     *
     * @return true if thin
     */
    public boolean isThin() {
        return switch (this) {
            case ACTIVATOR_RAIL, CARPET, DETECTOR_RAIL, DIODE_BLOCK_OFF, DIODE_BLOCK_ON, GOLD_PLATE, IRON_PLATE, IRON_TRAPDOOR, POWERED_RAIL, RAILS, REDSTONE_COMPARATOR_OFF, REDSTONE_COMPARATOR_ON, REDSTONE_WIRE, SNOW, STONE_PLATE, TRAP_DOOR, TRIPWIRE, WATER_LILY, WOOD_PLATE -> true;
            default -> false;
        };
    }

    /**
     * Gets whether this material is torch shaped.
     *
     * @return true if torch shaped
     */
    public boolean isStickLike() {
        return switch (this) {
            case LEVER, REDSTONE_TORCH_OFF, REDSTONE_TORCH_ON, TORCH, TRIPWIRE_HOOK -> true;
            default -> false;
        };
    }

    /**
     * Gets whether this material is a small cube.
     *
     * @return true if is a small cube
     */
    public boolean isSmall() {
        return switch (this) {
            case FLOWER_POT, SKULL, STONE_BUTTON, WOOD_BUTTON -> true;
            default -> false;
        };
    }

    /**
     * Gets whether this material is torch shaped.
     *
     * @return true if torch shaped
     */
    public boolean isDoorish() {
        return switch (this) {
            case ACACIA_DOOR, BIRCH_DOOR, DARK_OAK_DOOR, IRON_DOOR_BLOCK, JUNGLE_DOOR, LADDER, SPRUCE_DOOR, VINE, WALL_BANNER, WALL_SIGN, WOODEN_DOOR -> true;
            default -> false;
        };
    }

    /**
     * Gets whether this material is a fence part.
     *
     * @return true if part of a fence
     */
    public boolean isFence() {
        return switch (this) {
            case ACACIA_FENCE, ACACIA_FENCE_GATE, BIRCH_FENCE, BIRCH_FENCE_GATE, COBBLE_WALL, DARK_OAK_FENCE, DARK_OAK_FENCE_GATE, FENCE, FENCE_GATE, IRON_FENCE, JUNGLE_FENCE, JUNGLE_FENCE_GATE, NETHER_FENCE, PORTAL, SIGN_POST, SPRUCE_FENCE, SPRUCE_FENCE_GATE, STAINED_GLASS_PANE, STANDING_BANNER, THIN_GLASS -> true;
            default -> false;
        };
    }

    /**
     * Gets whether this material is X shaped.
     *
     * @return true if an X shape
     */
    public boolean isPlantLike() {
        return switch (this) {
            case BREWING_STAND, BROWN_MUSHROOM, CARROT, CROPS, DEAD_BUSH, DOUBLE_PLANT, LONG_GRASS, MELON_STEM, NETHER_WARTS, POTATO, PUMPKIN_STEM, RED_MUSHROOM, RED_ROSE, SAPLING, YELLOW_FLOWER -> true;
            default -> false;
        };
    }
}
