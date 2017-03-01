package com.ningxia.wine.entity;

/**
 * T401 entity. @author MyEclipse Persistence Tools
 */

public class T401 implements java.io.Serializable {

	// Fields

	private T401Id id;

	// Constructors

	/** default constructor */
	public T401() {
	}

	/** full constructor */
	public T401(T401Id id) {
		this.id = id;
	}

	// Property accessors

	public T401Id getId() {
		return this.id;
	}

	public void setId(T401Id id) {
		this.id = id;
	}

}