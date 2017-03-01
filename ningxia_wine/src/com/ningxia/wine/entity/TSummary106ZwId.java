package com.ningxia.wine.entity;

/**
 * TSummary106ZwId entity. @author MyEclipse Persistence Tools
 */

public class TSummary106ZwId implements java.io.Serializable {

	// Fields

	private Integer id;
	private String targetName;
	private String units;
	private String code;
	private String number;
	private String money;

	// Constructors

	/** default constructor */
	public TSummary106ZwId() {
	}

	/** minimal constructor */
	public TSummary106ZwId(Integer id, String targetName, String units,
			String code) {
		this.id = id;
		this.targetName = targetName;
		this.units = units;
		this.code = code;
	}

	/** full constructor */
	public TSummary106ZwId(Integer id, String targetName, String units,
			String code, String number, String money) {
		this.id = id;
		this.targetName = targetName;
		this.units = units;
		this.code = code;
		this.number = number;
		this.money = money;
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

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getMoney() {
		return this.money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TSummary106ZwId))
			return false;
		TSummary106ZwId castOther = (TSummary106ZwId) other;

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
				&& ((this.getNumber() == castOther.getNumber()) || (this
						.getNumber() != null && castOther.getNumber() != null && this
						.getNumber().equals(castOther.getNumber())))
				&& ((this.getMoney() == castOther.getMoney()) || (this
						.getMoney() != null && castOther.getMoney() != null && this
						.getMoney().equals(castOther.getMoney())));
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
		result = 37 * result
				+ (getNumber() == null ? 0 : this.getNumber().hashCode());
		result = 37 * result
				+ (getMoney() == null ? 0 : this.getMoney().hashCode());
		return result;
	}

}