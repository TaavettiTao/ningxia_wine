package com.ningxia.wine.entity;

/**
 * TSummary105ZwId entity. @author MyEclipse Persistence Tools
 */

public class TSummary105ZwId implements java.io.Serializable {

	// Fields

	private Integer id;
	private String targetName;
	private String units;
	private String code;
	private Double zhongweiBefore13;
	private Double zhongwei14;
	private Double zhongwei15;
	private Double shapotouquBefore13;
	private Double shapotouqu14;
	private Double shapotouqu15;
	private Double zhongningquBefore13;
	private Double zhongningqu14;
	private Double zhongningqu15;
	private Double haiyuanxianBefore13;
	private Double haiyuanxian14;
	private Double haiyuanxian15;

	// Constructors

	/** default constructor */
	public TSummary105ZwId() {
	}

	/** minimal constructor */
	public TSummary105ZwId(Integer id, String targetName, String units,
			String code) {
		this.id = id;
		this.targetName = targetName;
		this.units = units;
		this.code = code;
	}

	/** full constructor */
	public TSummary105ZwId(Integer id, String targetName, String units,
			String code, Double zhongweiBefore13, Double zhongwei14,
			Double zhongwei15, Double shapotouquBefore13, Double shapotouqu14,
			Double shapotouqu15, Double zhongningquBefore13,
			Double zhongningqu14, Double zhongningqu15,
			Double haiyuanxianBefore13, Double haiyuanxian14,
			Double haiyuanxian15) {
		this.id = id;
		this.targetName = targetName;
		this.units = units;
		this.code = code;
		this.zhongweiBefore13 = zhongweiBefore13;
		this.zhongwei14 = zhongwei14;
		this.zhongwei15 = zhongwei15;
		this.shapotouquBefore13 = shapotouquBefore13;
		this.shapotouqu14 = shapotouqu14;
		this.shapotouqu15 = shapotouqu15;
		this.zhongningquBefore13 = zhongningquBefore13;
		this.zhongningqu14 = zhongningqu14;
		this.zhongningqu15 = zhongningqu15;
		this.haiyuanxianBefore13 = haiyuanxianBefore13;
		this.haiyuanxian14 = haiyuanxian14;
		this.haiyuanxian15 = haiyuanxian15;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Double getZhongweiBefore13() {
		return this.zhongweiBefore13;
	}

	public void setZhongweiBefore13(Double zhongweiBefore13) {
		this.zhongweiBefore13 = zhongweiBefore13;
	}

	public Double getZhongwei14() {
		return this.zhongwei14;
	}

	public void setZhongwei14(Double zhongwei14) {
		this.zhongwei14 = zhongwei14;
	}

	public Double getZhongwei15() {
		return this.zhongwei15;
	}

	public void setZhongwei15(Double zhongwei15) {
		this.zhongwei15 = zhongwei15;
	}

	public Double getShapotouquBefore13() {
		return this.shapotouquBefore13;
	}

	public void setShapotouquBefore13(Double shapotouquBefore13) {
		this.shapotouquBefore13 = shapotouquBefore13;
	}

	public Double getShapotouqu14() {
		return this.shapotouqu14;
	}

	public void setShapotouqu14(Double shapotouqu14) {
		this.shapotouqu14 = shapotouqu14;
	}

	public Double getShapotouqu15() {
		return this.shapotouqu15;
	}

	public void setShapotouqu15(Double shapotouqu15) {
		this.shapotouqu15 = shapotouqu15;
	}

	public Double getZhongningquBefore13() {
		return this.zhongningquBefore13;
	}

	public void setZhongningquBefore13(Double zhongningquBefore13) {
		this.zhongningquBefore13 = zhongningquBefore13;
	}

	public Double getZhongningqu14() {
		return this.zhongningqu14;
	}

	public void setZhongningqu14(Double zhongningqu14) {
		this.zhongningqu14 = zhongningqu14;
	}

	public Double getZhongningqu15() {
		return this.zhongningqu15;
	}

	public void setZhongningqu15(Double zhongningqu15) {
		this.zhongningqu15 = zhongningqu15;
	}

	public Double getHaiyuanxianBefore13() {
		return this.haiyuanxianBefore13;
	}

	public void setHaiyuanxianBefore13(Double haiyuanxianBefore13) {
		this.haiyuanxianBefore13 = haiyuanxianBefore13;
	}

	public Double getHaiyuanxian14() {
		return this.haiyuanxian14;
	}

	public void setHaiyuanxian14(Double haiyuanxian14) {
		this.haiyuanxian14 = haiyuanxian14;
	}

	public Double getHaiyuanxian15() {
		return this.haiyuanxian15;
	}

	public void setHaiyuanxian15(Double haiyuanxian15) {
		this.haiyuanxian15 = haiyuanxian15;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TSummary105ZwId))
			return false;
		TSummary105ZwId castOther = (TSummary105ZwId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
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
				&& ((this.getZhongweiBefore13() == castOther
						.getZhongweiBefore13()) || (this.getZhongweiBefore13() != null
						&& castOther.getZhongweiBefore13() != null && this
						.getZhongweiBefore13().equals(
								castOther.getZhongweiBefore13())))
				&& ((this.getZhongwei14() == castOther.getZhongwei14()) || (this
						.getZhongwei14() != null
						&& castOther.getZhongwei14() != null && this
						.getZhongwei14().equals(castOther.getZhongwei14())))
				&& ((this.getZhongwei15() == castOther.getZhongwei15()) || (this
						.getZhongwei15() != null
						&& castOther.getZhongwei15() != null && this
						.getZhongwei15().equals(castOther.getZhongwei15())))
				&& ((this.getShapotouquBefore13() == castOther
						.getShapotouquBefore13()) || (this
						.getShapotouquBefore13() != null
						&& castOther.getShapotouquBefore13() != null && this
						.getShapotouquBefore13().equals(
								castOther.getShapotouquBefore13())))
				&& ((this.getShapotouqu14() == castOther.getShapotouqu14()) || (this
						.getShapotouqu14() != null
						&& castOther.getShapotouqu14() != null && this
						.getShapotouqu14().equals(castOther.getShapotouqu14())))
				&& ((this.getShapotouqu15() == castOther.getShapotouqu15()) || (this
						.getShapotouqu15() != null
						&& castOther.getShapotouqu15() != null && this
						.getShapotouqu15().equals(castOther.getShapotouqu15())))
				&& ((this.getZhongningquBefore13() == castOther
						.getZhongningquBefore13()) || (this
						.getZhongningquBefore13() != null
						&& castOther.getZhongningquBefore13() != null && this
						.getZhongningquBefore13().equals(
								castOther.getZhongningquBefore13())))
				&& ((this.getZhongningqu14() == castOther.getZhongningqu14()) || (this
						.getZhongningqu14() != null
						&& castOther.getZhongningqu14() != null && this
						.getZhongningqu14()
						.equals(castOther.getZhongningqu14())))
				&& ((this.getZhongningqu15() == castOther.getZhongningqu15()) || (this
						.getZhongningqu15() != null
						&& castOther.getZhongningqu15() != null && this
						.getZhongningqu15()
						.equals(castOther.getZhongningqu15())))
				&& ((this.getHaiyuanxianBefore13() == castOther
						.getHaiyuanxianBefore13()) || (this
						.getHaiyuanxianBefore13() != null
						&& castOther.getHaiyuanxianBefore13() != null && this
						.getHaiyuanxianBefore13().equals(
								castOther.getHaiyuanxianBefore13())))
				&& ((this.getHaiyuanxian14() == castOther.getHaiyuanxian14()) || (this
						.getHaiyuanxian14() != null
						&& castOther.getHaiyuanxian14() != null && this
						.getHaiyuanxian14()
						.equals(castOther.getHaiyuanxian14())))
				&& ((this.getHaiyuanxian15() == castOther.getHaiyuanxian15()) || (this
						.getHaiyuanxian15() != null
						&& castOther.getHaiyuanxian15() != null && this
						.getHaiyuanxian15()
						.equals(castOther.getHaiyuanxian15())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37
				* result
				+ (getTargetName() == null ? 0 : this.getTargetName()
						.hashCode());
		result = 37 * result
				+ (getUnits() == null ? 0 : this.getUnits().hashCode());
		result = 37 * result
				+ (getCode() == null ? 0 : this.getCode().hashCode());
		result = 37
				* result
				+ (getZhongweiBefore13() == null ? 0 : this
						.getZhongweiBefore13().hashCode());
		result = 37
				* result
				+ (getZhongwei14() == null ? 0 : this.getZhongwei14()
						.hashCode());
		result = 37
				* result
				+ (getZhongwei15() == null ? 0 : this.getZhongwei15()
						.hashCode());
		result = 37
				* result
				+ (getShapotouquBefore13() == null ? 0 : this
						.getShapotouquBefore13().hashCode());
		result = 37
				* result
				+ (getShapotouqu14() == null ? 0 : this.getShapotouqu14()
						.hashCode());
		result = 37
				* result
				+ (getShapotouqu15() == null ? 0 : this.getShapotouqu15()
						.hashCode());
		result = 37
				* result
				+ (getZhongningquBefore13() == null ? 0 : this
						.getZhongningquBefore13().hashCode());
		result = 37
				* result
				+ (getZhongningqu14() == null ? 0 : this.getZhongningqu14()
						.hashCode());
		result = 37
				* result
				+ (getZhongningqu15() == null ? 0 : this.getZhongningqu15()
						.hashCode());
		result = 37
				* result
				+ (getHaiyuanxianBefore13() == null ? 0 : this
						.getHaiyuanxianBefore13().hashCode());
		result = 37
				* result
				+ (getHaiyuanxian14() == null ? 0 : this.getHaiyuanxian14()
						.hashCode());
		result = 37
				* result
				+ (getHaiyuanxian15() == null ? 0 : this.getHaiyuanxian15()
						.hashCode());
		return result;
	}

}