package com.ningxia.wine.entity;

/**
 * TMenu entity. @author MyEclipse Persistence Tools
 */

public class TMenu implements java.io.Serializable {

	// Fields

	private TMenuId id;

	// Constructors

	/** default constructor */
	public TMenu() {
	}

	/** full constructor */
	public TMenu(TMenuId id) {
		this.id = id;
	}

	// Property accessors

	public TMenuId getId() {
		return this.id;
	}

	public void setId(TMenuId id) {
		this.id = id;
	}

}