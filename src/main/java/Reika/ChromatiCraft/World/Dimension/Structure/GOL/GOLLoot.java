/*******************************************************************************
 * @author Reika Kalseki
 *
 * Copyright 2017
 *
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.ChromatiCraft.World.Dimension.Structure.GOL;

import Reika.ChromatiCraft.Base.StructureLootRoom;
import Reika.ChromatiCraft.Block.Worldgen.BlockStructureShield.BlockType;
import Reika.ChromatiCraft.Registry.ChromaBlocks;
import Reika.ChromatiCraft.World.Dimension.Structure.GOLGenerator;
import Reika.DragonAPI.Instantiable.Worldgen.ChunkSplicedGenerationCache;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

public class GOLLoot extends StructureLootRoom<GOLGenerator> {
    public GOLLoot(GOLGenerator s) {
        super(s);
    }

    @Override
    public void generate(ChunkSplicedGenerationCache world, int x, int y, int z) {
        Block b = ChromaBlocks.STRUCTSHIELD.getBlockInstance();
        int ms = BlockType.STONE.metadata;
        int mg = BlockType.GLASS.metadata;
        int ml = BlockType.LIGHT.metadata;

        world.setBlock(x + 0, y + 1, z + 0, b, ms);
        world.setBlock(x + 0, y + 1, z + 1, b, ms);
        world.setBlock(x + 0, y + 1, z + 2, b, ms);
        world.setBlock(x + 0, y + 1, z + 3, b, ms);
        world.setBlock(x + 0, y + 1, z + 4, b, ms);
        world.setBlock(x + 0, y + 1, z + 5, b, ms);
        world.setBlock(x + 0, y + 1, z + 6, b, ms);
        world.setBlock(x + 0, y + 2, z + 0, b, ms);
        world.setBlock(x + 0, y + 2, z + 6, b, ms);
        world.setBlock(x + 0, y + 3, z + 0, b, ms);
        world.setBlock(x + 0, y + 3, z + 6, b, ms);
        world.setBlock(x + 0, y + 4, z + 0, b, ms);
        world.setBlock(x + 0, y + 4, z + 6, b, ms);
        world.setBlock(x + 0, y + 5, z + 0, b, ms);
        world.setBlock(x + 0, y + 5, z + 1, b, ms);
        world.setBlock(x + 0, y + 5, z + 5, b, ms);
        world.setBlock(x + 0, y + 5, z + 6, b, ms);
        world.setBlock(x + 0, y + 6, z + 1, b, ms);
        world.setBlock(x + 0, y + 6, z + 2, b, ms);
        world.setBlock(x + 0, y + 6, z + 3, b, ms);
        world.setBlock(x + 0, y + 6, z + 4, b, ms);
        world.setBlock(x + 0, y + 6, z + 5, b, ms);
        world.setBlock(x + 1, y + 1, z + 0, b, ms);
        world.setBlock(x + 1, y + 1, z + 1, b, ms);
        world.setBlock(x + 1, y + 1, z + 2, b, ms);
        world.setBlock(x + 1, y + 1, z + 3, b, ms);
        world.setBlock(x + 1, y + 1, z + 4, b, ms);
        world.setBlock(x + 1, y + 1, z + 5, b, ms);
        world.setBlock(x + 1, y + 1, z + 6, b, ms);
        world.setBlock(x + 1, y + 2, z + 0, b, ms);
        world.setBlock(x + 1, y + 2, z + 6, b, ms);
        world.setBlock(x + 1, y + 3, z + 0, b, ms);
        world.setBlock(x + 1, y + 3, z + 6, b, ms);
        world.setBlock(x + 1, y + 4, z + 0, b, ms);
        world.setBlock(x + 1, y + 4, z + 6, b, ms);
        world.setBlock(x + 1, y + 5, z + 0, b, ms);
        world.setBlock(x + 1, y + 5, z + 1, b, ms);
        world.setBlock(x + 1, y + 5, z + 5, b, ms);
        world.setBlock(x + 1, y + 5, z + 6, b, ms);
        world.setBlock(x + 1, y + 6, z + 1, b, ms);
        world.setBlock(x + 1, y + 6, z + 2, b, ms);
        world.setBlock(x + 1, y + 6, z + 3, b, ml);
        world.setBlock(x + 1, y + 6, z + 4, b, ms);
        world.setBlock(x + 1, y + 6, z + 5, b, ms);
        world.setBlock(x + 2, y + 1, z + 0, b, ms);
        world.setBlock(x + 2, y + 1, z + 1, b, ms);
        world.setBlock(x + 2, y + 1, z + 2, b, ms);
        world.setBlock(x + 2, y + 1, z + 3, b, ms);
        world.setBlock(x + 2, y + 1, z + 4, b, ms);
        world.setBlock(x + 2, y + 1, z + 5, b, ms);
        world.setBlock(x + 2, y + 1, z + 6, b, ms);
        world.setBlock(x + 2, y + 2, z + 0, b, ms);
        world.setBlock(x + 2, y + 2, z + 6, b, ms);
        world.setBlock(x + 2, y + 3, z + 0, b, ms);
        world.setBlock(x + 2, y + 3, z + 6, b, ms);
        world.setBlock(x + 2, y + 4, z + 0, b, ms);
        world.setBlock(x + 2, y + 4, z + 6, b, ms);
        world.setBlock(x + 2, y + 5, z + 0, b, ms);
        world.setBlock(x + 2, y + 5, z + 1, b, ms);
        world.setBlock(x + 2, y + 5, z + 5, b, ms);
        world.setBlock(x + 2, y + 5, z + 6, b, ms);
        world.setBlock(x + 2, y + 6, z + 1, b, ms);
        world.setBlock(x + 2, y + 6, z + 2, b, ms);
        world.setBlock(x + 2, y + 6, z + 3, b, ms);
        world.setBlock(x + 2, y + 6, z + 4, b, ms);
        world.setBlock(x + 2, y + 6, z + 5, b, ms);
        world.setBlock(x + 3, y + 1, z + 0, b, ms);
        world.setBlock(x + 3, y + 1, z + 1, b, ms);
        world.setBlock(x + 3, y + 1, z + 2, b, ms);
        world.setBlock(x + 3, y + 1, z + 3, b, ms);
        world.setBlock(x + 3, y + 1, z + 4, b, ms);
        world.setBlock(x + 3, y + 1, z + 5, b, ms);
        world.setBlock(x + 3, y + 1, z + 6, b, ms);
        world.setBlock(x + 3, y + 2, z + 0, b, ms);
        world.setBlock(x + 3, y + 2, z + 1, b, mg);
        world.setBlock(x + 3, y + 2, z + 2, b, ms);
        world.setBlock(x + 3, y + 2, z + 4, b, ms);
        world.setBlock(x + 3, y + 2, z + 5, b, mg);
        world.setBlock(x + 3, y + 2, z + 6, b, ms);
        world.setBlock(x + 3, y + 3, z + 0, b, ms);
        world.setBlock(x + 3, y + 3, z + 1, b, mg);
        world.setBlock(x + 3, y + 3, z + 2, b, ms);
        world.setBlock(x + 3, y + 3, z + 4, b, ms);
        world.setBlock(x + 3, y + 3, z + 5, b, mg);
        world.setBlock(x + 3, y + 3, z + 6, b, ms);
        world.setBlock(x + 3, y + 4, z + 0, b, ms);
        world.setBlock(x + 3, y + 4, z + 1, b, mg);
        world.setBlock(x + 3, y + 4, z + 2, b, ms);
        world.setBlock(x + 3, y + 4, z + 3, b, ms);
        world.setBlock(x + 3, y + 4, z + 4, b, ms);
        world.setBlock(x + 3, y + 4, z + 5, b, mg);
        world.setBlock(x + 3, y + 4, z + 6, b, ms);
        world.setBlock(x + 3, y + 5, z + 0, b, ms);
        world.setBlock(x + 3, y + 5, z + 1, b, ms);
        world.setBlock(x + 3, y + 5, z + 2, b, mg);
        world.setBlock(x + 3, y + 5, z + 3, b, mg);
        world.setBlock(x + 3, y + 5, z + 4, b, mg);
        world.setBlock(x + 3, y + 5, z + 5, b, ms);
        world.setBlock(x + 3, y + 5, z + 6, b, ms);
        world.setBlock(x + 3, y + 6, z + 1, b, ms);
        world.setBlock(x + 3, y + 6, z + 2, b, ms);
        world.setBlock(x + 3, y + 6, z + 3, b, ms);
        world.setBlock(x + 3, y + 6, z + 4, b, ms);
        world.setBlock(x + 3, y + 6, z + 5, b, ms);
        world.setBlock(x + 4, y + 0, z + 1, b, ms);
        world.setBlock(x + 4, y + 0, z + 2, b, ms);
        world.setBlock(x + 4, y + 0, z + 3, b, ms);
        world.setBlock(x + 4, y + 0, z + 4, b, ms);
        world.setBlock(x + 4, y + 0, z + 5, b, ms);
        world.setBlock(x + 4, y + 1, z + 0, b, ms);
        world.setBlock(x + 4, y + 1, z + 1, b, ms);
        world.setBlock(x + 4, y + 1, z + 2, b, ms);
        world.setBlock(x + 4, y + 1, z + 3, b, ms);
        world.setBlock(x + 4, y + 1, z + 4, b, ms);
        world.setBlock(x + 4, y + 1, z + 5, b, ms);
        world.setBlock(x + 4, y + 1, z + 6, b, ms);
        world.setBlock(x + 4, y + 5, z + 0, b, ms);
        world.setBlock(x + 4, y + 5, z + 1, b, ms);
        world.setBlock(x + 4, y + 5, z + 5, b, ms);
        world.setBlock(x + 4, y + 5, z + 6, b, ms);
        world.setBlock(x + 4, y + 6, z + 1, b, ms);
        world.setBlock(x + 4, y + 6, z + 2, b, ms);
        world.setBlock(x + 4, y + 6, z + 3, b, ms);
        world.setBlock(x + 4, y + 6, z + 4, b, ms);
        world.setBlock(x + 4, y + 6, z + 5, b, ms);
        world.setBlock(x + 5, y + 0, z + 1, b, ms);
        world.setBlock(x + 5, y + 0, z + 5, b, ms);
        world.setBlock(x + 5, y + 1, z + 0, b, ms);
        world.setBlock(x + 5, y + 1, z + 1, b, ms);
        world.setBlock(x + 5, y + 1, z + 5, b, ms);
        world.setBlock(x + 5, y + 1, z + 6, b, ms);
        world.setBlock(x + 5, y + 5, z + 0, b, ms);
        world.setBlock(x + 5, y + 5, z + 1, b, ms);
        world.setBlock(x + 5, y + 5, z + 5, b, ms);
        world.setBlock(x + 5, y + 5, z + 6, b, ms);
        world.setBlock(x + 5, y + 6, z + 1, b, ms);
        world.setBlock(x + 5, y + 6, z + 5, b, ms);
        world.setBlock(x + 6, y + 0, z + 1, b, ms);
        world.setBlock(x + 6, y + 0, z + 5, b, ms);
        world.setBlock(x + 6, y + 1, z + 0, b, ms);
        world.setBlock(x + 6, y + 1, z + 1, b, ms);
        world.setBlock(x + 6, y + 1, z + 5, b, ms);
        world.setBlock(x + 6, y + 1, z + 6, b, ms);
        world.setBlock(x + 6, y + 5, z + 0, b, ms);
        world.setBlock(x + 6, y + 5, z + 1, b, ms);
        world.setBlock(x + 6, y + 5, z + 5, b, ms);
        world.setBlock(x + 6, y + 5, z + 6, b, ms);
        world.setBlock(x + 6, y + 6, z + 1, b, ms);
        world.setBlock(x + 6, y + 6, z + 5, b, ms);
        world.setBlock(x + 7, y + 0, z + 1, b, ms);
        world.setBlock(x + 7, y + 0, z + 5, b, ms);
        world.setBlock(x + 7, y + 1, z + 0, b, ms);
        world.setBlock(x + 7, y + 1, z + 1, b, ms);
        world.setBlock(x + 7, y + 1, z + 5, b, ms);
        world.setBlock(x + 7, y + 1, z + 6, b, ms);
        world.setBlock(x + 7, y + 5, z + 0, b, ms);
        world.setBlock(x + 7, y + 5, z + 1, b, ms);
        world.setBlock(x + 7, y + 5, z + 5, b, ms);
        world.setBlock(x + 7, y + 5, z + 6, b, ms);
        world.setBlock(x + 7, y + 6, z + 1, b, ms);
        world.setBlock(x + 7, y + 6, z + 5, b, ms);
        world.setBlock(x + 8, y + 0, z + 1, b, ms);
        world.setBlock(x + 8, y + 0, z + 2, b, ms);
        world.setBlock(x + 8, y + 0, z + 3, b, ms);
        world.setBlock(x + 8, y + 0, z + 4, b, ms);
        world.setBlock(x + 8, y + 0, z + 5, b, ms);
        world.setBlock(x + 8, y + 1, z + 0, b, ms);
        world.setBlock(x + 8, y + 1, z + 1, b, ms);
        world.setBlock(x + 8, y + 1, z + 2, b, ms);
        world.setBlock(x + 8, y + 1, z + 3, b, ms);
        world.setBlock(x + 8, y + 1, z + 4, b, ms);
        world.setBlock(x + 8, y + 1, z + 5, b, ms);
        world.setBlock(x + 8, y + 1, z + 6, b, ms);
        world.setBlock(x + 8, y + 2, z + 0, b, ms);
        world.setBlock(x + 8, y + 2, z + 1, b, ms);
        world.setBlock(x + 8, y + 2, z + 5, b, ms);
        world.setBlock(x + 8, y + 2, z + 6, b, ms);
        world.setBlock(x + 8, y + 3, z + 0, b, ms);
        world.setBlock(x + 8, y + 3, z + 1, b, ms);
        world.setBlock(x + 8, y + 3, z + 5, b, ms);
        world.setBlock(x + 8, y + 3, z + 6, b, ms);
        world.setBlock(x + 8, y + 4, z + 0, b, ms);
        world.setBlock(x + 8, y + 4, z + 1, b, ms);
        world.setBlock(x + 8, y + 4, z + 5, b, ms);
        world.setBlock(x + 8, y + 4, z + 6, b, ms);
        world.setBlock(x + 8, y + 5, z + 0, b, ms);
        world.setBlock(x + 8, y + 5, z + 1, b, ms);
        world.setBlock(x + 8, y + 5, z + 2, b, ms);
        world.setBlock(x + 8, y + 5, z + 3, b, ms);
        world.setBlock(x + 8, y + 5, z + 4, b, ms);
        world.setBlock(x + 8, y + 5, z + 5, b, ms);
        world.setBlock(x + 8, y + 5, z + 6, b, ms);
        world.setBlock(x + 8, y + 6, z + 1, b, ms);
        world.setBlock(x + 8, y + 6, z + 2, b, ms);
        world.setBlock(x + 8, y + 6, z + 3, b, ms);
        world.setBlock(x + 8, y + 6, z + 4, b, ms);
        world.setBlock(x + 8, y + 6, z + 5, b, ms);
        world.setBlock(x + 9, y + 1, z + 1, b, ms);
        world.setBlock(x + 9, y + 1, z + 2, b, ms);
        world.setBlock(x + 9, y + 1, z + 3, b, ms);
        world.setBlock(x + 9, y + 1, z + 4, b, ms);
        world.setBlock(x + 9, y + 1, z + 5, b, ms);
        world.setBlock(x + 9, y + 2, z + 1, b, ms);
        world.setBlock(x + 9, y + 2, z + 5, b, ms);
        world.setBlock(x + 9, y + 3, z + 1, b, ms);
        world.setBlock(x + 9, y + 3, z + 5, b, ms);
        world.setBlock(x + 9, y + 4, z + 1, b, ms);
        world.setBlock(x + 9, y + 4, z + 5, b, ms);
        world.setBlock(x + 9, y + 5, z + 1, b, ms);
        world.setBlock(x + 9, y + 5, z + 2, b, ms);
        world.setBlock(x + 9, y + 5, z + 3, b, ms);
        world.setBlock(x + 9, y + 5, z + 4, b, ms);
        world.setBlock(x + 9, y + 5, z + 5, b, ms);

        this.addBreakable(world, x + 4, y + 2, z + 0);
        this.addBreakable(world, x + 4, y + 2, z + 6);
        this.addBreakable(world, x + 4, y + 3, z + 0);
        this.addBreakable(world, x + 4, y + 3, z + 6);
        this.addBreakable(world, x + 4, y + 4, z + 0);
        this.addBreakable(world, x + 4, y + 4, z + 6);
        this.addBreakable(world, x + 5, y + 0, z + 2);
        this.addBreakable(world, x + 5, y + 0, z + 3);
        this.addBreakable(world, x + 5, y + 0, z + 4);
        this.addBreakable(world, x + 5, y + 2, z + 0);
        this.addBreakable(world, x + 5, y + 2, z + 6);
        this.addBreakable(world, x + 5, y + 3, z + 0);
        this.addBreakable(world, x + 5, y + 3, z + 6);
        this.addBreakable(world, x + 5, y + 4, z + 0);
        this.addBreakable(world, x + 5, y + 4, z + 6);
        this.addBreakable(world, x + 5, y + 6, z + 2);
        this.addBreakable(world, x + 5, y + 6, z + 3);
        this.addBreakable(world, x + 5, y + 6, z + 4);
        this.addBreakable(world, x + 6, y + 0, z + 2);
        this.addBreakable(world, x + 6, y + 0, z + 3);
        this.addBreakable(world, x + 6, y + 0, z + 4);
        this.addBreakable(world, x + 6, y + 2, z + 0);
        this.addBreakable(world, x + 6, y + 2, z + 6);
        this.addBreakable(world, x + 6, y + 3, z + 0);
        this.addBreakable(world, x + 6, y + 3, z + 6);
        this.addBreakable(world, x + 6, y + 4, z + 0);
        this.addBreakable(world, x + 6, y + 4, z + 6);
        this.addBreakable(world, x + 6, y + 6, z + 2);
        this.addBreakable(world, x + 6, y + 6, z + 3);
        this.addBreakable(world, x + 6, y + 6, z + 4);
        this.addBreakable(world, x + 7, y + 0, z + 2);
        this.addBreakable(world, x + 7, y + 0, z + 3);
        this.addBreakable(world, x + 7, y + 0, z + 4);
        this.addBreakable(world, x + 7, y + 2, z + 0);
        this.addBreakable(world, x + 7, y + 2, z + 6);
        this.addBreakable(world, x + 7, y + 3, z + 0);
        this.addBreakable(world, x + 7, y + 3, z + 6);
        this.addBreakable(world, x + 7, y + 4, z + 0);
        this.addBreakable(world, x + 7, y + 4, z + 6);
        this.addBreakable(world, x + 7, y + 6, z + 2);
        this.addBreakable(world, x + 7, y + 6, z + 3);
        this.addBreakable(world, x + 7, y + 6, z + 4);
        this.addBreakable(world, x + 9, y + 2, z + 2);
        this.addBreakable(world, x + 9, y + 2, z + 3);
        this.addBreakable(world, x + 9, y + 2, z + 4);
        this.addBreakable(world, x + 9, y + 3, z + 2);
        this.addBreakable(world, x + 9, y + 3, z + 3);
        this.addBreakable(world, x + 9, y + 3, z + 4);
        this.addBreakable(world, x + 9, y + 4, z + 2);
        this.addBreakable(world, x + 9, y + 4, z + 3);
        this.addBreakable(world, x + 9, y + 4, z + 4);

        this.placeCore(x + 6, y + 3, z + 3);

        world.setBlock(x + 0, y + 2, z + 1, Blocks.air);
        world.setBlock(x + 0, y + 2, z + 2, Blocks.air);
        world.setBlock(x + 0, y + 2, z + 3, Blocks.air);
        world.setBlock(x + 0, y + 2, z + 4, Blocks.air);
        world.setBlock(x + 0, y + 2, z + 5, Blocks.air);
        world.setBlock(x + 0, y + 3, z + 1, Blocks.air);
        world.setBlock(x + 0, y + 3, z + 2, Blocks.air);
        world.setBlock(x + 0, y + 3, z + 3, Blocks.air);
        world.setBlock(x + 0, y + 3, z + 4, Blocks.air);
        world.setBlock(x + 0, y + 3, z + 5, Blocks.air);
        world.setBlock(x + 0, y + 4, z + 1, Blocks.air);
        world.setBlock(x + 0, y + 4, z + 2, Blocks.air);
        world.setBlock(x + 0, y + 4, z + 3, Blocks.air);
        world.setBlock(x + 0, y + 4, z + 4, Blocks.air);
        world.setBlock(x + 0, y + 4, z + 5, Blocks.air);
        world.setBlock(x + 0, y + 5, z + 2, Blocks.air);
        world.setBlock(x + 0, y + 5, z + 3, Blocks.air);
        world.setBlock(x + 0, y + 5, z + 4, Blocks.air);
        world.setBlock(x + 1, y + 2, z + 1, Blocks.air);
        world.setBlock(x + 1, y + 2, z + 2, Blocks.air);
        world.setBlock(x + 1, y + 2, z + 3, Blocks.air);
        world.setBlock(x + 1, y + 2, z + 4, Blocks.air);
        world.setBlock(x + 1, y + 2, z + 5, Blocks.air);
        world.setBlock(x + 1, y + 3, z + 1, Blocks.air);
        world.setBlock(x + 1, y + 3, z + 2, Blocks.air);
        world.setBlock(x + 1, y + 3, z + 3, Blocks.air);
        world.setBlock(x + 1, y + 3, z + 4, Blocks.air);
        world.setBlock(x + 1, y + 3, z + 5, Blocks.air);
        world.setBlock(x + 1, y + 4, z + 1, Blocks.air);
        world.setBlock(x + 1, y + 4, z + 2, Blocks.air);
        world.setBlock(x + 1, y + 4, z + 3, Blocks.air);
        world.setBlock(x + 1, y + 4, z + 4, Blocks.air);
        world.setBlock(x + 1, y + 4, z + 5, Blocks.air);
        world.setBlock(x + 1, y + 5, z + 2, Blocks.air);
        world.setBlock(x + 1, y + 5, z + 3, Blocks.air);
        world.setBlock(x + 1, y + 5, z + 4, Blocks.air);
        world.setBlock(x + 2, y + 2, z + 1, Blocks.air);
        world.setBlock(x + 2, y + 2, z + 2, Blocks.air);
        world.setBlock(x + 2, y + 2, z + 3, Blocks.air);
        world.setBlock(x + 2, y + 2, z + 4, Blocks.air);
        world.setBlock(x + 2, y + 2, z + 5, Blocks.air);
        world.setBlock(x + 2, y + 3, z + 1, Blocks.air);
        world.setBlock(x + 2, y + 3, z + 2, Blocks.air);
        world.setBlock(x + 2, y + 3, z + 3, Blocks.air);
        world.setBlock(x + 2, y + 3, z + 4, Blocks.air);
        world.setBlock(x + 2, y + 3, z + 5, Blocks.air);
        world.setBlock(x + 2, y + 4, z + 1, Blocks.air);
        world.setBlock(x + 2, y + 4, z + 2, Blocks.air);
        world.setBlock(x + 2, y + 4, z + 3, Blocks.air);
        world.setBlock(x + 2, y + 4, z + 4, Blocks.air);
        world.setBlock(x + 2, y + 4, z + 5, Blocks.air);
        world.setBlock(x + 2, y + 5, z + 2, Blocks.air);
        world.setBlock(x + 2, y + 5, z + 3, Blocks.air);
        world.setBlock(x + 2, y + 5, z + 4, Blocks.air);
        world.setBlock(x + 3, y + 2, z + 3, Blocks.air);
        world.setBlock(x + 3, y + 3, z + 3, Blocks.air);
        world.setBlock(x + 4, y + 2, z + 1, Blocks.air);
        world.setBlock(x + 4, y + 2, z + 2, Blocks.air);
        world.setBlock(x + 4, y + 2, z + 3, Blocks.air);
        world.setBlock(x + 4, y + 2, z + 4, Blocks.air);
        world.setBlock(x + 4, y + 2, z + 5, Blocks.air);
        world.setBlock(x + 4, y + 3, z + 1, Blocks.air);
        world.setBlock(x + 4, y + 3, z + 2, Blocks.air);
        world.setBlock(x + 4, y + 3, z + 3, Blocks.air);
        world.setBlock(x + 4, y + 3, z + 4, Blocks.air);
        world.setBlock(x + 4, y + 3, z + 5, Blocks.air);
        world.setBlock(x + 4, y + 4, z + 1, Blocks.air);
        world.setBlock(x + 4, y + 4, z + 2, Blocks.air);
        world.setBlock(x + 4, y + 4, z + 3, Blocks.air);
        world.setBlock(x + 4, y + 4, z + 4, Blocks.air);
        world.setBlock(x + 4, y + 4, z + 5, Blocks.air);
        world.setBlock(x + 4, y + 5, z + 2, Blocks.air);
        world.setBlock(x + 4, y + 5, z + 3, Blocks.air);
        world.setBlock(x + 4, y + 5, z + 4, Blocks.air);
        world.setBlock(x + 5, y + 1, z + 2, Blocks.air);
        world.setBlock(x + 5, y + 1, z + 3, Blocks.air);
        world.setBlock(x + 5, y + 1, z + 4, Blocks.air);
        world.setBlock(x + 5, y + 2, z + 1, Blocks.air);
        world.setBlock(x + 5, y + 2, z + 2, Blocks.air);
        world.setBlock(x + 5, y + 2, z + 3, Blocks.air);
        world.setBlock(x + 5, y + 2, z + 4, Blocks.air);
        world.setBlock(x + 5, y + 2, z + 5, Blocks.air);
        world.setBlock(x + 5, y + 3, z + 1, Blocks.air);
        world.setBlock(x + 5, y + 3, z + 2, Blocks.air);
        world.setBlock(x + 5, y + 3, z + 3, Blocks.air);
        world.setBlock(x + 5, y + 3, z + 4, Blocks.air);
        world.setBlock(x + 5, y + 3, z + 5, Blocks.air);
        world.setBlock(x + 5, y + 4, z + 1, Blocks.air);
        world.setBlock(x + 5, y + 4, z + 2, Blocks.air);
        world.setBlock(x + 5, y + 4, z + 3, Blocks.air);
        world.setBlock(x + 5, y + 4, z + 4, Blocks.air);
        world.setBlock(x + 5, y + 4, z + 5, Blocks.air);
        world.setBlock(x + 5, y + 5, z + 2, Blocks.air);
        world.setBlock(x + 5, y + 5, z + 3, Blocks.air);
        world.setBlock(x + 5, y + 5, z + 4, Blocks.air);
        world.setBlock(x + 6, y + 1, z + 2, Blocks.air);
        world.setBlock(x + 6, y + 1, z + 3, Blocks.air);
        world.setBlock(x + 6, y + 1, z + 4, Blocks.air);
        world.setBlock(x + 6, y + 2, z + 1, Blocks.air);
        world.setBlock(x + 6, y + 2, z + 2, Blocks.air);
        world.setBlock(x + 6, y + 2, z + 3, Blocks.air);
        world.setBlock(x + 6, y + 2, z + 4, Blocks.air);
        world.setBlock(x + 6, y + 2, z + 5, Blocks.air);
        world.setBlock(x + 6, y + 3, z + 1, Blocks.air);
        world.setBlock(x + 6, y + 3, z + 2, Blocks.air);
        world.setBlock(x + 6, y + 3, z + 4, Blocks.air);
        world.setBlock(x + 6, y + 3, z + 5, Blocks.air);
        world.setBlock(x + 6, y + 4, z + 1, Blocks.air);
        world.setBlock(x + 6, y + 4, z + 2, Blocks.air);
        world.setBlock(x + 6, y + 4, z + 3, Blocks.air);
        world.setBlock(x + 6, y + 4, z + 4, Blocks.air);
        world.setBlock(x + 6, y + 4, z + 5, Blocks.air);
        world.setBlock(x + 6, y + 5, z + 2, Blocks.air);
        world.setBlock(x + 6, y + 5, z + 3, Blocks.air);
        world.setBlock(x + 6, y + 5, z + 4, Blocks.air);
        world.setBlock(x + 7, y + 1, z + 2, Blocks.air);
        world.setBlock(x + 7, y + 1, z + 3, Blocks.air);
        world.setBlock(x + 7, y + 1, z + 4, Blocks.air);
        world.setBlock(x + 7, y + 2, z + 1, Blocks.air);
        world.setBlock(x + 7, y + 2, z + 2, Blocks.air);
        world.setBlock(x + 7, y + 2, z + 3, Blocks.air);
        world.setBlock(x + 7, y + 2, z + 4, Blocks.air);
        world.setBlock(x + 7, y + 2, z + 5, Blocks.air);
        world.setBlock(x + 7, y + 3, z + 1, Blocks.air);
        world.setBlock(x + 7, y + 3, z + 2, Blocks.air);
        world.setBlock(x + 7, y + 3, z + 3, Blocks.air);
        world.setBlock(x + 7, y + 3, z + 4, Blocks.air);
        world.setBlock(x + 7, y + 3, z + 5, Blocks.air);
        world.setBlock(x + 7, y + 4, z + 1, Blocks.air);
        world.setBlock(x + 7, y + 4, z + 2, Blocks.air);
        world.setBlock(x + 7, y + 4, z + 3, Blocks.air);
        world.setBlock(x + 7, y + 4, z + 4, Blocks.air);
        world.setBlock(x + 7, y + 4, z + 5, Blocks.air);
        world.setBlock(x + 7, y + 5, z + 2, Blocks.air);
        world.setBlock(x + 7, y + 5, z + 3, Blocks.air);
        world.setBlock(x + 7, y + 5, z + 4, Blocks.air);
        world.setBlock(x + 8, y + 2, z + 2, Blocks.air);
        world.setBlock(x + 8, y + 2, z + 3, Blocks.air);
        world.setBlock(x + 8, y + 2, z + 4, Blocks.air);
        world.setBlock(x + 8, y + 3, z + 2, Blocks.air);
        world.setBlock(x + 8, y + 3, z + 3, Blocks.air);
        world.setBlock(x + 8, y + 3, z + 4, Blocks.air);
        world.setBlock(x + 8, y + 4, z + 2, Blocks.air);
        world.setBlock(x + 8, y + 4, z + 3, Blocks.air);
        world.setBlock(x + 8, y + 4, z + 4, Blocks.air);
    }

    private void addBreakable(ChunkSplicedGenerationCache world, int x, int y, int z) {
        world.setBlock(
            x,
            y,
            z,
            ChromaBlocks.STRUCTSHIELD.getBlockInstance(),
            BlockType.STONE.metadata
        );
        parent.addBreakable(x, y, z);
    }
}
