package com.ningxia.wine.dao;

import com.ningxia.wine.entity.TUser;
import com.ningxia.wine.exception.DataBaseException;

public interface UserDao {
	
	public TUser findUsername(String username) throws DataBaseException;
	

}
