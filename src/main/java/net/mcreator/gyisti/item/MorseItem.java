
package net.mcreator.gyisti.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.gyisti.itemgroup.GyistiLivingItemGroup;
import net.mcreator.gyisti.GyistiModElements;

import java.util.List;

@GyistiModElements.ModElement.Tag
public class MorseItem extends GyistiModElements.ModElement {
	@ObjectHolder("gyisti:morse")
	public static final Item block = null;
	public MorseItem(GyistiModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, GyistiModElements.sounds.get(new ResourceLocation("gyisti:mors")),
					new Item.Properties().group(GyistiLivingItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("morse");
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("-... .--. --"));
		}
	}
}
