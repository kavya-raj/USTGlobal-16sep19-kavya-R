package com.ustglobal.libms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.libms.beans.Users;
import com.ustglobal.libms.dao.LoginDAO;
import com.ustglobal.libms.dao.LoginDAOImpl;
import com.ustglobal.libms.validation.Validation;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDAO dao = new LoginDAOImpl();
	
	Validation validation = new Validation();
	
	@Override
	public Users login(Users users)  {
		if(users!= null) {
			validation.validatePassword(users.getPassword());
			return dao.login(users);
		}
		return null;
		
	}// end of login()

}
