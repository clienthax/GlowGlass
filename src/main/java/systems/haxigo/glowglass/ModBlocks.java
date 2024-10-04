package systems.haxigo.glowglass;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.ColorCode;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import systems.haxigo.glowglass.blocks.*;

public class ModBlocks {

    public static void initialize() {
        Registry.register(Registries.ITEM_GROUP, CUSTOM_ITEM_GROUP_KEY, CUSTOM_ITEM_GROUP);
        ItemGroupEvents.modifyEntriesEvent(CUSTOM_ITEM_GROUP_KEY).register(itemGroup -> {
            itemGroup.add(GLOW_SAND);

            itemGroup.add(GLOW_GLASS);
            itemGroup.add(RED_STAINED_GLOWGLASS);
            itemGroup.add(ORANGE_STAINED_GLOWGLASS);
            itemGroup.add(YELLOW_STAINED_GLOWGLASS);
            itemGroup.add(LIME_STAINED_GLOWGLASS);
            itemGroup.add(GREEN_STAINED_GLOWGLASS);
            itemGroup.add(CYAN_STAINED_GLOWGLASS);
            itemGroup.add(LIGHT_BLUE_STAINED_GLOWGLASS);
            itemGroup.add(BLUE_STAINED_GLOWGLASS);
            itemGroup.add(PURPLE_STAINED_GLOWGLASS);
            itemGroup.add(MAGENTA_STAINED_GLOWGLASS);
            itemGroup.add(PINK_STAINED_GLOWGLASS);
            itemGroup.add(BROWN_STAINED_GLOWGLASS);
            itemGroup.add(WHITE_STAINED_GLOWGLASS);
            itemGroup.add(LIGHT_GRAY_STAINED_GLOWGLASS);
            itemGroup.add(GRAY_STAINED_GLOWGLASS);
            itemGroup.add(BLACK_STAINED_GLOWGLASS);

            itemGroup.add(GLOWGLASS_PANE);
            itemGroup.add(RED_STAINED_GLOWGLASS_PANE);
            itemGroup.add(ORANGE_STAINED_GLOWGLASS_PANE);
            itemGroup.add(YELLOW_STAINED_GLOWGLASS_PANE);
            itemGroup.add(LIME_STAINED_GLOWGLASS_PANE);
            itemGroup.add(GREEN_STAINED_GLOWGLASS_PANE);
            itemGroup.add(CYAN_STAINED_GLOWGLASS_PANE);
            itemGroup.add(LIGHT_BLUE_STAINED_GLOWGLASS_PANE);
            itemGroup.add(BLUE_STAINED_GLOWGLASS_PANE);
            itemGroup.add(PURPLE_STAINED_GLOWGLASS_PANE);
            itemGroup.add(MAGENTA_STAINED_GLOWGLASS_PANE);
            itemGroup.add(PINK_STAINED_GLOWGLASS_PANE);
            itemGroup.add(BROWN_STAINED_GLOWGLASS_PANE);
            itemGroup.add(WHITE_STAINED_GLOWGLASS_PANE);
            itemGroup.add(LIGHT_GRAY_STAINED_GLOWGLASS_PANE);
            itemGroup.add(GRAY_STAINED_GLOWGLASS_PANE);
            itemGroup.add(BLACK_STAINED_GLOWGLASS_PANE);

            });
    }

    public static final Block GLOW_SAND = register(new GlowSandBlock(new ColorCode(14406560), Blocks.SAND.getSettings()), "glowsand", true);

