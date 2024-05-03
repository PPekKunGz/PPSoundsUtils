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
            DeferredRegister.create(ForgeRegistries.ITEMS, "dimension");

    public static final RegistryObject<Item> MUSIC_DISC_DMS = ITEMS.register("music_disc_dms_01",
            () -> new RecordItem(13, SoundRegistries.DIMENSION_DISC, (new Item.Properties()).stacksTo(1), 4480));

    public static final RegistryObject<Item> MUSIC_DISC_NIGHT_1 = ITEMS.register("music_disc_night_1",
            () -> new RecordItem(13, SoundRegistries.NIGHT_1, (new Item.Properties()).stacksTo(1), 2358));
    public static final RegistryObject<Item> MUSIC_DISC_NIGHT_2 = ITEMS.register("music_disc_night_2",
            () -> new RecordItem(13, SoundRegistries.NIGHT_2, (new Item.Properties()).stacksTo(1), 3370));
    public static final RegistryObject<Item> MUSIC_DISC_NIGHT_3 = ITEMS.register("music_disc_night_3",
            () -> new RecordItem(13, SoundRegistries.NIGHT_3, (new Item.Properties()).stacksTo(1), 5153));
    public static final RegistryObject<Item> MUSIC_DISC_NIGHT_4 = ITEMS.register("music_disc_night_4",
            () -> new RecordItem(13, SoundRegistries.NIGHT_4, (new Item.Properties()).stacksTo(1), 4784));
    public static final RegistryObject<Item> MUSIC_DISC_NIGHT_5 = ITEMS.register("music_disc_night_5",
            () -> new RecordItem(13, SoundRegistries.NIGHT_5, (new Item.Properties()).stacksTo(1), 5505));
    public static final RegistryObject<Item> MUSIC_DISC_NIGHT_6 = ITEMS.register("music_disc_night_6",
            () -> new RecordItem(13, SoundRegistries.NIGHT_6, (new Item.Properties()).stacksTo(1), 2115));
    public static final RegistryObject<Item> MUSIC_DISC_NIGHT_7 = ITEMS.register("music_disc_night_7",
            () -> new RecordItem(13, SoundRegistries.NIGHT_7, (new Item.Properties()).stacksTo(1), 4262));
    public static final RegistryObject<Item> MUSIC_DISC_NIGHT_8 = ITEMS.register("music_disc_night_8",
            () -> new RecordItem(13, SoundRegistries.NIGHT_8, (new Item.Properties()).stacksTo(1), 4961));
    public static final RegistryObject<Item> MUSIC_DISC_NIGHT_9 = ITEMS.register("music_disc_night_9",
            () -> new RecordItem(13, SoundRegistries.NIGHT_9, (new Item.Properties()).stacksTo(1), 2419));
    public static final RegistryObject<Item> MUSIC_DISC_NIGHT_10 = ITEMS.register("music_disc_night_10",
            () -> new RecordItem(13, SoundRegistries.NIGHT_10, (new Item.Properties()).stacksTo(1), 4403));
    public static final RegistryObject<Item> MUSIC_DISC_NIGHT_11 = ITEMS.register("music_disc_night_11",
            () -> new RecordItem(13, SoundRegistries.NIGHT_11, (new Item.Properties()).stacksTo(1), 3588));
    public static final RegistryObject<Item> MUSIC_DISC_NIGHT_12 = ITEMS.register("music_disc_night_12",
            () -> new RecordItem(13, SoundRegistries.NIGHT_12, (new Item.Properties()).stacksTo(1), 4389));
    public static final RegistryObject<Item> MUSIC_DISC_NIGHT_13 = ITEMS.register("music_disc_night_13",
            () -> new RecordItem(13, SoundRegistries.NIGHT_13, (new Item.Properties()).stacksTo(1), 3820));
    public static final RegistryObject<Item> MUSIC_DISC_NIGHT_14 = ITEMS.register("music_disc_night_14",
            () -> new RecordItem(13, SoundRegistries.NIGHT_14, (new Item.Properties()).stacksTo(1), 2185));
    public static final RegistryObject<Item> MUSIC_DISC_NIGHT_15 = ITEMS.register("music_disc_night_15",
            () -> new RecordItem(13, SoundRegistries.NIGHT_15, (new Item.Properties()).stacksTo(1), 5123));


    public static final RegistryObject<Item> MUSIC_DISC_MONING_1 = ITEMS.register("music_disc_moning_1",
            () -> new RecordItem(13, SoundRegistries.MONING_1, (new Item.Properties()).stacksTo(1), 3595));
    public static final RegistryObject<Item> MUSIC_DISC_MONING_2 = ITEMS.register("music_disc_moning_2",
            () -> new RecordItem(13, SoundRegistries.MONING_2, (new Item.Properties()).stacksTo(1), 2884));
    public static final RegistryObject<Item> MUSIC_DISC_MONING_3 = ITEMS.register("music_disc_moning_3",
            () -> new RecordItem(13, SoundRegistries.MONING_3, (new Item.Properties()).stacksTo(1), 3953));
    public static final RegistryObject<Item> MUSIC_DISC_MONING_4 = ITEMS.register("music_disc_moning_4",
            () -> new RecordItem(13, SoundRegistries.MONING_4, (new Item.Properties()).stacksTo(1), 4131));
    public static final RegistryObject<Item> MUSIC_DISC_MONING_5 = ITEMS.register("music_disc_moning_5",
            () -> new RecordItem(13, SoundRegistries.MONING_5, (new Item.Properties()).stacksTo(1), 3605));
    public static final RegistryObject<Item> MUSIC_DISC_MONING_6 = ITEMS.register("music_disc_moning_6",
            () -> new RecordItem(13, SoundRegistries.MONING_6, (new Item.Properties()).stacksTo(1), 2878));
    public static final RegistryObject<Item> MUSIC_DISC_MONING_7 = ITEMS.register("music_disc_moning_7",
            () -> new RecordItem(13, SoundRegistries.MONING_7, (new Item.Properties()).stacksTo(1), 2419));
    public static final RegistryObject<Item> MUSIC_DISC_MONING_8 = ITEMS.register("music_disc_moning_8",
            () -> new RecordItem(13, SoundRegistries.MONING_8, (new Item.Properties()).stacksTo(1), 2968));
    public static final RegistryObject<Item> MUSIC_DISC_MONING_9 = ITEMS.register("music_disc_moning_9",
            () -> new RecordItem(13, SoundRegistries.MONING_9, (new Item.Properties()).stacksTo(1), 3588));
    public static final RegistryObject<Item> MUSIC_DISC_MONING_10 = ITEMS.register("music_disc_moning_10",
            () -> new RecordItem(13, SoundRegistries.MONING_10, (new Item.Properties()).stacksTo(1), 2606));
    public static final RegistryObject<Item> MUSIC_DISC_MONING_11 = ITEMS.register("music_disc_moning_11",
            () -> new RecordItem(13, SoundRegistries.MONING_11, (new Item.Properties()).stacksTo(1), 3376));
    public static final RegistryObject<Item> MUSIC_DISC_MONING_12 = ITEMS.register("music_disc_moning_12",
            () -> new RecordItem(13, SoundRegistries.MONING_12, (new Item.Properties()).stacksTo(1), 4075));
    public static final RegistryObject<Item> MUSIC_DISC_MONING_13 = ITEMS.register("music_disc_moning_13",
            () -> new RecordItem(13, SoundRegistries.MONING_13, (new Item.Properties()).stacksTo(1), 3060));
    public static final RegistryObject<Item> MUSIC_DISC_MONING_14 = ITEMS.register("music_disc_moning_14",
            () -> new RecordItem(13, SoundRegistries.MONING_14, (new Item.Properties()).stacksTo(1), 3550));



    public static final RegistryObject<Item> MUSIC_DISC_CLUB_1 = ITEMS.register("music_disc_club_1",
            () -> new RecordItem(13, SoundRegistries.CLUB_1, (new Item.Properties()).stacksTo(1), 2408));
    public static final RegistryObject<Item> MUSIC_DISC_CLUB_2 = ITEMS.register("music_disc_club_2",
            () -> new RecordItem(13, SoundRegistries.CLUB_2, (new Item.Properties()).stacksTo(1), 1948));
    public static final RegistryObject<Item> MUSIC_DISC_CLUB_3 = ITEMS.register("music_disc_club_3",
            () -> new RecordItem(13, SoundRegistries.CLUB_3, (new Item.Properties()).stacksTo(1), 3860));
    public static final RegistryObject<Item> MUSIC_DISC_CLUB_4 = ITEMS.register("music_disc_club_4",
            () -> new RecordItem(13, SoundRegistries.CLUB_4, (new Item.Properties()).stacksTo(1), 4182));
    public static final RegistryObject<Item> MUSIC_DISC_CLUB_5 = ITEMS.register("music_disc_club_5",
            () -> new RecordItem(13, SoundRegistries.CLUB_5, (new Item.Properties()).stacksTo(1), 2088));
    public static final RegistryObject<Item> MUSIC_DISC_CLUB_6 = ITEMS.register("music_disc_club_6",
            () -> new RecordItem(13, SoundRegistries.CLUB_6, (new Item.Properties()).stacksTo(1), 7281));
    public static final RegistryObject<Item> MUSIC_DISC_CLUB_7 = ITEMS.register("music_disc_club_7",
            () -> new RecordItem(13, SoundRegistries.CLUB_7, (new Item.Properties()).stacksTo(1), 3816));
    public static final RegistryObject<Item> MUSIC_DISC_CLUB_8 = ITEMS.register("music_disc_club_8",
            () -> new RecordItem(13, SoundRegistries.CLUB_8, (new Item.Properties()).stacksTo(1), 3329));
    public static final RegistryObject<Item> MUSIC_DISC_CLUB_9 = ITEMS.register("music_disc_club_9",
            () -> new RecordItem(13, SoundRegistries.CLUB_9, (new Item.Properties()).stacksTo(1), 2660));
    public static final RegistryObject<Item> MUSIC_DISC_CLUB_10 = ITEMS.register("music_disc_club_10",
            () -> new RecordItem(13, SoundRegistries.CLUB_10, (new Item.Properties()).stacksTo(1), 6886));
    public static final RegistryObject<Item> MUSIC_DISC_CLUB_11 = ITEMS.register("music_disc_club_11",
            () -> new RecordItem(13, SoundRegistries.CLUB_11, (new Item.Properties()).stacksTo(1), 2476));
    public static final RegistryObject<Item> MUSIC_DISC_CLUB_12 = ITEMS.register("music_disc_club_12",
            () -> new RecordItem(13, SoundRegistries.CLUB_12, (new Item.Properties()).stacksTo(1), 4152));
    public static final RegistryObject<Item> MUSIC_DISC_CLUB_13 = ITEMS.register("music_disc_club_13",
            () -> new RecordItem(13, SoundRegistries.CLUB_13, (new Item.Properties()).stacksTo(1), 3662));
    public static final RegistryObject<Item> MUSIC_DISC_CLUB_14 = ITEMS.register("music_disc_club_14",
            () -> new RecordItem(13, SoundRegistries.CLUB_14, (new Item.Properties()).stacksTo(1), 3081));
    public static final RegistryObject<Item> MUSIC_DISC_CLUB_15 = ITEMS.register("music_disc_club_15",
            () -> new RecordItem(13, SoundRegistries.CLUB_15, (new Item.Properties()).stacksTo(1), 6134));
    public static final RegistryObject<Item> MUSIC_DISC_CLUB_16 = ITEMS.register("music_disc_club_16",
            () -> new RecordItem(13, SoundRegistries.CLUB_16, (new Item.Properties()).stacksTo(1), 4345));
    public static final RegistryObject<Item> MUSIC_DISC_CLUB_17 = ITEMS.register("music_disc_club_17",
            () -> new RecordItem(13, SoundRegistries.CLUB_17, (new Item.Properties()).stacksTo(1), 3778));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
