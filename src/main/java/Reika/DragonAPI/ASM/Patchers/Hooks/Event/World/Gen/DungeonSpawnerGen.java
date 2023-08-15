package Reika.DragonAPI.ASM.Patchers.Hooks.Event.World.Gen;

import Reika.DragonAPI.ASM.Patchers.SpawnerGen;
import Reika.DragonAPI.Instantiable.Event.SpawnerGenerationEvent.SpawnerSource;
import Reika.DragonAPI.Libraries.Java.ReikaASMHelper;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodNode;

public class DungeonSpawnerGen extends SpawnerGen {
    public DungeonSpawnerGen() {
        super("net.minecraft.world.gen.feature.WorldGenDungeons", "asd");
    }

    @Override
    protected MethodNode getMethod(ClassNode cn) {
        return ReikaASMHelper.getMethodByName(
            cn,
            "func_76484_a",
            "generate",
            "(Lnet/minecraft/world/World;Ljava/util/Random;III)Z"
        );
    }

    @Override
    protected SpawnerSource getEnumEntry() {
        return SpawnerSource.DUNGEON;
    }
}
