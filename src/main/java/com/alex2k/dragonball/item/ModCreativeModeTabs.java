package com.alex2k.dragonball.item;

import com.alex2k.dragonball.DragonBall;
import com.alex2k.dragonball.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DragonBall.MOD_ID);

    public static final RegistryObject<CreativeModeTab> DRAGON_BALL_TAB = CREATIVE_MODE_TABS.register("dragon_ball_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DRAGON_BALL_4.get()))
                    .title(Component.translatable("creativetab.dragon_ball_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.DRAGON_BALL_1.get());
                        pOutput.accept(ModItems.DRAGON_BALL_2.get());
                        pOutput.accept(ModItems.DRAGON_BALL_3.get());
                        pOutput.accept(ModItems.DRAGON_BALL_4.get());
                        pOutput.accept(ModItems.DRAGON_BALL_5.get());
                        pOutput.accept(ModItems.DRAGON_BALL_6.get());
                        pOutput.accept(ModItems.DRAGON_BALL_7.get());
                        pOutput.accept(ModBlocks.DRAGON_BALL.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
