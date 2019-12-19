package com.ustglobal.libms.dao;

import java.util.Date;
import java.util.List;

import com.ustglobal.libms.beans.BooksInventory;
import com.ustglobal.libms.beans.BooksRegistration;
import com.ustglobal.libms.beans.Users;

public interface LibrarianDAO<BooksTransaction> {

	public Users registerStudent(Users user);
	public Boolean deleteStudent(int id) ;
	public Boolean addBooks(BooksInventory booksInventory) ;
	public Boolean deleteBook(int bookId) ;
	public Users getStudentInfo(int id) ;
	public List<BooksRegistration> viewRequest();
	public List<BooksInventory> showAllBooks() ;
	public List<BooksTransaction> getIssuedBooks();
	public Boolean acceptRequest(int registrationId);
	public Boolean denyRequest(int registrationId);
	

	
}
