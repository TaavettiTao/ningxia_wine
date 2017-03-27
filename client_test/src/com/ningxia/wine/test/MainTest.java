package com.ningxia.wine.test;

import com.google.gson.Gson;
import com.ningxia.wine.util.HttpClientUtil;

public class MainTest {
    //��¼�ӿ�
	public static final String LOGIN_URL = "http://127.0.0.1:8080/ningxia_wine/login/checkLogin";
	
	//�˳��ӿ�
	public static final String LOGIN_OUTURL = "http://127.0.0.1:8080/ningxia_wine/login/loginOut";
	
	//T402��ӽӿ�
	public static final String T402_ADD="http://127.0.0.1:8080/ningxia_wine/t402report/add";
	
	//T402��ѯ�ӿ�
	public static final String T402_QUERY="http://127.0.0.1:8080/ningxia_wine/t402report/query";

	public static final String QUERY_ALL_GSNAMES="http://127.0.0.1:8080/ningxia_wine/user/getAllGsnames";
	
	private static Gson gson=new Gson();
	
	public static void main(String[] args) {
		//sessionId��ƴ��ģʽ,username_15λ�����,��¼�ɹ�֮��ÿ�ʽ��ױ������ʹ��ֶ�
		String sessionId="admin_123456789111111";
		System.out.println(sessionId);
		
	/*	testLogin(sessionId);*/
		
		testQueryAllGsname(sessionId);
		
		//testAdd(sessionId);
		
		//testQuery(sessionId);
		
		/*testLoginOut(sessionId);*/
	}
	
