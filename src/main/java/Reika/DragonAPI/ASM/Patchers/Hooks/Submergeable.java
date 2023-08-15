/*******************************************************************************
 * @author Reika Kalseki
 *
 * Copyright 2017
 *
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.DragonAPI.ASM.Patchers.Hooks;

import Reika.DragonAPI.ASM.Patchers.Patcher;
import Reika.DragonAPI.Libraries.Java.ReikaASMHelper;
import cpw.mods.fml.relauncher.Side;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.VarInsnNode;

public class Submergeable extends Patcher {
    public Submergeable() {
        super("net.minecraft.block.BlockLiquid", "alw");
    }

    @Override
    protected void apply(ClassNode cn) {
        MethodNode m = ReikaASMHelper.getMethodByName(
            cn,
            "func_149646_a",
            "shouldSideBeRendered",
            "(Lnet/minecraft/world/IBlockAccess;IIII)Z"
        );
        m.instructions.clear();
        m.instructions.add(new VarInsnNode(Opcodes.ALOAD, 1));
        m.instructions.add(new VarInsnNode(Opcodes.ILOAD, 2));
        m.instructions.add(new VarInsnNode(Opcodes.ILOAD, 3));
        m.instructions.add(new VarInsnNode(Opcodes.ILOAD, 4));
        m.instructions.add(new VarInsnNode(Opcodes.ILOAD, 5));
        m.instructions.add(new VarInsnNode(Opcodes.ALOAD, 0));
        m.instructions.add(new MethodInsnNode(
            Opcodes.INVOKESTATIC,
            "Reika/DragonAPI/Libraries/World/ReikaBlockHelper",
            "renderLiquidSide",
            "(Lnet/minecraft/world/IBlockAccess;IIIILnet/minecraft/block/Block;)Z",
            false
        ));
        m.instructions.add(new InsnNode(Opcodes.IRETURN));
    }

    @Override
    public boolean runsOnSide(Side s) {
        return s == Side.CLIENT;
    }
}
