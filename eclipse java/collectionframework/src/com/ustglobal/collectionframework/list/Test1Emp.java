package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Test1Emp {
	public static void main(String[] args) {
		
		LinkedList<Employee> al = new LinkedList<Employee>();
		Employee s1 = new Employee(101, "anki", 4500.6);
		Employee s2 = new Employee(123, "salman",7800.9);
		Employee s3 = new Employee(234, "shahrukh", 9000.8);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		System.out.println("===using for loop=====");
		for(int i=0;i<al.size();i++) {
			Employee s= al.get(i);
			
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Pecentage is "+s.salary);
		}
		System.out.println("=============for each=====");
		for(Employee s:al) {
			System.out.println(s);
		}
		System.out.println("=======using iterator========");
		Iterator it = al.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
		System.out.println("======using list iterator======");
		ListIterator lt = al.listIterator();
				while(lt.hasNext()) {
					Object o1 = lt.next();
					System.out.println(o1);
				}
		}
	}



