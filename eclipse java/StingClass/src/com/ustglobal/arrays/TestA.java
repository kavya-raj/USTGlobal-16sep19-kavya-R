package com.ustglobal.arrays;

public class TestA {
	public static void main(String[] args) {
		int[] nums = new int[5];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		nums[4] = 50;
		
	for(int i:nums) {
		System.out.println(i);
	}
	
	
	System.out.println("============");
	char[] ch = {'a','b','c','d'};
	for(int i = 0;i<ch.length;i++) {
		System.out.println(ch[i]);
	}
	System.out.println("================");
	for(int i:ch) {
		System.out.println(i);
	}
	
	System.out.println("==========");
	boolean[] b = {true,false,true,false};
	for(int i=0;i<b.length;i++) {
		System.out.println(i);
		}
	System.out.println("==============");
	for(boolean i : b) {
		System.out.println(i);
	}
		
	System.out.println("===========");
	byte[] b1 = {10,20,45,67,89};
	for(int i=0;i<b1.length;i++) {
		System.out.println(i);
		}
	System.out.println("==============");
	for(byte i : b1) {
		System.out.println(i);
	}
	String[] names = {"aishu","kavyA","divya","priya"};
	for(int i=0;i<names.length;i++) {
		System.out.println(i);
		}
	System.out.println("==============");
	for(String i : names) {
		System.out.println(i);
	}
	}
}


