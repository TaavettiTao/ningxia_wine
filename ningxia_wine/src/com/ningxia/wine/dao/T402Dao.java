package com.ningxia.wine.dao;

import java.util.List;

import com.ningxia.wine.entity.T402;
import com.ningxia.wine.exception.DataBaseException;
import com.ningxia.wine.protocol.req.T402AddReq;
import com.ningxia.wine.protocol.req.T402QueryReq;

public interface T402Dao {
	
	/**
	 * 新增
	 * @param req
	 * @return
	 * @throws DataBaseException 
	 */
	public Integer save (T402AddReq req) throws DataBaseException;
	
	/**
	 * 查询
	 * @param req
	 * @return
	 * @throws DataBaseException 
	 */
	public List<T402> query(T402QueryReq req) throws DataBaseException;
	
	/**
	 * 根据id查询记录
	 * @param id
	 * @return
	 * @throws DataBaseException
	 */
	public T402 findById(Integer id) throws DataBaseException;

}
