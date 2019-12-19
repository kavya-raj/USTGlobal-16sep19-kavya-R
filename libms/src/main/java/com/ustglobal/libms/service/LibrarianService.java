package com.ustglobal.libms.service;

import java.util.List;

import com.ustglobal.libms.beans.BooksInventory;
import com.ustglobal.libms.beans.BooksRegistration;
import com.ustglobal.libms.beans.Users;
import com.ustglobal.libms.beans.BooksTransaction;

public interface LibrarianService<BooksTransaction> {
	
	public Users registerStudent(Users user);
	public Boolean addBooks(BooksInventory booksInventory);
	public Boolean deleteBook(int bookId);
	public List<BooksInventory> showAllBooks();
	public Users getStudentInfo(int id);
	public List<BooksRegistration> viewRequest();
	public Boolean deleteStudent(int id);
	public List<BooksTransaction> getIssuedBooks();
	public Boolean acceptRequest(int registrationId);
	
	public Boolean denyRequest(int registrationId);
	
	
}
