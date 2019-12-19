package com.ustglobal.libms.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.ustglobal.libms.beans.Users;

@Repository
public class LoginDAOImpl implements LoginDAO{

	static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("library-unit");
	static int id;
	
	//Login
	@Override
	public Users login(Users users)   {
		Users user = null;
		LoginDAOImpl.id = users.getId();
		try {
			EntityManager manager = FACTORY.createEntityManager();
			Query query = manager.createQuery("FROM Users WHERE id= :id and password=:pswd");
			query.setParameter("id", LoginDAOImpl.id);
			query.setParameter("pswd", users.getPassword());
			user = (Users)query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Login Failed");
		}
		return user;
	}// end of login()
	
}
