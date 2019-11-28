package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestTeach {
	public static void main(String[] args) {
		
		ArrayList<Teacher> al = new ArrayList<Teacher>();
		Teacher s1 = new Teacher(11, "anki", 4500.6);
		Teacher s2 = new Teacher(13, "salman",7800.9);
		Teacher s3 = new Teacher(4, "shahrukh", 9000.8);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		System.out.println("===using for loop=====");
		for(int i=0;i<al.size();i++) {
			Teacher s= al.get(i);
			
			System.out.println("Id is "+s.yop);
			System.out.println("Name is "+s.name);
			System.out.println("Pecentage is "+s.salary);
		}
		System.out.println("=============for each=====");
		for(Teacher s:al) {
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



