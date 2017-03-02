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
	 * �����¼�û���Ϣ���̰߳�ȫ��
	 */
	protected static ConcurrentMap<String, UserLoginInfo> loginedUser = new ConcurrentHashMap<String, UserLoginInfo>();
	
	/**
	 * ��������Ƿ���ִ��:
	 * true:����ִ��
	 * false:δִ��
	 */
	private static boolean isClearing=false;

	/**
	 * ��ȡ��������
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
	 * ������������
	 * 
	 * @param response
	 * @param str
	 * @throws IOException
	 */
	public void sendText(HttpServletResponse response, String str)
			throws IOException {

		// ����д����䣬���ı�������
		response.setContentType("text/plain;charset=UTF-8");
		// response.setContentType("application/json;charset=utf-8");

		response.getWriter().write(str);
		response.getWriter().flush();
		response.getWriter().close();
	}

	/**
	 * ���ͻ���ƾ֤
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
	 * �����ʱ�û�
	 */
	public void removeTimeOutOfUser(){
		if(!isClearing){
			for (String key : loginedUser.keySet()) {
				UserLoginInfo useInfo=loginedUser.get(key);
				Date loginInDate=useInfo.getLoginDate();
				//��¼ʱ������20���������¼��Ϣ
				long minutes=(new Date().getTime()-loginInDate.getTime())/(1000*60);
				if(minutes>=20){
					loginedUser.remove(key);
				}
			}
		}
	}
	
}
