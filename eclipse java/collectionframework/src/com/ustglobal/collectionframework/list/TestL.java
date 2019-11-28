package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Collections;

public class TestL {
public static void main(String[] args) {
	ArrayList<String> al =new ArrayList<>();
	al.add("girija");
	al.add("lalaja");
	al.add("vanaja");
	al.add("kirana");
	System.out.println("Before sort---->"+al);
	Collections.sort(al);
	System.out.println("After sort---->"+al);
}
}
