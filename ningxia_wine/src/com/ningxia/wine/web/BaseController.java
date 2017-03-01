package com.ningxia.wine.web;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.StringUtils;

import com.ningxia.wine.vo.UserLoginInfo;

public class BaseController {

	/**
	 * 保存登录用户信息（线程安全）
	 */
	protected static ConcurrentMap<String, UserLoginInfo> loginedUser = new ConcurrentHashMap<String, UserLoginInfo>();
	
	/**
	 * 清除任务是否在执行:
	 * true:正在执行
	 * false:未执行
	 */
	private static boolean isClearing=false;

	/**
	 * 读取请求数据
	 * 
	 * @param request
	 * @return
	 */
	public String readText(HttpServletRequest request) {
		StringBuffer sb = new StringBuffer();
		String line = null;
		try {
			BufferedReader bufferedReader = request.getReader();
			while ((line = bufferedReader.readLine()) != null) {
				sb.append(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

	/**
	 * 发送请求数据
	 * 
	 * @param response
	 * @param str
	 * @throws IOException
	 */
	public void sendText(HttpServletResponse response, String str)
			throws IOException {

		// 必须写上这句，中文编码问题
		response.setContentType("text/plain;charset=UTF-8");
		// response.setContentType("application/json;charset=utf-8");

		response.getWriter().write(str);
		response.getWriter().flush();
		response.getWriter().close();
	}

	/**
	 * 检查客户端凭证
	 * 
	 * @param sessionId
	 * @return
	 */
	public boolean checkAuthority(String sessionId) {
		boolean flag=false;
		if (StringUtils.isEmpty(sessionId)) {
			flag=false;
		}else if (loginedUser.containsKey(sessionId)) {
			flag=true;
		}
		removeTimeOutOfUser();
		return flag;
	}
	
	/**
	 * 清除超时用户
	 */
	public void removeTimeOutOfUser(){
		if(!isClearing){
			for (String key : loginedUser.keySet()) {
				UserLoginInfo useInfo=loginedUser.get(key);
				Date loginInDate=useInfo.getLoginDate();
				//登录时常大于20分钟清除登录信息
				long minutes=(new Date().getTime()-loginInDate.getTime())/(1000*60);
				if(minutes>=20){
					loginedUser.remove(key);
				}
			}
		}
	}
	
}
