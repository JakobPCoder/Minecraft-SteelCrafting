package jak0bw.steelcrafting.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.WeightedPressurePlateBlock;

public class SteelPressurePlateBlock extends WeightedPressurePlateBlock {
    public SteelPressurePlateBlock(AbstractBlock.Settings settings) {
        super(240, BlockSetType.IRON, settings);
    }
} 