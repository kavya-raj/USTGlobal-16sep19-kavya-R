package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestB {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(20);
		al.add(45);
		al.add(5);
		al.add(78);
		al.add(35);
		al.add(5);
		
		List<Integer> l = al.stream().filter(i -> i%3 == 0).collect(Collectors.toList());//multiple of 3
//		for(Integer i : l) {
//			System.out.println(i);
//		}
		System.out.println(l);
	}
}
