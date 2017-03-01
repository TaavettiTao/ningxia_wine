package com.ningxia.wine.entity;

/**
 * TSummary107SzsId entity. @author MyEclipse Persistence Tools
 */

public class TSummary107SzsId implements java.io.Serializable {

	// Fields

	private Integer id;
	private String targetName;
	private String units;
	private String code;
	private Double shizuishan;
	private Double dawukouqu;
	private Double huinongqu;
	private Double pingluoxian;

	// Constructors

	/** default constructor */
	public TSummary107SzsId() {
	}

	/** minimal constructor */
	public TSummary107SzsId(Integer id, String targetName, String units,
			String code) {
		this.id = id;
		this.targetName = targetName;
		this.units = units;
		this.code = code;
	}

	/** full constructor */
	public TSummary107SzsId(Integer id, String targetName, String units,
			String code, Double shizuishan, Double dawukouqu, Double huinongqu,
			Double pingluoxian) {
		this.id = id;
		this.targetName = targetName;
		this.units = units;
		this.code = code;
		this.shizuishan = shizuishan;
		this.dawukouqu = dawukouqu;
		this.huinongqu = huinongqu;
		this.pingluoxian = pingluoxian;
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

	public Double getShizuishan() {
		return this.shizuishan;
	}

	public void setShizuishan(Double shizuishan) {
		this.shizuishan = shizuishan;
	}

	public Double getDawukouqu() {
		return this.dawukouqu;
	}

	public void setDawukouqu(Double dawukouqu) {
		this.dawukouqu = dawukouqu;
	}

	public Double getHuinongqu() {
		return this.huinongqu;
	}

	public void setHuinongqu(Double huinongqu) {
		this.huinongqu = huinongqu;
	}

	public Double getPingluoxian() {
		return this.pingluoxian;
	}

	public void setPingluoxian(Double pingluoxian) {
		this.pingluoxian = pingluoxian;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TSummary107SzsId))
			return false;
		TSummary107SzsId castOther = (TSummary107SzsId) other;

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
				&& ((this.getShizuishan() == castOther.getShizuishan()) || (this
						.getShizuishan() != null
						&& castOther.getShizuishan() != null && this
						.getShizuishan().equals(castOther.getShizuishan())))
				&& ((this.getDawukouqu() == castOther.getDawukouqu()) || (this
						.getDawukouqu() != null
						&& castOther.getDawukouqu() != null && this
						.getDawukouqu().equals(castOther.getDawukouqu())))
				&& ((this.getHuinongqu() == castOther.getHuinongqu()) || (this
						.getHuinongqu() != null
						&& castOther.getHuinongqu() != null && this
						.getHuinongqu().equals(castOther.getHuinongqu())))
				&& ((this.getPingluoxian() == castOther.getPingluoxian()) || (this
						.getPingluoxian() != null
						&& castOther.getPingluoxian() != null && this
						.getPingluoxian().equals(castOther.getPingluoxian())));
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
				+ (getShizuishan() == null ? 0 : this.getShizuishan()
						.hashCode());
		result = 37 * result
				+ (getDawukouqu() == null ? 0 : this.getDawukouqu().hashCode());
		result = 37 * result
				+ (getHuinongqu() == null ? 0 : this.getHuinongqu().hashCode());
		result = 37
				* result
				+ (getPingluoxian() == null ? 0 : this.getPingluoxian()
						.hashCode());
		return result;
	}

}