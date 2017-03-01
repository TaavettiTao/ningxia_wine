package com.ningxia.wine.entity;

/**
 * TGsinfo entity. @author MyEclipse Persistence Tools
 */

public class TGsinfo implements java.io.Serializable {

	// Fields

	private TGsinfoId id;

	// Constructors

	/** default constructor */
	public TGsinfo() {
	}

	/** full constructor */
	public TGsinfo(TGsinfoId id) {
		this.id = id;
	}

	// Property accessors

	public TGsinfoId getId() {
		return this.id;
	}

	public void setId(TGsinfoId id) {
		this.id = id;
	}

}