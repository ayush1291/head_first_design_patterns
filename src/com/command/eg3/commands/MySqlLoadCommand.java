package com.command.eg3.commands;

import com.command.eg3.vendor.MySQL;

public class MySqlLoadCommand implements Command{
	MySQL mySql;
	
	public MySqlLoadCommand(MySQL mySql) {
		this.mySql=mySql;
	}
	
	@Override
	public void execute() {
		mySql.load();
	}

}
