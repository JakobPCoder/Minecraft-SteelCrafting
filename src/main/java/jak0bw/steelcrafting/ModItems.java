package jak0bw.steelcrafting;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ToolComponent;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.entry.RegistryEntryList;
import net.minecraft.registry.tag.BlockTags;
import java.util.List;
import net.minecraft.item.ItemGroups;

/**
 * Handles registration and creative tab assignment for all SteelCrafting mod items.
 */
public class ModItems {

    /**
     * Registers an item with the given name, factory, and settings.
     *
     * @param name     Path part of the identifier (e.g., "steel_ingot")
     * @param factory  Function to create the item from settings
     * @param settings Item settings
     * @return The registered Item
     */
    private static Item registerItem(String name, Function<Item.Settings, Item> factory, Item.Settings settings) {
        Identifier id = Identifier.of(SteelCrafting.MOD_ID, name);
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);
        return Items.register(key, factory, settings);
    }

    // Steel Ingot item
    public static final Item STEEL_INGOT = registerItem(
        "steel_ingot",
        Item::new,
        new Item.Settings()
    );

    // Steel Sword item
    public static final Item STEEL_SWORD = registerItem(
        "steel_sword",
        settings -> new SwordItem(SteelToolMaterial.STEEL, 3, -2.4F, settings),
        new Item.Settings()
    );

    // Steel Pickaxe item
    public static final Item STEEL_PICKAXE = registerItem(
        "steel_pickaxe",
        settings -> new PickaxeItem(SteelToolMaterial.STEEL, 1, -2.8F, settings),
        new Item.Settings()
    );

    // Steel Axe item
    public static final Item STEEL_AXE = registerItem(
        "steel_axe",
        settings -> new AxeItem(SteelToolMaterial.STEEL, 6.0F, -3.1F, settings),
        new Item.Settings()
    );

    // Steel Shovel item
    public static final Item STEEL_SHOVEL = registerItem(
        "steel_shovel",
        settings -> new ShovelItem(SteelToolMaterial.STEEL, 1.5F, -3.0F, settings),
        new Item.Settings()
    );

    // Steel Hoe item
    public static final Item STEEL_HOE = registerItem(
        "steel_hoe",
        settings -> new HoeItem(SteelToolMaterial.STEEL, -2, -1.0F, settings),
        new Item.Settings()
    );

    // Steel Flint and Steel item
    public static final Item STEEL_FLINT_AND_STEEL = registerItem(
        "steel_flint_and_steel",
        FlintAndSteelItem::new,
        new Item.Settings().maxDamage(256)
    );

    // Steel Helmet item (uses custom steel armor material)
    public static final Item STEEL_HELMET = registerItem(
        "steel_helmet",
        settings -> new ArmorItem(SteelArmorMaterial.INSTANCE, EquipmentType.HELMET, settings),
        new Item.Settings().maxDamage(EquipmentType.HELMET.getMaxDamage(SteelArmorMaterial.BASE_DURABILITY))
    );

    // Steel Chestplate item (uses custom steel armor material)
    public static final Item STEEL_CHESTPLATE = registerItem(
        "steel_chestplate",
        settings -> new ArmorItem(SteelArmorMaterial.INSTANCE, EquipmentType.CHESTPLATE, settings),
        new Item.Settings().maxDamage(EquipmentType.CHESTPLATE.getMaxDamage(SteelArmorMaterial.BASE_DURABILITY))
    );

    // Steel Leggings item (uses custom steel armor material)
    public static final Item STEEL_LEGGINGS = registerItem(
        "steel_leggings",
        settings -> new ArmorItem(SteelArmorMaterial.INSTANCE, EquipmentType.LEGGINGS, settings),
        new Item.Settings().maxDamage(EquipmentType.LEGGINGS.getMaxDamage(SteelArmorMaterial.BASE_DURABILITY))
    );

    // Steel Boots item (uses custom steel armor material)
    public static final Item STEEL_BOOTS = registerItem(
        "steel_boots",
        settings -> new ArmorItem(SteelArmorMaterial.INSTANCE, EquipmentType.BOOTS, settings),
        new Item.Settings().maxDamage(EquipmentType.BOOTS.getMaxDamage(SteelArmorMaterial.BASE_DURABILITY))
    );

    /**
     * Registers all mod items to their respective creative tabs.
     * Should be called during mod initialization.
     */
    public static void registerModItems() {
        SteelCrafting.LOGGER.info("Adding Mod Items to creative tabs for " + SteelCrafting.MOD_ID);

        // Add steel ingot to the Ingredients tab
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(STEEL_INGOT);
        });

        // Add steel sword, axe, and armor to the Combat tab
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(STEEL_SWORD);
            entries.add(STEEL_AXE);
            entries.add(STEEL_HELMET);
            entries.add(STEEL_CHESTPLATE);
            entries.add(STEEL_LEGGINGS);
            entries.add(STEEL_BOOTS);
        });

        // Add steel tools to the Tools tab
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(STEEL_PICKAXE);
            entries.add(STEEL_AXE);
            entries.add(STEEL_SHOVEL);
            entries.add(STEEL_HOE);
            entries.add(STEEL_FLINT_AND_STEEL);
        });

        // Add steel pressure plate to the Redstone Blocks tab
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(entries -> {
            entries.add(ModBlocks.STEEL_PRESSURE_PLATE);
        });
        
        // Add steel block to the Building Blocks tab
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.STEEL_BLOCK);
        });
    }

} 