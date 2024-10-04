package systems.haxigo.glowglass.blocks;

import net.minecraft.block.PaneBlock;

public class GlowPaneBlock extends PaneBlock {
    public GlowPaneBlock(Settings settings) {
        super(settings.luminance((state) -> 15));
    }
}
