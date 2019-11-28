package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {
	public static void main(String[] args) {
		LinkedHashSet<Double> ls = new LinkedHashSet<>();//no duplication,ordered
		ls.add(1.2);
		ls.add(45.5);
		ls.add(89.4);
		ls.add(45.6);
		ls.add(97.3);
		ls.add(1.2);

		System.out.println("*******Using for each********");
		for(Object o : ls) {
			System.out.println(o);
		}
		System.out.println("*******Using iterator*******");
		Iterator it = ls.iterator();
		while(it.hasNext()) {
			Object s = it.next();
			System.out.println(s);
		}

	}
}
