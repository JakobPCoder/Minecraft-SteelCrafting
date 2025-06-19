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
    public static final TagKey<Item> REPAIRS_STEEL_TOOL = TagKey.of(RegistryKeys.ITEM, Identifier.of("steelcrafting", "repairs_steel_tool"));


    /**
     * Steel tool material with diamond durability but iron speed and attack damage.
     * Uses iron's mining level and enchantability between iron and diamond.
     */
    public static final ToolMaterial STEEL = new ToolMaterial(
        BlockTags.INCORRECT_FOR_IRON_TOOL,  // Same mining level as iron
        1000,   // Durability between iron and diamond
        6.0F,   // Iron mining speed
        2.0F,   // Iron attack damage bonus
        12,     // Enchantability like iron
        REPAIRS_STEEL_TOOL  // Use steel ingots for repair
    );
} 