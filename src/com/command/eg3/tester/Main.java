package com.command.eg3.tester;

import com.command.eg3.client.LoadDriverUtil;

public class Main {

	public static void main(String[] args) {
		LoadDriverUtil.load("oracle");
		LoadDriverUtil.load("mysql");
		LoadDriverUtil.unload("oracle");
	}
}
