package com.adapter.eg2.step2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import com.adapter.eg2.step1.EnumerationAdapter;

public class Client {

	public static void main(String[] args) {
		List list1 = Arrays.asList(1,2,3,4);
		Vector dayNames = new Vector();

	      dayNames.add("Sunday");
	      dayNames.add("Monday");
	      dayNames.add("Tuesday");
		//uncomment n check.....
		//callMethod(list1.iterator());  
		
	    System.out.println("For list1");  
	    callMethod(list1.iterator());
	    System.out.println("For Vector");  
		callMethod(new EnumerationAdapter(dayNames.elements()));
	}
	
	
	public static void callMethod(Iterator itr) {
		// TODO Auto-generated method stub
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	
}
