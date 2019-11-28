package com.ustglobal.lambdaexpressions;

public class TestMessage {
public static void main(String[] args) {
	MessageInterface mes = (message)->{
		System.out.println("hello");
		System.out.println(message);
		return message;
		};
		String s = mes.greet("hi");
				System.out.println(s);
	
}
}
