/*******************************************************************************
 * @author Reika Kalseki
 *
 * Copyright 2017
 *
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.ChromatiCraft.Items;

import java.util.Collection;

import Reika.ChromatiCraft.Auxiliary.Interfaces.ResearchDependentName;
import Reika.ChromatiCraft.Base.ItemChromaMulti;
import Reika.ChromatiCraft.Registry.ChromaItems;
import Reika.ChromatiCraft.Registry.ChromaResearch;
import Reika.DragonAPI.Libraries.Java.ReikaJavaLibrary;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class ItemCluster extends ItemChromaMulti implements ResearchDependentName {
    private final IIcon[] icons = new IIcon[this.getNumberTypes()];

    public ItemCluster(int tex) {
        super(tex);
        hasSubtypes = true;
    }

    @Override
    public int getNumberTypes() {
        return ChromaItems.CLUSTER.getNumberMetadatas();
    }

    @Override
    public Collection<ChromaResearch> getRequiredResearch(ItemStack is) {
        return ReikaJavaLibrary.makeListFrom(ChromaResearch.GROUPS);
    }
}
