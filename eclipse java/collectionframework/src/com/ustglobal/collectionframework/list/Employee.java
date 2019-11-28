package com.ustglobal.collectionframework.list;

public class Employee {
String name;
int id;
double salary;
public Employee( int id,String name,double salary) {
	super();
	this.name = name;
	this.id = id;
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
}


}
