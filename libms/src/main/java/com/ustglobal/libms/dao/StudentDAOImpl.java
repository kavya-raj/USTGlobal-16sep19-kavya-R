package com.ustglobal.libms.dao;

import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.libms.beans.BooksInventory;
import com.ustglobal.libms.beans.BooksRegistration;

@Repository
public class StudentDAOImpl implements StudentDAO {

static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("library-unit");
	
	//SEARCH BOOK
	@Override
	public List<BooksInventory> searchBook(BooksInventory booksInventory) {
		List<BooksInventory> booksInventories = null;
		try {
			EntityManager manager = FACTORY.createEntityManager();
			TypedQuery<BooksInventory> query = manager.createQuery("FROM BooksInventory WHERE bookName = :bName and author1 =:author", BooksInventory.class);
			query.setParameter("bName", booksInventory.getBookName());
			query.setParameter("author", booksInventory.getAuthor());
			booksInventories = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Failed to fetch the books from BooksInventory");
		}
		return booksInventories;
	}// end of searchBook()
	
	
	//REQUEST BOOK
	@Override
	public Boolean requestBook(int bookId)  {
		BooksRegistration booksRegistration = new BooksRegistration();
		booksRegistration.setId(LoginDAOImpl.id);
		booksRegistration.setBookId(bookId);
		booksRegistration.setRegistrationDate(new Date());
		Random random = new Random();
		booksRegistration.setRegistrationId(random.nextInt(10000));
		boolean isRequested = false;
		try {
			EntityManager manager = FACTORY.createEntityManager();
			manager.getTransaction().begin();
			manager.persist(booksRegistration);
			manager.getTransaction().commit();
			isRequested = true;
			manager.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Failed to Request the Book");
		}
		return isRequested;
	}// end of requestBook()

	
}
