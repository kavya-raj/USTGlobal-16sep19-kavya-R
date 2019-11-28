package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestJ {
public static void main(String[] args) {
	PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
	pq.add(12);
	pq.add(23);
	pq.add(34);
	pq.add(56);
	pq.offer(1);
	
	System.out.println("Before poll "+pq);
	System.out.println("*****Using itereator*****");
	Iterator<Integer> it = pq.iterator();
	while(it.hasNext()) {
		System.out.println(pq.poll());
	}
	System.out.println("After poll "+pq);
}
}
