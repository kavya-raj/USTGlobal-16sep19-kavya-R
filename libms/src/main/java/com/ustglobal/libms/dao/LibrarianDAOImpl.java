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
import com.ustglobal.libms.beans.BooksTransaction;
import com.ustglobal.libms.beans.Users;

@Repository
public class LibrarianDAOImpl implements LibrarianDAO{

static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("library-unit");
	
	//ADD STUDENT
	@Override
	public Users registerStudent(Users user)  {
	user.setType("Student");
//		Random random = new Random();
//		user.setId(random.nextInt(10000));
		try {
			EntityManager manager = FACTORY.createEntityManager();
			manager.getTransaction().begin();
			manager.persist(user);
			manager.getTransaction().commit();
			manager.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Failed to add Student");
		}
		return user;
	}// end of registerStudent()
	
	
	//DELETE STUDENT
	@Override
	public Boolean deleteStudent(int id) {
		boolean isDeleted = false;
		try {
			EntityManager manager = FACTORY.createEntityManager();
			manager.getTransaction().begin();
			Users users = manager.find(Users.class, id);
			manager.remove(users);
			manager.getTransaction().commit();
			isDeleted = true;
			manager.close();
		} catch (Exception e) {
		e.printStackTrace();
		System.out.println("Failed to delete the Student");
		}
		return isDeleted;
	}// end of deleteStudent()

	
	//ADD BOOK
	@Override
	public Boolean addBooks(BooksInventory booksInventory)  {
		boolean isAdded = false;
	Random random = new Random();
	booksInventory.setBookId(random.nextInt(10000));
		try {
			EntityManager manager = FACTORY.createEntityManager();
			manager.getTransaction().begin();
			manager.persist(booksInventory);
			manager.getTransaction().commit();
			isAdded = true;
			manager.close();
		} catch (Exception e) {
		e.printStackTrace();
		System.out.println("Failed to add the book");
		}
		return isAdded;
	}// end of addBooks()

	//DELETE BOOK
	@Override
	public Boolean deleteBook(int bookId)  {
		boolean isDeleted = false;
		try {
			EntityManager manager = FACTORY.createEntityManager();
			manager.getTransaction().begin();
			BooksInventory booksInventory = manager.find(BooksInventory.class, bookId);
			manager.remove(booksInventory);
			manager.getTransaction().commit();
			isDeleted = true;
			manager.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Failed to delete the book from BooksInventory");
		}
		return isDeleted;
	}// end of deleteBook()

	//SHOW ALL BOOK
	@Override
	public List<BooksInventory> showAllBooks()  {
		List<BooksInventory> booksInventories = null;
		try {
			EntityManager manager = FACTORY.createEntityManager();
			TypedQuery<BooksInventory> query = manager.createQuery("FROM BooksInventory", BooksInventory.class);
			booksInventories = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Failed to fetch the books from BooksInventory");
		}
		return booksInventories;
	}// end of showAllBook()

	//STUDENT INFORMATION
	@Override
	public Users getStudentInfo(int id) {
		Users users = null;
		try {
			EntityManager manager = FACTORY.createEntityManager();
			manager.getTransaction().begin();
			users = manager.find(Users.class, id);
			manager.getTransaction().commit();
			manager.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Failed to fetch the Student Info");
		}
		return users;
	}// end of getStudentInfo()

	//VIEW REQUEST
	@Override
	public List<BooksRegistration> viewRequest()  {
		List<BooksRegistration> booksRegistrations = null;
		try {
			EntityManager manager = FACTORY.createEntityManager();
			TypedQuery<BooksRegistration> typedQuery = manager.createQuery("FROM BooksRegistration", BooksRegistration.class);
			 booksRegistrations = typedQuery.getResultList();
			 manager.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Failed to Fetch the Requests");
		}
		return booksRegistrations;
	}// end of viewRequest()
	
	//acceptRequest
			@Override
			public Boolean acceptRequest(int registrationId)  {
				boolean isAccepted   = false;
				Random random = new Random();
				BooksRegistration br = new BooksRegistration();
				br.setRegistrationId(random.nextInt(1000));
				BooksTransaction bt = new BooksTransaction();
				
				try {
					EntityManager manager = FACTORY.createEntityManager();
					manager.getTransaction().begin();
					br = manager.find(BooksRegistration.class, registrationId);
					bt.setRegistrationId(br.getRegistrationId());
					bt.setIssueDate(br.getRegistrationDate());
					manager.persist(bt);
					manager.getTransaction().commit();
					isAccepted = true;
					manager.close();
					manager.close();
				} catch (Exception e) {
					System.out.println("Failed to Fetch the Requests");
				}
				//return booksTransaction	;
				return isAccepted;
			}
	
	@Override
	public List<BooksTransaction> getIssuedBooks(){
		List<BooksTransaction> bt = null;
		try {
			EntityManager manager = FACTORY.createEntityManager();
			TypedQuery<BooksTransaction> query = manager.createQuery("FROM BooksTransaction", BooksTransaction.class);
			bt = query.getResultList();
			manager.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Failed to fetch the books from BooksTransaction");
		}
		return bt;
		
	}
	
	
	


		@Override
		public Boolean denyRequest(int registrationId) {
			boolean isDeleted = false;
			try {
				EntityManager manager = FACTORY.createEntityManager();
				manager.getTransaction().begin();
				BooksRegistration booksRegistration = manager.find(BooksRegistration.class, registrationId);
				manager.remove(booksRegistration);
				manager.getTransaction().commit();
				isDeleted = true;
				manager.close();
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Failed to deny the book from BooksRegistration");
			}
			return isDeleted;
		
		

			
			
		}
	
}
