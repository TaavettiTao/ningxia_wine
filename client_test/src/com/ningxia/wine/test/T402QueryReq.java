package com.ningxia.wine.test;

public class T402QueryReq {
	
	private String sessionId;

	// 季度
	private Integer season;
	// 年度
	private String nd;
    /**
     * gscode：代表的是区域的代码  比如杨浦111 浦东112
     *        如果查全区（值为all）的话  就把所有的记录返回就行  
     * 
     */
	private String gscode;
	
	/**
	 * 单个企业
	 */
	private String gsname;
	
	public String getGscode() {
		return gscode;
	}

	public void setGscode(String gscode) {
		this.gscode = gscode;
	}

	public String getGsname() {
		return gsname;
	}

	public void setGsname(String gsname) {
		this.gsname = gsname;
	}

	public Integer getSeason() {
		return season;
	}

	public void setSeason(Integer season) {
		this.season = season;
	}

	public String getNd() {
		return nd;
	}

	public void setNd(String nd) {
		this.nd = nd;
	}
	
	public String getSessionId() {
		return sessionId;
	}
	
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
}
