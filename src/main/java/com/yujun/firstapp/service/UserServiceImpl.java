package com.yujun.firstapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yujun.firstapp.dto.User;
import com.yujun.firstapp.dao.UserDAO;

@Service
public class UserServiceImpl implements UserService {

	private final UserDAO userDao;

	// Constructor Based Injection
	public UserServiceImpl(UserDAO userDao){
		this.userDao = userDao;
	}

	@Override
	public User getUser(String id) {
		return userDao.getUser(id);
	}

}
