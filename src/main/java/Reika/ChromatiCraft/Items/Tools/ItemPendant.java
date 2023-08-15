/*******************************************************************************
 * @author Reika Kalseki
 *
 * Copyright 2017
 *
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.ChromatiCraft.Items.Tools;

import java.util.List;

import Reika.ChromatiCraft.Base.CrystalBlock;
import Reika.ChromatiCraft.Base.ItemCrystalBasic;
import Reika.ChromatiCraft.ChromatiCraft;
import Reika.ChromatiCraft.Magic.CrystalPotionController;
import Reika.ChromatiCraft.Registry.ChromaBlocks;
import Reika.ChromatiCraft.Registry.ChromaOptions;
import Reika.ChromatiCraft.Registry.CrystalElement;
import Reika.DragonAPI.Libraries.ReikaEntityHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import org.lwjgl.input.Keyboard;

public class ItemPendant extends ItemCrystalBasic {
    private static final String ROOT_KEY = "pendant_status";

    public ItemPendant(int tex) {
        super(tex);
        hasSubtypes = true;
        maxStackSize = 1;
        this.setNoRepair();
    }

    @Override
    protected final CreativeTabs getCreativePage() {
        return ChromatiCraft.tabChromaTools;
    }

    @Override
    public void addInformation(ItemStack is, EntityPlayer ep, List li, boolean vb) {
        if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT)) {
            CrystalElement color = CrystalElement.elements[is.getItemDamage()];
            switch (color) {
                case PURPLE:
                    li.add("Boosts XP yields");
                    break;
                case BLACK:
                    li.add("Improved lumen buffer usage efficiency");
                    break;
                default:
                    ChromaBlocks b = this.isEnhanced(is) ? ChromaBlocks.SUPER
                                                         : ChromaBlocks.CRYSTAL; /*
b.getItem().addInformation(b.getStackOf(color), ep, li, vb);
 */
                    int lvl = ((CrystalBlock) b.getBlockInstance()).getPotionLevel(color);
                    li.add(CrystalPotionController.instance.getEffectName(color, lvl > 0)
                    );
                    li.add("Level: " + (lvl + 1));
                    break;
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Hold ");
            sb.append(EnumChatFormatting.GREEN.toString());
            sb.append("Shift");
            sb.append(EnumChatFormatting.GRAY.toString());
            sb.append(" for effect data");
            li.add(sb.toString());
        }
    }

    @Override
    public final void
    onUpdate(ItemStack is, World world, Entity e, int slot, boolean selected) {
        boolean en = this.isEnhanced(is);
        int level = en ? 2 : 0;
        if (e instanceof EntityPlayer) {
            EntityPlayer ep = (EntityPlayer) e;
            CrystalElement color = CrystalElement.elements[is.getItemDamage()];
            long bits = world.getTotalWorldTime() & (~1);
            bits |= en ? 1 : 0;
            getRootStorage(e).setLong(color.name(), bits);
            if (color == CrystalElement.BLACK || color == CrystalElement.PURPLE) {
            } else {
                int dura = en ? 6000 : color == CrystalElement.BLUE ? 3 : 100;
                PotionEffect pot = CrystalPotionController.instance.getEffectFromColor(
                    color, dura, level, false
                );
                if (pot == null || color == CrystalElement.BLUE
                    || !ep.isPotionActive(pot.getPotionID())) {
                    CrystalPotionController.instance.applyEffectFromColor(
                        dura, level, ep, color, true
                    );
                }
            }
            if (ChromaOptions.NOPARTICLES.getState())
                ReikaEntityHelper.setNoPotionParticles(ep);
            if (!world.isRemote)
                this.onTick(is, world, ep, slot);
        }
    }

    protected void onTick(ItemStack is, World world, EntityPlayer ep, int slot) {}

    private static NBTTagCompound getRootStorage(Entity e) {
        if (!e.getEntityData().hasKey(ROOT_KEY)) {
            e.getEntityData().setTag(ROOT_KEY, new NBTTagCompound());
        }
        return e.getEntityData().getCompoundTag(ROOT_KEY);
    }

    /** Whether the enhanced effect is active */
    protected boolean isEnhanced(ItemStack is) {
        return false;
    }

    /** 0 for basic, 1 for enhanced, -1 for none */
    public static int getActivePendantLevel(EntityPlayer ep, CrystalElement e) {
        long val = getRootStorage(ep).getLong(e.name());
        long dur = ep.worldObj.getTotalWorldTime() - val;
        return dur <= 20 ? (int) (dur > 0 ? 1 : 0) : -1;
    }
}
