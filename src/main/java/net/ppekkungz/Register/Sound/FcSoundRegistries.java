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

    public static final Item WHY_SONG = registerItem("music_disc_why_cover", "why_cover", 150, 6);
    public static final Item MYSTERIOUS_SONG = registerItem("music_disc_mysterious", "mysterious", 85, 6);
    public static final Item BUDDIES_SONG = registerItem("music_disc_buddies", "buddies", 267, 6);
    public static final Item OST_FSC_SONG = registerItem("music_disc_ost_fsc", "ost_fsc", 187, 6);
    public static final Item BUDDIES_ONE_SONG = registerItem("music_disc_buddies_one", "buddies_one", 185, 6);
    public static final Item AGAIN_OST_SONG = registerItem("music_disc_again_ost", "again_ost", 78, 6);
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

    private static Item registerItem(String item, String sound_file, int duration, int analog) {
        ResourceLocation id_sound = new ResourceLocation("ppekkungz", sound_file);
        SoundEvent sound = Registry.register(BuiltInRegistries.SOUND_EVENT, id_sound, SoundEvent.createVariableRangeEvent(id_sound));
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation("ppekkungz", item), new RecordItem(analog, sound, new FabricItemSettings().maxCount(1).rarity(Rarity.RARE), duration));
    }

    public static void init() {
        PPSoundsUtils.LOGGER.info("Register sound!");
    }
}