	public static void testQueryAllGsname(String sessionId){
		QueryAllGsNameReq req=new QueryAllGsNameReq();
		req.setSessionId(sessionId);
		String reqJson = gson.toJson(req);
		System.out.println("reqJson:"+reqJson);
		try {
			String resp=HttpClientUtil.postRequest(QUERY_ALL_GSNAMES, reqJson);
			System.out.println("resp=====:"+resp);
			QueryAllGsNameResp loginResp = gson.fromJson(resp,
					QueryAllGsNameResp.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	private static void testLoginOut(String sessionId) {
		LoginOutReq req=new LoginOutReq();
		req.setSessionId(sessionId);
		req.setUsername("1001");
		String reqJson = gson.toJson(req);
		System.out.println("reqJson:"+reqJson);
		try {
			String resp=HttpClientUtil.postRequest(LOGIN_OUTURL, reqJson);
			System.out.println("resp=====:"+resp);
			LoginOutResp loginResp = gson.fromJson(resp,
					LoginOutResp.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	/**
	 * ���Ե�¼
	 * ����������
	 * 
	 * ��¼�ɹ���{"user":{"id":1,"username":"1001","name":"�����û�","password":"123","gscode":"63","gsname":"�������ѹ����","roleId":1,"roleName":"ϵͳ����Ա"},"respCode":"0","respDesc":"��¼�ɹ�"}
	 * ��¼ʧ�ܣ�
	 * {"respCode":"1","respDesc":"�û������������"}
	 * {"respCode":"1","respDesc":"��ǰ�û�������"}
	 */
	public static void testLogin(String sessionId){
		LoginReq req=new LoginReq();
		req.setUsername("1001");
		req.setPassword("123");
		req.setSessionId(sessionId);
		String reqJson = gson.toJson(req);
		System.out.println("reqJson:"+reqJson);
		try {
			String resp=HttpClientUtil.postRequest(LOGIN_URL, reqJson);
			System.out.println("resp=====:"+resp);
			LoginResp loginResp = gson.fromJson(resp,
					LoginResp.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * ����������
	 * �ɹ���{"entity":{"id":10,"season":1,"nd":"2017","gscode":"64",
	 *      "gsname":"�������ѹ����","gsoldname":"gsoldname","ptzzmj":0.0,
	 *      "ptzzmjXz":0.0,"jzjstr":0.0,"ptyjstr":0.0,"xjptytr":0.0,
	 *      "gzptytr":0.0,"dljstr":0.0,"sljstr":0.0,"lhjstr":0.0,
	 *      "sbgztr":0.0,"bjdyszl":0.0,"bjdggswctzSf":0.0,"bjdyfzl":0.0,
	 *      "bjdwcflztz":0.0,"bjdyyzl":0.0,"bjdwcnyztr":0.0,"zzglrys":0,
	 *      "bjdzzlsygzrc":0,"bjdzzlsygrrgze":0.0,"bjdzzlsygzfy":0.0,
	 *      "ptjcczl":0.0,"hptjccl":0.0,"bptjccl":0.0,"bjdxsze":0.0,
	 *      "pzjxssr":0.0,"pzjxssl":0,"yzjxssl":0.0,"yzjxssr":0.0,
	 *      "jzdbjdzxcksl":0,"bjdxzzxcksl":0,"bjdzxckxsje":0.0,
	 *      "dnjdcglyrs":0,"dnlysr":0.0,"kfsr":0.0,"cysr":0.0,
	 *      "yxtr":0.0},"respCode":"0","respDesc":"��ӳɹ�"}
     * ʧ�ܣ�{"respCode":"1","respDesc":"T402���ݿ�����쳣"}
	 */
	public static void testAdd(String sessionId){
		T402AddReq req=new T402AddReq();
		req.setSessionId(sessionId);
		req.setSeason(1);
		req.setNd("2017");
		req.setGscode("64");
		req.setGsname("�������ѹ����");
		req.setGsoldname("gsoldname");
		String reqJson = gson.toJson(req);
		System.out.println("reqJson:"+reqJson);
		try {
			String resp=HttpClientUtil.postRequest(T402_ADD, reqJson);
			System.out.println("resp=====:"+resp);
			T402AddResp loginResp = gson.fromJson(resp,
					T402AddResp.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * ˵������ѯ����Ϊ���в�ѯ����sql�����andƴ�Ӳ�ѯ���������������ֵ��Ϊnull���߿��ַ��������ѯʱ����
	 * ����������
	 * ��ѯ2017��ȳɹ���{"t402s":[{"id":9,"season":1,"nd":"2017","gscode":"64","gsname":"�������ѹ����","gsoldname":"gsoldname","ptzzmj":0.0,"ptzzmjXz":0.0,"jzjstr":0.0,"ptyjstr":0.0,"xjptytr":0.0,"gzptytr":0.0,"dljstr":0.0,"sljstr":0.0,"lhjstr":0.0,"sbgztr":0.0,"bjdyszl":0.0,"bjdggswctzSf":0.0,"bjdyfzl":0.0,"bjdwcflztz":0.0,"bjdyyzl":0.0,"bjdwcnyztr":0.0,"zzglrys":0,"bjdzzlsygzrc":0,"bjdzzlsygrrgze":0.0,"bjdzzlsygzfy":0.0,"ptjcczl":0.0,"hptjccl":0.0,"bptjccl":0.0,"bjdxsze":0.0,"pzjxssr":0.0,"pzjxssl":0,"yzjxssl":0.0,"yzjxssr":0.0,"jzdbjdzxcksl":0,"bjdxzzxcksl":0,"bjdzxckxsje":0.0,"dnjdcglyrs":0,"dnlysr":0.0,"kfsr":0.0,"cysr":0.0,"yxtr":0.0},
	 *               {"id":10,"season":1,"nd":"2017","gscode":"64","gsname":"�������ѹ����","gsoldname":"gsoldname","ptzzmj":0.0,"ptzzmjXz":0.0,"jzjstr":0.0,"ptyjstr":0.0,"xjptytr":0.0,"gzptytr":0.0,"dljstr":0.0,"sljstr":0.0,"lhjstr":0.0,"sbgztr":0.0,"bjdyszl":0.0,"bjdggswctzSf":0.0,"bjdyfzl":0.0,"bjdwcflztz":0.0,"bjdyyzl":0.0,"bjdwcnyztr":0.0,"zzglrys":0,"bjdzzlsygzrc":0,"bjdzzlsygrrgze":0.0,"bjdzzlsygzfy":0.0,"ptjcczl":0.0,"hptjccl":0.0,"bptjccl":0.0,"bjdxsze":0.0,"pzjxssr":0.0,"pzjxssl":0,"yzjxssl":0.0,"yzjxssr":0.0,"jzdbjdzxcksl":0,"bjdxzzxcksl":0,"bjdzxckxsje":0.0,"dnjdcglyrs":0,"dnlysr":0.0,"kfsr":0.0,"cysr":0.0,"yxtr":0.0}],
	 *      "respCode":"0","respDesc":"success"}
	 * ��ѯ2017���,1����,64��,���˵�λ���������ѹ���֣�{"t402s":[{"id":9,"season":1,"nd":"2017","gscode":"64","gsname":"�������ѹ����","gsoldname":"gsoldname","ptzzmj":0.0,"ptzzmjXz":0.0,"jzjstr":0.0,"ptyjstr":0.0,"xjptytr":0.0,"gzptytr":0.0,"dljstr":0.0,"sljstr":0.0,"lhjstr":0.0,"sbgztr":0.0,"bjdyszl":0.0,"bjdggswctzSf":0.0,"bjdyfzl":0.0,"bjdwcflztz":0.0,"bjdyyzl":0.0,"bjdwcnyztr":0.0,"zzglrys":0,"bjdzzlsygzrc":0,"bjdzzlsygrrgze":0.0,"bjdzzlsygzfy":0.0,"ptjcczl":0.0,"hptjccl":0.0,"bptjccl":0.0,"bjdxsze":0.0,"pzjxssr":0.0,"pzjxssl":0,"yzjxssl":0.0,"yzjxssr":0.0,"jzdbjdzxcksl":0,"bjdxzzxcksl":0,"bjdzxckxsje":0.0,"dnjdcglyrs":0,"dnlysr":0.0,"kfsr":0.0,"cysr":0.0,"yxtr":0.0},{"id":10,"season":1,"nd":"2017","gscode":"64","gsname":"�������ѹ����","gsoldname":"gsoldname","ptzzmj":0.0,"ptzzmjXz":0.0,"jzjstr":0.0,"ptyjstr":0.0,"xjptytr":0.0,"gzptytr":0.0,"dljstr":0.0,"sljstr":0.0,"lhjstr":0.0,"sbgztr":0.0,"bjdyszl":0.0,"bjdggswctzSf":0.0,"bjdyfzl":0.0,"bjdwcflztz":0.0,"bjdyyzl":0.0,"bjdwcnyztr":0.0,"zzglrys":0,"bjdzzlsygzrc":0,"bjdzzlsygrrgze":0.0,"bjdzzlsygzfy":0.0,"ptjcczl":0.0,"hptjccl":0.0,"bptjccl":0.0,"bjdxsze":0.0,"pzjxssr":0.0,"pzjxssl":0,"yzjxssl":0.0,"yzjxssr":0.0,"jzdbjdzxcksl":0,"bjdxzzxcksl":0,"bjdzxckxsje":0.0,"dnjdcglyrs":0,"dnlysr":0.0,"kfsr":0.0,"cysr":0.0,"yxtr":0.0}],"respCode":"0","respDesc":"success"}
	 * ��ѯ��2017���,1����,ȫ����all:{"t402s":[{"id":9,"season":1,"nd":"2017","gscode":"64","gsname":"�������ѹ����","gsoldname":"gsoldname","ptzzmj":0.0,"ptzzmjXz":0.0,"jzjstr":0.0,"ptyjstr":0.0,"xjptytr":0.0,"gzptytr":0.0,"dljstr":0.0,"sljstr":0.0,"lhjstr":0.0,"sbgztr":0.0,"bjdyszl":0.0,"bjdggswctzSf":0.0,"bjdyfzl":0.0,"bjdwcflztz":0.0,"bjdyyzl":0.0,"bjdwcnyztr":0.0,"zzglrys":0,"bjdzzlsygzrc":0,"bjdzzlsygrrgze":0.0,"bjdzzlsygzfy":0.0,"ptjcczl":0.0,"hptjccl":0.0,"bptjccl":0.0,"bjdxsze":0.0,"pzjxssr":0.0,"pzjxssl":0,"yzjxssl":0.0,"yzjxssr":0.0,"jzdbjdzxcksl":0,"bjdxzzxcksl":0,"bjdzxckxsje":0.0,"dnjdcglyrs":0,"dnlysr":0.0,"kfsr":0.0,"cysr":0.0,"yxtr":0.0},{"id":10,"season":1,"nd":"2017","gscode":"64","gsname":"�������ѹ����","gsoldname":"gsoldname","ptzzmj":0.0,"ptzzmjXz":0.0,"jzjstr":0.0,"ptyjstr":0.0,"xjptytr":0.0,"gzptytr":0.0,"dljstr":0.0,"sljstr":0.0,"lhjstr":0.0,"sbgztr":0.0,"bjdyszl":0.0,"bjdggswctzSf":0.0,"bjdyfzl":0.0,"bjdwcflztz":0.0,"bjdyyzl":0.0,"bjdwcnyztr":0.0,"zzglrys":0,"bjdzzlsygzrc":0,"bjdzzlsygrrgze":0.0,"bjdzzlsygzfy":0.0,"ptjcczl":0.0,"hptjccl":0.0,"bptjccl":0.0,"bjdxsze":0.0,"pzjxssr":0.0,"pzjxssl":0,"yzjxssl":0.0,"yzjxssr":0.0,"jzdbjdzxcksl":0,"bjdxzzxcksl":0,"bjdzxckxsje":0.0,"dnjdcglyrs":0,"dnlysr":0.0,"kfsr":0.0,"cysr":0.0,"yxtr":0.0}],"respCode":"0","respDesc":"success"}
	 * ��ѯ��2017���,1����,���˵�λ���������ѹ����:{"t402s":[{"id":9,"season":1,"nd":"2017","gscode":"64","gsname":"�������ѹ����","gsoldname":"gsoldname","ptzzmj":0.0,"ptzzmjXz":0.0,"jzjstr":0.0,"ptyjstr":0.0,"xjptytr":0.0,"gzptytr":0.0,"dljstr":0.0,"sljstr":0.0,"lhjstr":0.0,"sbgztr":0.0,"bjdyszl":0.0,"bjdggswctzSf":0.0,"bjdyfzl":0.0,"bjdwcflztz":0.0,"bjdyyzl":0.0,"bjdwcnyztr":0.0,"zzglrys":0,"bjdzzlsygzrc":0,"bjdzzlsygrrgze":0.0,"bjdzzlsygzfy":0.0,"ptjcczl":0.0,"hptjccl":0.0,"bptjccl":0.0,"bjdxsze":0.0,"pzjxssr":0.0,"pzjxssl":0,"yzjxssl":0.0,"yzjxssr":0.0,"jzdbjdzxcksl":0,"bjdxzzxcksl":0,"bjdzxckxsje":0.0,"dnjdcglyrs":0,"dnlysr":0.0,"kfsr":0.0,"cysr":0.0,"yxtr":0.0},{"id":10,"season":1,"nd":"2017","gscode":"64","gsname":"�������ѹ����","gsoldname":"gsoldname","ptzzmj":0.0,"ptzzmjXz":0.0,"jzjstr":0.0,"ptyjstr":0.0,"xjptytr":0.0,"gzptytr":0.0,"dljstr":0.0,"sljstr":0.0,"lhjstr":0.0,"sbgztr":0.0,"bjdyszl":0.0,"bjdggswctzSf":0.0,"bjdyfzl":0.0,"bjdwcflztz":0.0,"bjdyyzl":0.0,"bjdwcnyztr":0.0,"zzglrys":0,"bjdzzlsygzrc":0,"bjdzzlsygrrgze":0.0,"bjdzzlsygzfy":0.0,"ptjcczl":0.0,"hptjccl":0.0,"bptjccl":0.0,"bjdxsze":0.0,"pzjxssr":0.0,"pzjxssl":0,"yzjxssl":0.0,"yzjxssr":0.0,"jzdbjdzxcksl":0,"bjdxzzxcksl":0,"bjdzxckxsje":0.0,"dnjdcglyrs":0,"dnlysr":0.0,"kfsr":0.0,"cysr":0.0,"yxtr":0.0}],"respCode":"0","respDesc":"success"}
	 * ��ѯʧ�ܣ�{"respCode":"1","respDesc":"ϵͳ�쳣"}
	 */
	public static void testQuery(String sessionId){
		
	/*	��ѯ2017���,1����,64��,���˵�λ���������ѹ����
	 * T402QueryReq req=new T402QueryReq();
		req.setNd("2017");
		req.setSeason(1);
		req.setGscode("64");
		req.setGsname("�������ѹ����");
		String reqJson = gson.toJson(req);
		System.out.println("reqJson:"+reqJson);
		try {
			String resp=HttpClientUtil.postRequest(t402_query, reqJson);
			System.out.println("resp=====:"+resp);
			T402QueryResp loginResp = gson.fromJson(resp,
					T402QueryResp.class);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		//2017���,1����,ȫ��
		/*T402QueryReq req=new T402QueryReq();
		req.setNd("2017");
		req.setSeason(1);
		req.setGscode("all");
		String reqJson = gson.toJson(req);
		System.out.println("reqJson:"+reqJson);
		try {
			String resp=HttpClientUtil.postRequest(t402_query, reqJson);
			System.out.println("resp=====:"+resp);
			
			T402QueryResp loginResp = gson.fromJson(resp,
					T402QueryResp.class);
			System.out.println("size=====:"+loginResp.getT402s().size());
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		
		//2017���,1����,���˵�λ���������ѹ����
		T402QueryReq req=new T402QueryReq();
		req.setNd("2017");
		req.setSeason(1);
		req.setSessionId(sessionId);
		req.setGsname("�������ѹ����");
		String reqJson = gson.toJson(req);
		System.out.println("reqJson:"+reqJson);
		try {
			String resp=HttpClientUtil.postRequest(T402_QUERY, reqJson);
			System.out.println("resp=====:"+resp);
			
			T402QueryResp loginResp = gson.fromJson(resp,
					T402QueryResp.class);
			System.out.println("size=====:"+loginResp.getT402s().size());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
