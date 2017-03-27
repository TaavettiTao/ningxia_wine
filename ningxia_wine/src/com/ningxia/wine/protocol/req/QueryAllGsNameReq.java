package com.ningxia.wine.protocol.req;
/**
 * 
 * @author Administrator<br/>
 * 查询所有酒庄名称<br/>
 *
 */
public class QueryAllGsNameReq {
	
	private String sessionId;

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
}
