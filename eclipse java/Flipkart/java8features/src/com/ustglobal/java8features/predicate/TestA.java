package com.ustglobal.java8features.predicate;

import java.util.function.Predicate;

public class TestA {
	public static void main(String[] args) {
		Predicate<Employee> p = e ->{
			if(e.salary>2300) {
				return true;
			}else {
				return false;
			}
		};
    	Employee e = new Employee(23, "piya", 5678.9);
    	boolean res = p.test(e);
    	System.out.println(res);
	}
}
