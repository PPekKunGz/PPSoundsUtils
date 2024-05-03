package net.dimension.ppsoundsutils.Register.Items;

import net.dimension.ppsoundsutils.PPSoundsUtils;
import net.dimension.ppsoundsutils.Register.Sounds.SoundRegistries;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.minecraft.world.item.Items.registerItem;

public class ItemsRegister {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PPSoundsUtils.MODID);

    public static final RegistryObject<Item> TEST = ITEMS.register("test",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MUSIC_DISC_DMS = ITEMS.register("music_disc_dms_01",
            () -> new RecordItem(13, SoundRegistries.DIMENSION_DISC, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 149));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
