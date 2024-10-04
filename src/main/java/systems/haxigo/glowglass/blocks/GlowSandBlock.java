package systems.haxigo.glowglass.blocks;

import net.minecraft.block.ColoredFallingBlock;
import net.minecraft.util.ColorCode;

public class GlowSandBlock extends ColoredFallingBlock {
    public GlowSandBlock(ColorCode color, Settings settings) {
        super(color, settings.luminance((state) -> 15));
    }
}
