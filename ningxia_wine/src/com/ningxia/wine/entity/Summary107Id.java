package com.ningxia.wine.entity;

/**
 * Summary107Id entity. @author MyEclipse Persistence Tools
 */

public class Summary107Id implements java.io.Serializable {

	// Fields

	private Integer productionId;
	private String targetName;
	private String uint;

	// Constructors

	/** default constructor */
	public Summary107Id() {
	}

	/** minimal constructor */
	public Summary107Id(Integer productionId, String targetName) {
		this.productionId = productionId;
		this.targetName = targetName;
	}

	/** full constructor */
	public Summary107Id(Integer productionId, String targetName, String uint) {
		this.productionId = productionId;
		this.targetName = targetName;
		this.uint = uint;
	}

	// Property accessors

	public Integer getProductionId() {
		return this.productionId;
	}

	public void setProductionId(Integer productionId) {
		this.productionId = productionId;
	}

	public String getTargetName() {
		return this.targetName;
	}

	public void setTargetName(String targetName) {
		this.targetName = targetName;
	}

	public String getUint() {
		return this.uint;
	}

	public void setUint(String uint) {
		this.uint = uint;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Summary107Id))
			return false;
		Summary107Id castOther = (Summary107Id) other;

		return ((this.getProductionId() == castOther.getProductionId()) || (this
				.getProductionId() != null
				&& castOther.getProductionId() != null && this
				.getProductionId().equals(castOther.getProductionId())))
				&& ((this.getTargetName() == castOther.getTargetName()) || (this
						.getTargetName() != null
						&& castOther.getTargetName() != null && this
						.getTargetName().equals(castOther.getTargetName())))
				&& ((this.getUint() == castOther.getUint()) || (this.getUint() != null
						&& castOther.getUint() != null && this.getUint()
						.equals(castOther.getUint())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getProductionId() == null ? 0 : this.getProductionId()
						.hashCode());
		result = 37
				* result
				+ (getTargetName() == null ? 0 : this.getTargetName()
						.hashCode());
		result = 37 * result
				+ (getUint() == null ? 0 : this.getUint().hashCode());
		return result;
	}

}