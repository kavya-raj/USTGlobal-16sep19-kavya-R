package com.ustglobal.libms.service;

import java.util.List;

import com.ustglobal.libms.beans.Users;

public interface AdminService {

	public Users addLibrarian(Users users);
	public Boolean deleteLibrarian(int id);
	public List<Users> displayLibrarian();
	
}
