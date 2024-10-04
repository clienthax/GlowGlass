package systems.haxigo.glowglass.blocks;

import net.minecraft.block.TransparentBlock;

public class GlowGlassBlock extends TransparentBlock {
    public GlowGlassBlock(Settings settings) {
        super(settings.luminance((state) -> 15));
    }
}
