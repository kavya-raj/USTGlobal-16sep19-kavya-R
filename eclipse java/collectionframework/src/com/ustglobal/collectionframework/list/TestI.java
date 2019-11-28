package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestI {
public static void main(String[] args) {
	ArrayList<Student> al = new ArrayList<Student>();
	Student s1 = new Student(101, "anki", 45.6);
	Student s2 = new Student(123, "salman",78.9);
	Student s3 = new Student(234, "shahrukh", 90.8);
	al.add(s1);
	al.add(s2);
	al.add(s3);
	
	System.out.println("===using for loop=====");
	for(int i=0;i<al.size();i++) {
		Student s= al.get(i);
		
		System.out.println("Id is "+s.id);
		System.out.println("Name is "+s.name);
		System.out.println("Pecentage is "+s.percentage);
	}
	System.out.println("=============for each=====");
	for(Student s:al) {
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
