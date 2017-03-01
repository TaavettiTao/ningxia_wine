package com.ningxia.wine.entity;

/**
 * TPtpz entity. @author MyEclipse Persistence Tools
 */

public class TPtpz implements java.io.Serializable {

	// Fields

	private TPtpzId id;

	// Constructors

	/** default constructor */
	public TPtpz() {
	}

	/** full constructor */
	public TPtpz(TPtpzId id) {
		this.id = id;
	}

	// Property accessors

	public TPtpzId getId() {
		return this.id;
	}

	public void setId(TPtpzId id) {
		this.id = id;
	}

}