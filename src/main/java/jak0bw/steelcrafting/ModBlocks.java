package jak0bw.steelcrafting;

import jak0bw.steelcrafting.block.SteelPressurePlateBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModBlocks {

    private static Block registerBlock(String path, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        final Identifier identifier = Identifier.of(SteelCrafting.MOD_ID, path);
        final RegistryKey<Block> registryKey = RegistryKey.of(RegistryKeys.BLOCK, identifier);

        final Block block = Blocks.register(registryKey, factory, settings);
        Items.register(block);
        return block;
    }
    
    
    public static final Block STEEL_BLOCK = registerBlock("steel_block",
            Block::new, AbstractBlock.Settings.copy(Blocks.IRON_BLOCK));

    public static final Block STEEL_PRESSURE_PLATE = registerBlock("steel_pressure_plate", 
            SteelPressurePlateBlock::new, AbstractBlock.Settings.copy(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE));


    public static void registerModBlocks() {
        SteelCrafting.LOGGER.info("Registering ModBlocks for " + SteelCrafting.MOD_ID);
    }
} 