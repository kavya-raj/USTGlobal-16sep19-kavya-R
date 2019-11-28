package com.ustglobal.objectclass;

public class TestG {
public static void main(String[] args) throws CloneNotSupportedException {
	Person p = new Person(10, "ravi");
	System.out.println("p id "+p.id);
	System.out.println("p name "+p.name);
	
	Object o = p.clone();
	Person p1 = (Person)o;
	System.out.println("p1 id "+p1.id);
	System.out.println("p1 name "+p1.name);
	p1.id = 20;
	p1.name = "surya";
	System.out.println("---------after clning------");
	System.out.println("p id "+p.id);
	System.out.println("p name "+p.name);
	System.out.println("p1 id "+p1.id);
	System.out.println("p1 name "+p1.name);

	System.out.println("");
}
}
