package com.mori.wintermod.world.structures;

import java.util.Random;

import com.mori.wintermod.registry.WinterModStructures;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.structure.SimpleStructurePiece;
import net.minecraft.structure.Structure;
import net.minecraft.structure.StructureManager;
import net.minecraft.structure.StructurePlacementData;
import net.minecraft.structure.processor.BlockIgnoreStructureProcessor;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockBox;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ServerWorldAccess;

public class CozyCabinPieces extends SimpleStructurePiece {
  private final BlockRotation rotation;
  private final Identifier template;

  public CozyCabinPieces(StructureManager structureManager, CompoundTag compoundTag) {
    super(WinterModStructures.COZYCABIN_PIECE, compoundTag);
    this.template = new Identifier(compoundTag.getString("Template"));
    this.rotation = BlockRotation.valueOf(compoundTag.getString("Rot"));
    this.initializeStructureData(structureManager);
  }

  public CozyCabinPieces(StructureManager structureManager, BlockPos pos, Identifier template,
        BlockRotation rotation) {
      super(WinterModStructures.COZYCABIN_PIECE, 0);
      this.pos = pos;
      this.rotation = rotation;
      this.template = template;
   
      this.initializeStructureData(structureManager);
    }
   
    private void initializeStructureData(StructureManager structureManager) {
      Structure structure = structureManager.getStructureOrBlank(this.template);
      StructurePlacementData placementData = (new StructurePlacementData())
        .setRotation(this.rotation)
        .setMirror(BlockMirror.NONE)
        .addProcessor(BlockIgnoreStructureProcessor.IGNORE_STRUCTURE_BLOCKS);
        
      this.setStructureData(structure, this.pos, placementData);
    }
   
    protected void toNbt(CompoundTag tag) {
      super.toNbt(tag);
      tag.putString("Template", this.template.toString());
      tag.putString("Rot", this.rotation.name());
    }
   
    @Override
    protected void handleMetadata(String metadata, BlockPos pos, ServerWorldAccess serverWorldAccess, Random random,
        BlockBox boundingBox) {
    }
  }