package com.ustglobal.sorting.list;

public class Student implements Comparable<Student> {  
	//since sort method implements compareto method we should implement comparable
	int id;
	String name;
	double percen;
	public Student(int id, String name, double percen) {
		super();
		this.id = id;
		this.name = name;
		this.percen = percen;
	}
//	@Override
//	public int compareTo(Student s) {
//		if(this.id>s.id) {
//			return 1;
//		}else if(this.id<s.id){
//			return -1;
//		}else {
//
//			return 0;
//		}
//	}
	
	
//	@Override
//	public int compareTo(Student s) {
//	if(this.percen>s.percen) {
//		return 1;
//	}else if(this.percen<s.percen) {
//		return -1;
//	}else {
//		return 0;
//	}
//	}
	
	
//	@Override
//	public int compareTo(Student s) {
//		
//		String p = this.name.toUpperCase();
//		String q = s.name.toUpperCase();
//				return p.compareTo(q);
//	
//	}
//	
	@Override
	public int compareTo(Student s) {
//		int i =this.id;    invalid dont do this
//		int j = s.id;
		
		Integer i = this.id;
		Integer j = s.id;
		return i.compareTo(j);
	}

}


