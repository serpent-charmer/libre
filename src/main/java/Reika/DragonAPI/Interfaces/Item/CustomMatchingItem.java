package Reika.DragonAPI.Interfaces.Item;

import Reika.DragonAPI.Instantiable.ItemFilter;
import net.minecraft.item.ItemStack;

public interface CustomMatchingItem {
    public boolean match(ItemStack is);

    public ItemFilter getFilter(ItemStack is);
}