    public static final Block GLOW_GLASS = register(new GlowGlassBlock(Blocks.GLASS.getSettings()), "glowglass", true);
    public static final Block RED_STAINED_GLOWGLASS = register(new StainedGlowGlassBlock(DyeColor.RED, Blocks.RED_STAINED_GLASS.getSettings()), "red_stained_glowglass", true);
    public static final Block ORANGE_STAINED_GLOWGLASS = register(new StainedGlowGlassBlock(DyeColor.ORANGE, Blocks.ORANGE_STAINED_GLASS.getSettings()), "orange_stained_glowglass", true);
    public static final Block YELLOW_STAINED_GLOWGLASS = register(new StainedGlowGlassBlock(DyeColor.YELLOW, Blocks.YELLOW_STAINED_GLASS.getSettings()), "yellow_stained_glowglass", true);
    public static final Block LIME_STAINED_GLOWGLASS = register(new StainedGlowGlassBlock(DyeColor.LIME, Blocks.LIME_STAINED_GLASS.getSettings()), "lime_stained_glowglass", true);
    public static final Block GREEN_STAINED_GLOWGLASS = register(new StainedGlowGlassBlock(DyeColor.GREEN, Blocks.GREEN_STAINED_GLASS.getSettings()), "green_stained_glowglass", true);
    public static final Block CYAN_STAINED_GLOWGLASS = register(new StainedGlowGlassBlock(DyeColor.CYAN, Blocks.CYAN_STAINED_GLASS.getSettings()), "cyan_stained_glowglass", true);
    public static final Block LIGHT_BLUE_STAINED_GLOWGLASS = register(new StainedGlowGlassBlock(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_STAINED_GLASS.getSettings()), "light_blue_stained_glowglass", true);
    public static final Block BLUE_STAINED_GLOWGLASS = register(new StainedGlowGlassBlock(DyeColor.BLUE, Blocks.BLUE_STAINED_GLASS.getSettings()), "blue_stained_glowglass", true);
    public static final Block PURPLE_STAINED_GLOWGLASS = register(new StainedGlowGlassBlock(DyeColor.PURPLE, Blocks.PURPLE_STAINED_GLASS.getSettings()), "purple_stained_glowglass", true);
    public static final Block MAGENTA_STAINED_GLOWGLASS = register(new StainedGlowGlassBlock(DyeColor.MAGENTA, Blocks.MAGENTA_STAINED_GLASS.getSettings()), "magenta_stained_glowglass", true);
    public static final Block PINK_STAINED_GLOWGLASS = register(new StainedGlowGlassBlock(DyeColor.PINK, Blocks.PINK_STAINED_GLASS.getSettings()), "pink_stained_glowglass", true);
    public static final Block BROWN_STAINED_GLOWGLASS = register(new StainedGlowGlassBlock(DyeColor.BROWN, Blocks.BROWN_STAINED_GLASS.getSettings()), "brown_stained_glowglass", true);
    public static final Block WHITE_STAINED_GLOWGLASS = register(new StainedGlowGlassBlock(DyeColor.WHITE, Blocks.WHITE_STAINED_GLASS.getSettings()), "white_stained_glowglass", true);
    public static final Block LIGHT_GRAY_STAINED_GLOWGLASS = register(new StainedGlowGlassBlock(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_STAINED_GLASS.getSettings()), "light_gray_stained_glowglass", true);
    public static final Block GRAY_STAINED_GLOWGLASS = register(new StainedGlowGlassBlock(DyeColor.GRAY, Blocks.GRAY_STAINED_GLASS.getSettings()), "gray_stained_glowglass", true);
    public static final Block BLACK_STAINED_GLOWGLASS = register(new StainedGlowGlassBlock(DyeColor.BLACK, Blocks.BLACK_STAINED_GLASS.getSettings()), "black_stained_glowglass", true);

