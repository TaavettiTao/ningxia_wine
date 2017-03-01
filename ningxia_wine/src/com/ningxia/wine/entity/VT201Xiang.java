package com.ningxia.wine.entity;

/**
 * VT201Xiang entity. @author MyEclipse Persistence Tools
 */

public class VT201Xiang implements java.io.Serializable {

	// Fields

	private VT201XiangId id;

	// Constructors

	/** default constructor */
	public VT201Xiang() {
	}

	/** full constructor */
	public VT201Xiang(VT201XiangId id) {
		this.id = id;
	}

	// Property accessors

	public VT201XiangId getId() {
		return this.id;
	}

	public void setId(VT201XiangId id) {
		this.id = id;
	}

}