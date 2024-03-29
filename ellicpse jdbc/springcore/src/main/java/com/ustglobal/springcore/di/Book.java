package com.ustglobal.springcore.di;

import javax.annotation.PreDestroy;

public class Book {
	
	String name;
	String author;
	double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@PreDestroy
	public void init() {
		System.out.println("init executing from book");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy method executing from book");
	}

}
