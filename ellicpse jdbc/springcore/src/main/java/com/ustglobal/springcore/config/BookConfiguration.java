package com.ustglobal.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ustglobal.springcore.di.Author;
import com.ustglobal.springcore.di.Book;
@Configuration
public class BookConfiguration {
	@Bean(name="book")
	public Book getBook() {
		Book book = new  Book();
		book.setAuthor("chandra");
		book.setName("chandu");
		book.setPrice(123.4);
		return book;
	}
	@Bean(name="author")
	public Author getAuthor() {
		Author author = new Author();
		author.setName("kavu");
		author.setPenname("kaaaaaaa");
		return author;
	}
}
