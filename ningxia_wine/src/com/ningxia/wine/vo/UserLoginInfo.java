package com.ningxia.wine.vo;

import java.util.Date;

import com.ningxia.wine.entity.TUser;
/**
 * 
 * @author Administrator<br/>
 * �û���¼״̬��Ϣ
 */
public class UserLoginInfo {
	
	public UserLoginInfo() {
		super();
	}

	public UserLoginInfo(Date loginDate, TUser user) {
		super();
		this.loginDate = loginDate;
		this.user = user;
	}

	/**
	 * ��¼�ɹ�ʱ��
	 */
	private Date loginDate;

	private TUser user;

	public Date getLoginDate() {
		return loginDate;
	}

	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}

	public TUser getUser() {
		return user;
	}

	public void setUser(TUser user) {
		this.user = user;
	}
}
