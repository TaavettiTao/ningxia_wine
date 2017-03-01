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
import com.ningxia.wine.entity.T402;
import com.ningxia.wine.enums.InterFaceStatusEnum;
import com.ningxia.wine.exception.DataBaseException;
import com.ningxia.wine.protocol.req.T402AddReq;
import com.ningxia.wine.protocol.req.T402QueryReq;
import com.ningxia.wine.protocol.resp.T402AddResp;
import com.ningxia.wine.protocol.resp.T402QueryResp;
import com.ningxia.wine.sevice.T402Service;

/**
 * 
 * @author Administrator
 * 
 *         葡萄酒庄（企业）生产经营情况季报
 */

@Controller
@RequestMapping("/t402report")
public class T402ReportController extends BaseController {

	private static Logger logger = LoggerFactory
			.getLogger("T402ReportController");

	@Resource
	private T402Service t402Service;

	private static Gson gson = new Gson();

	/**
	 * 新增
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping("/add")
	public void add(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		T402AddResp resp = new T402AddResp();
		resp.setRespCode(InterFaceStatusEnum.Success.getCode());
		resp.setRespDesc(InterFaceStatusEnum.Success.getDesc());

		try {
			String reqJson = readText(request);
			logger.info("T402添加请求信息：{}", reqJson);
			T402AddReq req = gson.fromJson(reqJson, T402AddReq.class);
			if (checkAuthority(req.getSessionId())) {
				Integer id = t402Service.save(req);
				if (id == null) {
					resp.setRespCode(InterFaceStatusEnum.T402AddError.getCode());
					resp.setRespDesc(InterFaceStatusEnum.T402AddError.getDesc());
				} else {
					T402 t402 = t402Service.findById(id);
					resp.setEntity(t402);
				}
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
			logger.error("T402数据库添加异常:{}", e.getMessage());
		} catch (Exception e) {
			resp.setRespCode(InterFaceStatusEnum.SystemError.getCode());
			resp.setRespDesc(InterFaceStatusEnum.SystemError.getDesc());
			e.printStackTrace();
			logger.error("T402系统异常:{}", e.getMessage());
		}

		String respJson = gson.toJson(resp);

		logger.info("T402添加响应 信息：{}", respJson);

		sendText(response, respJson);
	}

	/**
	 * 查询
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping("/query")
	public void query(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		T402QueryResp resp = new T402QueryResp();
		resp.setRespCode("0");
		resp.setRespDesc("success");
		try {
			String reqJson = readText(request);
			logger.info("T402查询请求信息：{}", reqJson);
			T402QueryReq req = gson.fromJson(reqJson, T402QueryReq.class);
			if (checkAuthority(req.getSessionId())) {
				List<T402> t402s = t402Service.query(req);
				resp.setT402s(t402s);
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
			logger.error("T402查询数据库异常:{}", e.getMessage());
		} catch (Exception e) {
			resp.setRespCode(InterFaceStatusEnum.SystemError.getCode());
			resp.setRespDesc(InterFaceStatusEnum.SystemError.getDesc());
			e.printStackTrace();
			logger.error("T402系统异常:{}", e.getMessage());
		}

		String respJson = gson.toJson(resp);
		logger.info("T402查询响应 信息：{}", respJson);
		sendText(response, respJson);
	}

}
