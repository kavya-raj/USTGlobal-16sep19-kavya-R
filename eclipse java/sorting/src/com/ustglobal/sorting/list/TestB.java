package com.ustglobal.sorting.list;

import java.util.Iterator;
import java.util.LinkedList;

public class TestB {
	public static void main(String[] args) {
		LinkedList<Laptop> ll = new LinkedList<Laptop>();
		Laptop lp1 = new Laptop(23000.00, 4,"HP");
		Laptop lp2 = new Laptop(34000.00, 8, "DEll");
		Laptop lp3 = new Laptop(12900.00, 9, "MAC");
		Laptop lp4 = new Laptop(45000.00, 12, "Asus");
		
		ll.add(lp1);
		ll.add(lp2);
		ll.add(lp3);
		ll.add(lp4);
		ll.add(new Laptop(200.00,2,"acer"));
		System.out.println("Befor sorting");
		displayLaptopDetails(ll);
		System.out.println("After sorting");
		displayLaptopDetails(ll);
	}
	static void displayLaptopDetails(LinkedList<Laptop> l) {
		Iterator<Laptop> it = l.iterator();
		while(it.hasNext()) {
			Laptop lp =it.next();
			System.out.println("Brand is "+lp.brand);
			System.out.println("Price is "+lp.price);
			System.out.println("Ram is "+lp.ram);
		}
	}
}
