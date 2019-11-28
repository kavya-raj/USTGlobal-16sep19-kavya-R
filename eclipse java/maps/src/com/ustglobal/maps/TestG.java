package com.ustglobal.maps;

import java.util.Hashtable;

public class TestG {
public static void main(String[] args) {
	Hashtable<Integer, String> ht = new Hashtable<Integer, String>();//unordered
	ht.put(101, "ajay");
	ht.put(103, "vijay");
	ht.put(123, "sonu");
	ht.put(34, "moni");
	ht.put(99, "ram");
//	ht.put(null,"john"); NullPointerException
//	ht.put(78,null);     NullPointerException
	System.out.println("Data "+ht);
}
}
