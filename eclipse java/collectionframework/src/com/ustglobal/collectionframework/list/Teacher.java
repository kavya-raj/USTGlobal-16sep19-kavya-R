package com.ustglobal.collectionframework.list;

public class Teacher {

int yop;
String name;
double salary;

public Teacher(int yop, String name, double salary) {
	super();
	this.yop = yop;
	this.name = name;
	this.salary = salary;
}

@Override
public String toString() {
	return "Teacher [yop=" + yop + ", name=" + name + ", salary=" + salary + "]";
}

}
