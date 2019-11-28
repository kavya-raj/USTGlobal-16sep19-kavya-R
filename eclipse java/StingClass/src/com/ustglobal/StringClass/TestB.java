package com.ustglobal.StringClass;

public class TestB {
public static void main(String[] args) {
	int[] nums = {10,20,30,40};
//	System.out.println(nums[10]);ArrayIndexOutOfBoundsException
	receive(nums);
	
}
static void receive(int[] numbers) {
	for(int num: numbers) {
 		System.out.println(num);
	}
}
static int[] getArray() {
	int[] values = {20,30,40,50};
	return values;
}

static void receive(String[] s) {
	String[] ss = {"kavya","swomya","bhavya","ramya"};
	for(String s1 : s ) {
 		System.out.println(s1);
	}
	
}
}
