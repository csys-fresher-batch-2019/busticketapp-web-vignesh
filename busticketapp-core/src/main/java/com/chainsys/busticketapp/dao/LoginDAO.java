package com.chainsys.busticketapp.dao;

import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import com.chainsys.busticketapp.model.UserRegistration;

public interface LoginDAO {
	
	@SqlUpdate("select Admin_name from AdminRegister where Admin_name=? and pass_word = ?")
	public boolean adminLogin(String adminname, String pass) throws Exception;
	
	@SqlUpdate("select name from UserRegister where Email_id=? and password=?")
	public UserRegistration user(String emailId, String pass) throws Exception ;
}
