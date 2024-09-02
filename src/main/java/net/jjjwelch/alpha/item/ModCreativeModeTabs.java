package net.jjjwelch.alpha.item;

import net.jjjwelch.alpha.Alpha;
import net.jjjwelch.alpha.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Alpha.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ALPHA = CREATIVE_MODE_TABS.register("alpha",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.VOID_STONE_ORE.get()))
                    .title(Component.translatable("creative.alpha.alpha"))
                    .displayItems(((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ECHO_NUGGET.get());
                        output.accept(ModItems.ECHO_INGOT.get());
                        output.accept(ModItems.REINFORCED_NETHERITE_INGOT.get());
                        output.accept(ModBlocks.VOID_STONE_ORE.get());
                    })).build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
