package net.mcreator.gyisti.procedures;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.gyisti.GyistiModElements;

import java.util.Map;

@GyistiModElements.ModElement.Tag
public class IceFoodEatenProcedure extends GyistiModElements.ModElement {
	public IceFoodEatenProcedure(GyistiModElements instance) {
		super(instance, 12);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure IceFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).setHealth((float) 9);
	}
}
