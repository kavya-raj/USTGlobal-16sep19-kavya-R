package com.ustglobal.collectionframework.list;

import java.util.Collections;
import java.util.LinkedList;

public class TestK {
public static void main(String[] args) {
	LinkedList<Integer> l = new LinkedList<>();
	l.add(12);
	l.add(14);
	l.add(23);
	l.add(45);
	l.add(90);
	l.add(10);
  //l.add(null);throws ClassCastExcepton only integer we can pass	
	System.out.println("Before sort "+l);
	Collections.sort(l);//returns nothing
	System.out.println("After sort "+l);
	
	Collections.reverse(l);
	System.out.println("After reverse "+l);
	
	Collections.shuffle(l);
	System.out.println("After shuffle "+l);
}
}
