package com.ustglobal.StringClass;

public class TestA {
	public static void main(String[] args) {
		String s1 = "vedik";
		String s2 = "gagan";
		String s3 = new String("vedik");
		String s4 = new String("vedik");
		String s5 = "vedik";
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		System.out.println(s1==s5);
		System.out.println("==============");
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s5));
		System.out.println("============");
		String s6 = s1.toUpperCase();
		System.out.println(s6);
		String s7 = s1.toUpperCase();
		System.out.println(s7);
		char c = s1.charAt(0);
		System.out.println(c);
		System.out.println("===========");
		boolean b = s1.equalsIgnoreCase("VEDik");
		System.out.println(b);
		
		StringBuffer sb1 =  new StringBuffer("kavya");
		sb1.append("raj");
		System.out.println(sb1);
		System.out.println(s1.length());
		
	}

}
