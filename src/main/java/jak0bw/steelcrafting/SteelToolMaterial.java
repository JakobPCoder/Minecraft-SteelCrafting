package jak0bw.steelcrafting;

import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

/**
 * Custom tool material for steel tools.
 * Has the durability of diamond but the mining speed and level of iron.
 */
public class SteelToolMaterial {
    
    /**
     * Steel tool material with diamond durability but iron speed and attack damage.
     * Uses iron's mining level and enchantability between iron and diamond.
     */
    public static final ToolMaterial STEEL = new ToolMaterial(
        BlockTags.INCORRECT_FOR_IRON_TOOL,  // Same mining level as iron
        1561,   // Diamond durability
        6.0F,   // Iron mining speed
        2.0F,   // Iron attack damage bonus
        12,     // Enchantability between iron (14) and diamond (10)
        ItemTags.IRON_TOOL_MATERIALS  // For now, use iron repair materials (we'll create steel tag later)
    );
} 