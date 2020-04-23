package tv.calibur.lagremover.mixin;

import com.mojang.authlib.GameProfile;
import net.minecraft.block.entity.SkullBlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(value = SkullBlockEntity.class)
public class Remover {
	@Overwrite
	public static GameProfile loadProperties(GameProfile profile) {
		System.out.println("Skipping Load Skull Skin");
		return profile;
	}
}
