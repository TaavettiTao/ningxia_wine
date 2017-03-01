package com.ningxia.wine.entity;

/**
 * TSummary102SzsId entity. @author MyEclipse Persistence Tools
 */

public class TSummary102SzsId implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer xh;
	private String fieldname;
	private String tablename;
	private String name;
	private String dw;
	private String code;
	private Double shizuishan;
	private Double dawukouqu;
	private Double huinongqu;
	private Double pingluoxian;

	// Constructors

	/** default constructor */
	public TSummary102SzsId() {
	}

	/** minimal constructor */
	public TSummary102SzsId(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public TSummary102SzsId(Integer id, Integer xh, String fieldname,
			String tablename, String name, String dw, String code,
			Double shizuishan, Double dawukouqu, Double huinongqu,
			Double pingluoxian) {
		this.id = id;
		this.xh = xh;
		this.fieldname = fieldname;
		this.tablename = tablename;
		this.name = name;
		this.dw = dw;
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

	public Integer getXh() {
		return this.xh;
	}

	public void setXh(Integer xh) {
		this.xh = xh;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDw() {
		return this.dw;
	}

	public void setDw(String dw) {
		this.dw = dw;
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
		if (!(other instanceof TSummary102SzsId))
			return false;
		TSummary102SzsId castOther = (TSummary102SzsId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getXh() == castOther.getXh()) || (this.getXh() != null
						&& castOther.getXh() != null && this.getXh().equals(
						castOther.getXh())))
				&& ((this.getFieldname() == castOther.getFieldname()) || (this
						.getFieldname() != null
						&& castOther.getFieldname() != null && this
						.getFieldname().equals(castOther.getFieldname())))
				&& ((this.getTablename() == castOther.getTablename()) || (this
						.getTablename() != null
						&& castOther.getTablename() != null && this
						.getTablename().equals(castOther.getTablename())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null
						&& castOther.getName() != null && this.getName()
						.equals(castOther.getName())))
				&& ((this.getDw() == castOther.getDw()) || (this.getDw() != null
						&& castOther.getDw() != null && this.getDw().equals(
						castOther.getDw())))
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
		result = 37 * result + (getXh() == null ? 0 : this.getXh().hashCode());
		result = 37 * result
				+ (getFieldname() == null ? 0 : this.getFieldname().hashCode());
		result = 37 * result
				+ (getTablename() == null ? 0 : this.getTablename().hashCode());
		result = 37 * result
				+ (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result + (getDw() == null ? 0 : this.getDw().hashCode());
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