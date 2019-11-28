package com.ustglobal.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestM {
public static void main(String[] args) {
	
	Comparator<Eemployee> comp = (e1,e2)->{  //Using lambda expression
		if(e1.height > e2.height ) {
			return 1;
		}else if(e1.height<e2.height) {
			return -1;
		}else {
			return 0;
		}
	};
	TreeSet<Eemployee> ts = new TreeSet<Eemployee>(comp);
	Eemployee e1 = new Eemployee(4, "nikki", 5.6);
	Eemployee e2 = new Eemployee(1, "baskar", 5.9);
	Eemployee e3 = new Eemployee(5, "suresh", 6.3);
	Eemployee e4 = new Eemployee(2, "dinesh", 5.3);
	
	ts.add(e1);
	ts.add(e2);
	ts.add(e3);
	ts.add(e4);
	System.out.println("********Using iterator*******");
	Iterator<Eemployee> it = ts.iterator();
	while(it.hasNext()) {
		Eemployee e = it.next();
		System.out.println("Id is "+e.id);
		System.out.println("Name is "+e.name);
		System.out.println("Height is "+e.height);
		System.out.println("=========================");
	}
}
}
