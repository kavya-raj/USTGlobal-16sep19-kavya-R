package com.ustglobal.libms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.libms.beans.BooksInventory;
import com.ustglobal.libms.beans.BooksRegistration;
import com.ustglobal.libms.beans.Users;
import com.ustglobal.libms.service.LibrarianService;
import com.ustglobal.libms.service.LibrarianServiceImpl;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class LibrarianController<BooksTransaction> {

	@Autowired
	LibrarianService service = new LibrarianServiceImpl();

	@PostMapping("/library/librarian/user")
	public Users addStudent(@RequestBody Users users) {
		try {
			users = service.registerStudent(users);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return users;
	}// end of addStudent()

	@PostMapping("/library/librarian/create")
	public Boolean addBooks(@RequestBody BooksInventory booksInventory) {
		boolean isAdded = false;
		try {
			service.addBooks(booksInventory);
			isAdded = true;
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return isAdded;
	}// end of addBooks()

	@DeleteMapping("/library/librarian/{bookId}")
	public Boolean deleteBook(@PathVariable("bookId") int bookId) {
		boolean isDeleted = false;
		try {
			service.deleteBook(bookId);
			isDeleted = true;
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return isDeleted;
	}// end of deleteBook()

	@GetMapping("/library/librarian/getBooks")
	public List<BooksInventory> showAllBook() {
		List<BooksInventory> bookList = null;
		try {
			bookList = service.showAllBooks();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return bookList;
	}// end of showAllBooks()
	
	@GetMapping("/library/librarian/getStudent/{id}")
	public Users getStuentInfo(@PathVariable("id")int id) {
		Users users = null;
		try {
			users = service.getStudentInfo(id);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return users;
	}// end of getStudentInfo()
	
	@DeleteMapping("/library/librarian/deleteStudent/{id}")
	public Boolean deleteStudent(@PathVariable("id") int id) {
		boolean isDeleted = false;
		try {
			isDeleted = service.deleteStudent(id);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return isDeleted;
	}// end of deleteStudent()

	@GetMapping("/library/librarian/viewRequest")
	public List<BooksRegistration> viewRequests() {
		List<BooksRegistration> booksRegistrations = null;
		try {
			booksRegistrations = service.viewRequest();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return booksRegistrations;
	}// end of viewRequest()
	
	@GetMapping("/library/librarian/getIssuedBooks")
	public List<BooksInventory> getIssuedBook() {
		List<BooksInventory> bookList = null;
		try {
			bookList = service.getIssuedBooks();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return bookList;
	}// end of getIssuedBooks()	
	
	@GetMapping("/library/librarian/acceptRequest/{registrationId}")
	public  Boolean acceptRequest(@PathVariable("registrationId") int registrationId) {
		
		boolean isAccepted = false;
		try {
			
			service.acceptRequest(registrationId);
			isAccepted = service.acceptRequest(registrationId);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return isAccepted;
	}
	
	@DeleteMapping("/library/librarian/denyRequest/{registrationId}")
	public Boolean denyRequest(@PathVariable("registrationId") int registrationId) {
		boolean isDeleted = false;
		try {
			service.denyRequest(registrationId);
			isDeleted = true;
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return isDeleted;
	
		}
	
	
	
}
