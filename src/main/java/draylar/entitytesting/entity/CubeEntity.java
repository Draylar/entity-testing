package draylar.entitytesting.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntityWithAi;
import net.minecraft.world.World;

public class CubeEntity extends MobEntityWithAi {

    public CubeEntity(EntityType<? extends MobEntityWithAi> entityType, World world) {
        super(entityType, world);
    }
}
