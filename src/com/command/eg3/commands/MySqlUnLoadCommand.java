package com.command.eg3.commands;

import com.command.eg3.vendor.MySQL;

public class MySqlUnLoadCommand implements Command{
	MySQL mySql;
	
	public MySqlUnLoadCommand(MySQL mySql) {
		this.mySql=mySql;
	}
	
	@Override
	public void execute() {
		mySql.unLoad();
	}

}
