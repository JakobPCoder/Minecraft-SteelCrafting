package jak0bw.steelcrafting;

import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.item.equipment.EquipmentAssetKeys;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.item.Item;
import java.util.Map;

/**
 * Holds the registry key and registration method for the steel armor material.
 */
public class SteelArmorMaterial {

    /**
     * Base durability multiplier for steel armor (same as iron).
     */
    public static final int BASE_DURABILITY = 30;

    /**
     * Tag for steel ingots, used for repairing steel armor.
     */
    public static final TagKey<Item> REPAIRS_STEEL_ARMOR = TagKey.of(net.minecraft.registry.RegistryKeys.ITEM, Identifier.of("steelcrafting", "repairs_steel_armor"));

    /**
     * Registry key for the steel armor material asset.
     */
    public static final RegistryKey<EquipmentAsset> STEEL_ARMOR_MATERIAL_KEY =  RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, Identifier.of("steelcrafting", "steel"));

    /**
     * The steel armor material instance, using iron values.
     */
    public static final ArmorMaterial INSTANCE = new ArmorMaterial(
        BASE_DURABILITY,
        Map.of(
            EquipmentType.HELMET, 2,
            EquipmentType.CHESTPLATE, 6,
            EquipmentType.LEGGINGS, 5,
            EquipmentType.BOOTS, 2
        ),
        12, // Enchantability a bit higher than iron and diamond
        SoundEvents.ITEM_ARMOR_EQUIP_IRON,
        0.0F, // Toughness (iron)
        0.0F, // Knockback resistance (iron)
        REPAIRS_STEEL_ARMOR,
        STEEL_ARMOR_MATERIAL_KEY
    );

}