package mcjty.lib.compat;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;

import javax.annotation.Nullable;

public interface CompatChunkGenerator extends IChunkGenerator {

    BlockPos clGetStrongholdGen(World worldIn, String structureName, BlockPos position);

    @Nullable
    @Override
    default BlockPos getStrongholdGen(World worldIn, String structureName, BlockPos position, boolean findUnexplored) {
        return clGetStrongholdGen(worldIn, structureName, position);
    }
}