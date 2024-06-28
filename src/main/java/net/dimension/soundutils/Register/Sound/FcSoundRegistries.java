package net.dimension.soundutils.Register.Sound;

import net.dimension.soundutils.PPSoundsUtils;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;

public class FcSoundRegistries {

    public static final Item DOUBLE_G = registerItem("music_disc_main_1", "main_1_music_sound", 4326, 6);
    public static final Item FIRST_PARTY01 = registerItem("music_disc_party_1", "party_1_music_sound", 40007, 6);
    public static final Item FIRST_PARTY02 = registerItem("music_disc_party_2", "party_2_music_sound", 40384, 6);

    ////////////////// HALLOWEEN ///////////////////
    public static final Item HALLO_01 = registerItem("music_disc_coyotehearing", "coyotehearing", 95, 6);
    public static final Item HALLO_02 = registerItem("music_disc_englishcountrygarden", "englishcountrygarden", 100, 6);
    public static final Item HALLO_03 = registerItem("music_disc_esjammyjams", "esjammyjams", 158, 6);
    public static final Item HALLO_04 = registerItem("music_disc_ha_cxdy", "ha_cxdy", 162, 6);
    public static final Item HALLO_05 = registerItem("music_disc_happyhaunts", "happyhaunts", 130, 6);
    public static final Item HALLO_06 = registerItem("music_disc_horsestrains", "horsestrains", 153, 6);
    public static final Item HALLO_07 = registerItem("music_disc_magicaldirt", "magicaldirt", 140, 6);
    public static final Item HALLO_08 = registerItem("music_disc_magicalgravity", "magicalgravity", 188, 6);
    public static final Item HALLO_09 = registerItem("music_disc_magicaltriumph", "magicaltriumph", 165, 6);
    public static final Item HALLO_10 = registerItem("music_disc_orphan", "orphan", 160, 6);
    public static final Item HALLO_11 = registerItem("music_disc_pooka", "pooka", 115, 6);
    public static final Item HALLO_12 = registerItem("music_disc_readysetgo", "readysetgo", 140, 6);
    public static final Item HALLO_13 = registerItem("music_disc_rightnow", "rightnow", 115, 6);
    public static final Item HALLO_14 = registerItem("music_disc_theneworder", "theneworder", 110, 6);
    public static final Item HALLO_15 = registerItem("music_disc_tropicalthunder", "tropicalthunder", 152, 6);
    public static final Item HALLO_16 = registerItem("music_disc_waltztodeath", "waltztodeath", 158, 6);
    ////////////////// HALLOWEEN ///////////////////


    private static Item registerItem(String item, String sound_file, int duration, int analog) {
        ResourceLocation id_sound = new ResourceLocation("ppekkungz", sound_file);
        SoundEvent sound = Registry.register(BuiltInRegistries.SOUND_EVENT, id_sound, SoundEvent.createVariableRangeEvent(id_sound));
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation("ppekkungz", item), new RecordItem(analog, sound, new FabricItemSettings().maxCount(1).rarity(Rarity.RARE), duration));
    }

    public static void init() {
        PPSoundsUtils.LOGGER.info("Register sound!");
    }
}
