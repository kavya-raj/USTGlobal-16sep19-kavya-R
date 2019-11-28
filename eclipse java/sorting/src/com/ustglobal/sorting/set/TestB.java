package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestB {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("vijay");
		hs.add("ajay");
		hs.add("sujay");
		hs.add("enjoy");
		hs.add("suta");
		System.out.println("*******Using for each********");
		for(String o : hs) {
			System.out.println(o);
		}
		System.out.println("*******Using iterator*******");
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
	}
}

