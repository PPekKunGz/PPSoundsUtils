package net.dimension.soundutils;

import net.dimension.soundutils.Register.Items.FcItemGroup;
import net.dimension.soundutils.Register.Sound.FcSoundRegistries;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PPSoundsUtils implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("dimension-school");

	@Override
	public void onInitialize() {
		FcSoundRegistries.init();
		FcItemGroup.init();

		LOGGER.info("PPSoundsUtils is Connected!");
	}
}