package com.ningxia.wine.test;

public class T402QueryReq {
	
	private String sessionId;

	// ����
	private Integer season;
	// ���
	private String nd;
    /**
     * gscode�������������Ĵ���  ��������111 �ֶ�112
     *        �����ȫ����ֵΪall���Ļ�  �Ͱ����еļ�¼���ؾ���  
     * 
     */
	private String gscode;
	
	/**
	 * ������ҵ
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
