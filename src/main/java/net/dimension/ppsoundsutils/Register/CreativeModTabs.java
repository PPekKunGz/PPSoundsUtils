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
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ItemsRegister.TEST.get()))
                    .title(Component.translatable("creativetab.ppsoundutils.items"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ItemsRegister.TEST.get());
                        pOutput.accept(ItemsRegister.MUSIC_DISC_DMS.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
