package tardisschematicviewer;

import java.awt.*;

public enum Material {

    air(Color.getHSBColor(0f, 0f, 0f)),
    acacia_button(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    acacia_door(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    acacia_fence(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    acacia_fence_gate(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    acacia_hanging_sign(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    acacia_leaves(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    acacia_log(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    acacia_planks(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    acacia_pressure_plate(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    acacia_sapling(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    acacia_sign(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    acacia_slab(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    acacia_stairs(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    acacia_trapdoor(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    acacia_wall_hanging_sign(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    acacia_wall_sign(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    acacia_wood(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    activator_rail(Color.getHSBColor(0f, 0f, 0f)),
    allium(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    amethyst_block(Color.getHSBColor(0.76f, 0.65f, 0.70f)),
    amethyst_cluster(Color.getHSBColor(0.76f, 0.65f, 0.70f)),
    ancient_debris(Color.getHSBColor(0f, 0f, 0.10f)),
    andesite(Color.getHSBColor(0f, 0f, 0.44f)),
    andesite_slab(Color.getHSBColor(0f, 0f, 0.44f)),
    andesite_stairs(Color.getHSBColor(0f, 0f, 0.44f)),
    andesite_wall(Color.getHSBColor(0f, 0f, 0.44f)),
    anvil(Color.getHSBColor(0f, 0f, 0.65f)),
    attached_melon_stem(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    attached_pumpkin_stem(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    azalea(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    azalea_leaves(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    azure_bluet(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    bamboo(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    bamboo_block(Color.getHSBColor(0.17f, 0.78f, 0.90f)),
    bamboo_button(Color.getHSBColor(0.17f, 0.78f, 0.90f)),
    bamboo_door(Color.getHSBColor(0.17f, 0.78f, 0.90f)),
    bamboo_fence(Color.getHSBColor(0.17f, 0.78f, 0.90f)),
    bamboo_fence_gate(Color.getHSBColor(0.17f, 0.78f, 0.90f)),
    bamboo_hanging_sign(Color.getHSBColor(0.17f, 0.78f, 0.90f)),
    bamboo_mosaic(Color.getHSBColor(0.17f, 0.78f, 0.90f)),
    bamboo_mosaic_slab(Color.getHSBColor(0.17f, 0.78f, 0.90f)),
    bamboo_mosaic_stairs(Color.getHSBColor(0.17f, 0.78f, 0.90f)),
    bamboo_planks(Color.getHSBColor(0.17f, 0.78f, 0.90f)),
    bamboo_pressure_plate(Color.getHSBColor(0.17f, 0.78f, 0.90f)),
    bamboo_sapling(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    bamboo_sign(Color.getHSBColor(0.17f, 0.78f, 0.90f)),
    bamboo_slab(Color.getHSBColor(0.17f, 0.78f, 0.90f)),
    bamboo_stairs(Color.getHSBColor(0.17f, 0.78f, 0.90f)),
    bamboo_trapdoor(Color.getHSBColor(0.17f, 0.78f, 0.90f)),
    bamboo_wall_hanging_sign(Color.getHSBColor(0.17f, 0.78f, 0.90f)),
    bamboo_wall_sign(Color.getHSBColor(0.17f, 0.78f, 0.90f)),
    barrel(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    barrier(Color.getHSBColor(0f, 0f, 0f)),
    basalt(Color.getHSBColor(0f, 0f, 0.10f)),
    beacon(Color.getHSBColor(0.49f, 0.58f, 0.86f)),
    bedrock(Color.getHSBColor(0f, 0f, 0.44f)),
    bee_nest(Color.getHSBColor(0.17f, 0.78f, 0.90f)),
    beehive(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    beetroots(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    bell(Color.getHSBColor(0.16f, 0.69f, 0.98f)),
    big_dripleaf(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    big_dripleaf_stem(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    birch_button(Color.getHSBColor(0.14f, 0.34f, 0.97f)),
    birch_door(Color.getHSBColor(0.14f, 0.34f, 0.97f)),
    birch_fence(Color.getHSBColor(0.14f, 0.34f, 0.97f)),
    birch_fence_gate(Color.getHSBColor(0.14f, 0.34f, 0.97f)),
    birch_hanging_sign(Color.getHSBColor(0.14f, 0.34f, 0.97f)),
    birch_leaves(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    birch_log(Color.getHSBColor(0.14f, 0.34f, 0.97f)),
    birch_planks(Color.getHSBColor(0.14f, 0.34f, 0.97f)),
    birch_pressure_plate(Color.getHSBColor(0.14f, 0.34f, 0.97f)),
    birch_sapling(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    birch_sign(Color.getHSBColor(0.14f, 0.34f, 0.97f)),
    birch_slab(Color.getHSBColor(0.14f, 0.34f, 0.97f)),
    birch_stairs(Color.getHSBColor(0.14f, 0.34f, 0.97f)),
    birch_trapdoor(Color.getHSBColor(0.14f, 0.34f, 0.97f)),
    birch_wall_hanging_sign(Color.getHSBColor(0.14f, 0.34f, 0.97f)),
    birch_wall_sign(Color.getHSBColor(0.14f, 0.34f, 0.97f)),
    birch_wood(Color.getHSBColor(0.14f, 0.34f, 0.97f)),
    black_banner(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    black_bed(Color.getHSBColor(0f, 0f, 0.10f)),
    black_candle(Color.getHSBColor(0f, 0f, 0.10f)),
    black_candle_cake(Color.getHSBColor(0f, 0f, 0f)),
    black_carpet(Color.getHSBColor(0f, 0f, 0.10f)),
    black_concrete(Color.getHSBColor(0f, 0f, 0.10f)),
    black_concrete_powder(Color.getHSBColor(0f, 0f, 0.10f)),
    black_glazed_terracotta(Color.getHSBColor(0f, 0f, 0.10f)),
    black_shulker_box(Color.getHSBColor(0f, 0f, 0.10f)),
    black_stained_glass(Color.getHSBColor(0f, 0f, 0.10f)),
    black_stained_glass_pane(Color.getHSBColor(0f, 0f, 0f)),
    black_terracotta(Color.getHSBColor(0.05f, 0.57f, 0.15f)),
    black_wall_banner(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    black_wool(Color.getHSBColor(0f, 0f, 0.10f)),
    blackstone(Color.getHSBColor(0f, 0f, 0.10f)),
    blackstone_slab(Color.getHSBColor(0f, 0f, 0.10f)),
    blackstone_stairs(Color.getHSBColor(0f, 0f, 0.10f)),
    blackstone_wall(Color.getHSBColor(0f, 0f, 0.10f)),
    blast_furnace(Color.getHSBColor(0f, 0f, 0.44f)),
    blue_banner(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    blue_bed(Color.getHSBColor(0.63f, 0.71f, 0.70f)),
    blue_candle(Color.getHSBColor(0.63f, 0.71f, 0.70f)),
    blue_candle_cake(Color.getHSBColor(0.63f, 0.71f, 0.70f)),
    blue_carpet(Color.getHSBColor(0.63f, 0.71f, 0.70f)),
    blue_concrete(Color.getHSBColor(0.63f, 0.71f, 0.70f)),
    blue_concrete_powder(Color.getHSBColor(0.63f, 0.71f, 0.70f)),
    blue_glazed_terracotta(Color.getHSBColor(0.63f, 0.71f, 0.70f)),
    blue_ice(Color.getHSBColor(0.67f, 0.37f, 1.00f)),
    blue_orchid(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    blue_shulker_box(Color.getHSBColor(0.63f, 0.71f, 0.70f)),
    blue_stained_glass(Color.getHSBColor(0.63f, 0.71f, 0.70f)),
    blue_stained_glass_pane(Color.getHSBColor(0.63f, 0.71f, 0.70f)),
    blue_terracotta(Color.getHSBColor(0.74f, 0.33f, 0.36f)),
    blue_wall_banner(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    blue_wool(Color.getHSBColor(0.63f, 0.71f, 0.70f)),
    bone_block(Color.getHSBColor(0.14f, 0.34f, 0.97f)),
    bookshelf(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    brain_coral(Color.getHSBColor(0.94f, 0.48f, 0.95f)),
    brain_coral_block(Color.getHSBColor(0.94f, 0.48f, 0.95f)),
    brain_coral_fan(Color.getHSBColor(0.94f, 0.48f, 0.95f)),
    brain_coral_wall_fan(Color.getHSBColor(0.94f, 0.48f, 0.95f)),
    brewing_stand(Color.getHSBColor(0f, 0f, 0.65f)),
    brick_slab(Color.getHSBColor(0f, 0.67f, 0.60f)),
    brick_stairs(Color.getHSBColor(0f, 0.67f, 0.60f)),
    brick_wall(Color.getHSBColor(0f, 0.67f, 0.60f)),
    bricks(Color.getHSBColor(0f, 0.67f, 0.60f)),
    brown_banner(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    brown_bed(Color.getHSBColor(0.08f, 0.50f, 0.40f)),
    brown_candle(Color.getHSBColor(0.08f, 0.50f, 0.40f)),
    brown_candle_cake(Color.getHSBColor(0.08f, 0.50f, 0.40f)),
    brown_carpet(Color.getHSBColor(0.08f, 0.50f, 0.40f)),
    brown_concrete(Color.getHSBColor(0.08f, 0.50f, 0.40f)),
    brown_concrete_powder(Color.getHSBColor(0.08f, 0.50f, 0.40f)),
    brown_glazed_terracotta(Color.getHSBColor(0.08f, 0.50f, 0.40f)),
    brown_mushroom(Color.getHSBColor(0.08f, 0.50f, 0.40f)),
    brown_mushroom_block(Color.getHSBColor(0.07f, 0.49f, 0.59f)),
    brown_shulker_box(Color.getHSBColor(0.08f, 0.50f, 0.40f)),
    brown_stained_glass(Color.getHSBColor(0.08f, 0.50f, 0.40f)),
    brown_stained_glass_pane(Color.getHSBColor(0.08f, 0.50f, 0.40f)),
    brown_terracotta(Color.getHSBColor(0.06f, 0.54f, 0.30f)),
    brown_wall_banner(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    brown_wool(Color.getHSBColor(0.08f, 0.50f, 0.40f)),
    bubble_column(Color.getHSBColor(0.67f, 0.75f, 1.00f)),
    bubble_coral(Color.getHSBColor(0.76f, 0.65f, 0.70f)),
    bubble_coral_block(Color.getHSBColor(0.76f, 0.65f, 0.70f)),
    bubble_coral_fan(Color.getHSBColor(0.76f, 0.65f, 0.70f)),
    bubble_coral_wall_fan(Color.getHSBColor(0.76f, 0.65f, 0.70f)),
    budding_amethyst(Color.getHSBColor(0.76f, 0.65f, 0.70f)),
    cactus(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    cake(Color.getHSBColor(0.08f, 0.50f, 0.40f)),
    calcite(Color.getHSBColor(0.06f, 0.23f, 0.82f)),
    campfire(Color.getHSBColor(0.08f, 0.62f, 0.51f)),
    candle(Color.getHSBColor(0.14f, 0.34f, 0.97f)),
    candle_cake(Color.getHSBColor(0.08f, 0.50f, 0.40f)),
    carrots(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    cartography_table(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    carved_pumpkin(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    cauldron(Color.getHSBColor(0f, 0f, 0.44f)),
    cave_air(Color.getHSBColor(0f, 0f, 0f)),
    cave_vines(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    cave_vines_plant(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    chain(Color.getHSBColor(0f, 0f, 0.33f)),
    chain_command_block(Color.getHSBColor(0.22f, 0.60f, 0.50f)),
    chest(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    chipped_anvil(Color.getHSBColor(0f, 0f, 0.65f)),
    chiseled_bookshelf(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    chiseled_deepslate(Color.getHSBColor(0f, 0f, 0.39f)),
    chiseled_nether_bricks(Color.getHSBColor(0f, 1.00f, 0.44f)),
    chiseled_polished_blackstone(Color.getHSBColor(0f, 0f, 0.10f)),
    chiseled_quartz_block(Color.getHSBColor(0.12f, 0.04f, 1.00f)),
    chiseled_red_sandstone(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    chiseled_sandstone(Color.getHSBColor(0.14f, 0.34f, 0.97f)),
    chiseled_stone_bricks(Color.getHSBColor(0f, 0f, 0.44f)),
    chorus_flower(Color.getHSBColor(0.76f, 0.65f, 0.70f)),
    chorus_plant(Color.getHSBColor(0.76f, 0.65f, 0.70f)),
    clay(Color.getHSBColor(0.63f, 0.11f, 0.72f)),
    coal_block(Color.getHSBColor(0f, 0f, 0.10f)),
    coal_ore(Color.getHSBColor(0f, 0f, 0.44f)),
    coarse_dirt(Color.getHSBColor(0.07f, 0.49f, 0.59f)),
    cobbled_deepslate(Color.getHSBColor(0f, 0f, 0.39f)),
    cobbled_deepslate_slab(Color.getHSBColor(0f, 0f, 0.39f)),
    cobbled_deepslate_stairs(Color.getHSBColor(0f, 0f, 0.39f)),
    cobbled_deepslate_wall(Color.getHSBColor(0f, 0f, 0.39f)),
    cobblestone(Color.getHSBColor(0f, 0f, 0.44f)),
    cobblestone_slab(Color.getHSBColor(0f, 0f, 0.44f)),
    cobblestone_stairs(Color.getHSBColor(0f, 0f, 0.44f)),
    cobblestone_wall(Color.getHSBColor(0f, 0f, 0.44f)),
    cobweb(Color.getHSBColor(0f, 0f, 0.78f)),
    cocoa(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    command_block(Color.getHSBColor(0.08f, 0.50f, 0.40f)),
    comparator(Color.getHSBColor(0f, 0f, 0.44f)),
    composter(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    conduit(Color.getHSBColor(0.49f, 0.58f, 0.86f)),
    copper_block(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    copper_ore(Color.getHSBColor(0f, 0f, 0.44f)),
    cornflower(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    cracked_deepslate_bricks(Color.getHSBColor(0f, 0f, 0.39f)),
    cracked_deepslate_tiles(Color.getHSBColor(0f, 0f, 0.39f)),
    cracked_nether_bricks(Color.getHSBColor(0f, 1.00f, 0.44f)),
    cracked_polished_blackstone_bricks(Color.getHSBColor(0f, 0f, 0.10f)),
    cracked_stone_bricks(Color.getHSBColor(0f, 0f, 0.44f)),
    crafting_table(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    creeper_head(Color.getHSBColor(0f, 0f, 0f)),
    creeper_wall_head(Color.getHSBColor(0f, 0f, 0f)),
    crimson_button(Color.getHSBColor(0.93f, 0.57f, 0.58f)),
    crimson_door(Color.getHSBColor(0.93f, 0.57f, 0.58f)),
    crimson_fence(Color.getHSBColor(0.93f, 0.57f, 0.58f)),
    crimson_fence_gate(Color.getHSBColor(0.93f, 0.57f, 0.58f)),
    crimson_fungus(Color.getHSBColor(0f, 1.00f, 0.44f)),
    crimson_hanging_sign(Color.getHSBColor(0.93f, 0.57f, 0.58f)),
    crimson_hyphae(Color.getHSBColor(0.99f, 0.73f, 0.36f)),
    crimson_nylium(Color.getHSBColor(1.00f, 0.75f, 0.74f)),
    crimson_planks(Color.getHSBColor(0.93f, 0.57f, 0.58f)),
    crimson_pressure_plate(Color.getHSBColor(0.93f, 0.57f, 0.58f)),
    crimson_roots(Color.getHSBColor(0f, 1.00f, 0.44f)),
    crimson_sign(Color.getHSBColor(0.93f, 0.57f, 0.58f)),
    crimson_slab(Color.getHSBColor(0.93f, 0.57f, 0.58f)),
    crimson_stairs(Color.getHSBColor(0.93f, 0.57f, 0.58f)),
    crimson_stem(Color.getHSBColor(0.93f, 0.57f, 0.58f)),
    crimson_trapdoor(Color.getHSBColor(0.93f, 0.57f, 0.58f)),
    crimson_wall_hanging_sign(Color.getHSBColor(0.93f, 0.57f, 0.58f)),
    crimson_wall_sign(Color.getHSBColor(0.93f, 0.57f, 0.58f)),
    crying_obsidian(Color.getHSBColor(0f, 0f, 0.10f)),
    cut_copper(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    cut_copper_slab(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    cut_copper_stairs(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    cut_red_sandstone(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    cut_red_sandstone_slab(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    cut_sandstone(Color.getHSBColor(0.14f, 0.34f, 0.97f)),
    cut_sandstone_slab(Color.getHSBColor(0.14f, 0.34f, 0.97f)),
    cyan_banner(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    cyan_bed(Color.getHSBColor(0.56f, 0.50f, 0.60f)),
    cyan_candle(Color.getHSBColor(0.56f, 0.50f, 0.60f)),
    cyan_candle_cake(Color.getHSBColor(0.56f, 0.50f, 0.60f)),
    cyan_carpet(Color.getHSBColor(0.56f, 0.50f, 0.60f)),
    cyan_concrete(Color.getHSBColor(0.56f, 0.50f, 0.60f)),
    cyan_concrete_powder(Color.getHSBColor(0.56f, 0.50f, 0.60f)),
    cyan_glazed_terracotta(Color.getHSBColor(0.56f, 0.50f, 0.60f)),
    cyan_shulker_box(Color.getHSBColor(0.56f, 0.50f, 0.60f)),
    cyan_stained_glass(Color.getHSBColor(0.56f, 0.50f, 0.60f)),
    cyan_stained_glass_pane(Color.getHSBColor(0.56f, 0.50f, 0.60f)),
    cyan_terracotta(Color.getHSBColor(0.50f, 0.05f, 0.36f)),
    cyan_wall_banner(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    cyan_wool(Color.getHSBColor(0.56f, 0.50f, 0.60f)),
    damaged_anvil(Color.getHSBColor(0f, 0f, 0.65f)),
    dandelion(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    dark_oak_button(Color.getHSBColor(0.08f, 0.50f, 0.40f)),
    dark_oak_door(Color.getHSBColor(0.08f, 0.50f, 0.40f)),
    dark_oak_fence(Color.getHSBColor(0.08f, 0.50f, 0.40f)),
    dark_oak_fence_gate(Color.getHSBColor(0.08f, 0.50f, 0.40f)),
    dark_oak_hanging_sign(Color.getHSBColor(0.08f, 0.50f, 0.40f)),
    dark_oak_leaves(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    dark_oak_log(Color.getHSBColor(0.08f, 0.50f, 0.40f)),
    dark_oak_planks(Color.getHSBColor(0.08f, 0.50f, 0.40f)),
    dark_oak_pressure_plate(Color.getHSBColor(0.08f, 0.50f, 0.40f)),
    dark_oak_sapling(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    dark_oak_sign(Color.getHSBColor(0.08f, 0.50f, 0.40f)),
    dark_oak_slab(Color.getHSBColor(0.08f, 0.50f, 0.40f)),
    dark_oak_stairs(Color.getHSBColor(0.08f, 0.50f, 0.40f)),
    dark_oak_trapdoor(Color.getHSBColor(0.08f, 0.50f, 0.40f)),
    dark_oak_wall_hanging_sign(Color.getHSBColor(0.08f, 0.50f, 0.40f)),
    dark_oak_wall_sign(Color.getHSBColor(0.08f, 0.50f, 0.40f)),
    dark_oak_wood(Color.getHSBColor(0.08f, 0.50f, 0.40f)),
    dark_prismarine(Color.getHSBColor(0.49f, 0.58f, 0.86f)),
    dark_prismarine_slab(Color.getHSBColor(0.49f, 0.58f, 0.86f)),
    dark_prismarine_stairs(Color.getHSBColor(0.49f, 0.58f, 0.86f)),
    daylight_detector(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    dead_brain_coral(Color.getHSBColor(0f, 0f, 0.30f)),
    dead_brain_coral_block(Color.getHSBColor(0f, 0f, 0.30f)),
    dead_brain_coral_fan(Color.getHSBColor(0f, 0f, 0.30f)),
    dead_brain_coral_wall_fan(Color.getHSBColor(0f, 0f, 0.30f)),
    dead_bubble_coral(Color.getHSBColor(0f, 0f, 0.30f)),
    dead_bubble_coral_block(Color.getHSBColor(0f, 0f, 0.30f)),
    dead_bubble_coral_fan(Color.getHSBColor(0f, 0f, 0.30f)),
    dead_bubble_coral_wall_fan(Color.getHSBColor(0f, 0f, 0.30f)),
    dead_bush(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    dead_fire_coral(Color.getHSBColor(0f, 0f, 0.30f)),
    dead_fire_coral_block(Color.getHSBColor(0f, 0f, 0.30f)),
    dead_fire_coral_fan(Color.getHSBColor(0f, 0f, 0.30f)),
    dead_fire_coral_wall_fan(Color.getHSBColor(0f, 0f, 0.30f)),
    dead_horn_coral(Color.getHSBColor(0f, 0f, 0.30f)),
    dead_horn_coral_block(Color.getHSBColor(0f, 0f, 0.30f)),
    dead_horn_coral_fan(Color.getHSBColor(0f, 0f, 0.30f)),
    dead_horn_coral_wall_fan(Color.getHSBColor(0f, 0f, 0.30f)),
    dead_tube_coral(Color.getHSBColor(0f, 0f, 0.30f)),
    dead_tube_coral_block(Color.getHSBColor(0f, 0f, 0.30f)),
    dead_tube_coral_fan(Color.getHSBColor(0f, 0f, 0.30f)),
    dead_tube_coral_wall_fan(Color.getHSBColor(0f, 0f, 0.30f)),
    deepslate(Color.getHSBColor(0f, 0f, 0.39f)),
    deepslate_brick_slab(Color.getHSBColor(0f, 0f, 0.39f)),
    deepslate_brick_stairs(Color.getHSBColor(0f, 0f, 0.39f)),
    deepslate_brick_wall(Color.getHSBColor(0f, 0f, 0.39f)),
    deepslate_bricks(Color.getHSBColor(0f, 0f, 0.39f)),
    deepslate_coal_ore(Color.getHSBColor(0f, 0f, 0.39f)),
    deepslate_copper_ore(Color.getHSBColor(0f, 0f, 0.39f)),
    deepslate_diamond_ore(Color.getHSBColor(0f, 0f, 0.39f)),
    deepslate_emerald_ore(Color.getHSBColor(0f, 0f, 0.39f)),
    deepslate_gold_ore(Color.getHSBColor(0f, 0f, 0.39f)),
    deepslate_iron_ore(Color.getHSBColor(0f, 0f, 0.39f)),
    deepslate_lapis_ore(Color.getHSBColor(0f, 0f, 0.39f)),
    deepslate_redstone_ore(Color.getHSBColor(0f, 0f, 0.39f)),
    deepslate_tile_slab(Color.getHSBColor(0f, 0f, 0.39f)),
    deepslate_tile_stairs(Color.getHSBColor(0f, 0f, 0.39f)),
    deepslate_tile_wall(Color.getHSBColor(0f, 0f, 0.39f)),
    deepslate_tiles(Color.getHSBColor(0f, 0f, 0.39f)),
    detector_rail(Color.getHSBColor(0f, 0f, 0.44f)),
    diamond_block(Color.getHSBColor(0.49f, 0.58f, 0.86f)),
    diamond_ore(Color.getHSBColor(0f, 0f, 0.44f)),
    diorite(Color.getHSBColor(0.12f, 0.04f, 1.00f)),
    diorite_slab(Color.getHSBColor(0.12f, 0.04f, 1.00f)),
    diorite_stairs(Color.getHSBColor(0.12f, 0.04f, 1.00f)),
    diorite_wall(Color.getHSBColor(0.12f, 0.04f, 1.00f)),
    dirt(Color.getHSBColor(0.07f, 0.49f, 0.59f)),
    dirt_path(Color.getHSBColor(0.07f, 0.49f, 0.59f)),
    dispenser(Color.getHSBColor(0f, 0f, 0.44f)),
    dragon_egg(Color.getHSBColor(0f, 0f, 0.10f)),
    dragon_head(Color.getHSBColor(0f, 0f, 0f)),
    dragon_wall_head(Color.getHSBColor(0f, 0f, 0f)),
    dried_kelp_block(Color.getHSBColor(0.22f, 0.60f, 0.50f)),
    dripstone_block(Color.getHSBColor(0.06f, 0.54f, 0.30f)),
    dropper(Color.getHSBColor(0f, 0f, 0.44f)),
    emerald_block(Color.getHSBColor(0.38f, 1.00f, 0.85f)),
    emerald_ore(Color.getHSBColor(0f, 0f, 0.44f)),
    enchanting_table(Color.getHSBColor(0f, 0.67f, 0.60f)),
    end_gateway(Color.getHSBColor(0f, 0f, 0.10f)),
    end_portal(Color.getHSBColor(0f, 0f, 0.10f)),
    end_portal_frame(Color.getHSBColor(0.22f, 0.60f, 0.50f)),
    end_rod(Color.getHSBColor(0.22f, 0.60f, 0.50f)),
    end_stone(Color.getHSBColor(0.14f, 0.34f, 0.97f)),
    end_stone_brick_slab(Color.getHSBColor(0.14f, 0.34f, 0.97f)),
    end_stone_brick_stairs(Color.getHSBColor(0.14f, 0.34f, 0.97f)),
    end_stone_brick_wall(Color.getHSBColor(0.14f, 0.34f, 0.97f)),
    end_stone_bricks(Color.getHSBColor(0.14f, 0.34f, 0.97f)),
    ender_chest(Color.getHSBColor(0f, 0f, 0.44f)),
    exposed_copper(Color.getHSBColor(0.04f, 0.27f, 0.53f)),
    exposed_cut_copper(Color.getHSBColor(0.04f, 0.27f, 0.53f)),
    exposed_cut_copper_slab(Color.getHSBColor(0.04f, 0.27f, 0.53f)),
    exposed_cut_copper_stairs(Color.getHSBColor(0.04f, 0.27f, 0.53f)),
    farmland(Color.getHSBColor(0.07f, 0.49f, 0.59f)),
    fern(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    fire(Color.getHSBColor(0f, 1.00f, 1.00f)),
    fire_coral(Color.getHSBColor(0f, 0.67f, 0.60f)),
    fire_coral_block(Color.getHSBColor(0f, 0.67f, 0.60f)),
    fire_coral_fan(Color.getHSBColor(0f, 0.67f, 0.60f)),
    fire_coral_wall_fan(Color.getHSBColor(0f, 0.67f, 0.60f)),
    fletching_table(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    flower_pot(Color.getHSBColor(0f, 0f, 0f)),
    flowering_azalea(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    flowering_azalea_leaves(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    frogspawn(Color.getHSBColor(0.67f, 0.75f, 1.00f)),
    frosted_ice(Color.getHSBColor(0.67f, 0.37f, 1.00f)),
    furnace(Color.getHSBColor(0f, 0f, 0.44f)),
    gilded_blackstone(Color.getHSBColor(0f, 0f, 0.10f)),
    glass(Color.getHSBColor(0f, 0f, 0f)),
    glass_pane(Color.getHSBColor(0f, 0f, 0f)),
    glow_lichen(Color.getHSBColor(0.43f, 0.24f, 0.65f)),
    glowstone(Color.getHSBColor(0.14f, 0.34f, 0.97f)),
    gold_block(Color.getHSBColor(0.16f, 0.69f, 0.98f)),
    gold_ore(Color.getHSBColor(0f, 0f, 0.44f)),
    granite(Color.getHSBColor(0.07f, 0.49f, 0.59f)),
    granite_slab(Color.getHSBColor(0.07f, 0.49f, 0.59f)),
    granite_stairs(Color.getHSBColor(0.07f, 0.49f, 0.59f)),
    granite_wall(Color.getHSBColor(0.07f, 0.49f, 0.59f)),
    grass(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    grass_block(Color.getHSBColor(0.24f, 0.69f, 0.70f)),
    gravel(Color.getHSBColor(0f, 0f, 0.44f)),
    gray_banner(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    gray_bed(Color.getHSBColor(0f, 0f, 0.30f)),
    gray_candle(Color.getHSBColor(0f, 0f, 0.30f)),
    gray_candle_cake(Color.getHSBColor(0f, 0f, 0.30f)),
    gray_carpet(Color.getHSBColor(0f, 0f, 0.30f)),
    gray_concrete(Color.getHSBColor(0f, 0f, 0.30f)),
    gray_concrete_powder(Color.getHSBColor(0f, 0f, 0.30f)),
    gray_glazed_terracotta(Color.getHSBColor(0f, 0f, 0.30f)),
    gray_shulker_box(Color.getHSBColor(0f, 0f, 0.30f)),
    gray_stained_glass(Color.getHSBColor(0f, 0f, 0.30f)),
    gray_stained_glass_pane(Color.getHSBColor(0f, 0f, 0.30f)),
    gray_terracotta(Color.getHSBColor(0.05f, 0.39f, 0.22f)),
    gray_wall_banner(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    gray_wool(Color.getHSBColor(0f, 0f, 0.30f)),
    green_banner(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    green_bed(Color.getHSBColor(0.22f, 0.60f, 0.50f)),
    green_candle(Color.getHSBColor(0.22f, 0.60f, 0.50f)),
    green_candle_cake(Color.getHSBColor(0.22f, 0.60f, 0.50f)),
    green_carpet(Color.getHSBColor(0.22f, 0.60f, 0.50f)),
    green_concrete(Color.getHSBColor(0.22f, 0.60f, 0.50f)),
    green_concrete_powder(Color.getHSBColor(0.22f, 0.60f, 0.50f)),
    green_glazed_terracotta(Color.getHSBColor(0.22f, 0.60f, 0.50f)),
    green_shulker_box(Color.getHSBColor(0.22f, 0.60f, 0.50f)),
    green_stained_glass(Color.getHSBColor(0.22f, 0.60f, 0.50f)),
    green_stained_glass_pane(Color.getHSBColor(0.22f, 0.60f, 0.50f)),
    green_terracotta(Color.getHSBColor(0.19f, 0.49f, 0.32f)),
    green_wall_banner(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    green_wool(Color.getHSBColor(0.22f, 0.60f, 0.50f)),
    grindstone(Color.getHSBColor(0f, 0f, 0.65f)),
    hanging_roots(Color.getHSBColor(0.07f, 0.49f, 0.59f)),
    hay_block(Color.getHSBColor(0.17f, 0.78f, 0.90f)),
    heavy_weighted_pressure_plate(Color.getHSBColor(0f, 0f, 0.65f)),
    honey_block(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    honeycomb_block(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    hopper(Color.getHSBColor(0f, 0f, 0.44f)),
    horn_coral(Color.getHSBColor(0.17f, 0.78f, 0.90f)),
    horn_coral_block(Color.getHSBColor(0.17f, 0.78f, 0.90f)),
    horn_coral_fan(Color.getHSBColor(0.17f, 0.78f, 0.90f)),
    horn_coral_wall_fan(Color.getHSBColor(0.17f, 0.78f, 0.90f)),
    ice(Color.getHSBColor(0.67f, 0.37f, 1.00f)),
    infested_chiseled_stone_bricks(Color.getHSBColor(0.63f, 0.11f, 0.72f)),
    infested_cobblestone(Color.getHSBColor(0.63f, 0.11f, 0.72f)),
    infested_cracked_stone_bricks(Color.getHSBColor(0.63f, 0.11f, 0.72f)),
    infested_deepslate(Color.getHSBColor(0f, 0f, 0.39f)),
    infested_mossy_stone_bricks(Color.getHSBColor(0.63f, 0.11f, 0.72f)),
    infested_stone(Color.getHSBColor(0.63f, 0.11f, 0.72f)),
    infested_stone_bricks(Color.getHSBColor(0.63f, 0.11f, 0.72f)),
    iron_bars(Color.getHSBColor(0f, 0f, 0.44f)),
    iron_block(Color.getHSBColor(0f, 0f, 0.65f)),
    iron_door(Color.getHSBColor(0f, 0f, 0.65f)),
    iron_ore(Color.getHSBColor(0f, 0f, 0.44f)),
    iron_trapdoor(Color.getHSBColor(0f, 0f, 0.65f)),
    jack_o_lantern(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    jigsaw(Color.getHSBColor(0f, 0f, 0.60f)),
    jukebox(Color.getHSBColor(0.07f, 0.49f, 0.59f)),
    jungle_button(Color.getHSBColor(0.07f, 0.49f, 0.59f)),
    jungle_door(Color.getHSBColor(0.07f, 0.49f, 0.59f)),
    jungle_fence(Color.getHSBColor(0.07f, 0.49f, 0.59f)),
    jungle_fence_gate(Color.getHSBColor(0.07f, 0.49f, 0.59f)),
    jungle_hanging_sign(Color.getHSBColor(0.07f, 0.49f, 0.59f)),
    jungle_leaves(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    jungle_log(Color.getHSBColor(0.07f, 0.49f, 0.59f)),
    jungle_planks(Color.getHSBColor(0.07f, 0.49f, 0.59f)),
    jungle_pressure_plate(Color.getHSBColor(0.07f, 0.49f, 0.59f)),
    jungle_sapling(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    jungle_sign(Color.getHSBColor(0.07f, 0.49f, 0.59f)),
    jungle_slab(Color.getHSBColor(0.07f, 0.49f, 0.59f)),
    jungle_stairs(Color.getHSBColor(0.07f, 0.49f, 0.59f)),
    jungle_trapdoor(Color.getHSBColor(0.07f, 0.49f, 0.59f)),
    jungle_wall_hanging_sign(Color.getHSBColor(0.07f, 0.49f, 0.59f)),
    jungle_wall_sign(Color.getHSBColor(0.07f, 0.49f, 0.59f)),
    jungle_wood(Color.getHSBColor(0.07f, 0.49f, 0.59f)),
    kelp(Color.getHSBColor(0.67f, 0.75f, 1.00f)),
    kelp_plant(Color.getHSBColor(0.67f, 0.75f, 1.00f)),
    ladder(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    lantern(Color.getHSBColor(0f, 0f, 0.65f)),
    lapis_block(Color.getHSBColor(0.62f, 0.71f, 1.00f)),
    lapis_ore(Color.getHSBColor(0f, 0f, 0.44f)),
    large_amethyst_bud(Color.getHSBColor(0.76f, 0.65f, 0.70f)),
    large_fern(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    lava(Color.getHSBColor(0f, 1.00f, 1.00f)),
    lava_cauldron(Color.getHSBColor(0f, 0f, 0.44f)),
    lectern(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    lever(Color.getHSBColor(0f, 0f, 0.44f)),
    light(Color.getHSBColor(0f, 0f, 0f)),
    light_blue_banner(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    light_blue_bed(Color.getHSBColor(0.59f, 0.53f, 0.85f)),
    light_blue_candle(Color.getHSBColor(0.59f, 0.53f, 0.85f)),
    light_blue_candle_cake(Color.getHSBColor(0.59f, 0.53f, 0.85f)),
    light_blue_carpet(Color.getHSBColor(0.59f, 0.53f, 0.85f)),
    light_blue_concrete(Color.getHSBColor(0.59f, 0.53f, 0.85f)),
    light_blue_concrete_powder(Color.getHSBColor(0.59f, 0.53f, 0.85f)),
    light_blue_glazed_terracotta(Color.getHSBColor(0.59f, 0.53f, 0.85f)),
    light_blue_shulker_box(Color.getHSBColor(0.59f, 0.53f, 0.85f)),
    light_blue_stained_glass(Color.getHSBColor(0.59f, 0.53f, 0.85f)),
    light_blue_stained_glass_pane(Color.getHSBColor(0.59f, 0.53f, 0.85f)),
    light_blue_terracotta(Color.getHSBColor(0.69f, 0.22f, 0.54f)),
    light_blue_wall_banner(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    light_blue_wool(Color.getHSBColor(0.59f, 0.53f, 0.85f)),
    light_gray_banner(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    light_gray_bed(Color.getHSBColor(0f, 0f, 0.60f)),
    light_gray_candle(Color.getHSBColor(0f, 0f, 0.60f)),
    light_gray_candle_cake(Color.getHSBColor(0f, 0f, 0.60f)),
    light_gray_carpet(Color.getHSBColor(0f, 0f, 0.60f)),
    light_gray_concrete(Color.getHSBColor(0f, 0f, 0.60f)),
    light_gray_concrete_powder(Color.getHSBColor(0f, 0f, 0.60f)),
    light_gray_glazed_terracotta(Color.getHSBColor(0f, 0f, 0.60f)),
    light_gray_shulker_box(Color.getHSBColor(0f, 0f, 0.60f)),
    light_gray_stained_glass(Color.getHSBColor(0f, 0f, 0.60f)),
    light_gray_stained_glass_pane(Color.getHSBColor(0f, 0f, 0.60f)),
    light_gray_terracotta(Color.getHSBColor(0.04f, 0.27f, 0.53f)),
    light_gray_wall_banner(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    light_gray_wool(Color.getHSBColor(0f, 0f, 0.60f)),
    light_weighted_pressure_plate(Color.getHSBColor(0.16f, 0.69f, 0.98f)),
    lightning_rod(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    lilac(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    lily_of_the_valley(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    lily_pad(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    lime_banner(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    lime_bed(Color.getHSBColor(0.24f, 0.88f, 0.80f)),
    lime_candle(Color.getHSBColor(0.24f, 0.88f, 0.80f)),
    lime_candle_cake(Color.getHSBColor(0.24f, 0.88f, 0.80f)),
    lime_carpet(Color.getHSBColor(0.24f, 0.88f, 0.80f)),
    lime_concrete(Color.getHSBColor(0.24f, 0.88f, 0.80f)),
    lime_concrete_powder(Color.getHSBColor(0.24f, 0.88f, 0.80f)),
    lime_glazed_terracotta(Color.getHSBColor(0.24f, 0.88f, 0.80f)),
    lime_shulker_box(Color.getHSBColor(0.24f, 0.88f, 0.80f)),
    lime_stained_glass(Color.getHSBColor(0.24f, 0.88f, 0.80f)),
    lime_stained_glass_pane(Color.getHSBColor(0.24f, 0.88f, 0.80f)),
    lime_terracotta(Color.getHSBColor(0.20f, 0.55f, 0.46f)),
    lime_wall_banner(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    lime_wool(Color.getHSBColor(0.24f, 0.88f, 0.80f)),
    lodestone(Color.getHSBColor(0f, 0f, 0.65f)),
    loom(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    magenta_banner(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    magenta_bed(Color.getHSBColor(0.79f, 0.65f, 0.85f)),
    magenta_candle(Color.getHSBColor(0.79f, 0.65f, 0.85f)),
    magenta_candle_cake(Color.getHSBColor(0.79f, 0.65f, 0.85f)),
    magenta_carpet(Color.getHSBColor(0.79f, 0.65f, 0.85f)),
    magenta_concrete(Color.getHSBColor(0.79f, 0.65f, 0.85f)),
    magenta_concrete_powder(Color.getHSBColor(0.79f, 0.65f, 0.85f)),
    magenta_glazed_terracotta(Color.getHSBColor(0.79f, 0.65f, 0.85f)),
    magenta_shulker_box(Color.getHSBColor(0.79f, 0.65f, 0.85f)),
    magenta_stained_glass(Color.getHSBColor(0.79f, 0.65f, 0.85f)),
    magenta_stained_glass_pane(Color.getHSBColor(0.79f, 0.65f, 0.85f)),
    magenta_terracotta(Color.getHSBColor(0.94f, 0.42f, 0.58f)),
    magenta_wall_banner(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    magenta_wool(Color.getHSBColor(0.79f, 0.65f, 0.85f)),
    magma_block(Color.getHSBColor(0f, 1.00f, 0.44f)),
    mangrove_button(Color.getHSBColor(0f, 0.67f, 0.60f)),
    mangrove_door(Color.getHSBColor(0f, 0.67f, 0.60f)),
    mangrove_fence(Color.getHSBColor(0f, 0.67f, 0.60f)),
    mangrove_fence_gate(Color.getHSBColor(0f, 0.67f, 0.60f)),
    mangrove_hanging_sign(Color.getHSBColor(0f, 0.67f, 0.60f)),
    mangrove_leaves(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    mangrove_log(Color.getHSBColor(0f, 0.67f, 0.60f)),
    mangrove_planks(Color.getHSBColor(0f, 0.67f, 0.60f)),
    mangrove_pressure_plate(Color.getHSBColor(0f, 0.67f, 0.60f)),
    mangrove_propagule(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    mangrove_roots(Color.getHSBColor(0.08f, 0.62f, 0.51f)),
    mangrove_sign(Color.getHSBColor(0f, 0.67f, 0.60f)),
    mangrove_slab(Color.getHSBColor(0f, 0.67f, 0.60f)),
    mangrove_stairs(Color.getHSBColor(0f, 0.67f, 0.60f)),
    mangrove_trapdoor(Color.getHSBColor(0f, 0.67f, 0.60f)),
    mangrove_wall_hanging_sign(Color.getHSBColor(0f, 0.67f, 0.60f)),
    mangrove_wall_sign(Color.getHSBColor(0f, 0.67f, 0.60f)),
    mangrove_wood(Color.getHSBColor(0f, 0.67f, 0.60f)),
    medium_amethyst_bud(Color.getHSBColor(0.76f, 0.65f, 0.70f)),
    melon(Color.getHSBColor(0.24f, 0.88f, 0.80f)),
    melon_stem(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    moss_block(Color.getHSBColor(0.22f, 0.60f, 0.50f)),
    moss_carpet(Color.getHSBColor(0.22f, 0.60f, 0.50f)),
    mossy_cobblestone(Color.getHSBColor(0f, 0f, 0.44f)),
    mossy_cobblestone_slab(Color.getHSBColor(0f, 0f, 0.44f)),
    mossy_cobblestone_stairs(Color.getHSBColor(0f, 0f, 0.44f)),
    mossy_cobblestone_wall(Color.getHSBColor(0f, 0f, 0.44f)),
    mossy_stone_brick_slab(Color.getHSBColor(0f, 0f, 0.44f)),
    mossy_stone_brick_stairs(Color.getHSBColor(0f, 0f, 0.44f)),
    mossy_stone_brick_wall(Color.getHSBColor(0f, 0f, 0.44f)),
    mossy_stone_bricks(Color.getHSBColor(0f, 0f, 0.44f)),
    moving_piston(Color.getHSBColor(0f, 0f, 0.44f)),
    mud(Color.getHSBColor(0.50f, 0.05f, 0.36f)),
    mud_brick_slab(Color.getHSBColor(0.04f, 0.27f, 0.53f)),
    mud_brick_stairs(Color.getHSBColor(0.04f, 0.27f, 0.53f)),
    mud_brick_wall(Color.getHSBColor(0.04f, 0.27f, 0.53f)),
    mud_bricks(Color.getHSBColor(0.04f, 0.27f, 0.53f)),
    muddy_mangrove_roots(Color.getHSBColor(0.08f, 0.62f, 0.51f)),
    mushroom_stem(Color.getHSBColor(0f, 0f, 0.78f)),
    mycelium(Color.getHSBColor(0.76f, 0.65f, 0.70f)),
    nether_brick_fence(Color.getHSBColor(0f, 1.00f, 0.44f)),
    nether_brick_slab(Color.getHSBColor(0f, 1.00f, 0.44f)),
    nether_brick_stairs(Color.getHSBColor(0f, 1.00f, 0.44f)),
    nether_brick_wall(Color.getHSBColor(0f, 1.00f, 0.44f)),
    nether_bricks(Color.getHSBColor(0f, 1.00f, 0.44f)),
    nether_gold_ore(Color.getHSBColor(0f, 1.00f, 0.44f)),
    nether_portal(Color.getHSBColor(0f, 0f, 0f)),
    nether_quartz_ore(Color.getHSBColor(0f, 1.00f, 0.44f)),
    nether_sprouts(Color.getHSBColor(0.56f, 0.50f, 0.60f)),
    nether_wart(Color.getHSBColor(0f, 0.67f, 0.60f)),
    nether_wart_block(Color.getHSBColor(0f, 0.67f, 0.60f)),
    netherite_block(Color.getHSBColor(0f, 0f, 0.10f)),
    netherrack(Color.getHSBColor(0f, 1.00f, 0.44f)),
    note_block(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    oak_button(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    oak_door(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    oak_fence(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    oak_fence_gate(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    oak_hanging_sign(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    oak_leaves(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    oak_log(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    oak_planks(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    oak_pressure_plate(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    oak_sapling(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    oak_sign(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    oak_slab(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    oak_stairs(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    oak_trapdoor(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    oak_wall_hanging_sign(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    oak_wall_sign(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    oak_wood(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    observer(Color.getHSBColor(0f, 0f, 0.44f)),
    obsidian(Color.getHSBColor(0f, 0f, 0.10f)),
    ochre_froglight(Color.getHSBColor(0.14f, 0.34f, 0.97f)),
    orange_banner(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    orange_bed(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    orange_candle(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    orange_candle_cake(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    orange_carpet(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    orange_concrete(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    orange_concrete_powder(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    orange_glazed_terracotta(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    orange_shulker_box(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    orange_stained_glass(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    orange_stained_glass_pane(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    orange_terracotta(Color.getHSBColor(0.06f, 0.77f, 0.62f)),
    orange_tulip(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    orange_wall_banner(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    orange_wool(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    oxeye_daisy(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    oxidized_copper(Color.getHSBColor(0.51f, 0.84f, 0.53f)),
    oxidized_cut_copper(Color.getHSBColor(0.51f, 0.84f, 0.53f)),
    oxidized_cut_copper_slab(Color.getHSBColor(0.51f, 0.84f, 0.53f)),
    oxidized_cut_copper_stairs(Color.getHSBColor(0.51f, 0.84f, 0.53f)),
    packed_ice(Color.getHSBColor(0.67f, 0.37f, 1.00f)),
    packed_mud(Color.getHSBColor(0.07f, 0.49f, 0.59f)),
    pearlescent_froglight(Color.getHSBColor(0.94f, 0.48f, 0.95f)),
    peony(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    petrified_oak_slab(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    piglin_head(Color.getHSBColor(0f, 0f, 0f)),
    piglin_wall_head(Color.getHSBColor(0f, 0f, 0f)),
    pink_banner(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    pink_bed(Color.getHSBColor(0.94f, 0.48f, 0.95f)),
    pink_candle(Color.getHSBColor(0.94f, 0.48f, 0.95f)),
    pink_candle_cake(Color.getHSBColor(0.94f, 0.48f, 0.95f)),
    pink_carpet(Color.getHSBColor(0.94f, 0.48f, 0.95f)),
    pink_concrete(Color.getHSBColor(0.94f, 0.48f, 0.95f)),
    pink_concrete_powder(Color.getHSBColor(0.94f, 0.48f, 0.95f)),
    pink_glazed_terracotta(Color.getHSBColor(0.94f, 0.48f, 0.95f)),
    pink_shulker_box(Color.getHSBColor(0.94f, 0.48f, 0.95f)),
    pink_stained_glass(Color.getHSBColor(0.94f, 0.48f, 0.95f)),
    pink_stained_glass_pane(Color.getHSBColor(0.94f, 0.48f, 0.95f)),
    pink_terracotta(Color.getHSBColor(1.00f, 0.52f, 0.63f)),
    pink_tulip(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    pink_wall_banner(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    pink_wool(Color.getHSBColor(0.94f, 0.48f, 0.95f)),
    piston(Color.getHSBColor(0f, 0f, 0.44f)),
    piston_head(Color.getHSBColor(0f, 0f, 0.44f)),
    player_head(Color.getHSBColor(0f, 0f, 0f)),
    player_wall_head(Color.getHSBColor(0f, 0f, 0f)),
    podzol(Color.getHSBColor(0.08f, 0.62f, 0.51f)),
    pointed_dripstone(Color.getHSBColor(0.06f, 0.54f, 0.30f)),
    polished_andesite(Color.getHSBColor(0f, 0f, 0.44f)),
    polished_andesite_slab(Color.getHSBColor(0f, 0f, 0.44f)),
    polished_andesite_stairs(Color.getHSBColor(0f, 0f, 0.44f)),
    polished_basalt(Color.getHSBColor(0f, 0f, 0.10f)),
    polished_blackstone(Color.getHSBColor(0f, 0f, 0.10f)),
    polished_blackstone_brick_slab(Color.getHSBColor(0f, 0f, 0.10f)),
    polished_blackstone_brick_stairs(Color.getHSBColor(0f, 0f, 0.10f)),
    polished_blackstone_brick_wall(Color.getHSBColor(0f, 0f, 0.10f)),
    polished_blackstone_bricks(Color.getHSBColor(0f, 0f, 0.10f)),
    polished_blackstone_button(Color.getHSBColor(0f, 0f, 0.10f)),
    polished_blackstone_pressure_plate(Color.getHSBColor(0f, 0f, 0.10f)),
    polished_blackstone_slab(Color.getHSBColor(0f, 0f, 0.10f)),
    polished_blackstone_stairs(Color.getHSBColor(0f, 0f, 0.10f)),
    polished_blackstone_wall(Color.getHSBColor(0f, 0f, 0.10f)),
    polished_deepslate(Color.getHSBColor(0f, 0f, 0.39f)),
    polished_deepslate_slab(Color.getHSBColor(0f, 0f, 0.39f)),
    polished_deepslate_stairs(Color.getHSBColor(0f, 0f, 0.39f)),
    polished_deepslate_wall(Color.getHSBColor(0f, 0f, 0.39f)),
    polished_diorite(Color.getHSBColor(0.12f, 0.04f, 1.00f)),
    polished_diorite_slab(Color.getHSBColor(0.12f, 0.04f, 1.00f)),
    polished_diorite_stairs(Color.getHSBColor(0.12f, 0.04f, 1.00f)),
    polished_granite(Color.getHSBColor(0.07f, 0.49f, 0.59f)),
    polished_granite_slab(Color.getHSBColor(0.07f, 0.49f, 0.59f)),
    polished_granite_stairs(Color.getHSBColor(0.07f, 0.49f, 0.59f)),
    poppy(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    potatoes(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    potted_acacia_sapling(Color.getHSBColor(0f, 0f, 0f)),
    potted_allium(Color.getHSBColor(0f, 0f, 0f)),
    potted_azalea_bush(Color.getHSBColor(0f, 0f, 0f)),
    potted_azure_bluet(Color.getHSBColor(0f, 0f, 0f)),
    potted_bamboo(Color.getHSBColor(0f, 0f, 0f)),
    potted_birch_sapling(Color.getHSBColor(0f, 0f, 0f)),
    potted_blue_orchid(Color.getHSBColor(0f, 0f, 0f)),
    potted_brown_mushroom(Color.getHSBColor(0f, 0f, 0f)),
    potted_cactus(Color.getHSBColor(0f, 0f, 0f)),
    potted_cornflower(Color.getHSBColor(0f, 0f, 0f)),
    potted_crimson_fungus(Color.getHSBColor(0f, 0f, 0f)),
    potted_crimson_roots(Color.getHSBColor(0f, 0f, 0f)),
    potted_dandelion(Color.getHSBColor(0f, 0f, 0f)),
    potted_dark_oak_sapling(Color.getHSBColor(0f, 0f, 0f)),
    potted_dead_bush(Color.getHSBColor(0f, 0f, 0f)),
    potted_fern(Color.getHSBColor(0f, 0f, 0f)),
    potted_flowering_azalea_bush(Color.getHSBColor(0f, 0f, 0f)),
    potted_jungle_sapling(Color.getHSBColor(0f, 0f, 0f)),
    potted_lily_of_the_valley(Color.getHSBColor(0f, 0f, 0f)),
    potted_mangrove_propagule(Color.getHSBColor(0f, 0f, 0f)),
    potted_oak_sapling(Color.getHSBColor(0f, 0f, 0f)),
    potted_orange_tulip(Color.getHSBColor(0f, 0f, 0f)),
    potted_oxeye_daisy(Color.getHSBColor(0f, 0f, 0f)),
    potted_pink_tulip(Color.getHSBColor(0f, 0f, 0f)),
    potted_poppy(Color.getHSBColor(0f, 0f, 0f)),
    potted_red_mushroom(Color.getHSBColor(0f, 0f, 0f)),
    potted_red_tulip(Color.getHSBColor(0f, 0f, 0f)),
    potted_spruce_sapling(Color.getHSBColor(0f, 0f, 0f)),
    potted_warped_fungus(Color.getHSBColor(0f, 0f, 0f)),
    potted_warped_roots(Color.getHSBColor(0f, 0f, 0f)),
    potted_white_tulip(Color.getHSBColor(0f, 0f, 0f)),
    potted_wither_rose(Color.getHSBColor(0f, 0f, 0f)),
    powder_snow(Color.getHSBColor(0f, 0f, 1.00f)),
    powder_snow_cauldron(Color.getHSBColor(0f, 0f, 0.44f)),
    powered_rail(Color.getHSBColor(0f, 0f, 0f)),
    prismarine(Color.getHSBColor(0.56f, 0.50f, 0.60f)),
    prismarine_brick_slab(Color.getHSBColor(0.49f, 0.58f, 0.86f)),
    prismarine_brick_stairs(Color.getHSBColor(0.49f, 0.58f, 0.86f)),
    prismarine_bricks(Color.getHSBColor(0.49f, 0.58f, 0.86f)),
    prismarine_slab(Color.getHSBColor(0.56f, 0.50f, 0.60f)),
    prismarine_stairs(Color.getHSBColor(0.56f, 0.50f, 0.60f)),
    prismarine_wall(Color.getHSBColor(0.56f, 0.50f, 0.60f)),
    pumpkin(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    pumpkin_stem(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    purple_banner(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    purple_bed(Color.getHSBColor(0.76f, 0.65f, 0.70f)),
    purple_candle(Color.getHSBColor(0.76f, 0.65f, 0.70f)),
    purple_candle_cake(Color.getHSBColor(0f, 0f, 0f)),
    purple_carpet(Color.getHSBColor(0.76f, 0.65f, 0.70f)),
    purple_concrete(Color.getHSBColor(0.76f, 0.65f, 0.70f)),
    purple_concrete_powder(Color.getHSBColor(0.76f, 0.65f, 0.70f)),
    purple_glazed_terracotta(Color.getHSBColor(0.76f, 0.65f, 0.70f)),
    purple_shulker_box(Color.getHSBColor(0.95f, 0.40f, 0.48f)),
    purple_stained_glass(Color.getHSBColor(0.76f, 0.65f, 0.70f)),
    purple_stained_glass_pane(Color.getHSBColor(0f, 0f, 0f)),
    purple_terracotta(Color.getHSBColor(0.95f, 0.40f, 0.48f)),
    purple_wall_banner(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    purple_wool(Color.getHSBColor(0.76f, 0.65f, 0.70f)),
    purpur_block(Color.getHSBColor(0.79f, 0.65f, 0.85f)),
    purpur_pillar(Color.getHSBColor(0.79f, 0.65f, 0.85f)),
    purpur_slab(Color.getHSBColor(0.79f, 0.65f, 0.85f)),
    purpur_stairs(Color.getHSBColor(0.79f, 0.65f, 0.85f)),
    quartz_block(Color.getHSBColor(0.12f, 0.04f, 1.00f)),
    quartz_bricks(Color.getHSBColor(0.12f, 0.04f, 1.00f)),
    quartz_pillar(Color.getHSBColor(0.12f, 0.04f, 1.00f)),
    quartz_slab(Color.getHSBColor(0.12f, 0.04f, 1.00f)),
    quartz_stairs(Color.getHSBColor(0.12f, 0.04f, 1.00f)),
    rail(Color.getHSBColor(0f, 0f, 0.44f)),
    raw_copper_block(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    raw_gold_block(Color.getHSBColor(0.16f, 0.69f, 0.98f)),
    raw_iron_block(Color.getHSBColor(0.07f, 0.32f, 0.85f)),
    red_banner(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    red_bed(Color.getHSBColor(0f, 0.67f, 0.60f)),
    red_candle(Color.getHSBColor(0f, 0.67f, 0.60f)),
    red_candle_cake(Color.getHSBColor(0f, 0.67f, 0.60f)),
    red_carpet(Color.getHSBColor(0f, 0.67f, 0.60f)),
    red_concrete(Color.getHSBColor(0f, 0.67f, 0.60f)),
    red_concrete_powder(Color.getHSBColor(0f, 0.67f, 0.60f)),
    red_glazed_terracotta(Color.getHSBColor(0f, 0.67f, 0.60f)),
    red_mushroom(Color.getHSBColor(0f, 0.67f, 0.60f)),
    red_mushroom_block(Color.getHSBColor(0f, 0.67f, 0.60f)),
    red_nether_brick_slab(Color.getHSBColor(0f, 1.00f, 0.44f)),
    red_nether_brick_stairs(Color.getHSBColor(0f, 1.00f, 0.44f)),
    red_nether_brick_wall(Color.getHSBColor(0f, 1.00f, 0.44f)),
    red_nether_bricks(Color.getHSBColor(0f, 1.00f, 0.44f)),
    red_sand(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    red_sandstone(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    red_sandstone_slab(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    red_sandstone_stairs(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    red_sandstone_wall(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    red_shulker_box(Color.getHSBColor(0f, 0.67f, 0.60f)),
    red_stained_glass(Color.getHSBColor(0f, 0.67f, 0.60f)),
    red_stained_glass_pane(Color.getHSBColor(0f, 0.67f, 0.60f)),
    red_terracotta(Color.getHSBColor(0.02f, 0.68f, 0.56f)),
    red_tulip(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    red_wall_banner(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    red_wool(Color.getHSBColor(0f, 0.67f, 0.60f)),
    redstone_block(Color.getHSBColor(0f, 0.67f, 0.60f)),
    redstone_lamp(Color.getHSBColor(0f, 0.67f, 0.60f)),
    redstone_ore(Color.getHSBColor(0f, 0f, 0.44f)),
    redstone_torch(Color.getHSBColor(0f, 0.67f, 0.60f)),
    redstone_wall_torch(Color.getHSBColor(0f, 0.67f, 0.60f)),
    redstone_wire(Color.getHSBColor(0f, 0.67f, 0.60f)),
    reinforced_deepslate(Color.getHSBColor(0f, 0f, 0.39f)),
    repeater(Color.getHSBColor(0f, 0f, 0.44f)),
    repeating_command_block(Color.getHSBColor(0.76f, 0.65f, 0.70f)),
    respawn_anchor(Color.getHSBColor(0f, 0f, 0.10f)),
    rooted_dirt(Color.getHSBColor(0.07f, 0.49f, 0.59f)),
    rose_bush(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    sand(Color.getHSBColor(0.14f, 0.34f, 0.97f)),
    sandstone(Color.getHSBColor(0.14f, 0.34f, 0.97f)),
    sandstone_slab(Color.getHSBColor(0.14f, 0.34f, 0.97f)),
    sandstone_stairs(Color.getHSBColor(0.14f, 0.34f, 0.97f)),
    sandstone_wall(Color.getHSBColor(0.14f, 0.34f, 0.97f)),
    scaffolding(Color.getHSBColor(0.14f, 0.34f, 0.97f)),
    sculk(Color.getHSBColor(0f, 0f, 0.10f)),
    sculk_catalyst(Color.getHSBColor(0f, 0f, 0.10f)),
    sculk_sensor(Color.getHSBColor(0.56f, 0.50f, 0.60f)),
    sculk_shrieker(Color.getHSBColor(0f, 0f, 0.10f)),
    sculk_vein(Color.getHSBColor(0f, 0f, 0.10f)),
    sea_lantern(Color.getHSBColor(0.12f, 0.04f, 1.00f)),
    sea_pickle(Color.getHSBColor(0.22f, 0.60f, 0.50f)),
    seagrass(Color.getHSBColor(0.67f, 0.75f, 1.00f)),
    shroomlight(Color.getHSBColor(0f, 0.67f, 0.60f)),
    shulker_box(Color.getHSBColor(0.76f, 0.65f, 0.70f)),
    skeleton_skull(Color.getHSBColor(0f, 0f, 0.44f)),
    skeleton_wall_skull(Color.getHSBColor(0f, 0f, 0.44f)),
    slime_block(Color.getHSBColor(0.24f, 0.69f, 0.70f)),
    small_amethyst_bud(Color.getHSBColor(0.76f, 0.65f, 0.70f)),
    small_dripleaf(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    smithing_table(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    smoker(Color.getHSBColor(0f, 0f, 0.44f)),
    smooth_basalt(Color.getHSBColor(0f, 0f, 0.10f)),
    smooth_quartz(Color.getHSBColor(0.12f, 0.04f, 1.00f)),
    smooth_quartz_slab(Color.getHSBColor(0.12f, 0.04f, 1.00f)),
    smooth_quartz_stairs(Color.getHSBColor(0.12f, 0.04f, 1.00f)),
    smooth_red_sandstone(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    smooth_red_sandstone_slab(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    smooth_red_sandstone_stairs(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    smooth_sandstone(Color.getHSBColor(0.14f, 0.34f, 0.97f)),
    smooth_sandstone_slab(Color.getHSBColor(0.14f, 0.34f, 0.97f)),
    smooth_sandstone_stairs(Color.getHSBColor(0.14f, 0.34f, 0.97f)),
    smooth_stone(Color.getHSBColor(0f, 0f, 0.44f)),
    smooth_stone_slab(Color.getHSBColor(0f, 0f, 0.44f)),
    snow(Color.getHSBColor(0f, 0f, 1.00f)),
    snow_block(Color.getHSBColor(0f, 0f, 1.00f)),
    soul_campfire(Color.getHSBColor(0.08f, 0.62f, 0.51f)),
    soul_fire(Color.getHSBColor(0.59f, 0.53f, 0.85f)),
    soul_lantern(Color.getHSBColor(0f, 0f, 0.65f)),
    soul_sand(Color.getHSBColor(0.08f, 0.50f, 0.40f)),
    soul_soil(Color.getHSBColor(0.08f, 0.50f, 0.40f)),
    soul_torch(Color.getHSBColor(0.56f, 0.50f, 0.60f)),
    soul_wall_torch(Color.getHSBColor(0.56f, 0.50f, 0.60f)),
    spawner(Color.getHSBColor(0f, 0f, 0.44f)),
    sponge(Color.getHSBColor(0.17f, 0.78f, 0.90f)),
    spore_blossom(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    spruce_button(Color.getHSBColor(0.08f, 0.62f, 0.51f)),
    spruce_door(Color.getHSBColor(0.08f, 0.62f, 0.51f)),
    spruce_fence(Color.getHSBColor(0.08f, 0.62f, 0.51f)),
    spruce_fence_gate(Color.getHSBColor(0.08f, 0.62f, 0.51f)),
    spruce_hanging_sign(Color.getHSBColor(0.08f, 0.62f, 0.51f)),
    spruce_leaves(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    spruce_log(Color.getHSBColor(0.08f, 0.62f, 0.51f)),
    spruce_planks(Color.getHSBColor(0.08f, 0.62f, 0.51f)),
    spruce_pressure_plate(Color.getHSBColor(0.08f, 0.62f, 0.51f)),
    spruce_sapling(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    spruce_sign(Color.getHSBColor(0.08f, 0.62f, 0.51f)),
    spruce_slab(Color.getHSBColor(0.08f, 0.62f, 0.51f)),
    spruce_stairs(Color.getHSBColor(0.08f, 0.62f, 0.51f)),
    spruce_trapdoor(Color.getHSBColor(0.08f, 0.62f, 0.51f)),
    spruce_wall_hanging_sign(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    spruce_wall_sign(Color.getHSBColor(0.08f, 0.62f, 0.51f)),
    spruce_wood(Color.getHSBColor(0.08f, 0.62f, 0.51f)),
    sticky_piston(Color.getHSBColor(0f, 0f, 0.44f)),
    stone(Color.getHSBColor(0f, 0f, 0.44f)),
    stone_brick_slab(Color.getHSBColor(0f, 0f, 0.44f)),
    stone_brick_stairs(Color.getHSBColor(0f, 0f, 0.44f)),
    stone_brick_wall(Color.getHSBColor(0f, 0f, 0.44f)),
    stone_bricks(Color.getHSBColor(0f, 0f, 0.44f)),
    stone_button(Color.getHSBColor(0f, 0f, 0.44f)),
    stone_pressure_plate(Color.getHSBColor(0f, 0f, 0.44f)),
    stone_slab(Color.getHSBColor(0f, 0f, 0.44f)),
    stone_stairs(Color.getHSBColor(0f, 0f, 0.44f)),
    stonecutter(Color.getHSBColor(0f, 0f, 0.44f)),
    stripped_acacia_log(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    stripped_acacia_wood(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    stripped_bamboo_block(Color.getHSBColor(0.17f, 0.78f, 0.90f)),
    stripped_birch_log(Color.getHSBColor(0.14f, 0.34f, 0.97f)),
    stripped_birch_wood(Color.getHSBColor(0.14f, 0.34f, 0.97f)),
    stripped_crimson_hyphae(Color.getHSBColor(0.99f, 0.73f, 0.36f)),
    stripped_crimson_stem(Color.getHSBColor(0.93f, 0.57f, 0.58f)),
    stripped_dark_oak_log(Color.getHSBColor(0.08f, 0.50f, 0.40f)),
    stripped_dark_oak_wood(Color.getHSBColor(0.08f, 0.50f, 0.40f)),
    stripped_jungle_log(Color.getHSBColor(0.07f, 0.49f, 0.59f)),
    stripped_jungle_wood(Color.getHSBColor(0.07f, 0.49f, 0.59f)),
    stripped_mangrove_log(Color.getHSBColor(0f, 0.67f, 0.60f)),
    stripped_mangrove_wood(Color.getHSBColor(0f, 0.67f, 0.60f)),
    stripped_oak_log(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    stripped_oak_wood(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    stripped_spruce_log(Color.getHSBColor(0.08f, 0.62f, 0.51f)),
    stripped_spruce_wood(Color.getHSBColor(0.08f, 0.62f, 0.51f)),
    stripped_warped_hyphae(Color.getHSBColor(0.93f, 0.49f, 0.34f)),
    stripped_warped_stem(Color.getHSBColor(0.50f, 0.59f, 0.56f)),
    structure_block(Color.getHSBColor(0f, 0f, 0.60f)),
    structure_void(Color.getHSBColor(0f, 0f, 0f)),
    sugar_cane(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    sunflower(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    sweet_berry_bush(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    tall_grass(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    tall_seagrass(Color.getHSBColor(0.67f, 0.75f, 1.00f)),
    target(Color.getHSBColor(0.12f, 0.04f, 1.00f)),
    terracotta(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    tinted_glass(Color.getHSBColor(0f, 0f, 0.30f)),
    tnt(Color.getHSBColor(0f, 1.00f, 1.00f)),
    torch(Color.getHSBColor(0.17f, 0.78f, 0.90f)),
    trapped_chest(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    tripwire(Color.getHSBColor(0.17f, 0.78f, 0.90f)),
    tripwire_hook(Color.getHSBColor(0f, 0f, 0.44f)),
    tube_coral(Color.getHSBColor(0.63f, 0.71f, 0.70f)),
    tube_coral_block(Color.getHSBColor(0.63f, 0.71f, 0.70f)),
    tube_coral_fan(Color.getHSBColor(0.63f, 0.71f, 0.70f)),
    tube_coral_wall_fan(Color.getHSBColor(0.63f, 0.71f, 0.70f)),
    tuff(Color.getHSBColor(0.05f, 0.39f, 0.22f)),
    turtle_egg(Color.getHSBColor(0.14f, 0.34f, 0.97f)),
    twisting_vines(Color.getHSBColor(0.56f, 0.50f, 0.60f)),
    twisting_vines_plant(Color.getHSBColor(0.56f, 0.50f, 0.60f)),
    verdant_froglight(Color.getHSBColor(0.43f, 0.24f, 0.65f)),
    vine(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    void_air(Color.getHSBColor(0f, 0f, 0f)),
    wall_torch(Color.getHSBColor(0.17f, 0.78f, 0.90f)),
    warped_button(Color.getHSBColor(0.50f, 0.59f, 0.56f)),
    warped_door(Color.getHSBColor(0.50f, 0.59f, 0.56f)),
    warped_fence(Color.getHSBColor(0.50f, 0.59f, 0.56f)),
    warped_fence_gate(Color.getHSBColor(0.50f, 0.59f, 0.56f)),
    warped_fungus(Color.getHSBColor(0.56f, 0.50f, 0.60f)),
    warped_hanging_sign(Color.getHSBColor(0.50f, 0.59f, 0.56f)),
    warped_hyphae(Color.getHSBColor(0.93f, 0.49f, 0.34f)),
    warped_nylium(Color.getHSBColor(0.51f, 0.84f, 0.53f)),
    warped_planks(Color.getHSBColor(0.50f, 0.59f, 0.56f)),
    warped_pressure_plate(Color.getHSBColor(0.50f, 0.59f, 0.56f)),
    warped_roots(Color.getHSBColor(0.56f, 0.50f, 0.60f)),
    warped_sign(Color.getHSBColor(0.50f, 0.59f, 0.56f)),
    warped_slab(Color.getHSBColor(0.50f, 0.59f, 0.56f)),
    warped_stairs(Color.getHSBColor(0.50f, 0.59f, 0.56f)),
    warped_stem(Color.getHSBColor(0.50f, 0.59f, 0.56f)),
    warped_trapdoor(Color.getHSBColor(0.50f, 0.59f, 0.56f)),
    warped_wall_hanging_sign(Color.getHSBColor(0.50f, 0.59f, 0.56f)),
    warped_wall_sign(Color.getHSBColor(0.50f, 0.59f, 0.56f)),
    warped_wart_block(Color.getHSBColor(0.45f, 0.89f, 0.71f)),
    water(Color.getHSBColor(0.67f, 0.75f, 1.00f)),
    water_cauldron(Color.getHSBColor(0f, 0f, 0.44f)),
    waxed_copper_block(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    waxed_cut_copper(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    waxed_cut_copper_slab(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    waxed_cut_copper_stairs(Color.getHSBColor(0.08f, 0.76f, 0.85f)),
    waxed_exposed_copper(Color.getHSBColor(0.04f, 0.27f, 0.53f)),
    waxed_exposed_cut_copper(Color.getHSBColor(0.04f, 0.27f, 0.53f)),
    waxed_exposed_cut_copper_slab(Color.getHSBColor(0.04f, 0.27f, 0.53f)),
    waxed_exposed_cut_copper_stairs(Color.getHSBColor(0.04f, 0.27f, 0.53f)),
    waxed_oxidized_copper(Color.getHSBColor(0.51f, 0.84f, 0.53f)),
    waxed_oxidized_cut_copper(Color.getHSBColor(0.51f, 0.84f, 0.53f)),
    waxed_oxidized_cut_copper_slab(Color.getHSBColor(0.51f, 0.84f, 0.53f)),
    waxed_oxidized_cut_copper_stairs(Color.getHSBColor(0.51f, 0.84f, 0.53f)),
    waxed_weathered_copper(Color.getHSBColor(0.50f, 0.59f, 0.56f)),
    waxed_weathered_cut_copper(Color.getHSBColor(0.50f, 0.59f, 0.56f)),
    waxed_weathered_cut_copper_slab(Color.getHSBColor(0.50f, 0.59f, 0.56f)),
    waxed_weathered_cut_copper_stairs(Color.getHSBColor(0.50f, 0.59f, 0.56f)),
    weathered_copper(Color.getHSBColor(0.50f, 0.59f, 0.56f)),
    weathered_cut_copper(Color.getHSBColor(0.50f, 0.59f, 0.56f)),
    weathered_cut_copper_slab(Color.getHSBColor(0.50f, 0.59f, 0.56f)),
    weathered_cut_copper_stairs(Color.getHSBColor(0.50f, 0.59f, 0.56f)),
    weeping_vines(Color.getHSBColor(0f, 1.00f, 0.44f)),
    weeping_vines_plant(Color.getHSBColor(0f, 1.00f, 0.44f)),
    wet_sponge(Color.getHSBColor(0.17f, 0.78f, 0.90f)),
    wheat(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    white_banner(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    white_bed(Color.getHSBColor(0f, 0f, 1.00f)),
    white_candle(Color.getHSBColor(0f, 0f, 0.78f)),
    white_candle_cake(Color.getHSBColor(0f, 0f, 1.00f)),
    white_carpet(Color.getHSBColor(0f, 0f, 1.00f)),
    white_concrete(Color.getHSBColor(0f, 0f, 1.00f)),
    white_concrete_powder(Color.getHSBColor(0f, 0f, 1.00f)),
    white_glazed_terracotta(Color.getHSBColor(0f, 0f, 1.00f)),
    white_shulker_box(Color.getHSBColor(0f, 0f, 1.00f)),
    white_stained_glass(Color.getHSBColor(0f, 0f, 1.00f)),
    white_stained_glass_pane(Color.getHSBColor(0f, 0f, 1.00f)),
    white_terracotta(Color.getHSBColor(0.06f, 0.23f, 0.82f)),
    white_tulip(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    white_wall_banner(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    white_wool(Color.getHSBColor(0f, 0f, 1.00f)),
    wither_rose(Color.getHSBColor(0.33f, 1.00f, 0.49f)),
    wither_skeleton_skull(Color.getHSBColor(0f, 0f, 0.44f)),
    wither_skeleton_wall_skull(Color.getHSBColor(0f, 0f, 0.44f)),
    yellow_banner(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    yellow_bed(Color.getHSBColor(0.17f, 0.78f, 0.90f)),
    yellow_candle(Color.getHSBColor(0.17f, 0.78f, 0.90f)),
    yellow_candle_cake(Color.getHSBColor(0.17f, 0.78f, 0.90f)),
    yellow_carpet(Color.getHSBColor(0.17f, 0.78f, 0.90f)),
    yellow_concrete(Color.getHSBColor(0.17f, 0.78f, 0.90f)),
    yellow_concrete_powder(Color.getHSBColor(0.17f, 0.78f, 0.90f)),
    yellow_glazed_terracotta(Color.getHSBColor(0.17f, 0.78f, 0.90f)),
    yellow_shulker_box(Color.getHSBColor(0.17f, 0.78f, 0.90f)),
    yellow_stained_glass(Color.getHSBColor(0.17f, 0.78f, 0.90f)),
    yellow_stained_glass_pane(Color.getHSBColor(0.17f, 0.78f, 0.90f)),
    yellow_terracotta(Color.getHSBColor(0.11f, 0.81f, 0.73f)),
    yellow_wall_banner(Color.getHSBColor(0.11f, 0.50f, 0.56f)),
    yellow_wool(Color.getHSBColor(0.17f, 0.78f, 0.90f)),
    zombie_head(Color.getHSBColor(0f, 0f, 0f)),
    zombie_wall_head(Color.getHSBColor(0f, 0f, 0f));

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

    public static Material fromDataString(String data) {
        // "minecraft:cobblestone_stairs[facing=east,half=top,shape=straight,waterlogged=false]"
        String[] colon = data.split(":");
        String[] leftSquare = colon[1].split("\\[");
        try {
            return Material.valueOf(leftSquare[0]);
        } catch (IllegalArgumentException e) {
            return Material.air;
        }
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
     * Gets whether this material is glass.
     *
     * @return true if the material is glass
     */
    public boolean isGlass() {
        return switch (this) {
            case black_stained_glass, black_stained_glass_pane,
                    blue_stained_glass, blue_stained_glass_pane,
                    brown_stained_glass, brown_stained_glass_pane,
                    cyan_stained_glass, cyan_stained_glass_pane,
                    glass_pane, tinted_glass, glass,
                    gray_stained_glass, gray_stained_glass_pane,
                    green_stained_glass, green_stained_glass_pane,
                    light_blue_stained_glass, light_blue_stained_glass_pane,
                    light_gray_stained_glass, light_gray_stained_glass_pane,
                    lime_stained_glass, lime_stained_glass_pane,
                    magenta_stained_glass, magenta_stained_glass_pane,
                    orange_stained_glass, orange_stained_glass_pane,
                    pink_stained_glass, pink_stained_glass_pane,
                    purple_stained_glass, purple_stained_glass_pane,
                    red_stained_glass, red_stained_glass_pane,
                    white_stained_glass, white_stained_glass_pane,
                    yellow_stained_glass, yellow_stained_glass_pane -> true;
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
            case acacia_stairs, birch_stairs, brick_stairs, cobblestone_stairs, dark_oak_stairs, jungle_stairs,
                    nether_brick_stairs, quartz_stairs, red_sandstone_stairs, sandstone_stairs, andesite_stairs, spruce_stairs,
                    oak_stairs, bamboo_mosaic_stairs, bamboo_stairs, blackstone_stairs, cobbled_deepslate_stairs, stone_brick_stairs, crimson_stairs,
                    stone_stairs, cut_copper_stairs, dark_prismarine_stairs, deepslate_brick_stairs, deepslate_tile_stairs, diorite_stairs, end_stone_brick_stairs,
                    exposed_cut_copper_stairs, granite_stairs, mangrove_stairs, mossy_cobblestone_stairs, mossy_stone_brick_stairs, mud_brick_stairs,
                    oxidized_cut_copper_stairs, polished_andesite_stairs, polished_blackstone_brick_stairs, polished_blackstone_stairs, polished_deepslate_stairs,
                    polished_diorite_stairs, polished_granite_stairs, prismarine_brick_stairs, prismarine_stairs, purpur_stairs, red_nether_brick_stairs,
                    smooth_quartz_stairs, smooth_red_sandstone_stairs, smooth_sandstone_stairs, warped_stairs, waxed_cut_copper_stairs, waxed_exposed_cut_copper_stairs,
                    waxed_oxidized_cut_copper_stairs, waxed_weathered_cut_copper_stairs, weathered_cut_copper_stairs ->
                    true;
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
            case white_bed, red_bed, blue_bed, light_blue_bed, orange_bed, magenta_bed, cyan_bed,
                    black_bed, brown_bed, light_gray_bed, gray_bed, purple_bed, lime_bed, pink_bed, green_bed, yellow_bed,
                    cake, daylight_detector, acacia_slab, andesite_slab, bamboo_mosaic_slab,
                    bamboo_slab, birch_slab, blackstone_slab, brick_slab, cobbled_deepslate_slab,
                    cobblestone_slab, crimson_slab, cut_copper_slab, cut_red_sandstone_slab,
                    cut_sandstone_slab, dark_oak_slab, dark_prismarine_slab, deepslate_tile_slab,
                    diorite_slab, end_stone_brick_slab, exposed_cut_copper_slab, granite_slab,
                    jungle_slab, mangrove_slab, mossy_cobblestone_slab, mossy_stone_brick_slab,
                    mud_brick_slab, nether_brick_slab, oak_slab, oxidized_cut_copper_slab,
                    petrified_oak_slab, polished_andesite_slab, polished_blackstone_brick_slab,
                    polished_blackstone_slab, polished_deepslate_slab, polished_diorite_slab,
                    polished_granite_slab, prismarine_brick_slab, prismarine_slab, purpur_slab,
                    quartz_slab, red_nether_brick_slab, red_sandstone_slab, sandstone_slab,
                    smooth_quartz_slab, smooth_red_sandstone_slab, smooth_sandstone_slab,
                    smooth_stone_slab, spruce_slab, stone_brick_slab, stone_slab, warped_slab,
                    waxed_cut_copper_slab, waxed_exposed_cut_copper_slab, waxed_oxidized_cut_copper_slab,
                    waxed_weathered_cut_copper_slab, weathered_cut_copper_slab -> true;
            default -> false;
        };
    }

    /**
     * Gets whether this material is thin.
     *
     * @return true if thin
     */
    public boolean isThin() {
        switch (this) {
            case activator_rail:
            case black_carpet:
            case blue_carpet:
            case brown_carpet:
            case cyan_carpet:
            case gray_carpet:
            case green_carpet:
            case light_blue_carpet:
            case light_gray_carpet:
            case lime_carpet:
            case magenta_carpet:
            case moss_carpet:
            case orange_carpet:
            case pink_carpet:
            case purple_carpet:
            case red_carpet:
            case white_carpet:
            case yellow_carpet:
            case detector_rail:
            case repeater:
            case heavy_weighted_pressure_plate:
            case light_weighted_pressure_plate:
            case iron_trapdoor:
            case powered_rail:
            case rail:
            case comparator:
            case redstone_wire:
            case snow:
            case acacia_pressure_plate:
            case oak_pressure_plate:
            case birch_pressure_plate:
            case jungle_pressure_plate:
            case spruce_pressure_plate:
            case mangrove_pressure_plate:
            case bamboo_pressure_plate:
            case dark_oak_pressure_plate:
            case crimson_pressure_plate:
            case polished_blackstone_pressure_plate:
            case stone_pressure_plate:
            case warped_pressure_plate:
            case acacia_trapdoor:
            case oak_trapdoor:
            case birch_trapdoor:
            case jungle_trapdoor:
            case spruce_trapdoor:
            case mangrove_trapdoor:
            case bamboo_trapdoor:
            case dark_oak_trapdoor:
            case crimson_trapdoor:
            case warped_trapdoor:
            case tripwire:
            case lily_pad:
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
        return switch (this) {
            case lever, redstone_torch, soul_torch, torch, tripwire_hook, redstone_wall_torch, soul_wall_torch, wall_torch, end_rod ->
                    true;
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
            case flower_pot, skeleton_skull, wither_skeleton_skull, stone_button,
                    oak_button, skeleton_wall_skull, wither_skeleton_wall_skull, creeper_head,
                    creeper_wall_head, piglin_head, piglin_wall_head, player_wall_head, player_head,
                    zombie_wall_head, zombie_head, acacia_button, bamboo_button, birch_button, crimson_button,
                    dark_oak_button, jungle_button, mangrove_button, polished_blackstone_button,
                    spruce_button, warped_button -> true;
            default -> false;
        };
    }

    /**
     * Gets whether this material is torch shaped.
     *
     * @return true if torch shaped
     */
    public boolean isDoorish() {
        switch (this) {
            case acacia_door:
            case birch_door:
            case dark_oak_door:
            case iron_door:
            case jungle_door:
            case ladder:
            case spruce_door:
            case vine:
//            case wall_banner:
//            case wall_sign:
            case oak_door:
            case bamboo_door:
            case crimson_door:
            case mangrove_door:
            case warped_door:
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
            case acacia_fence:
            case acacia_fence_gate:
            case acacia_sign:
            case acacia_wall_hanging_sign:
            case acacia_wall_sign:
            case andesite_wall:
            case bamboo_fence:
            case bamboo_fence_gate:
            case bamboo_sign:
            case bamboo_wall_hanging_sign:
            case bamboo_wall_sign:
            case birch_fence:
            case birch_fence_gate:
            case birch_sign:
            case birch_wall_hanging_sign:
            case birch_wall_sign:
            case black_banner:
            case black_stained_glass_pane:
            case black_wall_banner:
            case blackstone_wall:
            case blue_banner:
            case blue_stained_glass_pane:
            case blue_wall_banner:
            case brick_wall:
            case brown_banner:
            case brown_stained_glass_pane:
            case brown_wall_banner:
            case cobbled_deepslate_wall:
            case cobblestone_wall:
            case crimson_fence:
            case crimson_fence_gate:
            case cyan_banner:
            case cyan_stained_glass_pane:
            case cyan_wall_banner:
            case dark_oak_fence:
            case dark_oak_fence_gate:
            case dark_oak_sign:
            case dark_oak_wall_hanging_sign:
            case dark_oak_wall_sign:
            case deepslate_brick_wall:
            case deepslate_tile_wall:
            case diorite_wall:
            case end_stone_brick_wall:
            case glass_pane:
            case granite_wall:
            case gray_banner:
            case gray_stained_glass_pane:
            case gray_wall_banner:
            case green_banner:
            case green_stained_glass_pane:
            case green_wall_banner:
            case iron_bars:
            case jungle_fence:
            case jungle_fence_gate:
            case jungle_sign:
            case jungle_wall_hanging_sign:
            case jungle_wall_sign:
            case light_blue_banner:
            case light_blue_stained_glass_pane:
            case light_blue_wall_banner:
            case light_gray_banner:
            case light_gray_stained_glass_pane:
            case light_gray_wall_banner:
            case lime_banner:
            case lime_stained_glass_pane:
            case lime_wall_banner:
            case magenta_banner:
            case magenta_stained_glass_pane:
            case magenta_wall_banner:
            case mangrove_fence:
            case mangrove_fence_gate:
            case mangrove_sign:
            case mangrove_wall_hanging_sign:
            case mangrove_wall_sign:
            case mossy_cobblestone_wall:
            case mossy_stone_brick_wall:
            case mud_brick_wall:
            case nether_brick_fence:
            case nether_brick_wall:
            case nether_portal:
            case oak_fence:
            case oak_fence_gate:
            case oak_sign:
            case oak_wall_hanging_sign:
            case oak_wall_sign:
            case orange_banner:
            case orange_stained_glass_pane:
            case orange_wall_banner:
            case pink_banner:
            case pink_stained_glass_pane:
            case pink_wall_banner:
            case polished_blackstone_brick_wall:
            case polished_blackstone_wall:
            case polished_deepslate_wall:
            case prismarine_wall:
            case purple_banner:
            case purple_stained_glass_pane:
            case purple_wall_banner:
            case red_banner:
            case red_nether_brick_wall:
            case red_sandstone_wall:
            case red_stained_glass_pane:
            case red_wall_banner:
            case sandstone_wall:
            case spruce_fence:
            case spruce_fence_gate:
            case spruce_sign:
            case spruce_wall_hanging_sign:
            case spruce_wall_sign:
            case stone_brick_wall:
            case warped_fence:
            case warped_fence_gate:
            case white_banner:
            case white_stained_glass_pane:
            case white_wall_banner:
            case yellow_banner:
            case yellow_stained_glass_pane:
            case yellow_wall_banner:
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
            case acacia_sapling:
            case allium:
            case azure_bluet:
            case bamboo:
            case bamboo_sapling:
            case beetroots:
            case birch_sapling:
            case blue_orchid:
            case brewing_stand:
            case brown_mushroom:
            case carrots:
            case cave_vines:
            case cave_vines_plant:
            case cornflower:
            case dandelion:
            case dark_oak_sapling:
            case dead_bush:
            case fern:
            case hanging_roots:
            case jungle_sapling:
            case kelp_plant:
            case large_fern:
            case lilac:
            case lily_of_the_valley:
            case melon_stem:
            case nether_wart:
            case oak_sapling:
            case orange_tulip:
            case oxeye_daisy:
            case peony:
            case pink_tulip:
            case poppy:
            case potatoes:
            case pumpkin_stem:
            case red_mushroom:
            case red_tulip:
            case rose_bush:
            case seagrass:
            case spruce_sapling:
            case sunflower:
            case sugar_cane:
            case sweet_berry_bush:
            case tall_grass:
            case tall_seagrass:
            case twisting_vines:
            case twisting_vines_plant:
            case weeping_vines:
            case weeping_vines_plant:
            case wheat:
            case white_tulip:
                return true;
            default:
                return false;
        }
    }
}
