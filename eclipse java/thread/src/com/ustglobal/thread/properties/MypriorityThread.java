package com.ustglobal.thread.properties;

public class MypriorityThread extends Thread{
public static void main(String[] args) {
	System.out.println("Main started");
	int p = Thread.currentThread().getPriority();
	System.out.println("main thread priority "+p);
	
	Thread.currentThread().setPriority(7);
	System.out.println("main thread priority "+Thread.currentThread().getPriority());
	
	MypriorityThread t = new MypriorityThread();
	int q = t.getPriority();
	System.out.println("my priority thread priority "+q);
	
	t.setPriority(6);
	System.out.println("my priority thread priority "+t.getPriority());
	
	System.out.println("Main ended");
}
}
