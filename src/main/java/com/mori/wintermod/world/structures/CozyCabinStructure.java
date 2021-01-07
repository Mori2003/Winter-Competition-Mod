package com.mori.wintermod.world.structures;

import java.util.List;

import com.mori.wintermod.WinterMod;

import net.minecraft.structure.StructureManager;
import net.minecraft.structure.StructurePiece;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

public class CozyCabinStructure {
  
    private static final Identifier COZYCABIN = new Identifier(WinterMod.MOD_ID, "cozycabin");
   
   
    public static void addPieces(StructureManager manager, BlockPos pos, BlockRotation rotation, List<StructurePiece> pieces) {
      pieces.add(new CozyCabinPieces(manager, pos, COZYCABIN, rotation));
    
    }
  }