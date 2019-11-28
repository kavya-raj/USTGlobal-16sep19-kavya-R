package com.ustglobal.beanobject.bean;
import java.util.Scanner;
public class TestB {
	public static void main(String[] args) {
		System.out.println("Scanner class");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		System.out.println("Age is "+age);
		System.out.println("are you kannadiga");
		boolean bo = sc.nextBoolean();
		System.out.println(bo);
		String s = sc.next();
		String s1 = sc.nextLine();
		System.out.println("enter b");
	byte b = sc.nextByte();
	System.out.println(b);
	System.out.println("enter c");
	short c = sc.nextShort();
	System.out.println(c);
	System.out.println("enter d");
	double d = sc.nextDouble();
	System.out.println(d);
	
		
	}

}
