package com.ustglobal.libms.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="books_inventory")
public class BooksInventory {

	@Id
	@Column
	private int bookId;
	@Column
	private String bookName;
	@Column
	
	private String author;
	@Column
	private String publisher;
	@Column
	private String yearOfPublication;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getYearOfPublication() {
		return yearOfPublication;
	}
	public void setYearOfPublication(String yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}
	
	@Override
	public String toString() {
		return "BooksInventory [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", publisher=" + publisher + ", yearOfPublication=" + yearOfPublication + "]";
	}
	
	
	
}
