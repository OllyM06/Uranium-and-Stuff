package com.theor30.uraniumandstuff;

import com.theor30.uraniumandstuff.block.ModBlocks;
import com.theor30.uraniumandstuff.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, UraniumAndStuff.MODID);

    public static final Supplier<CreativeModeTab> URANIUM_AND_STUFF_TAB = CREATIVE_MODE_TAB.register("uranium_and_stuff_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.URANIUM.get()))
                    .title(Component.translatable("creativetab.uraniumandstuff.uraniumandstuff"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.URANIUM);
                        output.accept(ModItems.RAW_URANIUM);
                        output.accept(ModBlocks.URANIUM_BLOCK);
                        output.accept(ModBlocks.URANIUM_ORE);
                    })
                    .build()
    );


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
