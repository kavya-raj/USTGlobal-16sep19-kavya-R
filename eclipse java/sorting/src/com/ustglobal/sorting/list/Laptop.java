package com.ustglobal.sorting.list;

public class Laptop implements Comparable<Laptop>{
	double price;
	int ram;
	String brand;
	public Laptop(double price, int ram, String brand) {
		super();
		this.price = price;
		this.ram = ram;
		this.brand = brand;
	}
	@Override
	public int compareTo(Laptop l) {
		if(this.price>l.price) {
			return 1;
		}else if(this.price<l.price) {
			return -1;
		}else {
			return 0;
		}
	}


}
