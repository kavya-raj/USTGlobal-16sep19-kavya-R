package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestL {
public static void main(String[] args) {
	SortByCustName sc = new SortByCustName();
	TreeSet<Customer> ts = new TreeSet<>(sc);
	Customer c1 =new Customer("naveen", 1, 234.5);
	Customer c2 = new Customer("vedik", 20, 09.57);
	Customer c3 = new Customer("shine", 30,789.4);
	Customer c4 = new Customer("alok", 40, 900.45);
	Customer c5 = new Customer("moon", 50, 7849.6);
	ts.add(c1);
	ts.add(c2);
	ts.add(c3);
	ts.add(c5);
	ts.add(c5);
	System.out.println("******using iteratir********");
	Iterator<Customer> it = ts.iterator();
	while(it.hasNext()) {
		Customer c = it.next();
		System.out.println("Name is "+c.name);
		System.out.println("id is "+c.id);
		System.out.println("salary is "+c.salary);
	}

}
}
