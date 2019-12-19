package com.ustglobal.libms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.libms.beans.BooksInventory;
import com.ustglobal.libms.dao.StudentDAO;
import com.ustglobal.libms.dao.StudentDAOImpl;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO dao = new StudentDAOImpl();
	
	@Override
	public List<BooksInventory> searchBook(BooksInventory booksInventory)  {
		return dao.searchBook(booksInventory);
	}// end of searchBook()
	
	@Override
	public Boolean requestBook(int bookId)  {
		return dao.requestBook(bookId);
	}// end of requestBook() 

}
