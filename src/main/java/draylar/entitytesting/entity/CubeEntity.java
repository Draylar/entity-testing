package draylar.entitytesting.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntityWithAi;
import net.minecraft.world.World;

/*
 * Our Cube Entity extends MobEntityWithAi, which extends MobEntity, which extends LivingEntity.
 *
 * LivingEntity has health and can deal damage.
 * MobEntity has movement controls and AI capabilities.
 * MobEntityWithAi has pathfinding favor and slightly tweaked leash behavior.
 */
public class CubeEntity extends MobEntityWithAi {

    public CubeEntity(EntityType<? extends MobEntityWithAi> entityType, World world) {
        super(entityType, world);
    }
}
