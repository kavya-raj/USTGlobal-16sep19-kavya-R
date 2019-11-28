package com.ustglobal.objectclass;

public class TestF {
public static void main(String[] args) {
	Cow c1 = new Cow(10, "ganga", 10000);
	Cow c2 = new Cow(20, "gowri", 15000);
	Cow c3 = new Cow(10, "ganga", 10000);
	boolean isEqual = (c1.equals(c2));
	System.out.println(isEqual);
	System.out.println(c1.equals(c3));
	
}
}
