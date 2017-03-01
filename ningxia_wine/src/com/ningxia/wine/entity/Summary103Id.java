package com.ningxia.wine.entity;

/**
 * Summary103Id entity. @author MyEclipse Persistence Tools
 */

public class Summary103Id implements java.io.Serializable {

	// Fields

	private Integer productionId;
	private String targetName;
	private String units;
	private String code;
	private Double region;
	private Double yinchuan;
	private Double wuzhong;
	private Double shizuishan;
	private Double zhongwei;
	private Double nongken;

	// Constructors

	/** default constructor */
	public Summary103Id() {
	}

	/** minimal constructor */
	public Summary103Id(Integer productionId, String targetName, String code) {
		this.productionId = productionId;
		this.targetName = targetName;
		this.code = code;
	}

	/** full constructor */
	public Summary103Id(Integer productionId, String targetName, String units,
			String code, Double region, Double yinchuan, Double wuzhong,
			Double shizuishan, Double zhongwei, Double nongken) {
		this.productionId = productionId;
		this.targetName = targetName;
		this.units = units;
		this.code = code;
		this.region = region;
		this.yinchuan = yinchuan;
		this.wuzhong = wuzhong;
		this.shizuishan = shizuishan;
		this.zhongwei = zhongwei;
		this.nongken = nongken;
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

	public Double getRegion() {
		return this.region;
	}

	public void setRegion(Double region) {
		this.region = region;
	}

	public Double getYinchuan() {
		return this.yinchuan;
	}

	public void setYinchuan(Double yinchuan) {
		this.yinchuan = yinchuan;
	}

	public Double getWuzhong() {
		return this.wuzhong;
	}

	public void setWuzhong(Double wuzhong) {
		this.wuzhong = wuzhong;
	}

	public Double getShizuishan() {
		return this.shizuishan;
	}

	public void setShizuishan(Double shizuishan) {
		this.shizuishan = shizuishan;
	}

	public Double getZhongwei() {
		return this.zhongwei;
	}

	public void setZhongwei(Double zhongwei) {
		this.zhongwei = zhongwei;
	}

	public Double getNongken() {
		return this.nongken;
	}

	public void setNongken(Double nongken) {
		this.nongken = nongken;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Summary103Id))
			return false;
		Summary103Id castOther = (Summary103Id) other;

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
				&& ((this.getRegion() == castOther.getRegion()) || (this
						.getRegion() != null && castOther.getRegion() != null && this
						.getRegion().equals(castOther.getRegion())))
				&& ((this.getYinchuan() == castOther.getYinchuan()) || (this
						.getYinchuan() != null
						&& castOther.getYinchuan() != null && this
						.getYinchuan().equals(castOther.getYinchuan())))
				&& ((this.getWuzhong() == castOther.getWuzhong()) || (this
						.getWuzhong() != null && castOther.getWuzhong() != null && this
						.getWuzhong().equals(castOther.getWuzhong())))
				&& ((this.getShizuishan() == castOther.getShizuishan()) || (this
						.getShizuishan() != null
						&& castOther.getShizuishan() != null && this
						.getShizuishan().equals(castOther.getShizuishan())))
				&& ((this.getZhongwei() == castOther.getZhongwei()) || (this
						.getZhongwei() != null
						&& castOther.getZhongwei() != null && this
						.getZhongwei().equals(castOther.getZhongwei())))
				&& ((this.getNongken() == castOther.getNongken()) || (this
						.getNongken() != null && castOther.getNongken() != null && this
						.getNongken().equals(castOther.getNongken())));
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
				+ (getRegion() == null ? 0 : this.getRegion().hashCode());
		result = 37 * result
				+ (getYinchuan() == null ? 0 : this.getYinchuan().hashCode());
		result = 37 * result
				+ (getWuzhong() == null ? 0 : this.getWuzhong().hashCode());
		result = 37
				* result
				+ (getShizuishan() == null ? 0 : this.getShizuishan()
						.hashCode());
		result = 37 * result
				+ (getZhongwei() == null ? 0 : this.getZhongwei().hashCode());
		result = 37 * result
				+ (getNongken() == null ? 0 : this.getNongken().hashCode());
		return result;
	}

}