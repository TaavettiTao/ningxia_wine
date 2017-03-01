package com.ningxia.wine.entity;

/**
 * TSummary107Id entity. @author MyEclipse Persistence Tools
 */

public class TSummary107Id implements java.io.Serializable {

	// Fields

	private Integer id;
	private String targetname;
	private String units;
	private String code;
	private Double region;
	private Double yinchuan;
	private Double shizuishan;
	private Double wuzhong;
	private Double zhongwei;
	private Double nongken;
	private Double guyuan;
	private String fieldname;
	private String tablename;
	private String method;
	private String sql;
	private String where;

	// Constructors

	/** default constructor */
	public TSummary107Id() {
	}

	/** minimal constructor */
	public TSummary107Id(Integer id, String targetname, String units,
			String code) {
		this.id = id;
		this.targetname = targetname;
		this.units = units;
		this.code = code;
	}

	/** full constructor */
	public TSummary107Id(Integer id, String targetname, String units,
			String code, Double region, Double yinchuan, Double shizuishan,
			Double wuzhong, Double zhongwei, Double nongken, Double guyuan,
			String fieldname, String tablename, String method, String sql,
			String where) {
		this.id = id;
		this.targetname = targetname;
		this.units = units;
		this.code = code;
		this.region = region;
		this.yinchuan = yinchuan;
		this.shizuishan = shizuishan;
		this.wuzhong = wuzhong;
		this.zhongwei = zhongwei;
		this.nongken = nongken;
		this.guyuan = guyuan;
		this.fieldname = fieldname;
		this.tablename = tablename;
		this.method = method;
		this.sql = sql;
		this.where = where;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTargetname() {
		return this.targetname;
	}

	public void setTargetname(String targetname) {
		this.targetname = targetname;
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

	public Double getShizuishan() {
		return this.shizuishan;
	}

	public void setShizuishan(Double shizuishan) {
		this.shizuishan = shizuishan;
	}

	public Double getWuzhong() {
		return this.wuzhong;
	}

	public void setWuzhong(Double wuzhong) {
		this.wuzhong = wuzhong;
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

	public Double getGuyuan() {
		return this.guyuan;
	}

	public void setGuyuan(Double guyuan) {
		this.guyuan = guyuan;
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

	public String getMethod() {
		return this.method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getSql() {
		return this.sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

	public String getWhere() {
		return this.where;
	}

	public void setWhere(String where) {
		this.where = where;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TSummary107Id))
			return false;
		TSummary107Id castOther = (TSummary107Id) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getTargetname() == castOther.getTargetname()) || (this
						.getTargetname() != null
						&& castOther.getTargetname() != null && this
						.getTargetname().equals(castOther.getTargetname())))
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
				&& ((this.getShizuishan() == castOther.getShizuishan()) || (this
						.getShizuishan() != null
						&& castOther.getShizuishan() != null && this
						.getShizuishan().equals(castOther.getShizuishan())))
				&& ((this.getWuzhong() == castOther.getWuzhong()) || (this
						.getWuzhong() != null && castOther.getWuzhong() != null && this
						.getWuzhong().equals(castOther.getWuzhong())))
				&& ((this.getZhongwei() == castOther.getZhongwei()) || (this
						.getZhongwei() != null
						&& castOther.getZhongwei() != null && this
						.getZhongwei().equals(castOther.getZhongwei())))
				&& ((this.getNongken() == castOther.getNongken()) || (this
						.getNongken() != null && castOther.getNongken() != null && this
						.getNongken().equals(castOther.getNongken())))
				&& ((this.getGuyuan() == castOther.getGuyuan()) || (this
						.getGuyuan() != null && castOther.getGuyuan() != null && this
						.getGuyuan().equals(castOther.getGuyuan())))
				&& ((this.getFieldname() == castOther.getFieldname()) || (this
						.getFieldname() != null
						&& castOther.getFieldname() != null && this
						.getFieldname().equals(castOther.getFieldname())))
				&& ((this.getTablename() == castOther.getTablename()) || (this
						.getTablename() != null
						&& castOther.getTablename() != null && this
						.getTablename().equals(castOther.getTablename())))
				&& ((this.getMethod() == castOther.getMethod()) || (this
						.getMethod() != null && castOther.getMethod() != null && this
						.getMethod().equals(castOther.getMethod())))
				&& ((this.getSql() == castOther.getSql()) || (this.getSql() != null
						&& castOther.getSql() != null && this.getSql().equals(
						castOther.getSql())))
				&& ((this.getWhere() == castOther.getWhere()) || (this
						.getWhere() != null && castOther.getWhere() != null && this
						.getWhere().equals(castOther.getWhere())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37
				* result
				+ (getTargetname() == null ? 0 : this.getTargetname()
						.hashCode());
		result = 37 * result
				+ (getUnits() == null ? 0 : this.getUnits().hashCode());
		result = 37 * result
				+ (getCode() == null ? 0 : this.getCode().hashCode());
		result = 37 * result
				+ (getRegion() == null ? 0 : this.getRegion().hashCode());
		result = 37 * result
				+ (getYinchuan() == null ? 0 : this.getYinchuan().hashCode());
		result = 37
				* result
				+ (getShizuishan() == null ? 0 : this.getShizuishan()
						.hashCode());
		result = 37 * result
				+ (getWuzhong() == null ? 0 : this.getWuzhong().hashCode());
		result = 37 * result
				+ (getZhongwei() == null ? 0 : this.getZhongwei().hashCode());
		result = 37 * result
				+ (getNongken() == null ? 0 : this.getNongken().hashCode());
		result = 37 * result
				+ (getGuyuan() == null ? 0 : this.getGuyuan().hashCode());
		result = 37 * result
				+ (getFieldname() == null ? 0 : this.getFieldname().hashCode());
		result = 37 * result
				+ (getTablename() == null ? 0 : this.getTablename().hashCode());
		result = 37 * result
				+ (getMethod() == null ? 0 : this.getMethod().hashCode());
		result = 37 * result
				+ (getSql() == null ? 0 : this.getSql().hashCode());
		result = 37 * result
				+ (getWhere() == null ? 0 : this.getWhere().hashCode());
		return result;
	}

}