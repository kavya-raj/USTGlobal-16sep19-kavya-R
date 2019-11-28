package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestI {
public static void main(String[] args) {
	SortByName sb = new SortByName();   
	SortByPincode sp = new SortByPincode();
	SortByMicr sm = new SortByMicr();
	TreeSet<Bank> ts = new TreeSet<Bank>(sm);
	Bank b1 = new Bank("SBI", 573201, 234567890);
	Bank b2 = new Bank("HDFC", 573201, 87654567);
	Bank b3 = new Bank("CANARA", 123456,1234567);
	Bank b4 = new Bank("CITI", 875490, 34567987);
	Bank b5 = new Bank("CANARA", 123456,1234567);
	
	ts.add(b1);
	ts.add(b2);
	ts.add(b3);
	ts.add(b4);
	ts.add(b5);
	System.out.println("******using iteratir********");
	Iterator<Bank> it = ts.iterator();
	while(it.hasNext()) {
		Bank b = it.next();
		System.out.println("Name is "+b.name);
		System.out.println("Pincode is "+b.pincode);
		System.out.println("MICR is "+b.micr);
	}
}
}
