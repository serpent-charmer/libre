package Reika.DragonAPI.ASM.Patchers.Hooks.Event.Render;

import Reika.DragonAPI.ASM.Patchers.BlockRenderBrightness;
import org.objectweb.asm.tree.ClassNode;

public class ChunkCacheRenderBrightness extends BlockRenderBrightness {
    public ChunkCacheRenderBrightness() {
        super("net.minecraft.world.ChunkCache", "ahr");
    }

    @Override
    protected void apply(ClassNode cn) {
        this.patchBlockLight(cn);
    }
}
