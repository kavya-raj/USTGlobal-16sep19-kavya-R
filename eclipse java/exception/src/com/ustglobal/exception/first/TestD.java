package com.ustglobal.exception.first;

public class TestD {
	public static void main(String[] args) {
		System.out.println("Main started");
		int[] a = {10,20,30};
		int b = 10;
		try {

			System.out.println(b/0);
		}catch(ArithmeticException e){
			System.out.println("number divided by zero");
		}
		try {
			System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println("array index is not present");
		}
		System.out.println("Main Ended");
	}
}
