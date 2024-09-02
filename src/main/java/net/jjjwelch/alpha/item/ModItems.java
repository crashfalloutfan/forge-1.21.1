package net.jjjwelch.alpha.item;

import net.jjjwelch.alpha.Alpha;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Alpha.MOD_ID);

    public static final RegistryObject<Item> ECHO_NUGGET = ITEMS.register("echo_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ECHO_INGOT = ITEMS.register("echo_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REINFORCED_NETHERITE_INGOT = ITEMS.register("reinforced_netherite_ingot", () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
