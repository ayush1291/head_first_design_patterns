package com.command.eg3.commands;

import com.command.eg3.vendor.OracleDriver;

public class OracleUnLoadCommand implements Command{
OracleDriver oracleDriver;
	
	public OracleUnLoadCommand(OracleDriver oracleDriver) {
		this.oracleDriver=oracleDriver;
	}
	
	@Override
	public void execute() {
		oracleDriver.unLoad();
	}
}
