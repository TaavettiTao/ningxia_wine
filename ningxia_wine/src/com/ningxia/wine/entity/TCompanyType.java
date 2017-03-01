package com.ningxia.wine.entity;

/**
 * TCompanyType entity. @author MyEclipse Persistence Tools
 */

public class TCompanyType implements java.io.Serializable {

	// Fields

	private TCompanyTypeId id;

	// Constructors

	/** default constructor */
	public TCompanyType() {
	}

	/** full constructor */
	public TCompanyType(TCompanyTypeId id) {
		this.id = id;
	}

	// Property accessors

	public TCompanyTypeId getId() {
		return this.id;
	}

	public void setId(TCompanyTypeId id) {
		this.id = id;
	}

}