package com.ustglobal.exception.customizeduncheckedexception;

public class TestAge {
public static void main(String[] args) {
	System.out.println("Main started");
	Validator v = new Validator();
	try {
	v.verify(12);
	}catch(InvalidAgeException ie) {
		System.out.println("exception occured");
	}
	//v.verify(14);-->to get output try again next time
	System.out.println("Main ended");
}
}
