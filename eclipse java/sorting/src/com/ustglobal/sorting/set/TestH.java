package com.ustglobal.sorting.set;


import java.util.Iterator;
import java.util.TreeSet;

public class TestH {
public static void main(String[] args) {
	TreeSet<Employee> hs = new TreeSet<>();//for this we should implement comparable for output since this compares only comparable
	Employee e1 = new Employee(1, "k", 2355.6);
	Employee e2 = new Employee(2, "she", 3455.8);
	Employee e3 = new Employee(3, "pee", 903.2);
	Employee e4 = new Employee(4, "rak", 34545.8);
	Employee e5 = new Employee(1, "k", 2355.6);//allows duplication
	hs.add(e1);
	hs.add(e2);
	hs.add(e3);
	hs.add(e4);
	hs.add(e5);
	System.out.println("**********8Using iterator********");
	Iterator<Employee> it = hs.iterator();
	while(it.hasNext()) {
		Employee e = it.next();
		System.out.println("Id is "+e.id);
		System.out.println("Name is "+e.name);
		System.out.println("Salary is "+e.salary);

	}

}
}
