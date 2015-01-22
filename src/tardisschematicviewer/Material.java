package tardisschematicviewer;

import java.awt.Color;

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
    YELLOW_FLOWER(Color.yellow),;

    private final Color color;

    private Material(Color color) {
        this.color = color;
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
        switch (this) {
            case CARPET:
            case WOOL:
            case STAINED_CLAY:
            case STAINED_GLASS:
            case STAINED_GLASS_PANE:
                return true;
            default:
                return false;
        }
    }

    /**
     * Gets whether this material is glass.
     *
     * @return true if the material is glass
     */
    public boolean isGlass() {
        switch (this) {
            case GLASS:
            case STAINED_GLASS:
            case STAINED_GLASS_PANE:
            case THIN_GLASS:
                return true;
            default:
                return false;
        }
    }

    /**
     * Gets whether this Material is a cube.
     *
     * @return true if the Material is represented as a 3D cube.
     */
    public boolean isCube() {
        switch (this) {
            case ANVIL:
            case BARRIER:
            case BEACON:
            case BEDROCK:
            case BOOKSHELF:
            case BRICK:
            case BURNING_FURNACE:
            case CACTUS:
            case CAULDRON:
            case CHEST:
            case CLAY:
            case COAL_BLOCK:
            case COAL_ORE:
            case COBBLESTONE:
            case COMMAND:
            case DIAMOND_BLOCK:
            case DIAMOND_ORE:
            case DIRT:
            case DISPENSER:
            case DOUBLE_STEP:
            case DOUBLE_STONE_SLAB2:
            case DRAGON_EGG:
            case DROPPER:
            case EMERALD_BLOCK:
            case EMERALD_ORE:
            case ENCHANTMENT_TABLE:
            case ENDER_CHEST:
            case ENDER_PORTAL:
            case ENDER_PORTAL_FRAME:
            case ENDER_STONE:
            case FURNACE:
            case GLASS:
            case GLOWING_REDSTONE_ORE:
            case GLOWSTONE:
            case GOLD_BLOCK:
            case GOLD_ORE:
            case GRASS:
            case GRAVEL:
            case HARD_CLAY:
            case HAY_BLOCK:
            case HOPPER:
            case HUGE_MUSHROOM_1:
            case HUGE_MUSHROOM_2:
            case ICE:
            case IRON_BLOCK:
            case IRON_ORE:
            case JACK_O_LANTERN:
            case JUKEBOX:
            case LAPIS_BLOCK:
            case LAPIS_ORE:
            case LAVA:
            case LEAVES:
            case LEAVES_2:
            case LOG:
            case LOG_2:
            case MELON_BLOCK:
            case MOB_SPAWNER:
            case MONSTER_EGGS:
            case MOSSY_COBBLESTONE:
            case MYCEL:
            case NETHERRACK:
            case NETHER_BRICK:
            case NOTE_BLOCK:
            case OBSIDIAN:
            case PACKED_ICE:
            case PISTON_BASE:
            case PISTON_STICKY_BASE:
            case PRISMARINE:
            case PUMPKIN:
            case QUARTZ_BLOCK:
            case QUARTZ_ORE:
            case REDSTONE_BLOCK:
            case REDSTONE_LAMP_OFF:
            case REDSTONE_LAMP_ON:
            case REDSTONE_ORE:
            case RED_SANDSTONE:
            case SAND:
            case SANDSTONE:
            case SEA_LANTERN:
            case SLIME_BLOCK:
            case SMOOTH_BRICK:
            case SNOW_BLOCK:
            case SOIL:
            case SOUL_SAND:
            case SPONGE:
            case STAINED_CLAY:
            case STAINED_GLASS:
            case STATIONARY_LAVA:
            case STATIONARY_WATER:
            case STONE:
            case SUGAR_CANE_BLOCK:
            case TNT:
            case TRAPPED_CHEST:
            case WATER:
            case WEB:
            case WOOD:
            case WOOD_DOUBLE_STEP:
            case WOOL:
            case WORKBENCH:
                return true;
            default:
                return false;
        }
    }

    /**
     * Gets whether this material is stair shaped.
     *
     * @return true if stairs
     */
    public boolean isStair() {
        switch (this) {
            case ACACIA_STAIRS:
            case BIRCH_WOOD_STAIRS:
            case BRICK_STAIRS:
            case COBBLESTONE_STAIRS:
            case DARK_OAK_STAIRS:
            case JUNGLE_WOOD_STAIRS:
            case NETHER_BRICK_STAIRS:
            case QUARTZ_STAIRS:
            case RED_SANDSTONE_STAIRS:
            case SANDSTONE_STAIRS:
            case SMOOTH_STAIRS:
            case SPRUCE_WOOD_STAIRS:
            case WOOD_STAIRS:
                return true;
            default:
                return false;
        }
    }

    /**
     * Gets whether this material is stair shaped.
     *
     * @return true if stairs
     */
    public boolean isSlab() {
        switch (this) {
            case BED_BLOCK:
            case CAKE_BLOCK:
            case DAYLIGHT_DETECTOR:
            case DAYLIGHT_DETECTOR_INVERTED:
            case STEP:
            case STONE_SLAB2:
            case WOOD_STEP:
                return true;
            default:
                return false;
        }
    }

    /**
     * Gets whether this material is thin.
     *
     * @return true if thin
     */
    public boolean isThin() {
        switch (this) {
            case ACTIVATOR_RAIL:
            case CARPET:
            case DETECTOR_RAIL:
            case DIODE_BLOCK_OFF:
            case DIODE_BLOCK_ON:
            case GOLD_PLATE:
            case IRON_PLATE:
            case IRON_TRAPDOOR:
            case POWERED_RAIL:
            case RAILS:
            case REDSTONE_COMPARATOR_OFF:
            case REDSTONE_COMPARATOR_ON:
            case REDSTONE_WIRE:
            case SNOW:
            case STONE_PLATE:
            case TRAP_DOOR:
            case TRIPWIRE:
            case WATER_LILY:
            case WOOD_PLATE:
                return true;
            default:
                return false;
        }
    }

    /**
     * Gets whether this material is torch shaped.
     *
     * @return true if torch shaped
     */
    public boolean isStickLike() {
        switch (this) {
            case LEVER:
            case REDSTONE_TORCH_OFF:
            case REDSTONE_TORCH_ON:
            case TORCH:
            case TRIPWIRE_HOOK:
                return true;
            default:
                return false;
        }
    }

    /**
     * Gets whether this material is a small cube.
     *
     * @return true if is a small cube
     */
    public boolean isSmall() {
        switch (this) {
            case FLOWER_POT:
            case SKULL:
            case STONE_BUTTON:
            case WOOD_BUTTON:
                return true;
            default:
                return false;
        }
    }

    /**
     * Gets whether this material is torch shaped.
     *
     * @return true if torch shaped
     */
    public boolean isDoorish() {
        switch (this) {
            case ACACIA_DOOR:
            case BIRCH_DOOR:
            case DARK_OAK_DOOR:
            case IRON_DOOR_BLOCK:
            case JUNGLE_DOOR:
            case LADDER:
            case SPRUCE_DOOR:
            case VINE:
            case WALL_BANNER:
            case WALL_SIGN:
            case WOODEN_DOOR:
                return true;
            default:
                return false;
        }
    }

    /**
     * Gets whether this material is a fence part.
     *
     * @return true if part of a fence
     */
    public boolean isFence() {
        switch (this) {
            case ACACIA_FENCE:
            case ACACIA_FENCE_GATE:
            case BIRCH_FENCE:
            case BIRCH_FENCE_GATE:
            case COBBLE_WALL:
            case DARK_OAK_FENCE:
            case DARK_OAK_FENCE_GATE:
            case FENCE:
            case FENCE_GATE:
            case IRON_FENCE:
            case JUNGLE_FENCE:
            case JUNGLE_FENCE_GATE:
            case NETHER_FENCE:
            case PORTAL:
            case SIGN_POST:
            case SPRUCE_FENCE:
            case SPRUCE_FENCE_GATE:
            case STAINED_GLASS_PANE:
            case STANDING_BANNER:
            case THIN_GLASS:
                return true;
            default:
                return false;
        }
    }

    /**
     * Gets whether this material is X shaped.
     *
     * @return true if an X shape
     */
    public boolean isPlantLike() {
        switch (this) {
            case BREWING_STAND:
            case BROWN_MUSHROOM:
            case CARROT:
            case CROPS:
            case DEAD_BUSH:
            case DOUBLE_PLANT:
            case LONG_GRASS:
            case MELON_STEM:
            case NETHER_WARTS:
            case POTATO:
            case PUMPKIN_STEM:
            case RED_MUSHROOM:
            case RED_ROSE:
            case SAPLING:
            case YELLOW_FLOWER:
                return true;
            default:
                return false;
        }
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
}
