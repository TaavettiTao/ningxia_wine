package com.ningxia.wine.entity;

/**
 * TAdministrativeArea entity. @author MyEclipse Persistence Tools
 */

public class TAdministrativeArea implements java.io.Serializable {

	// Fields

	private TAdministrativeAreaId id;

	// Constructors

	/** default constructor */
	public TAdministrativeArea() {
	}

	/** full constructor */
	public TAdministrativeArea(TAdministrativeAreaId id) {
		this.id = id;
	}

	// Property accessors

	public TAdministrativeAreaId getId() {
		return this.id;
	}

	public void setId(TAdministrativeAreaId id) {
		this.id = id;
	}

}