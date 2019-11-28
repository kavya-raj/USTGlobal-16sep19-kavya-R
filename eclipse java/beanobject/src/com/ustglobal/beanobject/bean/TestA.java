package com.ustglobal.beanobject.bean;

public class TestA {
public static void main(String[] args) {
	Student s = new Student();
	s.setId(10);
	s.setName("Shiva");
	s.setRollno(123);
	Database db = new Database();
	db.receive(s);
	
	Employee e = new Employee();
	e.setId(10);
	e.setDeptno(123);
	e.setDesig("software");
	e.setName("kavya");
db.save(e);

}


}
