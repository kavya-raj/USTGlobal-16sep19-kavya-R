package com.ustglobal.java8features;

import java.util.function.Consumer;

public class TestF {
public static void main(String[] args) {
	Consumer<Student> c  = s ->{//only input no return type
		System.out.println("Id is "+s.id);
		System.out.println("Name is "+s.name);
		System.out.println("Percentage is "+s.percen);
	};
	Student s1 = new Student(12, "bhava",45.8 );
	c.accept(s1);
}}
