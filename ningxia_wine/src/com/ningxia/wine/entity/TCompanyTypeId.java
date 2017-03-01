package com.ningxia.wine.entity;

/**
 * TCompanyTypeId entity. @author MyEclipse Persistence Tools
 */

public class TCompanyTypeId implements java.io.Serializable {

	// Fields

	private Integer companyTypeCode;
	private String companyTypeName;

	// Constructors

	/** default constructor */
	public TCompanyTypeId() {
	}

	/** minimal constructor */
	public TCompanyTypeId(Integer companyTypeCode) {
		this.companyTypeCode = companyTypeCode;
	}

	/** full constructor */
	public TCompanyTypeId(Integer companyTypeCode, String companyTypeName) {
		this.companyTypeCode = companyTypeCode;
		this.companyTypeName = companyTypeName;
	}

	// Property accessors

	public Integer getCompanyTypeCode() {
		return this.companyTypeCode;
	}

	public void setCompanyTypeCode(Integer companyTypeCode) {
		this.companyTypeCode = companyTypeCode;
	}

	public String getCompanyTypeName() {
		return this.companyTypeName;
	}

	public void setCompanyTypeName(String companyTypeName) {
		this.companyTypeName = companyTypeName;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TCompanyTypeId))
			return false;
		TCompanyTypeId castOther = (TCompanyTypeId) other;

		return ((this.getCompanyTypeCode() == castOther.getCompanyTypeCode()) || (this
				.getCompanyTypeCode() != null
				&& castOther.getCompanyTypeCode() != null && this
				.getCompanyTypeCode().equals(castOther.getCompanyTypeCode())))
				&& ((this.getCompanyTypeName() == castOther
						.getCompanyTypeName()) || (this.getCompanyTypeName() != null
						&& castOther.getCompanyTypeName() != null && this
						.getCompanyTypeName().equals(
								castOther.getCompanyTypeName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCompanyTypeCode() == null ? 0 : this.getCompanyTypeCode()
						.hashCode());
		result = 37
				* result
				+ (getCompanyTypeName() == null ? 0 : this.getCompanyTypeName()
						.hashCode());
		return result;
	}

}