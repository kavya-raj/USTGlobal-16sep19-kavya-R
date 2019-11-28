package com.ustglobal.accessmodifier.pkg1;

import com.ustglobal.accessmodifier.pkg2.Demo;

public class Sample extends Demo { 
	public static void main(String[] args) {
		Demo d = new Demo();
		//private
//		System.out.println(d.a);Not possible
		Sample s = new Sample();
		// Default
		System.out.println(s.c);
		
		//Protected
		System.out.println(s.c);
		s.mul();
		//public
//		
		System.out.println(d.name);
		d.div();
	}

}
