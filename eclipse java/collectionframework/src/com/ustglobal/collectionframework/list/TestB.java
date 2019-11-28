package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestB {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(23);
		al.add(98.7);
		al.add(true);
		al.add("Good Morning");
		Iterator it = al.iterator();
		Object o1= it.next();
		System.out.println("Obj1 is "+o1);

		Object o2 = it.next();
		System.out.println("Onj2 is "+o2);

		Object o3 = it.next();
		System.out.println("Onj3 is "+o3);

		Object o4 = it.next();
		System.out.println("Onj4 is "+o4);

		boolean b = it.hasNext();
		System.out.println("Has Next "+b);

		//	Object o5 = it.next();
		//	System.out.println("Onj5 is "+o5);
		//	NoSuchElementException


		System.out.println("=========using for loop======");

		for(int i =0;i<al.size();i++) {
			Object o = al.get(i);
			System.out.println(o);

		}
		ArrayList al1 = new ArrayList();
		al1.add(12);
		al1.add(233.4);
		al1.add("momo");
		al1.add(false);

		System.out.println("========Using Iterator=======");
        Iterator it1 = al1.iterator();
        while(it1.hasNext()) {
        	Object o =it1.next();
        	System.out.println(o);
        }
        
        for(;it1.hasNext();) {
        	Object ob = it1.next();
        	System.out.println(ob);
        }


		for(int i=0;i<4;i++) {
			Object o = al.get(i);
			System.out.println(o);
		}
	}
}
