package com.ningxia.wine.entity;

/**
 * TRole entity. @author MyEclipse Persistence Tools
 */

public class TRole implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String bz;

	// Constructors

	/** default constructor */
	public TRole() {
	}

	/** full constructor */
	public TRole(String name, String bz) {
		this.name = name;
		this.bz = bz;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBz() {
		return this.bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

}