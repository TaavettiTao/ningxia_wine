package com.ningxia.wine.entity;

/**
 * TSummary105SzsId entity. @author MyEclipse Persistence Tools
 */

public class TSummary105SzsId implements java.io.Serializable {

	// Fields

	private Integer id;
	private String targetName;
	private String units;
	private String code;
	private Double shizuishanBefore13;
	private Double shizuishan14;
	private Double shizuishan15;
	private Double dawukouquBefore13;
	private Double dawukouqu14;
	private Double dawukouqu15;
	private Double huinongquBefore13;
	private Double huinongqu14;
	private Double huinongqu15;
	private Double pingluoxianBefore13;
	private Double pingluoxian14;
	private Double pingluoxian15;

	// Constructors

	/** default constructor */
	public TSummary105SzsId() {
	}

	/** minimal constructor */
	public TSummary105SzsId(Integer id, String targetName, String units,
			String code) {
		this.id = id;
		this.targetName = targetName;
		this.units = units;
		this.code = code;
	}

	/** full constructor */
	public TSummary105SzsId(Integer id, String targetName, String units,
			String code, Double shizuishanBefore13, Double shizuishan14,
			Double shizuishan15, Double dawukouquBefore13, Double dawukouqu14,
			Double dawukouqu15, Double huinongquBefore13, Double huinongqu14,
			Double huinongqu15, Double pingluoxianBefore13,
			Double pingluoxian14, Double pingluoxian15) {
		this.id = id;
		this.targetName = targetName;
		this.units = units;
		this.code = code;
		this.shizuishanBefore13 = shizuishanBefore13;
		this.shizuishan14 = shizuishan14;
		this.shizuishan15 = shizuishan15;
		this.dawukouquBefore13 = dawukouquBefore13;
		this.dawukouqu14 = dawukouqu14;
		this.dawukouqu15 = dawukouqu15;
		this.huinongquBefore13 = huinongquBefore13;
		this.huinongqu14 = huinongqu14;
		this.huinongqu15 = huinongqu15;
		this.pingluoxianBefore13 = pingluoxianBefore13;
		this.pingluoxian14 = pingluoxian14;
		this.pingluoxian15 = pingluoxian15;
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

	public Double getShizuishanBefore13() {
		return this.shizuishanBefore13;
	}

	public void setShizuishanBefore13(Double shizuishanBefore13) {
		this.shizuishanBefore13 = shizuishanBefore13;
	}

	public Double getShizuishan14() {
		return this.shizuishan14;
	}

	public void setShizuishan14(Double shizuishan14) {
		this.shizuishan14 = shizuishan14;
	}

	public Double getShizuishan15() {
		return this.shizuishan15;
	}

	public void setShizuishan15(Double shizuishan15) {
		this.shizuishan15 = shizuishan15;
	}

	public Double getDawukouquBefore13() {
		return this.dawukouquBefore13;
	}

	public void setDawukouquBefore13(Double dawukouquBefore13) {
		this.dawukouquBefore13 = dawukouquBefore13;
	}

	public Double getDawukouqu14() {
		return this.dawukouqu14;
	}

	public void setDawukouqu14(Double dawukouqu14) {
		this.dawukouqu14 = dawukouqu14;
	}

	public Double getDawukouqu15() {
		return this.dawukouqu15;
	}

	public void setDawukouqu15(Double dawukouqu15) {
		this.dawukouqu15 = dawukouqu15;
	}

	public Double getHuinongquBefore13() {
		return this.huinongquBefore13;
	}

	public void setHuinongquBefore13(Double huinongquBefore13) {
		this.huinongquBefore13 = huinongquBefore13;
	}

	public Double getHuinongqu14() {
		return this.huinongqu14;
	}

	public void setHuinongqu14(Double huinongqu14) {
		this.huinongqu14 = huinongqu14;
	}

	public Double getHuinongqu15() {
		return this.huinongqu15;
	}

	public void setHuinongqu15(Double huinongqu15) {
		this.huinongqu15 = huinongqu15;
	}

	public Double getPingluoxianBefore13() {
		return this.pingluoxianBefore13;
	}

	public void setPingluoxianBefore13(Double pingluoxianBefore13) {
		this.pingluoxianBefore13 = pingluoxianBefore13;
	}

	public Double getPingluoxian14() {
		return this.pingluoxian14;
	}

	public void setPingluoxian14(Double pingluoxian14) {
		this.pingluoxian14 = pingluoxian14;
	}

	public Double getPingluoxian15() {
		return this.pingluoxian15;
	}

	public void setPingluoxian15(Double pingluoxian15) {
		this.pingluoxian15 = pingluoxian15;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TSummary105SzsId))
			return false;
		TSummary105SzsId castOther = (TSummary105SzsId) other;

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
				&& ((this.getShizuishanBefore13() == castOther
						.getShizuishanBefore13()) || (this
						.getShizuishanBefore13() != null
						&& castOther.getShizuishanBefore13() != null && this
						.getShizuishanBefore13().equals(
								castOther.getShizuishanBefore13())))
				&& ((this.getShizuishan14() == castOther.getShizuishan14()) || (this
						.getShizuishan14() != null
						&& castOther.getShizuishan14() != null && this
						.getShizuishan14().equals(castOther.getShizuishan14())))
				&& ((this.getShizuishan15() == castOther.getShizuishan15()) || (this
						.getShizuishan15() != null
						&& castOther.getShizuishan15() != null && this
						.getShizuishan15().equals(castOther.getShizuishan15())))
				&& ((this.getDawukouquBefore13() == castOther
						.getDawukouquBefore13()) || (this
						.getDawukouquBefore13() != null
						&& castOther.getDawukouquBefore13() != null && this
						.getDawukouquBefore13().equals(
								castOther.getDawukouquBefore13())))
				&& ((this.getDawukouqu14() == castOther.getDawukouqu14()) || (this
						.getDawukouqu14() != null
						&& castOther.getDawukouqu14() != null && this
						.getDawukouqu14().equals(castOther.getDawukouqu14())))
				&& ((this.getDawukouqu15() == castOther.getDawukouqu15()) || (this
						.getDawukouqu15() != null
						&& castOther.getDawukouqu15() != null && this
						.getDawukouqu15().equals(castOther.getDawukouqu15())))
				&& ((this.getHuinongquBefore13() == castOther
						.getHuinongquBefore13()) || (this
						.getHuinongquBefore13() != null
						&& castOther.getHuinongquBefore13() != null && this
						.getHuinongquBefore13().equals(
								castOther.getHuinongquBefore13())))
				&& ((this.getHuinongqu14() == castOther.getHuinongqu14()) || (this
						.getHuinongqu14() != null
						&& castOther.getHuinongqu14() != null && this
						.getHuinongqu14().equals(castOther.getHuinongqu14())))
				&& ((this.getHuinongqu15() == castOther.getHuinongqu15()) || (this
						.getHuinongqu15() != null
						&& castOther.getHuinongqu15() != null && this
						.getHuinongqu15().equals(castOther.getHuinongqu15())))
				&& ((this.getPingluoxianBefore13() == castOther
						.getPingluoxianBefore13()) || (this
						.getPingluoxianBefore13() != null
						&& castOther.getPingluoxianBefore13() != null && this
						.getPingluoxianBefore13().equals(
								castOther.getPingluoxianBefore13())))
				&& ((this.getPingluoxian14() == castOther.getPingluoxian14()) || (this
						.getPingluoxian14() != null
						&& castOther.getPingluoxian14() != null && this
						.getPingluoxian14()
						.equals(castOther.getPingluoxian14())))
				&& ((this.getPingluoxian15() == castOther.getPingluoxian15()) || (this
						.getPingluoxian15() != null
						&& castOther.getPingluoxian15() != null && this
						.getPingluoxian15()
						.equals(castOther.getPingluoxian15())));
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
				+ (getShizuishanBefore13() == null ? 0 : this
						.getShizuishanBefore13().hashCode());
		result = 37
				* result
				+ (getShizuishan14() == null ? 0 : this.getShizuishan14()
						.hashCode());
		result = 37
				* result
				+ (getShizuishan15() == null ? 0 : this.getShizuishan15()
						.hashCode());
		result = 37
				* result
				+ (getDawukouquBefore13() == null ? 0 : this
						.getDawukouquBefore13().hashCode());
		result = 37
				* result
				+ (getDawukouqu14() == null ? 0 : this.getDawukouqu14()
						.hashCode());
		result = 37
				* result
				+ (getDawukouqu15() == null ? 0 : this.getDawukouqu15()
						.hashCode());
		result = 37
				* result
				+ (getHuinongquBefore13() == null ? 0 : this
						.getHuinongquBefore13().hashCode());
		result = 37
				* result
				+ (getHuinongqu14() == null ? 0 : this.getHuinongqu14()
						.hashCode());
		result = 37
				* result
				+ (getHuinongqu15() == null ? 0 : this.getHuinongqu15()
						.hashCode());
		result = 37
				* result
				+ (getPingluoxianBefore13() == null ? 0 : this
						.getPingluoxianBefore13().hashCode());
		result = 37
				* result
				+ (getPingluoxian14() == null ? 0 : this.getPingluoxian14()
						.hashCode());
		result = 37
				* result
				+ (getPingluoxian15() == null ? 0 : this.getPingluoxian15()
						.hashCode());
		return result;
	}

}