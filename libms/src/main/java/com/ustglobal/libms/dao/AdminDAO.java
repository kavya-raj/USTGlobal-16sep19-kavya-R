package com.ustglobal.libms.dao;

import java.util.List;

import com.ustglobal.libms.beans.Users;

public interface AdminDAO {

	public Users addLibrarian(Users users);
	public Boolean deleteLibrarian(int id) ;
	public List<Users> displayLibrarian();
	
}
