
package net.mcreator.gyisti.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import net.mcreator.gyisti.itemgroup.GyistiLivingItemGroup;
import net.mcreator.gyisti.GyistiModElements;

import java.util.List;

@GyistiModElements.ModElement.Tag
public class DiepiobasictankItem extends GyistiModElements.ModElement {
	@ObjectHolder("gyisti:diepiobasictank")
	public static final Item block = null;
	public DiepiobasictankItem(GyistiModElements instance) {
		super(instance, 16);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(GyistiLivingItemGroup.tab).maxStackSize(64));
			setRegistryName("diepiobasictank");
		}

		@Override
		public int getItemEnchantability() {
			return 35;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("FU ZA KE RU NA!!!!"));
		}
	}
}
