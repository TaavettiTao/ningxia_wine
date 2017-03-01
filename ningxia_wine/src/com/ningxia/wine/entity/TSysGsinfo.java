package com.ningxia.wine.entity;

/**
 * TSysGsinfo entity. @author MyEclipse Persistence Tools
 */

public class TSysGsinfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private String gscode;
	private String gsname;
	private String password;
	private String bz;

	// Constructors

	/** default constructor */
	public TSysGsinfo() {
	}

	/** full constructor */
	public TSysGsinfo(String gscode, String gsname, String password, String bz) {
		this.gscode = gscode;
		this.gsname = gsname;
		this.password = password;
		this.bz = bz;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBz() {
		return this.bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

}