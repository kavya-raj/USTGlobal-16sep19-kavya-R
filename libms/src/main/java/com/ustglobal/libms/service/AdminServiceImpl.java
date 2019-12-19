package com.ustglobal.libms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.libms.beans.Users;
import com.ustglobal.libms.dao.AdminDAO;
import com.ustglobal.libms.dao.AdminDaoImpl;
import com.ustglobal.libms.validation.Validation;
@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	//private AdminDAO dao = new AdminDaoImpl();
	AdminDAO dao = new AdminDaoImpl();
	
	Validation validation = new Validation();
	
	@Override
	public Users addLibrarian(Users users)  {
		if(users!= null) {
			validation.validateEmail(users.getEmail());
			validation.validatePassword(users.getPassword());
			return dao.addLibrarian(users);
		}
		return null;
	}// end of addLibrarian()

	@Override
	public Boolean deleteLibrarian(int id)  {
		return dao.deleteLibrarian(id);
	}// end of deleteLibrarian()

	@Override
	public List<Users> displayLibrarian()  {
		return dao.displayLibrarian();
	}// end of displayLibrarian()

}
