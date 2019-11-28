package com.ustglobal.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestD {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> lh = new LinkedHashMap<String, Integer>();
		lh.put("Hassan", 573202);
		lh.put("Bang",560068);
		lh.put("patna",81200);
		
		for(Map.Entry<String, Integer> m :lh.entrySet()) {
			String key = m.getKey();
			Integer value = m.getValue();
			System.out.println("Key is "+key+ "-------->"+"Value "+value);
		}
	}
}
