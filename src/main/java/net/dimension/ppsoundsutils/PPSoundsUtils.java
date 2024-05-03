package net.dimension.ppsoundsutils;

import com.mojang.logging.LogUtils;
import net.dimension.ppsoundsutils.Register.CreativeModTabs;
import net.dimension.ppsoundsutils.Register.Items.ItemsRegister;
import net.dimension.ppsoundsutils.Register.Sounds.SoundRegistries;
import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;

import static net.minecraftforge.versions.forge.ForgeVersion.MOD_ID;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(PPSoundsUtils.MODID)
public class PPSoundsUtils {
    public static final String MODID = "ppsoundsutils";
    private static final Logger LOGGER = LogUtils.getLogger();
    public PPSoundsUtils() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);

        ItemsRegister.register(modEventBus);

        CreativeModTabs.register(modEventBus);

        SoundRegistries.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
//        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvent {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            System.out.println("THIS RUN ON CLIENT");
        }

    }

}
