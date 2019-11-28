package com.ustglobal.maps;

import java.util.HashMap;

public class TestB {
	public static void main(String[] args) {
		HashMap hm = new HashMap();//no insertion order
		hm.put("kuku",123234);
		hm.put("nala",87654);
		hm.put("sheela", 56794);

		HashMap hm1 = new HashMap();
		hm1.put("deepu", 9876567);
		hm1.put("riya",2121298);
		hm1.put("kriti",87670990);

		boolean hasKey = hm.containsKey("nala");
		System.out.println("has key "+hasKey);
		
		System.out.println("==================");
		
		boolean hasValue = hm.containsValue("123234");
		System.out.println("Hhas Value "+hasValue);
		
		hm.putAll(hm1);
		
		System.out.println("=====================");
		System.out.println("After put all "+hm);
		
		System.out.println(hm.size());
		
		boolean isEmpty = hm.isEmpty();
		System.out.println("Map is Empty "+isEmpty);
		
		hm.clear();
		System.out.println("After clear "+hm);
	}
}
