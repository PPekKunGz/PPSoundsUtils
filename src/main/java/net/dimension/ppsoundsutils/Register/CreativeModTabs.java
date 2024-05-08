package net.dimension.ppsoundsutils.Register;

import net.dimension.ppsoundsutils.PPSoundsUtils;
import net.dimension.ppsoundsutils.Register.Items.ItemsRegister;
import net.minecraft.core.registries.Registries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PPSoundsUtils.MODID);

    public static final RegistryObject<CreativeModeTab> PPSOUNDSUTILS_MUSIC = CREATIVE_MODE_TABS.register("ppsoundutils_music",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ItemsRegister.MUSIC_DISC_DMS.get()))
                    .title(Component.translatable("creativetab.ppsoundutils.items"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ItemsRegister.MUSIC_DISC_NIGHT_1.get());
                        pOutput.accept(ItemsRegister.MUSIC_DISC_NIGHT_2.get());
                        pOutput.accept(ItemsRegister.MUSIC_DISC_NIGHT_3.get());
                        pOutput.accept(ItemsRegister.MUSIC_DISC_NIGHT_4.get());
                        pOutput.accept(ItemsRegister.MUSIC_DISC_NIGHT_5.get());
                        pOutput.accept(ItemsRegister.MUSIC_DISC_NIGHT_6.get());
                        pOutput.accept(ItemsRegister.MUSIC_DISC_NIGHT_7.get());
                        pOutput.accept(ItemsRegister.MUSIC_DISC_NIGHT_8.get());
                        pOutput.accept(ItemsRegister.MUSIC_DISC_NIGHT_9.get());
                        pOutput.accept(ItemsRegister.MUSIC_DISC_NIGHT_10.get());
                        pOutput.accept(ItemsRegister.MUSIC_DISC_NIGHT_11.get());
                        pOutput.accept(ItemsRegister.MUSIC_DISC_NIGHT_12.get());
                        pOutput.accept(ItemsRegister.MUSIC_DISC_NIGHT_13.get());
                        pOutput.accept(ItemsRegister.MUSIC_DISC_NIGHT_14.get());
                        pOutput.accept(ItemsRegister.MUSIC_DISC_NIGHT_15.get());

                        pOutput.accept(ItemsRegister.MUSIC_DISC_MONING_1.get());
                        pOutput.accept(ItemsRegister.MUSIC_DISC_MONING_2.get());
                        pOutput.accept(ItemsRegister.MUSIC_DISC_MONING_3.get());
                        pOutput.accept(ItemsRegister.MUSIC_DISC_MONING_4.get());
                        pOutput.accept(ItemsRegister.MUSIC_DISC_MONING_5.get());
                        pOutput.accept(ItemsRegister.MUSIC_DISC_MONING_6.get());
                        pOutput.accept(ItemsRegister.MUSIC_DISC_MONING_7.get());
                        pOutput.accept(ItemsRegister.MUSIC_DISC_MONING_8.get());
                        pOutput.accept(ItemsRegister.MUSIC_DISC_MONING_9.get());
                        pOutput.accept(ItemsRegister.MUSIC_DISC_MONING_10.get());
                        pOutput.accept(ItemsRegister.MUSIC_DISC_MONING_11.get());
                        pOutput.accept(ItemsRegister.MUSIC_DISC_MONING_12.get());
                        pOutput.accept(ItemsRegister.MUSIC_DISC_MONING_13.get());
                        pOutput.accept(ItemsRegister.MUSIC_DISC_MONING_14.get());

                        pOutput.accept(ItemsRegister.MUSIC_DISC_CLUB_1.get());
                        pOutput.accept(ItemsRegister.MUSIC_DISC_CLUB_2.get());
                        pOutput.accept(ItemsRegister.MUSIC_DISC_CLUB_3.get());
                        pOutput.accept(ItemsRegister.MUSIC_DISC_CLUB_4.get());
                        pOutput.accept(ItemsRegister.MUSIC_DISC_CLUB_5.get());
                        pOutput.accept(ItemsRegister.MUSIC_DISC_CLUB_6.get());
                        pOutput.accept(ItemsRegister.MUSIC_DISC_CLUB_7.get());
                        pOutput.accept(ItemsRegister.MUSIC_DISC_CLUB_8.get());
                        pOutput.accept(ItemsRegister.MUSIC_DISC_CLUB_9.get());
                        pOutput.accept(ItemsRegister.MUSIC_DISC_CLUB_10.get());
                        pOutput.accept(ItemsRegister.MUSIC_DISC_CLUB_11.get());
                        pOutput.accept(ItemsRegister.MUSIC_DISC_CLUB_12.get());
                        pOutput.accept(ItemsRegister.MUSIC_DISC_CLUB_13.get());
                        pOutput.accept(ItemsRegister.MUSIC_DISC_CLUB_14.get());
                        pOutput.accept(ItemsRegister.MUSIC_DISC_CLUB_15.get());
                        pOutput.accept(ItemsRegister.MUSIC_DISC_CLUB_16.get());
                        pOutput.accept(ItemsRegister.MUSIC_DISC_CLUB_17.get());

                        pOutput.accept(ItemsRegister.MUSIC_DISC_OMAKASE_1.get());
                        pOutput.accept(ItemsRegister.MUSIC_DISC_OMAKASE_2.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
