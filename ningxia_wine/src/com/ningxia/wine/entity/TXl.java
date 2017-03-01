package com.ningxia.wine.entity;

/**
 * TXl entity. @author MyEclipse Persistence Tools
 */

public class TXl implements java.io.Serializable {

	// Fields

	private TXlId id;

	// Constructors

	/** default constructor */
	public TXl() {
	}

	/** full constructor */
	public TXl(TXlId id) {
		this.id = id;
	}

	// Property accessors

	public TXlId getId() {
		return this.id;
	}

	public void setId(TXlId id) {
		this.id = id;
	}

}