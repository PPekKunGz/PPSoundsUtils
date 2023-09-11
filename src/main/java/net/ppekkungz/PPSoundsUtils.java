package net.ppekkungz;

import net.fabricmc.api.ModInitializer;

import net.ppekkungz.Register.Items.FcItemGroup;
import net.ppekkungz.Register.Sound.FcSoundRegistries;
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