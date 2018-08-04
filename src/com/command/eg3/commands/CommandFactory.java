package com.command.eg3.commands;

import com.command.eg3.vendor.MySQL;
import com.command.eg3.vendor.OracleDriver;

public class CommandFactory {

	public static Command loadCommand(String type, Object driver){
		if("oracle".equalsIgnoreCase(type)){
			return new OracleLoadCommand((OracleDriver)driver);
		}else{
			return new MySqlLoadCommand((MySQL)driver);
		}
	}
	
	public static Command unLoadCommand(String type,Object driver){
		if("oracle".equalsIgnoreCase(type)){
			return new OracleUnLoadCommand((OracleDriver)driver);
		}else{
			return new MySqlUnLoadCommand((MySQL)driver);
		}
	}
	
}
