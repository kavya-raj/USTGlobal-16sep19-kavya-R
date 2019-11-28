package com.ustglobal.atmmachine;

public class TestA {
	public static void main(String[] args) {
		HDFC h = new HDFC();
		Machine m = new Machine();
		ICICI i = new ICICI();
		SBI s = new SBI();
		m.slot(h);
		m.slot(i);
		m.slot(s);
	}
}
