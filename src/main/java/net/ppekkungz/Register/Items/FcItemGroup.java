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
            })
            .build());

    public static void init() {
        PPSoundsUtils.LOGGER.info("Register Creative Mode Tab!");
    }
}
