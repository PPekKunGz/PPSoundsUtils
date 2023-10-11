package net.ppekkungz.Register.Items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.ChatFormatting;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.ppekkungz.PPSoundsUtils;
import net.ppekkungz.Register.Sound.FcSoundRegistries;

public class FcItemGroup {
    public static final CreativeModeTab MUSIC_STATION_GROUP = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, new ResourceLocation("ppekkungz", "music_station_group"), FabricItemGroup.builder()
            .icon(() -> new ItemStack(FcSoundRegistries.MYSTERIOUS_SONG))
            .title(Component.literal("ᴍᴜꜱɪᴄ ꜱᴛᴀᴛɪᴏɴ").setStyle(Style.EMPTY.withColor(ChatFormatting.GREEN).withBold(true)))
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(FcSoundRegistries.MYSTERIOUS_SONG);
                output.accept(FcSoundRegistries.WHY_SONG);
                output.accept(FcSoundRegistries.BUDDIES_SONG);
                output.accept(FcSoundRegistries.OST_FSC_SONG);
                output.accept(FcSoundRegistries.BUDDIES_ONE_SONG);
                output.accept(FcSoundRegistries.AGAIN_OST_SONG);
                output.accept(FcSoundRegistries.TIIDTIIW_SONG);
                output.accept(FcSoundRegistries.THAMNOY_SONG);
                output.accept(FcSoundRegistries.JULY_SONG);
                output.accept(FcSoundRegistries.LUVYOUTWENTYFOURH_SONG);
                output.accept(FcSoundRegistries.ADVENTURETHEME_SONG);
                output.accept(FcSoundRegistries.ALONEWITHMYTHOUGHTS_SONG);
                output.accept(FcSoundRegistries.ANEWBEGINNING_SONG);
                output.accept(FcSoundRegistries.BATUQEBOM_SONG);
                output.accept(FcSoundRegistries.CARTOONBANKHEIST_SONG);
                output.accept(FcSoundRegistries.FRUITSOFLIFE_SONG);
                output.accept(FcSoundRegistries.GLORYTOTHEGARDENER_SONG);
                output.accept(FcSoundRegistries.INMYDREAMS_SONG);
                output.accept(FcSoundRegistries.MANJKHAMMAJ_SONG);
                output.accept(FcSoundRegistries.PATRIOTICMARCH_SONG);
                output.accept(FcSoundRegistries.PLUCKANDPLAY_SONG);
                output.accept(FcSoundRegistries.SPAZZCARDIGAN_SONG);
                output.accept(FcSoundRegistries.THECCHOONERTHEBETTER_SONG);
                output.accept(FcSoundRegistries.THECURIOUSKITTEN_SONG);
                output.accept(FcSoundRegistries.THEDAYINMETHER_SONG);
                output.accept(FcSoundRegistries.VIEWOFTHEVALLEY_SONG);
                output.accept(FcSoundRegistries.WAYOUTWEST_SONG);
                output.accept(FcSoundRegistries.YYOURLOVE_SONG);
                output.accept(FcSoundRegistries.WATER_01);
                output.accept(FcSoundRegistries.WATER_02);
                output.accept(FcSoundRegistries.WATER_03);
                output.accept(FcSoundRegistries.WATER_04);
                output.accept(FcSoundRegistries.WATER_05);
                output.accept(FcSoundRegistries.WATER_06);
                output.accept(FcSoundRegistries.WATER_07);
                output.accept(FcSoundRegistries.WATER_08);
                output.accept(FcSoundRegistries.WATER_09);
                output.accept(FcSoundRegistries.WATER_10);
                output.accept(FcSoundRegistries.WATER_11);
                output.accept(FcSoundRegistries.WATER_12);
                output.accept(FcSoundRegistries.WATER_13);
                output.accept(FcSoundRegistries.LIFE_BYTHEFIREPLACE_SONG);
                output.accept(FcSoundRegistries.LIFE_CALCAM_SONG);
                output.accept(FcSoundRegistries.LIFE_CONFIDENTKURT_SONG);
                output.accept(FcSoundRegistries.LIFE_FINEDINING_SONG);
                output.accept(FcSoundRegistries.LIFE_IHAVEARESERVAATION_SONG);
                output.accept(FcSoundRegistries.LIFE_JANESTREET_SONG);
                output.accept(FcSoundRegistries.LIFE_LOSTLOUNGE_SONG);
                output.accept(FcSoundRegistries.LIFE_MEMBERONLY_SONG);
                output.accept(FcSoundRegistries.LIFE_ONTHEROCKS_SONG);
                output.accept(FcSoundRegistries.LIFE_PUTIT_SONG);
                output.accept(FcSoundRegistries.LIFE_RUNNINGERRANDS_SONG);
                output.accept(FcSoundRegistries.LIFE_SMOKEJACKETBLUES_SONG);
                output.accept(FcSoundRegistries.LIFE_SQUIRMWORM_SONG);
                output.accept(FcSoundRegistries.LIFE_STROLLIN_SONG);
                output.accept(FcSoundRegistries.LIFE_THETHOUGHTOFUOU_SONG);
                output.accept(FcSoundRegistries.LIFE_WISHYOUDNEVERLEFT_SONG);
            })
            .build());

    public static void init() {
        PPSoundsUtils.LOGGER.info("Register Creative Mode Tab!");
    }
}
