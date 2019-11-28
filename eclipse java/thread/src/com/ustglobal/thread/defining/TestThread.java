package com.ustglobal.thread.defining;

public class TestThread {
	public static void main(String[] args) {
		System.out.println("Main started");

		 MyThread m = new MyThread(); 
		/*
		 * Don'
		 * t call run() method, it behaves like normal program 
		 * All code will be executed inside main thread only
		 */
	//	m.run();
		m.start();
	//	m.start(); We can't call two times it throws exception called IllegealStateException 
		for(int i = 0;i<10;i++) {
			System.out.println("Main thread");
		}
		System.out.println("Main ended");
	}
}
