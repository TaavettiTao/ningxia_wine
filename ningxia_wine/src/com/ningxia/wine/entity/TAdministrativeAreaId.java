package com.ningxia.wine.entity;

/**
 * TAdministrativeAreaId entity. @author MyEclipse Persistence Tools
 */

public class TAdministrativeAreaId implements java.io.Serializable {

	// Fields

	private String areaCode;
	private String areaName;

	// Constructors

	/** default constructor */
	public TAdministrativeAreaId() {
	}

	/** minimal constructor */
	public TAdministrativeAreaId(String areaCode) {
		this.areaCode = areaCode;
	}

	/** full constructor */
	public TAdministrativeAreaId(String areaCode, String areaName) {
		this.areaCode = areaCode;
		this.areaName = areaName;
	}

	// Property accessors

	public String getAreaCode() {
		return this.areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getAreaName() {
		return this.areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TAdministrativeAreaId))
			return false;
		TAdministrativeAreaId castOther = (TAdministrativeAreaId) other;

		return ((this.getAreaCode() == castOther.getAreaCode()) || (this
				.getAreaCode() != null && castOther.getAreaCode() != null && this
				.getAreaCode().equals(castOther.getAreaCode())))
				&& ((this.getAreaName() == castOther.getAreaName()) || (this
						.getAreaName() != null
						&& castOther.getAreaName() != null && this
						.getAreaName().equals(castOther.getAreaName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getAreaCode() == null ? 0 : this.getAreaCode().hashCode());
		result = 37 * result
				+ (getAreaName() == null ? 0 : this.getAreaName().hashCode());
		return result;
	}

}