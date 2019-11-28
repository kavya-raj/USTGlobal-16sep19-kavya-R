package com.ustglobal.wrapperclasses;

public class TestA {
	public static void main(String[] args) {
		int a = 10;
		System.out.println("a is "+a);
		Integer i = a;//Boxing/Auto boxing
		System.out.println("i is "+i);
		
		Integer x = 10;
		Integer z = new Integer(20);
		System.out.println(" x is "+x);
		int y = x;//unboxing aut2o or unboxing
		System.out.println("y is "+y);
		
		int value = Integer.parseInt("123sry");//NumberFormatException
		System.out.println("Value is "+value);
		
		boolean result = Boolean.parseBoolean("true");
		System.out.println("Result is"+result);
	}

}

