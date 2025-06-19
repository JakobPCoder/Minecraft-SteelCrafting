package jak0bw.steelcrafting.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.WeightedPressurePlateBlock;
import net.minecraft.entity.Entity;
import net.minecraft.predicate.entity.EntityPredicates;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;

import java.util.List;

public class SteelPressurePlateBlock extends WeightedPressurePlateBlock {
    protected static final Box BOX_BIG = new Box(0.0, 0.0, 0.0, 1.0, 0.25, 1.0);

    public SteelPressurePlateBlock(AbstractBlock.Settings settings) {
        super(240, BlockSetType.IRON, settings);
    }

    @Override
    protected int getRedstoneOutput(World world, BlockPos pos) {
        // Get the bounding box used by the vanilla pressure plate
        Box box = BOX_BIG.offset(pos);
        // Get all entities in the box (like vanilla, but we will process them differently later)
        List<Entity> entities = world.getEntitiesByClass(Entity.class, box, EntityPredicates.EXCEPT_SPECTATOR.and(entity -> !entity.canAvoidTraps()));

        int total = 0;
        for (Entity entity : entities) {
            if (entity instanceof net.minecraft.entity.ItemEntity itemEntity) {
                // For item entities, add the count of items in the stack
                total += itemEntity.getStack().getCount();
            } else {
                // For all other entities, count as 1
                total += 1;
            }
        }
        return Math.min(15, total / 16);
    }
} 