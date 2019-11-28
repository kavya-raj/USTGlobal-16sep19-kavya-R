package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestF {
public static void main(String[] args) {
	Student s1 = new Student(2, "divya", 56.7);
	Student s2 = new Student(9, "mangya", 89.3);
	Student s3 = new Student(6, "kavya", 78.6);
	Student s4 = new Student(4, "kirAN", 94.6);
	Student s5 = new Student(8, "chinnu", 79.0);
	Student s6 = new Student(12, "minnu", 46.7);
	Student s7 = new Student(34, "rannu", 56.9);
	Student s8 = new Student(98, "kaage", 34.5);
	Student s9 = new Student(96, "kempi", 89.0);
	
	
	ArrayList<Student> al = new ArrayList<>();
	al.add(s1);
	al.add(s2);
	al.add(s3);
	
	ArrayList<Student> al1 = new ArrayList<Student>();
	al1.add(s4);
	al1.add(s5);
	al1.add(s6);
	
	ArrayList<Student> al2 = new ArrayList<Student>();
	al2.add(s7);
	al2.add(s8);
	al2.add(s9);
	
	HashMap<String,ArrayList<Student>> hm = new HashMap<>();
	hm.put("first",al);
	hm.put("second",al1);
	hm.put("third",al2);
	ArrayList<Student> first = hm.get("second");
	Iterator<Student> it = first.iterator();
	while(it.hasNext()) {
		Student s = it.next();
		System.out.println("Id id "+s.id);
		System.out.println("Name is "+s.name);
		System.out.println("Percentag is "+s.percen);
		System.out.println("======================");
	}
}
}
