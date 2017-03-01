package com.ningxia.wine.entity;

/**
 * T202 entity. @author MyEclipse Persistence Tools
 */

public class T202 implements java.io.Serializable {

	// Fields

	private T202Id id;

	// Constructors

	/** default constructor */
	public T202() {
	}

	/** full constructor */
	public T202(T202Id id) {
		this.id = id;
	}

	// Property accessors

	public T202Id getId() {
		return this.id;
	}

	public void setId(T202Id id) {
		this.id = id;
	}

}