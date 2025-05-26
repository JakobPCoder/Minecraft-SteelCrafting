package jak0bw.steelcrafting;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.item.equipment.ArmorMaterials;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;


/**
 * Class responsible for registering all mod items.
 * This includes the steel ingot and steel tools.
 */
public class ModItems {
    
    /**
     * Registers a basic item in Fabric 1.21.4, storing the registry key in settings.
     *
     * @param name    Path part of the identifier
     * @param factory Function to create the item from settings
     * @param settings Item settings
     * @return The registered Item
     */
    private static Item registerItem(String name, Function<Item.Settings, Item> factory, Item.Settings settings) {
        Identifier id = Identifier.of(SteelCrafting.MOD_ID, name);
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);
        return Items.register(key, factory, settings);
    }


    /**
     * Steel Ingot item instance.
     */
    public static final Item STEEL_INGOT = registerItem(
        "steel_ingot",
        Item::new,
        new Item.Settings()
    );

    /**
     * Steel Sword item instance.
     */
    public static final Item STEEL_SWORD = registerItem(
        "steel_sword",
        settings -> new SwordItem(SteelToolMaterial.STEEL, 3, -2.4F, settings),
        new Item.Settings()
    );

    /**
     * Steel Pickaxe item instance.
     */
    public static final Item STEEL_PICKAXE = registerItem(
        "steel_pickaxe",
        settings -> new PickaxeItem(SteelToolMaterial.STEEL, 1, -2.8F, settings),
        new Item.Settings()
    );

    /**
     * Steel Axe item instance.
     */
    public static final Item STEEL_AXE = registerItem(
        "steel_axe",
        settings -> new AxeItem(SteelToolMaterial.STEEL, 6.0F, -3.1F, settings),
        new Item.Settings()
    );

    /**
     * Steel Shovel item instance.
     */
    public static final Item STEEL_SHOVEL = registerItem(
        "steel_shovel",
        settings -> new ShovelItem(SteelToolMaterial.STEEL, 1.5F, -3.0F, settings),
        new Item.Settings()
    );

    /**
     * Steel Hoe item instance.
     */
    public static final Item STEEL_HOE = registerItem(
        "steel_hoe",
        settings -> new HoeItem(SteelToolMaterial.STEEL, -2, -1.0F, settings),
        new Item.Settings()
    );

    /**
     * Steel Helmet item instance.
     * Uses iron armor material as base with custom durability.
     */
    public static final Item STEEL_HELMET = registerItem(
        "steel_helmet",
        settings -> new ArmorItem(ArmorMaterials.IRON, EquipmentType.HELMET, settings),
        new Item.Settings().maxDamage(363)  // Diamond helmet durability
    );

    /**
     * Steel Chestplate item instance.
     * Uses iron armor material as base with custom durability.
     */
    public static final Item STEEL_CHESTPLATE = registerItem(
        "steel_chestplate",
        settings -> new ArmorItem(ArmorMaterials.IRON, EquipmentType.CHESTPLATE, settings),
        new Item.Settings().maxDamage(528)  // Diamond chestplate durability
    );

    /**
     * Steel Leggings item instance.
     * Uses iron armor material as base with custom durability.
     */
    public static final Item STEEL_LEGGINGS = registerItem(
        "steel_leggings",
        settings -> new ArmorItem(ArmorMaterials.IRON, EquipmentType.LEGGINGS, settings),
        new Item.Settings().maxDamage(495)  // Diamond leggings durability
    );

    /**
     * Steel Boots item instance.
     * Uses iron armor material as base with custom durability.
     */
    public static final Item STEEL_BOOTS = registerItem(
        "steel_boots",
        settings -> new ArmorItem(ArmorMaterials.IRON, EquipmentType.BOOTS, settings),
        new Item.Settings().maxDamage(429)  // Diamond boots durability
    );
    

    /**
     * Adds all mod items to creative tabs.
     * This method should be called during mod initialization.
     */
    public static void registerModItems() {
        SteelCrafting.LOGGER.info("Adding Mod Items to creative tabs for " + SteelCrafting.MOD_ID);
        
        // Add steel ingot to ingredients tab
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(STEEL_INGOT);
        });
        
        // Add steel tools to combat tab
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(STEEL_SWORD);
            entries.add(STEEL_AXE);
            entries.add(STEEL_HELMET);
            entries.add(STEEL_CHESTPLATE);
            entries.add(STEEL_LEGGINGS);
            entries.add(STEEL_BOOTS);
        });
        
        // Add steel tools to tools tab
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(STEEL_PICKAXE);
            entries.add(STEEL_AXE);
            entries.add(STEEL_SHOVEL);
            entries.add(STEEL_HOE);
        });
    }
} 