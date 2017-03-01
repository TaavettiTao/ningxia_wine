package com.ningxia.wine.sevice;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ningxia.wine.dao.T402Dao;
import com.ningxia.wine.entity.T402;
import com.ningxia.wine.exception.DataBaseException;
import com.ningxia.wine.protocol.req.T402AddReq;
import com.ningxia.wine.protocol.req.T402QueryReq;

@Service
public class T402Service {
	
	@Resource
	private T402Dao t402Dao;
	
	
	public Integer save(T402AddReq req) throws DataBaseException{
		return t402Dao.save(req);
	}
	
	public List<T402> query(T402QueryReq req) throws DataBaseException{
		return t402Dao.query(req);
	}
	
	public T402 findById(Integer id) throws DataBaseException{
		return t402Dao.findById(id);
	}

}
