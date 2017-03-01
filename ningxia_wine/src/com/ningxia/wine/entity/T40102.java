package com.ningxia.wine.entity;

/**
 * T40102 entity. @author MyEclipse Persistence Tools
 */

public class T40102 implements java.io.Serializable {

	// Fields

	private Integer id;
	private String nd;
	private String gscode;
	private String cplsCode;
	private String cplsName;
	private String cpName;
	private String tjnd;
	private Integer pzSl;
	private Double gzSl;
	private String bz;

	// Constructors

	/** default constructor */
	public T40102() {
	}

	/** full constructor */
	public T40102(String nd, String gscode, String cplsCode, String cplsName,
			String cpName, String tjnd, Integer pzSl, Double gzSl, String bz) {
		this.nd = nd;
		this.gscode = gscode;
		this.cplsCode = cplsCode;
		this.cplsName = cplsName;
		this.cpName = cpName;
		this.tjnd = tjnd;
		this.pzSl = pzSl;
		this.gzSl = gzSl;
		this.bz = bz;
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

	public String getCplsCode() {
		return this.cplsCode;
	}

	public void setCplsCode(String cplsCode) {
		this.cplsCode = cplsCode;
	}

	public String getCplsName() {
		return this.cplsName;
	}

	public void setCplsName(String cplsName) {
		this.cplsName = cplsName;
	}

	public String getCpName() {
		return this.cpName;
	}

	public void setCpName(String cpName) {
		this.cpName = cpName;
	}

	public String getTjnd() {
		return this.tjnd;
	}

	public void setTjnd(String tjnd) {
		this.tjnd = tjnd;
	}

	public Integer getPzSl() {
		return this.pzSl;
	}

	public void setPzSl(Integer pzSl) {
		this.pzSl = pzSl;
	}

	public Double getGzSl() {
		return this.gzSl;
	}

	public void setGzSl(Double gzSl) {
		this.gzSl = gzSl;
	}

	public String getBz() {
		return this.bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

}