package com.ningxia.wine.entity;

/**
 * TSummary104WzId entity. @author MyEclipse Persistence Tools
 */

public class TSummary104WzId implements java.io.Serializable {

	// Fields

	private Integer productionId;
	private String targetName;
	private String units;
	private String code;
	private Double wuzhong;
	private Double hongsipu;
	private Double litong;
	private Double yanchi;
	private Double tongxin;
	private Double qingtongxia;

	// Constructors

	/** default constructor */
	public TSummary104WzId() {
	}

	/** minimal constructor */
	public TSummary104WzId(Integer productionId, String targetName, String code) {
		this.productionId = productionId;
		this.targetName = targetName;
		this.code = code;
	}

	/** full constructor */
	public TSummary104WzId(Integer productionId, String targetName,
			String units, String code, Double wuzhong, Double hongsipu,
			Double litong, Double yanchi, Double tongxin, Double qingtongxia) {
		this.productionId = productionId;
		this.targetName = targetName;
		this.units = units;
		this.code = code;
		this.wuzhong = wuzhong;
		this.hongsipu = hongsipu;
		this.litong = litong;
		this.yanchi = yanchi;
		this.tongxin = tongxin;
		this.qingtongxia = qingtongxia;
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

	public Double getWuzhong() {
		return this.wuzhong;
	}

	public void setWuzhong(Double wuzhong) {
		this.wuzhong = wuzhong;
	}

	public Double getHongsipu() {
		return this.hongsipu;
	}

	public void setHongsipu(Double hongsipu) {
		this.hongsipu = hongsipu;
	}

	public Double getLitong() {
		return this.litong;
	}

	public void setLitong(Double litong) {
		this.litong = litong;
	}

	public Double getYanchi() {
		return this.yanchi;
	}

	public void setYanchi(Double yanchi) {
		this.yanchi = yanchi;
	}

	public Double getTongxin() {
		return this.tongxin;
	}

	public void setTongxin(Double tongxin) {
		this.tongxin = tongxin;
	}

	public Double getQingtongxia() {
		return this.qingtongxia;
	}

	public void setQingtongxia(Double qingtongxia) {
		this.qingtongxia = qingtongxia;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TSummary104WzId))
			return false;
		TSummary104WzId castOther = (TSummary104WzId) other;

		return ((this.getProductionId() == castOther.getProductionId()) || (this
				.getProductionId() != null
				&& castOther.getProductionId() != null && this
				.getProductionId().equals(castOther.getProductionId())))
				&& ((this.getTargetName() == castOther.getTargetName()) || (this
						.getTargetName() != null
						&& castOther.getTargetName() != null && this
						.getTargetName().equals(castOther.getTargetName())))
				&& ((this.getUnits() == castOther.getUnits()) || (this
						.getUnits() != null && castOther.getUnits() != null && this
						.getUnits().equals(castOther.getUnits())))
				&& ((this.getCode() == castOther.getCode()) || (this.getCode() != null
						&& castOther.getCode() != null && this.getCode()
						.equals(castOther.getCode())))
				&& ((this.getWuzhong() == castOther.getWuzhong()) || (this
						.getWuzhong() != null && castOther.getWuzhong() != null && this
						.getWuzhong().equals(castOther.getWuzhong())))
				&& ((this.getHongsipu() == castOther.getHongsipu()) || (this
						.getHongsipu() != null
						&& castOther.getHongsipu() != null && this
						.getHongsipu().equals(castOther.getHongsipu())))
				&& ((this.getLitong() == castOther.getLitong()) || (this
						.getLitong() != null && castOther.getLitong() != null && this
						.getLitong().equals(castOther.getLitong())))
				&& ((this.getYanchi() == castOther.getYanchi()) || (this
						.getYanchi() != null && castOther.getYanchi() != null && this
						.getYanchi().equals(castOther.getYanchi())))
				&& ((this.getTongxin() == castOther.getTongxin()) || (this
						.getTongxin() != null && castOther.getTongxin() != null && this
						.getTongxin().equals(castOther.getTongxin())))
				&& ((this.getQingtongxia() == castOther.getQingtongxia()) || (this
						.getQingtongxia() != null
						&& castOther.getQingtongxia() != null && this
						.getQingtongxia().equals(castOther.getQingtongxia())));
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
				+ (getUnits() == null ? 0 : this.getUnits().hashCode());
		result = 37 * result
				+ (getCode() == null ? 0 : this.getCode().hashCode());
		result = 37 * result
				+ (getWuzhong() == null ? 0 : this.getWuzhong().hashCode());
		result = 37 * result
				+ (getHongsipu() == null ? 0 : this.getHongsipu().hashCode());
		result = 37 * result
				+ (getLitong() == null ? 0 : this.getLitong().hashCode());
		result = 37 * result
				+ (getYanchi() == null ? 0 : this.getYanchi().hashCode());
		result = 37 * result
				+ (getTongxin() == null ? 0 : this.getTongxin().hashCode());
		result = 37
				* result
				+ (getQingtongxia() == null ? 0 : this.getQingtongxia()
						.hashCode());
		return result;
	}

}