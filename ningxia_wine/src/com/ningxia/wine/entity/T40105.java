package com.ningxia.wine.entity;

/**
 * T40105 entity. @author MyEclipse Persistence Tools
 */

public class T40105 implements java.io.Serializable {

	// Fields

	private Integer id;
	private String nd;
	private String gscode;
	private String code;
	private String cityType;
	private Integer number;
	private String privince;
	private String city;
	private String remarks;

	// Constructors

	/** default constructor */
	public T40105() {
	}

	/** full constructor */
	public T40105(String nd, String gscode, String code, String cityType,
			Integer number, String privince, String city, String remarks) {
		this.nd = nd;
		this.gscode = gscode;
		this.code = code;
		this.cityType = cityType;
		this.number = number;
		this.privince = privince;
		this.city = city;
		this.remarks = remarks;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNd() {
		return this.nd;
	}

	public void setNd(String nd) {
		this.nd = nd;
	}

	public String getGscode() {
		return this.gscode;
	}

	public void setGscode(String gscode) {
		this.gscode = gscode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCityType() {
		return this.cityType;
	}

	public void setCityType(String cityType) {
		this.cityType = cityType;
	}

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getPrivince() {
		return this.privince;
	}

	public void setPrivince(String privince) {
		this.privince = privince;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}