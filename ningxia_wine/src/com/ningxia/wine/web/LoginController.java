package com.ningxia.wine.web;

import java.io.IOException;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;
import com.ningxia.wine.entity.TUser;
import com.ningxia.wine.enums.InterFaceStatusEnum;
import com.ningxia.wine.exception.DataBaseException;
import com.ningxia.wine.protocol.req.LoginOutReq;
import com.ningxia.wine.protocol.req.LoginReq;
import com.ningxia.wine.protocol.resp.LoginOutResp;
import com.ningxia.wine.protocol.resp.LoginResp;
import com.ningxia.wine.sevice.UserService;
import com.ningxia.wine.vo.UserLoginInfo;

@Controller
@RequestMapping("/login")
public class LoginController extends BaseController {

	private static Logger logger = LoggerFactory.getLogger("LoginController");

	@Resource
	private UserService userService;

	private static Gson gson = new Gson();

	@RequestMapping("/checkLogin")
	public void checkLogin(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		LoginResp resp = new LoginResp();
		resp.setRespCode(InterFaceStatusEnum.Success.getCode());
		resp.setRespDesc(InterFaceStatusEnum.Success.getDesc());

		try {
			// ��ȡ������Ϣ
			String reqJson = readText(request);
			logger.info("��¼������Ϣ��{}", reqJson);
			LoginReq req = gson.fromJson(reqJson, LoginReq.class);
			if(StringUtils.isEmpty(req.getSessionId())){
				resp.setRespCode(InterFaceStatusEnum.SessionIdNoEmpty.getCode());
				resp.setRespDesc(InterFaceStatusEnum.SessionIdNoEmpty.getDesc());
			}else if (checkAuthority(req.getSessionId())) {
				resp.setRespCode(InterFaceStatusEnum.UserAlreadyLogin.getCode());
				resp.setRespDesc(InterFaceStatusEnum.UserAlreadyLogin.getDesc());
			} else {
				TUser user = userService.findByUsername(req.getUsername());
				if (user == null) {
					resp.setRespCode(InterFaceStatusEnum.UserNotExist.getCode());
					resp.setRespDesc(InterFaceStatusEnum.UserNotExist.getDesc());
				} else {
					if (StringUtils.isEmpty(req.getPassword())
							|| !req.getPassword().equals(user.getPassword())) {
						resp.setRespCode(InterFaceStatusEnum.UsernameOrPassordError
								.getCode());
						resp.setRespDesc(InterFaceStatusEnum.UsernameOrPassordError
								.getDesc());
					} else {
						loginedUser.put(req.getSessionId(),new UserLoginInfo(new Date(),user));
						resp.setUser(user);
					}
				}
			}
		} catch (DataBaseException e) {
			resp.setRespCode(InterFaceStatusEnum.DataBaseError.getCode());
			resp.setRespDesc(InterFaceStatusEnum.DataBaseError.getDesc());
			e.printStackTrace();
			logger.error("��¼�������쳣��{}", e.getMessage());
		} catch (Exception e) {
			resp.setRespCode(InterFaceStatusEnum.SystemError.getCode());
			resp.setRespDesc(InterFaceStatusEnum.SystemError.getDesc());
			e.printStackTrace();
			logger.error("��¼�������쳣��{}", e.getMessage());
		}

		String respJson = gson.toJson(resp);
		logger.info("��¼������Ӧ��Ϣ��{}", respJson);
		sendText(response, respJson);
	}
	
	/**
	 * ע���û���¼״̬
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping("/loginOut")
	public void loginOut(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		LoginOutResp resp = new LoginOutResp();
		resp.setRespCode(InterFaceStatusEnum.Success.getCode());
		resp.setRespDesc(InterFaceStatusEnum.Success.getDesc());

		try {
			// ��ȡ������Ϣ
			String reqJson = readText(request);
			logger.info("�˳�������Ϣ��{}", reqJson);
			LoginOutReq req = gson.fromJson(reqJson, LoginOutReq.class);
			if (checkAuthority(req.getSessionId())) {
				UserLoginInfo user=loginedUser.get(req.getSessionId());
				if(user!=null&&!user.getUser().getUsername().equals(req.getUsername())){
					resp.setRespCode(InterFaceStatusEnum.UserNotExist
							.getCode());
					resp.setRespDesc(InterFaceStatusEnum.UserNotExist
							.getDesc());
				}else{
					//ע���û���¼״̬
					loginedUser.remove(req.getSessionId());
				}
			} else {
				resp.setRespCode(InterFaceStatusEnum.UserIdentityAccessError
						.getCode());
				resp.setRespDesc(InterFaceStatusEnum.UserIdentityAccessError
						.getDesc());
			}
		}  catch (Exception e) {
			resp.setRespCode(InterFaceStatusEnum.SystemError.getCode());
			resp.setRespDesc(InterFaceStatusEnum.SystemError.getDesc());
			e.printStackTrace();
			logger.error("��¼�������쳣��{}", e.getMessage());
		}

		String respJson = gson.toJson(resp);
		logger.info("�˳�������Ӧ��Ϣ��{}", respJson);
		sendText(response, respJson);
	}
}
