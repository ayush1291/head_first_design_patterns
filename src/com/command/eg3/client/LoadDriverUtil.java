package com.command.eg3.client;

import com.command.eg3.DriverFactory;
import com.command.eg3.commands.CommandFactory;



public class LoadDriverUtil {
	
	public static void load(String type){
		(CommandFactory.loadCommand(type, DriverFactory.loadDriverClass(type))).execute();
	}

	public static void unload(String type){
		(CommandFactory.unLoadCommand(type, DriverFactory.loadDriverClass(type))).execute();
	}
}
