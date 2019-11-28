package com.ustglobal.StringClass;

public class TestC {
public static void main(String[] args) {
	Student s1 = new Student(10, "arya", 33.5);
	Student s2 = new Student(20, "nithin", 67.8);
	Student s3 = new Student(30, "chinku", 98.7);
	
	Student[] students = new Student[3];
	students[0] = s1;
	students[1]= s2;
	students[2] = s3;
	
	for(Student s : students) {
		System.out.println(s);
	}
	receive(students);
}
static void receive(Student[] stu) {
	for(Student s : stu) {
		System.out.println(s);
	}
}
}
