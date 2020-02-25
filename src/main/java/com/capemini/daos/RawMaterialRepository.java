package com.capemini.daos;

import java.util.HashMap;
import java.util.Map;

public class RawMaterialRepository {
		public static void list() {
	// raw material inventory
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(100, "-MILK");
		hm.put(101, "-COFFEE");
		hm.put(102, "-BISCUIT");
		hm.put(103, "-TEA");
		hm.put(104, "-FRIES");
		hm.put(105, "-COLD_DRINK");
		hm.put(106, "-ICE_CREAM");
	///
		
System.out.println("The Id and name of raw material.\n");
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}



public static String str() {
	// TODO Auto-generated method stub
	return "Successfully";
}
}