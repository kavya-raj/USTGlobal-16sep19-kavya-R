package com.ust_global.typecasting.primitive;

public class TestA {
	public static void main(String[] args)
	{
		//implicit casting
		byte a = 10;
		int b = a;
		System.out.println("b is "+b);
		int p = 20;
		double q = p;
		System.out.println("q is "+q);
		//explicit casting
		double x = 20.87;
		int y = (int) x;
		System.out.println("y is"+y);
		byte z = (byte) x;
		System.out.println("z is "+z);
		char c = (char) x;
		System.out.println("c is "+c);
	}

}
