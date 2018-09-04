package emt.init;

import cpw.mods.fml.common.registry.GameRegistry;
import emt.block.BlockReflectedGen;
import emt.tile.generator.TileEntityBaseGenerator;
import emt.tile.generator.TileEntityReflexionGen;

public class EMTAutogeneratedGens
  implements Runnable
{
  public static BlockReflectedGen[] BRG;
  public static TileEntityReflexionGen TFG = new TileEntityReflexionGen();
  private static short sets;
  
  public void run()
  {
    sets = (short)(TileEntityReflexionGen.L.size() / 16);
    if (TileEntityReflexionGen.L.size() % 16 != 0) {
      sets = (short)(sets + 1);
    }
    BRG = new BlockReflectedGen[sets];
    for (short i = 0; i < sets; ++i) {
      BRG[i] = new BlockReflectedGen("EGenerator.Set." + Short.toString(i), i);
    }
   // for (int i = 0; i < TileEntityReflexionGen.L.size(); i++) {
      GameRegistry.registerTileEntity(TileEntityBaseGenerator.class, "TileEntityBaseGenerator");// + TileEntityReflexionGen.L.get(i));
    //}
    for (short i = 0; i < sets; i = (short)(i + 1)) {
      GameRegistry.registerBlock(BRG[i], "EGenerator.Set." + Short.toString(i));
    }
  }
}
