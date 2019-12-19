package com.ustglobal.libms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.libms.beans.BooksInventory;
import com.ustglobal.libms.beans.BooksRegistration;
import com.ustglobal.libms.beans.BooksTransaction;
import com.ustglobal.libms.beans.Users;
import com.ustglobal.libms.dao.LibrarianDAO;
import com.ustglobal.libms.dao.LibrarianDAOImpl;
import com.ustglobal.libms.validation.Validation;

@Service
public class LibrarianServiceImpl implements LibrarianService {

	@Autowired
	//private LibrarianDAO dao = new LibrarianDAOImpl();
	LibrarianDAO dao = new LibrarianDAOImpl();
	
	Validation validation = new Validation();
	
	@Override
	public Boolean addBooks(BooksInventory booksInventory)  {
		return dao.addBooks(booksInventory);
	}// end of addBooks() 

	@Override
	public Boolean deleteBook(int bookId) {
		return dao.deleteBook(bookId);
	}// end of deleteBooks()

	@Override
	public Users registerStudent(Users user)  {
		if(user!= null) {
			validation.validateEmail(user.getEmail());
			validation.validatePassword(user.getPassword());
			return dao.registerStudent(user);
		}
		return null;
		
	}// end of registerStudent()

	@Override
	public List<BooksInventory> showAllBooks()  {
		return dao.showAllBooks();
	}// end of showAllBooks()

	@Override
	public Users getStudentInfo(int id)  {
		return dao.getStudentInfo(id);
	}// end of getStudentInfo()

	@Override
	public Boolean deleteStudent(int id)  {
		return dao.deleteStudent(id);
	}// edn of deleteStudent()

	@Override
	public List<BooksRegistration> viewRequest()  {
		return dao.viewRequest();
	}
	
	@Override
	public List<BooksTransaction> getIssuedBooks(){
		return dao.getIssuedBooks();
	}

	

	@Override
	public Boolean denyRequest(int registrationId) {
		return dao.denyRequest(registrationId);
	}

	@Override
	public Boolean acceptRequest(int registrationId) {
		return dao.acceptRequest(registrationId);
	}

	
}
