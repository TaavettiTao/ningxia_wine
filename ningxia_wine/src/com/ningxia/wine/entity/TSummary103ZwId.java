package com.ningxia.wine.entity;

/**
 * TSummary103ZwId entity. @author MyEclipse Persistence Tools
 */

public class TSummary103ZwId implements java.io.Serializable {

	// Fields

	private Integer productionId;
	private String targetName;
	private String units;
	private String code;
	private Double zhongwei;
	private Double shapotouqu;
	private Double zhongningqu;
	private Double haiyuanxian;

	// Constructors

	/** default constructor */
	public TSummary103ZwId() {
	}

	/** minimal constructor */
	public TSummary103ZwId(Integer productionId, String targetName, String code) {
		this.productionId = productionId;
		this.targetName = targetName;
		this.code = code;
	}

	/** full constructor */
	public TSummary103ZwId(Integer productionId, String targetName,
			String units, String code, Double zhongwei, Double shapotouqu,
			Double zhongningqu, Double haiyuanxian) {
		this.productionId = productionId;
		this.targetName = targetName;
		this.units = units;
		this.code = code;
		this.zhongwei = zhongwei;
		this.shapotouqu = shapotouqu;
		this.zhongningqu = zhongningqu;
		this.haiyuanxian = haiyuanxian;
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

	public Double getZhongwei() {
		return this.zhongwei;
	}

	public void setZhongwei(Double zhongwei) {
		this.zhongwei = zhongwei;
	}

	public Double getShapotouqu() {
		return this.shapotouqu;
	}

	public void setShapotouqu(Double shapotouqu) {
		this.shapotouqu = shapotouqu;
	}

	public Double getZhongningqu() {
		return this.zhongningqu;
	}

	public void setZhongningqu(Double zhongningqu) {
		this.zhongningqu = zhongningqu;
	}

	public Double getHaiyuanxian() {
		return this.haiyuanxian;
	}

	public void setHaiyuanxian(Double haiyuanxian) {
		this.haiyuanxian = haiyuanxian;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TSummary103ZwId))
			return false;
		TSummary103ZwId castOther = (TSummary103ZwId) other;

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
				&& ((this.getZhongwei() == castOther.getZhongwei()) || (this
						.getZhongwei() != null
						&& castOther.getZhongwei() != null && this
						.getZhongwei().equals(castOther.getZhongwei())))
				&& ((this.getShapotouqu() == castOther.getShapotouqu()) || (this
						.getShapotouqu() != null
						&& castOther.getShapotouqu() != null && this
						.getShapotouqu().equals(castOther.getShapotouqu())))
				&& ((this.getZhongningqu() == castOther.getZhongningqu()) || (this
						.getZhongningqu() != null
						&& castOther.getZhongningqu() != null && this
						.getZhongningqu().equals(castOther.getZhongningqu())))
				&& ((this.getHaiyuanxian() == castOther.getHaiyuanxian()) || (this
						.getHaiyuanxian() != null
						&& castOther.getHaiyuanxian() != null && this
						.getHaiyuanxian().equals(castOther.getHaiyuanxian())));
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
				+ (getZhongwei() == null ? 0 : this.getZhongwei().hashCode());
		result = 37
				* result
				+ (getShapotouqu() == null ? 0 : this.getShapotouqu()
						.hashCode());
		result = 37
				* result
				+ (getZhongningqu() == null ? 0 : this.getZhongningqu()
						.hashCode());
		result = 37
				* result
				+ (getHaiyuanxian() == null ? 0 : this.getHaiyuanxian()
						.hashCode());
		return result;
	}

}