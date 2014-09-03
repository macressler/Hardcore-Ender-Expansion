package chylex.hee.gui.core;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import chylex.hee.gui.ContainerCharmPouch;
import chylex.hee.gui.ContainerDecompositionTable;
import chylex.hee.gui.ContainerEndPowderEnhancements;
import chylex.hee.gui.ContainerEnergyExtractionTable;
import chylex.hee.gui.ContainerEnhancedBrewingStand;
import chylex.hee.gui.GuiCharmPouch;
import chylex.hee.gui.GuiDecompositionTable;
import chylex.hee.gui.GuiEndPowderEnhancements;
import chylex.hee.gui.GuiEnergyExtractionTable;
import chylex.hee.gui.GuiEnhancedBrewingStand;
import chylex.hee.tileentity.TileEntityDecompositionTable;
import chylex.hee.tileentity.TileEntityEnergyExtractionTable;
import chylex.hee.tileentity.TileEntityEnhancedBrewingStand;
import cpw.mods.fml.common.network.IGuiHandler;

public final class GuiHandler implements IGuiHandler{
	public static GuiHandler instance = new GuiHandler();
	
	@Override
	public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z){
		switch(id){
			case 0: return new ContainerEnhancedBrewingStand(player.inventory,(TileEntityEnhancedBrewingStand)world.getTileEntity(x,y,z));
			case 2: return new ContainerDecompositionTable(player.inventory,(TileEntityDecompositionTable)world.getTileEntity(x,y,z));
			case 3: return new ContainerEnergyExtractionTable(player.inventory,(TileEntityEnergyExtractionTable)world.getTileEntity(x,y,z));
			case 4: return new ContainerEndPowderEnhancements(player.inventory);
			case 5: return new ContainerCharmPouch(player);
		}
		
		return null;
	}

	@Override
	public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z){
		switch(id){
			case 0: return new GuiEnhancedBrewingStand(player.inventory,(TileEntityEnhancedBrewingStand)world.getTileEntity(x,y,z));
			case 2: return new GuiDecompositionTable(player.inventory,(TileEntityDecompositionTable)world.getTileEntity(x,y,z));
			case 3: return new GuiEnergyExtractionTable(player.inventory,(TileEntityEnergyExtractionTable)world.getTileEntity(x,y,z));
			case 4: return new GuiEndPowderEnhancements(player.inventory);
			case 5: return new GuiCharmPouch(player);
		}
		
		return null;
	}
	
	private GuiHandler(){}
}