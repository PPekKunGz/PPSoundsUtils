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

    public static final Item MAIN_SOUND_END = registerItem("music_disc_main_sound", "main_sound", 127, 6);
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
    public static final Item LIFE_JIMENACONTRERAS_SONG = registerItem("music_disc_life_jimenacontreras", "life_jimenacontreras", 160, 6);
    public static final Item LIFE_JOSEFSUKSERENADEOP6_SONG = registerItem("music_disc_life_josefsukserenadeop6", "life_josefsukserenadeop6", 1572, 6);
    public static final Item LIFE_MOZARTSYMPHONYNO_SONG = registerItem("music_disc_life_mozartsymphonyno", "life_mozartsymphonyno", 1872, 6);

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
    ////////////////// CHRISTMAS ///////////////////
    public static final Item CHRIST_01 = registerItem("music_disc_centralpark", "centralpark", 148, 6);
    public static final Item CHRIST_02 = registerItem("music_disc_christmashomecoming", "christmashomecoming", 132, 6);
    public static final Item CHRIST_03 = registerItem("music_disc_christmasvillage", "christmasvillage", 94, 6);
    public static final Item CHRIST_04 = registerItem("music_disc_joytotheworld", "joytotheworld", 130, 6);
    public static final Item CHRIST_05 = registerItem("music_disc_ocomeallyefaithful", "ocomeallyefaithful", 212, 6);

    ////////////////// CHRISTMAS ///////////////////
    ////////////////// SOUND ///////////////////
    public static final Item SOUND_01 = registerItem("music_disc_sound_babneeniang", "babneeniang", 152, 6);
    public static final Item SOUND_02 = registerItem("music_disc_sound_bigwatch", "bigwatch", 184, 6);
    public static final Item SOUND_03 = registerItem("music_disc_sound_chanyungwai", "chanyungwai", 198, 6);
    public static final Item SOUND_04 = registerItem("music_disc_sound_chiwidterdeeyulaw", "chiwidterdeeyulaw", 215, 6);
    public static final Item SOUND_05 = registerItem("music_disc_sound_choptherlawmunpidmai", "choptherlawmunpidmai", 220, 6);
    public static final Item SOUND_06 = registerItem("music_disc_sound_choptherna", "choptherna", 284, 6);
    public static final Item SOUND_07 = registerItem("music_disc_sound_enhypen_shoutout", "enhypen_shoutout", 234, 6);
    public static final Item SOUND_08 = registerItem("music_disc_sound_flow_sing", "flow_sing", 242, 6);
    public static final Item SOUND_09 = registerItem("music_disc_sound_jaojai", "jaojai", 205, 6);
    public static final Item SOUND_10 = registerItem("music_disc_sound_keapungneemaimerao", "keapungneemaimerao", 282, 6);
    public static final Item SOUND_11 = registerItem("music_disc_sound_konmaikui", "konmaikui", 185, 6);
    public static final Item SOUND_12 = registerItem("music_disc_sound_korphunmunnarak", "korphunmunnarak", 208, 6);
    public static final Item SOUND_13 = registerItem("music_disc_sound_kwajadairuk", "kwajadairuk", 232, 6);
    public static final Item SOUND_14 = registerItem("music_disc_sound_meyou_todayofyear", "meyou_todayofyear", 235, 6);
    public static final Item SOUND_15 = registerItem("music_disc_sound_millionmirror", "millionmirror", 208, 6);
    public static final Item SOUND_16 = registerItem("music_disc_sound_nolastenternity", "nolastenternity", 128, 6);
    public static final Item SOUND_17 = registerItem("music_disc_sound_notbad", "notbad", 202, 6);
    public static final Item SOUND_18 = registerItem("music_disc_sound_pidpak", "pidpak", 223, 6);
    public static final Item SOUND_19 = registerItem("music_disc_sound_pyschogram", "pyschogram", 228, 6);
    public static final Item SOUND_20 = registerItem("music_disc_sound_ror_t_mt", "ror_t_mt", 218, 6);
    public static final Item SOUND_21 = registerItem("music_disc_sound_sol_amuyhay", "sol_amuyhay", 178, 6);
    public static final Item SOUND_22 = registerItem("music_disc_sound_summer_breeze", "summer_breeze", 228, 6);
    public static final Item SOUND_23 = registerItem("music_disc_sound_sun", "sun", 290, 6);
    public static final Item SOUND_24 = registerItem("music_disc_sound_tanboi", "tanboi", 200, 6);
    public static final Item SOUND_25 = registerItem("music_disc_sound_thank_you", "thank_you", 202, 6);
    public static final Item SOUND_26 = registerItem("music_disc_sound_w_r_u", "w_r_u", 270, 6);
    public static final Item SOUND_27 = registerItem("music_disc_sound_where_is_our_blue", "where_is_our_blue", 200, 6);
    public static final Item SOUND_28 = registerItem("music_disc_sound_whisper_whisper_whisper", "whisper_whisper_whisper", 128, 6);
    public static final Item SOUND_29 = registerItem("music_disc_sound_wingneeorkpaiduaykwamwaimug", "wingneeorkpaiduaykwamwaimug", 252, 6);
    ////////////////// SOUND ///////////////////
    ////////////////// FIRE ///////////////////
    public static final Item FIRE_01 = registerItem("music_disc_fire_middle_treeofsavior", "fire_middle_treeofsavior", 266, 6);
    public static final Item FIRE_02 = registerItem("music_disc_fire_first_rag", "fire_first_rag", 142, 6);
    public static final Item FIRE_03 = registerItem("music_disc_fire_end_rag", "fire_end_rag", 35, 6);
    public static final Item FIRE_04 = registerItem("music_disc_fire_siestita", "fire_siestita", 160, 6);
    public static final Item FIRE_05 = registerItem("music_disc_fire_dovelove", "fire_dovelove", 182, 6);
    public static final Item FIRE_06 = registerItem("music_disc_fire_yourlove", "fire_yourlove", 150, 6);
    public static final Item FIRE_07 = registerItem("music_disc_fire_honkyoku", "fire_honkyoku", 155, 6);
    public static final Item FIRE_08 = registerItem("music_disc_fire_saomeoorchestralmix", "fire_saomeoorchestralmix", 158, 6);
    public static final Item FIRE_09 = registerItem("music_disc_fire_minyosankyoku", "fire_minyosankyoku", 158, 6);
    public static final Item FIRE_10 = registerItem("music_disc_fire_girasol_quincasmoreira", "fire_girasol_quincasmoreira", 158, 6);

    ////////////////// FIRE ///////////////////

    // WIND
    public static final Item WIND_01 = registerItem("music_disc_wind_01", "wind_01", 219, 7);
    public static final Item WIND_02 = registerItem("music_disc_wind_02", "wind_02", 190, 7);
    public static final Item WIND_03 = registerItem("music_disc_wind_03", "wind_03", 58, 7);
    public static final Item WIND_04 = registerItem("music_disc_wind_04", "wind_04", 143, 7);
    public static final Item WIND_05 = registerItem("music_disc_wind_05", "wind_05", 86, 7);
    public static final Item WIND_06 = registerItem("music_disc_wind_06", "wind_06", 132, 7);
    // WIND

    // LIFE
    public static final Item LIFE_01 = registerItem("music_disc_life_01", "life1_01", 138, 7);
    public static final Item LIFE_02 = registerItem("music_disc_life_02", "life1_02", 127, 7);
    public static final Item LIFE_03 = registerItem("music_disc_life_03", "life1_03", 169, 7);
    public static final Item LIFE_04 = registerItem("music_disc_life_04", "life1_04", 142, 7);
    public static final Item LIFE_05 = registerItem("music_disc_life_05", "life1_05", 149, 7);
    public static final Item LIFE_06 = registerItem("music_disc_life_06", "life1_06", 176, 7);
    public static final Item LIFE_07 = registerItem("music_disc_life_07", "life1_07", 186, 7);
    public static final Item LIFE_08 = registerItem("music_disc_life_08", "life1_08", 147, 7);
    public static final Item LIFE_09 = registerItem("music_disc_life_09", "life1_09", 168, 7);
    public static final Item LIFE_10 = registerItem("music_disc_life_10", "life1_10", 117, 7);
    public static final Item LIFE_11 = registerItem("music_disc_life_11", "life1_11", 165, 7);
    public static final Item LIFE_12 = registerItem("music_disc_life_12", "life1_12", 97, 7);
    public static final Item LIFE_13 = registerItem("music_disc_life_13", "life1_13", 179, 7);
    // WIND

    // LIGHT
    public static final Item LIGHT_01 = registerItem("music_disc_light_01", "light_01", 120, 7);
    public static final Item LIGHT_02 = registerItem("music_disc_light_02", "light_02", 572, 7);
    public static final Item LIGHT_03 = registerItem("music_disc_light_03", "light_03", 559, 7);
    public static final Item LIGHT_04 = registerItem("music_disc_light_04", "light_04", 123, 7);
    public static final Item LIGHT_05 = registerItem("music_disc_light_05", "light_05", 655, 7);
    public static final Item LIGHT_06 = registerItem("music_disc_light_06", "light_06", 1579, 7);
    public static final Item LIGHT_07 = registerItem("music_disc_light_07", "light_07", 80, 7);
    public static final Item LIGHT_08 = registerItem("music_disc_light_08", "light_08", 1877, 7);

    // LIGHT

    // DIRT
    public static final Item DIRT_01 = registerItem("music_disc_dirt_1", "dirt1_1", 60, 8);
    public static final Item DIRT_02 = registerItem("music_disc_dirt_2", "dirt1_2", 201, 8);
    public static final Item DIRT_03 = registerItem("music_disc_dirt_3", "dirt1_3", 175, 8);

    // DIRT

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
