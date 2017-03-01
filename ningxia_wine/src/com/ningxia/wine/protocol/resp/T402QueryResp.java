package com.ningxia.wine.protocol.resp;

import java.util.List;

import com.ningxia.wine.entity.T402;

public class T402QueryResp extends BaseResp {
	
	private List<T402> t402s;

	public List<T402> getT402s() {
		return t402s;
	}

	public void setT402s(List<T402> t402s) {
		this.t402s = t402s;
	}
}
