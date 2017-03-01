package com.ningxia.wine.entity;

/**
 * TSummary106Id entity. @author MyEclipse Persistence Tools
 */

public class TSummary106Id implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer xh;
	private String targetName;
	private String units;
	private String code;
	private String number;
	private String money;
	private String fieldname;
	private String tablename;
	private String SSql;
	private String SWhere;
	private String method;

	// Constructors

	/** default constructor */
	public TSummary106Id() {
	}

	/** minimal constructor */
	public TSummary106Id(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public TSummary106Id(Integer id, Integer xh, String targetName,
			String units, String code, String number, String money,
			String fieldname, String tablename, String SSql, String SWhere,
			String method) {
		this.id = id;
		this.xh = xh;
		this.targetName = targetName;
		this.units = units;
		this.code = code;
		this.number = number;
		this.money = money;
		this.fieldname = fieldname;
		this.tablename = tablename;
		this.SSql = SSql;
		this.SWhere = SWhere;
		this.method = method;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getXh() {
		return this.xh;
	}

	public void setXh(Integer xh) {
		this.xh = xh;
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

	public String getFieldname() {
		return this.fieldname;
	}

	public void setFieldname(String fieldname) {
		this.fieldname = fieldname;
	}

	public String getTablename() {
		return this.tablename;
	}

	public void setTablename(String tablename) {
		this.tablename = tablename;
	}

	public String getSSql() {
		return this.SSql;
	}

	public void setSSql(String SSql) {
		this.SSql = SSql;
	}

	public String getSWhere() {
		return this.SWhere;
	}

	public void setSWhere(String SWhere) {
		this.SWhere = SWhere;
	}

	public String getMethod() {
		return this.method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TSummary106Id))
			return false;
		TSummary106Id castOther = (TSummary106Id) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getXh() == castOther.getXh()) || (this.getXh() != null
						&& castOther.getXh() != null && this.getXh().equals(
						castOther.getXh())))
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
						.getMoney().equals(castOther.getMoney())))
				&& ((this.getFieldname() == castOther.getFieldname()) || (this
						.getFieldname() != null
						&& castOther.getFieldname() != null && this
						.getFieldname().equals(castOther.getFieldname())))
				&& ((this.getTablename() == castOther.getTablename()) || (this
						.getTablename() != null
						&& castOther.getTablename() != null && this
						.getTablename().equals(castOther.getTablename())))
				&& ((this.getSSql() == castOther.getSSql()) || (this.getSSql() != null
						&& castOther.getSSql() != null && this.getSSql()
						.equals(castOther.getSSql())))
				&& ((this.getSWhere() == castOther.getSWhere()) || (this
						.getSWhere() != null && castOther.getSWhere() != null && this
						.getSWhere().equals(castOther.getSWhere())))
				&& ((this.getMethod() == castOther.getMethod()) || (this
						.getMethod() != null && castOther.getMethod() != null && this
						.getMethod().equals(castOther.getMethod())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result + (getXh() == null ? 0 : this.getXh().hashCode());
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
		result = 37 * result
				+ (getFieldname() == null ? 0 : this.getFieldname().hashCode());
		result = 37 * result
				+ (getTablename() == null ? 0 : this.getTablename().hashCode());
		result = 37 * result
				+ (getSSql() == null ? 0 : this.getSSql().hashCode());
		result = 37 * result
				+ (getSWhere() == null ? 0 : this.getSWhere().hashCode());
		result = 37 * result
				+ (getMethod() == null ? 0 : this.getMethod().hashCode());
		return result;
	}

}