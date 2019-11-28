package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestF {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>();
		ts.add("roopa");
		ts.add("jaya");
		ts.add("munni");
		ts.add("sheela");

		System.out.println("*******Using for each********");
		for(Object o : ts) {
			System.out.println(o);
		}
		System.out.println("*******Using iterator*******");
		Iterator<String> it = ts.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}

	}
}
