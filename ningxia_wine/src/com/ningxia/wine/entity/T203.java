package com.ningxia.wine.entity;

/**
 * T203 entity. @author MyEclipse Persistence Tools
 */

public class T203 implements java.io.Serializable {

	// Fields

	private T203Id id;

	// Constructors

	/** default constructor */
	public T203() {
	}

	/** full constructor */
	public T203(T203Id id) {
		this.id = id;
	}

	// Property accessors

	public T203Id getId() {
		return this.id;
	}

	public void setId(T203Id id) {
		this.id = id;
	}

}