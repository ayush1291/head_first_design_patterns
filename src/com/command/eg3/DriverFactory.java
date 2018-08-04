package com.command.eg3;

import com.command.eg3.vendor.MySQL;
import com.command.eg3.vendor.OracleDriver;

public class DriverFactory {
	
	public static Object loadDriverClass(String type){
		if("oracle".equalsIgnoreCase(type)){
			return new OracleDriver();
		}else{
			return new MySQL();
		}
	}
}
