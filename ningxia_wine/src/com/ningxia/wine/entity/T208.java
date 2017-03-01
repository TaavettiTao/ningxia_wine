package com.ningxia.wine.entity;

/**
 * T208 entity. @author MyEclipse Persistence Tools
 */

public class T208 implements java.io.Serializable {

	// Fields

	private Integer id;
	private String nd;
	private String gscode;
	private String gsname;
	private String gsoldname;
	private String cyxhmc;
	private String cltime;
	private String bgdd;
	private String bgsl;
	private String fzrdh;
	private String hzxm;
	private String hzdh;
	private String mszxm;
	private String mszdh;

	// Constructors

	/** default constructor */
	public T208() {
	}

	/** full constructor */
	public T208(String nd, String gscode, String gsname, String gsoldname,
			String cyxhmc, String cltime, String bgdd, String bgsl,
			String fzrdh, String hzxm, String hzdh, String mszxm, String mszdh) {
		this.nd = nd;
		this.gscode = gscode;
		this.gsname = gsname;
		this.gsoldname = gsoldname;
		this.cyxhmc = cyxhmc;
		this.cltime = cltime;
		this.bgdd = bgdd;
		this.bgsl = bgsl;
		this.fzrdh = fzrdh;
		this.hzxm = hzxm;
		this.hzdh = hzdh;
		this.mszxm = mszxm;
		this.mszdh = mszdh;
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

	public String getGsname() {
		return this.gsname;
	}

	public void setGsname(String gsname) {
		this.gsname = gsname;
	}

	public String getGsoldname() {
		return this.gsoldname;
	}

	public void setGsoldname(String gsoldname) {
		this.gsoldname = gsoldname;
	}

	public String getCyxhmc() {
		return this.cyxhmc;
	}

	public void setCyxhmc(String cyxhmc) {
		this.cyxhmc = cyxhmc;
	}

	public String getCltime() {
		return this.cltime;
	}

	public void setCltime(String cltime) {
		this.cltime = cltime;
	}

	public String getBgdd() {
		return this.bgdd;
	}

	public void setBgdd(String bgdd) {
		this.bgdd = bgdd;
	}

	public String getBgsl() {
		return this.bgsl;
	}

	public void setBgsl(String bgsl) {
		this.bgsl = bgsl;
	}

	public String getFzrdh() {
		return this.fzrdh;
	}

	public void setFzrdh(String fzrdh) {
		this.fzrdh = fzrdh;
	}

	public String getHzxm() {
		return this.hzxm;
	}

	public void setHzxm(String hzxm) {
		this.hzxm = hzxm;
	}

	public String getHzdh() {
		return this.hzdh;
	}

	public void setHzdh(String hzdh) {
		this.hzdh = hzdh;
	}

	public String getMszxm() {
		return this.mszxm;
	}

	public void setMszxm(String mszxm) {
		this.mszxm = mszxm;
	}

	public String getMszdh() {
		return this.mszdh;
	}

	public void setMszdh(String mszdh) {
		this.mszdh = mszdh;
	}

}