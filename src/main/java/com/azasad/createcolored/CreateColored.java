package com.azasad.createcolored;

import com.azasad.createcolored.content.ColoredTags;
import com.azasad.createcolored.content.block.ColoredBlocks;
import com.azasad.createcolored.content.blockEntities.ColoredBlockEntities;
import com.simibubi.create.foundation.data.CreateRegistrate;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//Executes both in server and client
public class CreateColored implements ModInitializer {
	public static final String MOD_ID = "create-colored";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(MOD_ID);

	public static Identifier asResource(String path) {
		return new Identifier(MOD_ID, path);
	}

	@Override
	public void onInitialize() {
		LOGGER.info("Registering create-colored blocks!");
		ColoredTags.initialize();
		ColoredBlockEntities.initialize();
		ColoredBlocks.initialize();
		REGISTRATE.register();
	}
}