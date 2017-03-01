package com.ningxia.wine.entity;

/**
 * VT201Xian entity. @author MyEclipse Persistence Tools
 */

public class VT201Xian implements java.io.Serializable {

	// Fields

	private VT201XianId id;

	// Constructors

	/** default constructor */
	public VT201Xian() {
	}

	/** full constructor */
	public VT201Xian(VT201XianId id) {
		this.id = id;
	}

	// Property accessors

	public VT201XianId getId() {
		return this.id;
	}

	public void setId(VT201XianId id) {
		this.id = id;
	}

}