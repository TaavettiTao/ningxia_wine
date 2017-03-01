package com.ningxia.wine.entity;

/**
 * T206 entity. @author MyEclipse Persistence Tools
 */

public class T206 implements java.io.Serializable {

	// Fields

	private T206Id id;

	// Constructors

	/** default constructor */
	public T206() {
	}

	/** full constructor */
	public T206(T206Id id) {
		this.id = id;
	}

	// Property accessors

	public T206Id getId() {
		return this.id;
	}

	public void setId(T206Id id) {
		this.id = id;
	}

}