package com.ningxia.wine.entity;

/**
 * T20601 entity. @author MyEclipse Persistence Tools
 */

public class T20601 implements java.io.Serializable {

	// Fields

	private T20601Id id;

	// Constructors

	/** default constructor */
	public T20601() {
	}

	/** full constructor */
	public T20601(T20601Id id) {
		this.id = id;
	}

	// Property accessors

	public T20601Id getId() {
		return this.id;
	}

	public void setId(T20601Id id) {
		this.id = id;
	}

}