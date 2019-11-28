package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Testemp {
	public static void main(String[] args) {
		Employee e1 = new Employee(2, "kaage", 7890.9);
		Employee e2 = new Employee(23, "kaape", 789340.9);
		Employee e3 = new Employee(78, "sri", 34459.0);
		Employee e4 = new Employee(34, "ram", 123456);
		Employee e5 = new Employee(56, "ruchi", 8765);
		Employee e6 = new Employee(89, "manu", 344324);
		Employee e7 = new Employee(34, "sonu", 876556);
		Employee e8 = new Employee(56, "giri", 6789.8);
		Employee e9 = new Employee(67, "raj", 234323);

		ArrayList<Employee> al = new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(e3);

		ArrayList<Employee> al1 = new ArrayList<>();
		al1.add(e4);
		al1.add(e5);
		al1.add(e6);

		ArrayList<Employee> al2 = new ArrayList<>();
		al2.add(e7);
		al2.add(e8);
		al2.add(e9);

		HashMap<String,ArrayList<Employee>> hm = new HashMap<>();
		hm.put("first",al);
		hm.put("second",al1);
		hm.put("third",al2);
		ArrayList<Employee> f = hm.get("third");
		Iterator<Employee> it = f.iterator();
		while(it.hasNext()) {
			Employee e  = it.next();
			System.out.println("Id id "+e.id);
			System.out.println("Name is "+e.name);
			System.out.println("Salary is "+e.salary);
			System.out.println("=============================");
		}


	}
}
