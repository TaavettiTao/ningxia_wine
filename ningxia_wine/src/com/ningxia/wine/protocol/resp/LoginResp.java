package com.ningxia.wine.protocol.resp;

import com.ningxia.wine.entity.TUser;

/**
 * 
 * @author Administrator
 * µÇÂ¼ÏìÓ¦
 */
public class LoginResp extends BaseResp {
	
	private TUser user;
	
	public TUser getUser() {
		return user;
	}
	
	public void setUser(TUser user) {
		this.user = user;
	}

}
