package com.ust_global.studentapp.qspiders;
import static com.ust_global.studentapp.jspiders.Remote.*;//to access only static members
import com.ust_global.studentapp.jspiders.*;//both static and non-static members

public class TestB {
public static void main(String[] args) {
	on();
	System.out.println(num);
	Remote r = new Remote();
	System.out.println(r.sum);
}
}
