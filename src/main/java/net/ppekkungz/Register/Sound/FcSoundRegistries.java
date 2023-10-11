package net.ppekkungz.Register.Sound;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.ppekkungz.PPSoundsUtils;

public class FcSoundRegistries {

    public static final Item WHY_SONG = registerItem("music_disc_why_cover", "why_cover", 155, 6);
    public static final Item MYSTERIOUS_SONG = registerItem("music_disc_mysterious", "mysterious", 90, 6);
    public static final Item BUDDIES_SONG = registerItem("music_disc_buddies", "buddies", 270, 6);
    public static final Item OST_FSC_SONG = registerItem("music_disc_ost_fsc", "ost_fsc", 190, 6);
    public static final Item BUDDIES_ONE_SONG = registerItem("music_disc_buddies_one", "buddies_one", 190, 6);
    public static final Item AGAIN_OST_SONG = registerItem("music_disc_again_ost", "again_ost", 80, 6);
    public static final Item TIIDTIIW_SONG = registerItem("music_disc_tiidtiiw", "tiidtiiw", 230, 6);
    public static final Item THAMNOY_SONG = registerItem("music_disc_thamnoy", "thamnoy", 230, 6);
    public static final Item LUVYOUTWENTYFOURH_SONG = registerItem("music_disc_luvyoutwentyfourh", "luvyoutwentyfourh", 225, 6);
    public static final Item JULY_SONG = registerItem("music_disc_july", "july", 190, 6);
    ////////////////// LIFE  ///////////////////
    public static final Item ADVENTURETHEME_SONG = registerItem("music_disc_adventuretheme", "adventuretheme", 146, 6);
    public static final Item ALONEWITHMYTHOUGHTS_SONG = registerItem("music_disc_alomewithmythoughts", "alomewithmythoughts", 133, 6);
    public static final Item ANEWBEGINNING_SONG = registerItem("music_disc_anewbeginning", "anewbeginning", 136, 6);
    public static final Item BATUQEBOM_SONG = registerItem("music_disc_batuquebom", "batuquebom", 199, 6);
    public static final Item CARTOONBANKHEIST_SONG = registerItem("music_disc_cartoonbankheist", "cartoonbankheist", 85, 6);
    public static final Item FRUITSOFLIFE_SONG = registerItem("music_disc_fruitsoflife", "fruitsoflife", 130, 6);
    public static final Item GLORYTOTHEGARDENER_SONG = registerItem("music_disc_glorytothegardener", "glorytothegardener", 154, 6);
    public static final Item INMYDREAMS_SONG = registerItem("music_disc_inmydreams", "inmydreams", 152, 6);
    public static final Item MANJKHAMMAJ_SONG = registerItem("music_disc_manjkhammaj", "manjkhammaj", 87, 6);
    public static final Item PATRIOTICMARCH_SONG = registerItem("music_disc_patrioticmarch", "patrioticmarch", 121, 6);
    public static final Item PLUCKANDPLAY_SONG = registerItem("music_disc_pluckandplay", "pluckandplay", 193, 6);
    public static final Item SPAZZCARDIGAN_SONG = registerItem("music_disc_spazzcardigan", "spazzcardigan", 186, 6);
    public static final Item THECCHOONERTHEBETTER_SONG = registerItem("music_disc_thecchoonerthebetter", "thecchoonerthebetter", 93, 6);
    public static final Item THECURIOUSKITTEN_SONG = registerItem("music_disc_thecuriouskitten", "thecuriouskitten", 81, 6);
    public static final Item THEDAYINMETHER_SONG = registerItem("music_disc_thedayimether", "thedayimether", 144, 6);
    public static final Item VIEWOFTHEVALLEY_SONG = registerItem("music_disc_viewofthevalley", "viewofthevalley", 84, 6);
    public static final Item WAYOUTWEST_SONG = registerItem("music_disc_wayoutwest", "wayoutwest", 152, 6);
    public static final Item YYOURLOVE_SONG = registerItem("music_disc_yyourlove", "yyourlove", 133, 6);
    ////////////////// LIFE ///////////////////
    ////////////////// LIFE 02 ///////////////////
    public static final Item LIFE_BYTHEFIREPLACE_SONG = registerItem("music_disc_life_bythefireplace_tracktribe", "life_bythefireplace", 252, 6);
    public static final Item LIFE_CALCAM_SONG = registerItem("music_disc_life_calmcam_tracktribe", "life_calmcam", 240, 6);
    public static final Item LIFE_CONFIDENTKURT_SONG = registerItem("music_disc_life_confidentkurt_tracktribe", "life_confidentkurt", 195, 6);
    public static final Item LIFE_FINEDINING_SONG = registerItem("music_disc_life_finedining_tracktribe", "life_finedining", 190, 6);
    public static final Item LIFE_IHAVEARESERVAATION_SONG = registerItem("music_disc_life_ihaveareservation_tracktribe", "life_ihaveareservation", 135, 6);
    public static final Item LIFE_JANESTREET_SONG = registerItem("music_disc_life_janestreet_tracktribe", "life_janestreet", 195, 6);
    public static final Item LIFE_LOSTLOUNGE_SONG = registerItem("music_disc_life_lostlounge_tracktribe", "life_lostlounge", 245, 6);
    public static final Item LIFE_MEMBERONLY_SONG = registerItem("music_disc_life_membersonly_tracktribe", "life_membersonly", 185, 6);
    public static final Item LIFE_ONTHEROCKS_SONG = registerItem("music_disc_life_ontherocks_tracktribe", "life_ontherocks", 205, 6);
    public static final Item LIFE_PUTIT_SONG = registerItem("music_disc_life_putit_tracktribe", "life_putit", 200, 6);
    public static final Item LIFE_RUNNINGERRANDS_SONG = registerItem("music_disc_life_runningerrands_tracktribe", "life_runningerrands", 260, 6);
    public static final Item LIFE_SMOKEJACKETBLUES_SONG = registerItem("music_disc_life_smokejacketblues_tracktribe", "life_smokejacketblues", 150, 6);
    public static final Item LIFE_SQUIRMWORM_SONG = registerItem("music_disc_life_squirmworm_tracktribe", "life_squirmworm", 205, 6);
    public static final Item LIFE_STROLLIN_SONG = registerItem("music_disc_life_strollin_tracktribe", "life_strollin", 185, 6);
    public static final Item LIFE_THETHOUGHTOFUOU_SONG = registerItem("music_disc_life_thethoughtofuou_tracktribe", "life_thethoughtofuou", 250, 6);
    public static final Item LIFE_WISHYOUDNEVERLEFT_SONG = registerItem("music_disc_life_wishyoudneverleft_tracktribe", "life_wishyoudneverleft", 305, 6);

