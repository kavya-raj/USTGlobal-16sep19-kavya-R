package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;

public class TestE {
public static void main(String[] args) {
	ArrayList<Integer> marks = new ArrayList<>();
	marks.add(70);
	marks.add(24);
	marks.add(35);
	marks.add(79);
	marks.add(38);
	marks.add(57);
	
	Comparator<Integer> cmp = (m1,m2)->{
		if(m1 > m2) {
			return 1;
		}else if (m1<m2) {
			return -1;
		} else {
			return 0;
		}
	};
	long noOfFailedStudents = marks.stream().filter(i -> i < 40 ).count();
	System.out.println(noOfFailedStudents);
	System.out.println("===================");
	Integer i = marks.stream().min(cmp).get();
	System.out.println("Min value "+i);
	
	System.out.println("================");
	Integer j = marks.stream().max(cmp).get();
	System.out.println("Max value "+j);
}
}
