package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestF {
	public static void main(String[] args) {
		ArrayList<Marker> al = new ArrayList<>();
		al.add(new Marker(50,"blue"));
		al.add(new Marker(89,"black"));
		al.add(new Marker(78,"red"));
		System.out.println("Befor sorting-------------");
		display(al);
		SortByPrice sb = new SortByPrice();
		SortByColor sb1 = new SortByColor();
		Collections.sort(al,sb1);
		Collections.sort(al,sb);
		
		
		System.out.println("Afetr sortong----------");
		display(al);
	
		
		
	}
	static void display(ArrayList<Marker> a) {
		Iterator<Marker> it = a.iterator();
		while(it.hasNext()) {
			Marker m = it.next();
			System.out.println("Peice is "+m.price);
			System.out.println("Color is "+m.color);
		}
	}
}
