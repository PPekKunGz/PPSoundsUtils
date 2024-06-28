package net.dimension.soundutils.Register.Items;

import net.dimension.soundutils.PPSoundsUtils;
import net.dimension.soundutils.Register.Sound.FcSoundRegistries;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.ChatFormatting;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class FcItemGroup {
    public static final CreativeModeTab MUSIC_STATION_GROUP = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, new ResourceLocation("ppekkungz", "music_station_group"), FabricItemGroup.builder()
            .icon(() -> new ItemStack(FcSoundRegistries.DOUBLE_G))
            .title(Component.literal("ᴍᴜꜱɪᴄ ꜱᴛᴀᴛɪᴏɴ").setStyle(Style.EMPTY.withColor(ChatFormatting.GREEN).withBold(true)))
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(FcSoundRegistries.DOUBLE_G);
                output.accept(FcSoundRegistries.FIRST_PARTY01);
                output.accept(FcSoundRegistries.FIRST_PARTY02);
                output.accept(FcSoundRegistries.HALLO_01);
                output.accept(FcSoundRegistries.HALLO_02);
                output.accept(FcSoundRegistries.HALLO_03);
                output.accept(FcSoundRegistries.HALLO_04);
                output.accept(FcSoundRegistries.HALLO_05);
                output.accept(FcSoundRegistries.HALLO_06);
                output.accept(FcSoundRegistries.HALLO_07);
                output.accept(FcSoundRegistries.HALLO_08);
                output.accept(FcSoundRegistries.HALLO_09);
                output.accept(FcSoundRegistries.HALLO_10);
                output.accept(FcSoundRegistries.HALLO_11);
                output.accept(FcSoundRegistries.HALLO_12);
                output.accept(FcSoundRegistries.HALLO_13);
                output.accept(FcSoundRegistries.HALLO_14);
                output.accept(FcSoundRegistries.HALLO_15);
                output.accept(FcSoundRegistries.HALLO_16);
            })
            .build());

    public static void init() {
        PPSoundsUtils.LOGGER.info("Register Creative Mode Tab!");
    }
}
