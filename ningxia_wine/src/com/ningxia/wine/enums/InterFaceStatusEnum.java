package com.ningxia.wine.enums;
/**
 * 
 * @author taoww
 * �ӿ���Ӧ״̬ö����
 *
 */
public enum InterFaceStatusEnum {
	Success("0","success"),
	SystemError("1","ϵͳ�쳣"),
	DataBaseError("2","���ݿ��쳣"),
	UsernameOrPassordError("3","�û������������"),
	UserNotExist("4","��ǰ�û�������"),
	UserIdentityAccessError("5","�û�������Ч���¼��ʱ"),
	T402AddError("6","���ʧ��"),
	UserAlreadyLogin("7","�û��ѵ�¼�������ظ���¼"),
	SessionIdNoEmpty("8","�û����Ʋ���Ϊ��");
	
	
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
	 * 根据code获取对应的枚举类
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
	 * 根据code获取对应的名�?
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
