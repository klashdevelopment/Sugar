package dev.klash.sugar.caramel;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CaramelMod implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("caramel");

	public static final Item CUSTOM_ITEM =
			Registry.register(Registries.ITEM, new Identifier("caramel", "custom_item"),
					new Item(new FabricItemSettings()));

	@Override
	public void onInitialize() {
		LOGGER.info("[sugar] Adding sugar into the pan...");
		LOGGER.info("[sugar] Turning up the heat...");
		LOGGER.info("[sugar] Caramel created!");
	}
}
