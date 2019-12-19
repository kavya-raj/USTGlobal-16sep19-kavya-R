package com.ustglobal.libms.service;

import java.util.List;

import com.ustglobal.libms.beans.BooksInventory;

public interface StudentService {
	
	public List<BooksInventory> searchBook(BooksInventory booksInventory) ;
	public Boolean requestBook(int bookId) ;
}
