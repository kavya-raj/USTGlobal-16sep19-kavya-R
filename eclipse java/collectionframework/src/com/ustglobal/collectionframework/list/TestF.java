package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestF {
	public static void main(String[] args) {
		LinkedList li = new LinkedList();
		li.add(10);
		li.add(08.1);
		li.add("kavya");
		li.add(true);
		li.add(null);
		System.out.println("======using for loop===");
		for(int i=0;i<li.size();i++) {
			System.out.println(i);
		}
		System.out.println("======using for each loop=====");
		for(Object obj :li) {
			System.out.println(obj);
		}
		System.out.println("=======using iterator========");
		Iterator it = li.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
				System.out.println("=========Using list iterator======");
				ListIterator l = li.listIterator();
				while(l.hasNext()) {
					Object s = l.next();
					System.out.println(s);
				}
	}
}
