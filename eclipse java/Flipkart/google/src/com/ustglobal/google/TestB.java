package com.ustglobal.google;

public class TestB {
public static void main(String[] args) {
	Browser b = new Browser();
	Google g = new Gmail();
	b.open(g);
	
	Google gog = new GoogleDrive();
	b.open(gog);
	
}
}
