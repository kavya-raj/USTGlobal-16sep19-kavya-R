package com.ustglobal.maps;

import java.util.HashMap;

public class TestA {
	public static void main(String[] args) {
		HashMap hm = new HashMap();//no insertion order
		hm.put("kuku",123234);
		hm.put("nala",87654);
		hm.put("sheela", 56794);
		System.out.println("Data  "+hm);
		
		hm.put("nala",9875678);//for keys , duplicates are not allowed
		System.out.println("After modify  "+hm);
		
		hm.put("dimple ",9875678);//for values,duplicates are allowed
		System.out.println("After dimple "+hm);
		
		hm.put(null,39755009);//only one null is allowed for key , for value any nulls are allowed 
		System.out.println("After null "+hm);
		
		hm.put(null,9065468); 
		System.out.println("After adding duplicate null  "+hm);

		
		System.out.println("===============");
		Object phoneno = hm.get("sheela");
		System.out.println("Value "+phoneno);
		
		System.out.println("=============");
		Object phoneno1 = hm.get("she");
		System.out.println("Value "+phoneno1);
		
		System.out.println("===============");
		Object value = hm.remove("kuku");
		System.out.println("Value "+value);
		System.out.println(" after remove-------> "+hm);
	}
}
