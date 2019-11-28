package com.ustglobal.java8features;

import java.util.function.Function;

public class TesTD {
public static void main(String[] args) {
	Function<Integer,Student> f = id->{
		Student s = new Student(2,"viji",47.8);
		s.id = id;
		return s;
	};
	Student s = f.apply(24);
	System.out.println("ID is "+s.id);
	System.out.println("Name is "+s.name);
	System.out.println("percentage is "+s.percen);

}
}
