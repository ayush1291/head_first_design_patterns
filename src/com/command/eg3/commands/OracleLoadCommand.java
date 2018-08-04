package com.command.eg3.commands;

import com.command.eg3.vendor.OracleDriver;

public class OracleLoadCommand implements Command{
	OracleDriver oracleDriver;
	
	public OracleLoadCommand(OracleDriver oracleDriver) {
		this.oracleDriver=oracleDriver;
	}
	
	@Override
	public void execute() {
		oracleDriver.load();
	}
	

}
