package com.hsbc.banking.bl;

import com.hsbc.banking.dao.UserDao;
import com.hsbc.banking.dao.UserImpl;
import com.hsbc.banking.exceptions.AgeException;
import com.hsbc.banking.exceptions.UserNameException;
import com.hsbc.banking.models.User;

// sub-class can have same exception as super class or sub-type of that in 'throws'
public class UserBLImpl implements UserBL {

	private UserDao userDao;
	
	public UserBLImpl(int size)
	{
		userDao=new UserImpl(size);
	}
		
	@Override
	public boolean addUser(User user) throws UserNameException, AgeException {
		// TODO Auto-generated method stub
		return this.userDao.addUser(user);
	}

	@Override
	public User[] getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
