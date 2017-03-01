package com.ningxia.wine.enums;
/**
 * 
 * @author taoww
 * 接口响应状态枚举类
 *
 */
public enum InterFaceStatusEnum {
	Success("0","success"),
	SystemError("1","系统异常"),
	DataBaseError("2","数据库异常"),
	UsernameOrPassordError("3","用户名或密码错误"),
	UserNotExist("4","当前用户不存在"),
	UserIdentityAccessError("5","用户令牌无效或登录超时"),
	T402AddError("6","添加失败"),
	UserAlreadyLogin("7","用户已登录，无需重复登录"),
	SessionIdNoEmpty("8","用户令牌不能为空");
	
	
	private String code;
	private String desc;
	
	private InterFaceStatusEnum(String code,String desc){
		this.code=code;
		this.desc=desc;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDesc() {
		return desc;
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	/**
	 * 鏍规嵁code鑾峰彇瀵瑰簲鐨勬灇涓剧被
	 * @param code
	 * @return
	 */
	public InterFaceStatusEnum getOrderStatusEnum(String code){
		for(InterFaceStatusEnum item:InterFaceStatusEnum.values()){
			if(item.getCode().equals(code)){
				return item;
			}
		}
		return null;
	}
	
	/**
	 * 鏍规嵁code鑾峰彇瀵瑰簲鐨勫悕绉?
	 * @param code
	 * @return
	 */
	public String getEnumName(String code){
		for(InterFaceStatusEnum item:InterFaceStatusEnum.values()){
			if(item.getCode().equals(code)){
				return item.desc;
			}
		}
		return "";
	}
}
