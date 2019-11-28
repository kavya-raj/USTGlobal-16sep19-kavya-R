package com.ustglobal.java8features;

import java.util.ArrayList;

public class TestG {
public static void main(String[] args) {
	ArrayList<Student> al = new ArrayList<Student>();
	al.add(new Student(3,"vikki",34.5));
	al.add(new Student(334, "yash", 36.7));
	al.add(new Student(56, "vijay", 98.7));
	al.add(new Student(7, "hari", 56.9));
	al.add(new Student(9, "kaage", 33.9));
	Helper h = new Helper();
//	h.displayAllStudent(al);
//	h.displayFailedStudents(al);
//	h.displayPassedStudents(al);
	h.topperOfClass(al);
}
}