    ////////////////// LIFE 02 ///////////////////
    ////////////////// WATER ///////////////////
    public static final Item WATER_01 = registerItem("music_disc_aalaap_in_raag_jhinjhoti", "aalaap_in_raag_jhinjhoti", 180, 6);
    public static final Item WATER_02 = registerItem("music_disc_calmcam_tracktribe", "calmcam_tracktribe", 240, 6);
    public static final Item WATER_03 = registerItem("music_disc_dovelove_quincasmoreira", "dovelove_quincasmoreira", 180, 6);
    public static final Item WATER_04 = registerItem("music_disc_hanudixit", "hanudixit", 150, 6);
    public static final Item WATER_05 = registerItem("music_disc_lawrence_tracktribe", "lawrence_tracktribe", 240, 6);
    public static final Item WATER_06 = registerItem("music_disc_oholynight_djwilliams", "oholynight_djwilliams", 110, 6);
    public static final Item WATER_07 = registerItem("music_disc_raagpilu", "raagpilu", 185, 6);
    public static final Item WATER_08 = registerItem("music_disc_savior", "savior", 160, 6);
    public static final Item WATER_09 = registerItem("music_disc_societysdream", "societysdream", 140, 6);
    public static final Item WATER_10 = registerItem("music_disc_emeraldseas", "emeraldseas", 100, 6);
    public static final Item WATER_11 = registerItem("music_disc_ihadafeeling", "ihadafeeling", 330, 6);
    public static final Item WATER_12 = registerItem("music_disc_islandcoconuts", "islandcoconuts", 145, 6);
    public static final Item WATER_13 = registerItem("music_disc_peachy_half_cool", "peachy_half_cool", 105, 6);
    public static final Item WATER_14 = registerItem("music_disc_sharpedges_half_cool", "sharpedges_half_cool", 153, 6);
    ////////////////// WATER ///////////////////

    public static final Item DMS_01 = registerItem("music_disc_dms_01", "dms_01", 153, 6);
    public static final Item DMS_02 = registerItem("music_disc_dms_02", "dms_02", 153, 6);
    public static final Item DMS_03 = registerItem("music_disc_dms_03", "dms_03", 204, 6);
    private static Item registerItem(String item, String sound_file, int duration, int analog) {
        ResourceLocation id_sound = new ResourceLocation("ppekkungz", sound_file);
        SoundEvent sound = Registry.register(BuiltInRegistries.SOUND_EVENT, id_sound, SoundEvent.createVariableRangeEvent(id_sound));
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation("ppekkungz", item), new RecordItem(analog, sound, new FabricItemSettings().maxCount(1).rarity(Rarity.RARE), duration));
    }

    public static void init() {
        PPSoundsUtils.LOGGER.info("Register sound!");
    }
}
