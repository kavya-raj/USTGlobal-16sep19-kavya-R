package com.ustglobal.java8features;

import java.util.function.Function;

public class TestC {
public static void main(String[] args) {
	Function<Integer ,Integer> f = i ->i*i;
	int res = f.apply(5);
	System.out.println("square of 5 is "+res);
	
	int res1 = f.apply(6);
	System.out.println("square of 6 is "+res1);
}
}
