package com.ningxia.wine.entity;

/**
 * TNxxzqhId entity. @author MyEclipse Persistence Tools
 */

public class TNxxzqhId implements java.io.Serializable {

	// Fields

	private String code;
	private String name;

	// Constructors

	/** default constructor */
	public TNxxzqhId() {
	}

	/** minimal constructor */
	public TNxxzqhId(String code) {
		this.code = code;
	}

	/** full constructor */
	public TNxxzqhId(String code, String name) {
		this.code = code;
		this.name = name;
	}

	// Property accessors

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TNxxzqhId))
			return false;
		TNxxzqhId castOther = (TNxxzqhId) other;

		return ((this.getCode() == castOther.getCode()) || (this.getCode() != null
				&& castOther.getCode() != null && this.getCode().equals(
				castOther.getCode())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null
						&& castOther.getName() != null && this.getName()
						.equals(castOther.getName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCode() == null ? 0 : this.getCode().hashCode());
		result = 37 * result
				+ (getName() == null ? 0 : this.getName().hashCode());
		return result;
	}

}