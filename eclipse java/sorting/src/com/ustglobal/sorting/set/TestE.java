package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestE {
	public static void main(String[] args) {
		TreeSet ts  = new TreeSet();//no duplication,same datatypes,sorted in ascending order,no null,generics;
		ts.add(34);
		ts.add(34);
		ts.add(70);
		ts.add(678);
		ts.add(67);
		//  ts.add("kavya");ClassCastException	
		//	ts.add(null);NullPointException
		System.out.println("*******Using for each********");
		for(Object o : ts) {
			System.out.println(o);
		}
		System.out.println("*******Using iterator*******");
		Iterator it = ts.iterator();
		while(it.hasNext()) {
			Object s = it.next();
			System.out.println(s);
		}

	}
}
