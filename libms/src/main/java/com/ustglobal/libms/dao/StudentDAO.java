package com.ustglobal.libms.dao;

import java.util.List;

import com.ustglobal.libms.beans.BooksInventory;

public interface StudentDAO {

	public List<BooksInventory> searchBook(BooksInventory booksInventory) ;
	public Boolean requestBook(int bookId);

}
