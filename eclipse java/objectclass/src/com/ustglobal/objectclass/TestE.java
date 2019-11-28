package com.ustglobal.objectclass;


public class TestE {
public static void main(String[] args) {
	

	Car c = new Car(2000, "BMW", "blue");
	int code = c.hashCode();
	System.out.println(code);
	System.out.println(c);
}
}
