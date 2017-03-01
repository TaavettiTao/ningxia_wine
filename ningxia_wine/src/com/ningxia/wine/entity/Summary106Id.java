package com.ningxia.wine.entity;

/**
 * Summary106Id entity. @author MyEclipse Persistence Tools
 */

public class Summary106Id implements java.io.Serializable {

	// Fields

	private Integer productionId;
	private String sellSituation;
	private String units;
	private String code;
	private Double number;
	private Double amount;

	// Constructors

	/** default constructor */
	public Summary106Id() {
	}

	/** minimal constructor */
	public Summary106Id(Integer productionId) {
		this.productionId = productionId;
	}

	/** full constructor */
	public Summary106Id(Integer productionId, String sellSituation,
			String units, String code, Double number, Double amount) {
		this.productionId = productionId;
		this.sellSituation = sellSituation;
		this.units = units;
		this.code = code;
		this.number = number;
		this.amount = amount;
	}

	// Property accessors

	public Integer getProductionId() {
		return this.productionId;
	}

	public void setProductionId(Integer productionId) {
		this.productionId = productionId;
	}

	public String getSellSituation() {
		return this.sellSituation;
	}

	public void setSellSituation(String sellSituation) {
		this.sellSituation = sellSituation;
	}

	public String getUnits() {
		return this.units;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Double getNumber() {
		return this.number;
	}

	public void setNumber(Double number) {
		this.number = number;
	}

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Summary106Id))
			return false;
		Summary106Id castOther = (Summary106Id) other;

		return ((this.getProductionId() == castOther.getProductionId()) || (this
				.getProductionId() != null
				&& castOther.getProductionId() != null && this
				.getProductionId().equals(castOther.getProductionId())))
				&& ((this.getSellSituation() == castOther.getSellSituation()) || (this
						.getSellSituation() != null
						&& castOther.getSellSituation() != null && this
						.getSellSituation()
						.equals(castOther.getSellSituation())))
				&& ((this.getUnits() == castOther.getUnits()) || (this
						.getUnits() != null && castOther.getUnits() != null && this
						.getUnits().equals(castOther.getUnits())))
				&& ((this.getCode() == castOther.getCode()) || (this.getCode() != null
						&& castOther.getCode() != null && this.getCode()
						.equals(castOther.getCode())))
				&& ((this.getNumber() == castOther.getNumber()) || (this
						.getNumber() != null && castOther.getNumber() != null && this
						.getNumber().equals(castOther.getNumber())))
				&& ((this.getAmount() == castOther.getAmount()) || (this
						.getAmount() != null && castOther.getAmount() != null && this
						.getAmount().equals(castOther.getAmount())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getProductionId() == null ? 0 : this.getProductionId()
						.hashCode());
		result = 37
				* result
				+ (getSellSituation() == null ? 0 : this.getSellSituation()
						.hashCode());
		result = 37 * result
				+ (getUnits() == null ? 0 : this.getUnits().hashCode());
		result = 37 * result
				+ (getCode() == null ? 0 : this.getCode().hashCode());
		result = 37 * result
				+ (getNumber() == null ? 0 : this.getNumber().hashCode());
		result = 37 * result
				+ (getAmount() == null ? 0 : this.getAmount().hashCode());
		return result;
	}

}