package com.ustglobal.beanobject.bean;

public class Database {
	
	void receive(Student s) {
		System.out.println("Id is "+s.getId());
		System.out.println("Name is "+s.getName() );
		System.out.println("Rollno is "+s.getRollno());
		System.out.println("=======================");
	}
	
	void save(Employee e)
	{
		System.out.println("...............Im database.........");
		System.out.println("Id is "+e.getId());
		System.out.println("Name is "+e.getName() );
		System.out.println("Rollno is "+e.getDeptno());
		System.out.println("Id is "+e.getDesig());
		System.out.println("Name is "+e.getSalary());
	
	
		System.out.println("=======================");
	}
}
