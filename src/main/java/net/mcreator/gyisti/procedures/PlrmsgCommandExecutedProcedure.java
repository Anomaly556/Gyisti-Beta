package net.mcreator.gyisti.procedures;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.command.FunctionObject;

import net.mcreator.gyisti.GyistiModElements;

import java.util.Optional;
import java.util.Map;

@GyistiModElements.ModElement.Tag
public class PlrmsgCommandExecutedProcedure extends GyistiModElements.ModElement {
	public PlrmsgCommandExecutedProcedure(GyistiModElements instance) {
		super(instance, 8);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure PlrmsgCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (!entity.world.isRemote && entity.world.getServer() != null) {
			Optional<FunctionObject> _fopt = entity.world.getServer().getFunctionManager().get(new ResourceLocation("ply"));
			if (_fopt.isPresent()) {
				FunctionObject _fobj = _fopt.get();
				entity.world.getServer().getFunctionManager().execute(_fobj, entity.getCommandSource());
			}
		}
	}
}
