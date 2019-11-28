package com.ustglobal.exception.first;

public class TestB {
	public static void main(String[] args) {
		System.out.println("Main started");
		int a = 10;
		int b = 0;
		try {
			b = 10/0;
			System.out.println("Hello");//this will not execute
			System.out.println("Happy Deepavali");//not executed
		}catch(ArithmeticException ae) {
			System.out.println("number is divided by zero");
		}
		System.out.println(b);
		System.out.println("main ended");
	}
}
