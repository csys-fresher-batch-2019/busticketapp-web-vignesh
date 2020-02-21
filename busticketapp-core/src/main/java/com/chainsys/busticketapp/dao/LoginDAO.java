package com.chainsys.busticketapp.dao;

import com.chainsys.busticketapp.model.UserRegistration;

public interface LoginDAO {

	public boolean adminLogin(String adminname, String pass) throws Exception;

	public UserRegistration user(String emailId, String pass) throws Exception;
}
