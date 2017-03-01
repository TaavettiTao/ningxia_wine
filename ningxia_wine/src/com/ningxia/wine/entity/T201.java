package com.ningxia.wine.entity;

/**
 * T201 entity. @author MyEclipse Persistence Tools
 */

public class T201 implements java.io.Serializable {

	// Fields

	private T201Id id;

	// Constructors

	/** default constructor */
	public T201() {
	}

	/** full constructor */
	public T201(T201Id id) {
		this.id = id;
	}

	// Property accessors

	public T201Id getId() {
		return this.id;
	}

	public void setId(T201Id id) {
		this.id = id;
	}

}