    public static final Block GLOWGLASS_PANE = register(new GlowPaneBlock(Blocks.GLASS_PANE.getSettings()), "glowglass_pane", true);
    public static final Block RED_STAINED_GLOWGLASS_PANE = register(new StainedGlowPaneBlock(DyeColor.RED, Blocks.RED_STAINED_GLASS_PANE.getSettings()), "red_stained_glowglass_pane", true);
    public static final Block ORANGE_STAINED_GLOWGLASS_PANE = register(new StainedGlowPaneBlock(DyeColor.ORANGE, Blocks.ORANGE_STAINED_GLASS_PANE.getSettings()), "orange_stained_glowglass_pane", true);
    public static final Block YELLOW_STAINED_GLOWGLASS_PANE = register(new StainedGlowPaneBlock(DyeColor.YELLOW, Blocks.YELLOW_STAINED_GLASS_PANE.getSettings()), "yellow_stained_glowglass_pane", true);
    public static final Block LIME_STAINED_GLOWGLASS_PANE = register(new StainedGlowPaneBlock(DyeColor.LIME, Blocks.LIME_STAINED_GLASS_PANE.getSettings()), "lime_stained_glowglass_pane", true);
    public static final Block GREEN_STAINED_GLOWGLASS_PANE = register(new StainedGlowPaneBlock(DyeColor.GREEN, Blocks.GREEN_STAINED_GLASS_PANE.getSettings()), "green_stained_glowglass_pane", true);
    public static final Block CYAN_STAINED_GLOWGLASS_PANE = register(new StainedGlowPaneBlock(DyeColor.CYAN, Blocks.CYAN_STAINED_GLASS_PANE.getSettings()), "cyan_stained_glowglass_pane", true);
    public static final Block LIGHT_BLUE_STAINED_GLOWGLASS_PANE = register(new StainedGlowPaneBlock(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_STAINED_GLASS_PANE.getSettings()), "light_blue_stained_glowglass_pane", true);
    public static final Block BLUE_STAINED_GLOWGLASS_PANE = register(new StainedGlowPaneBlock(DyeColor.BLUE, Blocks.BLUE_STAINED_GLASS_PANE.getSettings()), "blue_stained_glowglass_pane", true);
    public static final Block PURPLE_STAINED_GLOWGLASS_PANE = register(new StainedGlowPaneBlock(DyeColor.PURPLE, Blocks.PURPLE_STAINED_GLASS_PANE.getSettings()), "purple_stained_glowglass_pane", true);
    public static final Block MAGENTA_STAINED_GLOWGLASS_PANE = register(new StainedGlowPaneBlock(DyeColor.MAGENTA, Blocks.MAGENTA_STAINED_GLASS_PANE.getSettings()), "magenta_stained_glowglass_pane", true);
    public static final Block PINK_STAINED_GLOWGLASS_PANE = register(new StainedGlowPaneBlock(DyeColor.PINK, Blocks.PINK_STAINED_GLASS_PANE.getSettings()), "pink_stained_glowglass_pane", true);
    public static final Block BROWN_STAINED_GLOWGLASS_PANE = register(new StainedGlowPaneBlock(DyeColor.BROWN, Blocks.BROWN_STAINED_GLASS_PANE.getSettings()), "brown_stained_glowglass_pane", true);
    public static final Block WHITE_STAINED_GLOWGLASS_PANE = register(new StainedGlowPaneBlock(DyeColor.WHITE, Blocks.WHITE_STAINED_GLASS_PANE.getSettings()), "white_stained_glowglass_pane", true);
    public static final Block LIGHT_GRAY_STAINED_GLOWGLASS_PANE = register(new StainedGlowPaneBlock(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_STAINED_GLASS_PANE.getSettings()), "light_gray_stained_glowglass_pane", true);
    public static final Block GRAY_STAINED_GLOWGLASS_PANE = register(new StainedGlowPaneBlock(DyeColor.GRAY, Blocks.GRAY_STAINED_GLASS_PANE.getSettings()), "gray_stained_glowglass_pane", true);
    public static final Block BLACK_STAINED_GLOWGLASS_PANE = register(new StainedGlowPaneBlock(DyeColor.BLACK, Blocks.BLACK_STAINED_GLASS_PANE.getSettings()), "black_stained_glowglass_pane", true);

    public static final RegistryKey<ItemGroup> CUSTOM_ITEM_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(GlowGlass.MOD_ID, "item_group"));
    public static final ItemGroup CUSTOM_ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModBlocks.GLOW_SAND))
            .displayName(Text.translatable("itemGroup.glowglass"))
            .build();


    public static Block register(Block block, String name, boolean shouldRegisterItem) {
        // Register the block and its item.
        Identifier id = Identifier.of(GlowGlass.MOD_ID, name);

        // Sometimes, you may not want to register an item for the block.
        // Eg: if it's a technical block like `minecraft:air` or `minecraft:end_gateway`
        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, id, blockItem);
        }

        return Registry.register(Registries.BLOCK, id, block);
    }

}
