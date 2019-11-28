package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestE {
	public static void main(String[] args) {
		ArrayList<Pen> al = new ArrayList<Pen>();
		Pen p1 = new Pen(34, "dums");
		Pen p2 = new Pen(54, "reynolds");
		Pen p3 = new Pen(56, "jetter");
		Pen p4 = new Pen(78, "cello");
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		System.out.println("before sorting");
		displayPenDetails(al);
		System.out.println("After sorting");
		displayPenDetails(al);
	}
	static void displayPenDetails(ArrayList<Pen> p) {
		Iterator<Pen> it = p.iterator();
		while(it.hasNext()) {
			Pen pe =it.next();
			System.out.println("Price is "+pe.price);
			System.out.println("Brand id "+pe.brand);
		}
	}
}
