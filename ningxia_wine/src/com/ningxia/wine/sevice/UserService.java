package com.ningxia.wine.sevice;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ningxia.wine.dao.UserDao;
import com.ningxia.wine.entity.TUser;
import com.ningxia.wine.exception.DataBaseException;

@Service
public class UserService {
	
	@Resource
	private UserDao userDao;
	
	
	public TUser findByUsername(String username) throws DataBaseException{
		return userDao.findUsername(username);
	}

}
