package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestC {
	public static void main(String[] args) {
		LinkedHashSet ls = new LinkedHashSet();//ordered,no duplication
		ls.add(34);
		ls.add("niki");
		ls.add(34.6);
		ls.add(34);
		ls.add("bhavya");
		ls.add(null);
		ls.add(null);
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

