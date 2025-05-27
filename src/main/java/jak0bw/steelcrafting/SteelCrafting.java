package jak0bw.steelcrafting;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Main mod initializer for SteelCrafting.
 * Handles mod setup and item registration.
 */
public class SteelCrafting implements ModInitializer {
	// Mod ID for SteelCrafting
	public static final String MOD_ID = "steelcrafting";

	// Logger for SteelCrafting mod. Uses the mod ID as the logger's name.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	/**
	 * Called by Fabric when the mod is initialized.
	 * Registers all mod items and performs setup tasks.
	 */
	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		// Register all SteelCrafting mod items
		ModItems.registerModItems();
	}
}