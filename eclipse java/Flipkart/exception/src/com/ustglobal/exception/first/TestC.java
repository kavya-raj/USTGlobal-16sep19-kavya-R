package com.ustglobal.exception.first;

public class TestC {
	public static void main(String[] args) {
		System.out.println("Main started");
		int[] a = {10,20,30};
		int b = 10;
		try {
			System.out.println(a[5]);
			System.out.println(b/0);//not executed
		}catch(ArithmeticException e){
			System.out.println("number divided by zero");
		}catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println("array index is not present");
		}
		System.out.println("Main ended");
	}
}
