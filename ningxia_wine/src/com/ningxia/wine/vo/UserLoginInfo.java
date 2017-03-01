package com.ningxia.wine.vo;

import java.util.Date;

import com.ningxia.wine.entity.TUser;
/**
 * 
 * @author Administrator<br/>
 * 用户登录状态信息
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
	 * 登录成功时间
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
