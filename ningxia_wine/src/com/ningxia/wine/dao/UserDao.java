package com.ningxia.wine.dao;

import java.util.List;

import com.ningxia.wine.entity.TUser;
import com.ningxia.wine.exception.DataBaseException;

public interface UserDao {
	
	public TUser findUsername(String username) throws DataBaseException;
	
	/**
	 * 查询所有酒庄名称
	 * @return
	 * @throws DataBaseException
	 */
	public List<String> findAllGsname() throws DataBaseException;
	

}
