package systems.haxigo.glowglass.blocks;

import net.minecraft.block.StainedGlassBlock;
import net.minecraft.util.DyeColor;

public class StainedGlowGlassBlock extends StainedGlassBlock {
    public StainedGlowGlassBlock(DyeColor color, Settings settings) {
        super(color, settings.luminance((state) -> 15));
    }
}
