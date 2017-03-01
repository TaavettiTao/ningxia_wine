package com.ningxia.wine.entity;

/**
 * TSummary104YcId entity. @author MyEclipse Persistence Tools
 */

public class TSummary104YcId implements java.io.Serializable {

	// Fields

	private Integer productionId;
	private String targetName;
	private String units;
	private String code;
	private Double yinchuan;
	private Double xingqingqu;
	private Double xixiaqu;
	private Double jinfengqu;
	private Double yongningxian;
	private Double helanxian;
	private Double lingwushi;

	// Constructors

	/** default constructor */
	public TSummary104YcId() {
	}

	/** minimal constructor */
	public TSummary104YcId(Integer productionId, String targetName, String code) {
		this.productionId = productionId;
		this.targetName = targetName;
		this.code = code;
	}

	/** full constructor */
	public TSummary104YcId(Integer productionId, String targetName,
			String units, String code, Double yinchuan, Double xingqingqu,
			Double xixiaqu, Double jinfengqu, Double yongningxian,
			Double helanxian, Double lingwushi) {
		this.productionId = productionId;
		this.targetName = targetName;
		this.units = units;
		this.code = code;
		this.yinchuan = yinchuan;
		this.xingqingqu = xingqingqu;
		this.xixiaqu = xixiaqu;
		this.jinfengqu = jinfengqu;
		this.yongningxian = yongningxian;
		this.helanxian = helanxian;
		this.lingwushi = lingwushi;
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

	public Double getYinchuan() {
		return this.yinchuan;
	}

	public void setYinchuan(Double yinchuan) {
		this.yinchuan = yinchuan;
	}

	public Double getXingqingqu() {
		return this.xingqingqu;
	}

	public void setXingqingqu(Double xingqingqu) {
		this.xingqingqu = xingqingqu;
	}

	public Double getXixiaqu() {
		return this.xixiaqu;
	}

	public void setXixiaqu(Double xixiaqu) {
		this.xixiaqu = xixiaqu;
	}

	public Double getJinfengqu() {
		return this.jinfengqu;
	}

	public void setJinfengqu(Double jinfengqu) {
		this.jinfengqu = jinfengqu;
	}

	public Double getYongningxian() {
		return this.yongningxian;
	}

	public void setYongningxian(Double yongningxian) {
		this.yongningxian = yongningxian;
	}

	public Double getHelanxian() {
		return this.helanxian;
	}

	public void setHelanxian(Double helanxian) {
		this.helanxian = helanxian;
	}

	public Double getLingwushi() {
		return this.lingwushi;
	}

	public void setLingwushi(Double lingwushi) {
		this.lingwushi = lingwushi;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TSummary104YcId))
			return false;
		TSummary104YcId castOther = (TSummary104YcId) other;

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
				&& ((this.getYinchuan() == castOther.getYinchuan()) || (this
						.getYinchuan() != null
						&& castOther.getYinchuan() != null && this
						.getYinchuan().equals(castOther.getYinchuan())))
				&& ((this.getXingqingqu() == castOther.getXingqingqu()) || (this
						.getXingqingqu() != null
						&& castOther.getXingqingqu() != null && this
						.getXingqingqu().equals(castOther.getXingqingqu())))
				&& ((this.getXixiaqu() == castOther.getXixiaqu()) || (this
						.getXixiaqu() != null && castOther.getXixiaqu() != null && this
						.getXixiaqu().equals(castOther.getXixiaqu())))
				&& ((this.getJinfengqu() == castOther.getJinfengqu()) || (this
						.getJinfengqu() != null
						&& castOther.getJinfengqu() != null && this
						.getJinfengqu().equals(castOther.getJinfengqu())))
				&& ((this.getYongningxian() == castOther.getYongningxian()) || (this
						.getYongningxian() != null
						&& castOther.getYongningxian() != null && this
						.getYongningxian().equals(castOther.getYongningxian())))
				&& ((this.getHelanxian() == castOther.getHelanxian()) || (this
						.getHelanxian() != null
						&& castOther.getHelanxian() != null && this
						.getHelanxian().equals(castOther.getHelanxian())))
				&& ((this.getLingwushi() == castOther.getLingwushi()) || (this
						.getLingwushi() != null
						&& castOther.getLingwushi() != null && this
						.getLingwushi().equals(castOther.getLingwushi())));
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
				+ (getYinchuan() == null ? 0 : this.getYinchuan().hashCode());
		result = 37
				* result
				+ (getXingqingqu() == null ? 0 : this.getXingqingqu()
						.hashCode());
		result = 37 * result
				+ (getXixiaqu() == null ? 0 : this.getXixiaqu().hashCode());
		result = 37 * result
				+ (getJinfengqu() == null ? 0 : this.getJinfengqu().hashCode());
		result = 37
				* result
				+ (getYongningxian() == null ? 0 : this.getYongningxian()
						.hashCode());
		result = 37 * result
				+ (getHelanxian() == null ? 0 : this.getHelanxian().hashCode());
		result = 37 * result
				+ (getLingwushi() == null ? 0 : this.getLingwushi().hashCode());
		return result;
	}

}