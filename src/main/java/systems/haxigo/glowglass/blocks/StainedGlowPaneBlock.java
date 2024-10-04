package systems.haxigo.glowglass.blocks;

import net.minecraft.block.StainedGlassPaneBlock;
import net.minecraft.util.DyeColor;

public class StainedGlowPaneBlock extends StainedGlassPaneBlock {
    public StainedGlowPaneBlock(DyeColor color, Settings settings) {
        super(color, settings.luminance((state) -> 15));
    }
}
