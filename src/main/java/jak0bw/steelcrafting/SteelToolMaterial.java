package jak0bw.steelcrafting;

import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.registry.RegistryKeys;

/**
 * Custom tool material for steel tools.
 * Has the durability of diamond but the mining speed and level of iron.
 */
public class SteelToolMaterial {
    // Custom tag for steel ingots, used for repairing steel tools and armor
    public static final TagKey<Item> STEEL_INGOTS = TagKey.of(RegistryKeys.ITEM, Identifier.of("steelcrafting", "steel_ingots"));

    /**
     * Steel tool material with diamond durability but iron speed and attack damage.
     * Uses iron's mining level and enchantability between iron and diamond.
     */
    public static final ToolMaterial STEEL = new ToolMaterial(
        BlockTags.INCORRECT_FOR_IRON_TOOL,  // Same mining level as iron
        1561,   // Diamond durability
        6.0F,   // Iron mining speed
        2.0F,   // Iron attack damage bonus
        14,     // Enchantability like iron
        STEEL_INGOTS  // Use steel ingots for repair
    );
} 