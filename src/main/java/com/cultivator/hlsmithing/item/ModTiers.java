package com.cultivator.hlsmithing.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier STEEL = new ForgeTier(2, 400, 6.0F, 2.0F, 14,
            BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.STEEL_PLATE.get()));

    public static final ForgeTier ROSE_GOLD = new ForgeTier(0, 60, 12.0F, 0.0F, 22,
            BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ModItems.ROSE_GOLD_INGOT.get()));
}
