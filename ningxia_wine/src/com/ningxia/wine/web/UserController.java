package com.ningxia.wine.web;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;
import com.ningxia.wine.enums.InterFaceStatusEnum;
import com.ningxia.wine.exception.DataBaseException;
import com.ningxia.wine.protocol.req.QueryAllGsNameReq;
import com.ningxia.wine.protocol.resp.QueryAllGsNameResp;
import com.ningxia.wine.sevice.UserService;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController {

	private static Logger logger = LoggerFactory.getLogger("UserController");

	@Resource
	private UserService userService;

	private static Gson gson = new Gson();

	/**
	 * 查询所有酒庄名称
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping("/getAllGsnames")
	public void getAllGsnames(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		QueryAllGsNameResp resp = new QueryAllGsNameResp();
		resp.setRespCode(InterFaceStatusEnum.Success.getCode());
		resp.setRespDesc(InterFaceStatusEnum.Success.getDesc());

		try {
			String reqJson = readText(request);
			logger.info("查询所有酒庄名称请求信息：{}", reqJson);
			QueryAllGsNameReq req = gson.fromJson(reqJson,
					QueryAllGsNameReq.class);
			if (checkAuthority(req.getSessionId())) {
				List<String> gsnames = userService.findAllGsname();
				resp.setGsNames(gsnames);
			} else {
				resp.setRespCode(InterFaceStatusEnum.UserIdentityAccessError
						.getCode());
				resp.setRespDesc(InterFaceStatusEnum.UserIdentityAccessError
						.getDesc());
			}
		} catch (DataBaseException e) {
			resp.setRespCode(InterFaceStatusEnum.DataBaseError.getCode());
			resp.setRespDesc(InterFaceStatusEnum.DataBaseError.getDesc());
			e.printStackTrace();
			logger.error("查询所有酒庄名称异常:{}", e.getMessage());
		} catch (Exception e) {
			resp.setRespCode(InterFaceStatusEnum.SystemError.getCode());
			resp.setRespDesc(InterFaceStatusEnum.SystemError.getDesc());
			e.printStackTrace();
			logger.error("查询所有酒庄名称异常:{}", e.getMessage());
		}
		String respJson = gson.toJson(resp);
		logger.info("查询所有酒庄名称响应 信息：{}", respJson);
		sendText(response, respJson);
	}

}
