package com.alex2k.dragonball.item;

import com.alex2k.dragonball.DragonBall;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DragonBall.MOD_ID);

    public static final RegistryObject<Item> DRAGON_BALL_1 = ITEMS.register("dragon_ball_1",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_BALL_2 = ITEMS.register("dragon_ball_2",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_BALL_3 = ITEMS.register("dragon_ball_3",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_BALL_4 = ITEMS.register("dragon_ball_4",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_BALL_5 = ITEMS.register("dragon_ball_5",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_BALL_6 = ITEMS.register("dragon_ball_6",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_BALL_7 = ITEMS.register("dragon_ball_7",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
