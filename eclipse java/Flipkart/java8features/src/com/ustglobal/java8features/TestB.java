package com.ustglobal.java8features;

import java.util.function.Predicate;

public class TestB {
	public static void main(String[] args) {
		Predicate<Student> p = s ->{
			if(s.percen>=35) {
				return true;
			}else {
				return false;
			}
		};
		
		
		Student s = new Student(10, "anup", 23.5);
		boolean res = p.test(s);
		System.out.println(res);
		
	}
}
