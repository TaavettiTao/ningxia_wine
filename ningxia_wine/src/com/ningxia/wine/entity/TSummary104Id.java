package com.ningxia.wine.entity;

/**
 * TSummary104Id entity. @author MyEclipse Persistence Tools
 */

public class TSummary104Id implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer xh;
	private String targetName;
	private String units;
	private String code;
	private Double region;
	private Double yinchuan;
	private Double wuzhong;
	private Double shizuishan;
	private Double guyuan;
	private Double zhongwei;
	private Double nongken;
	private String fieldname;
	private String tablename;
	private String method;
	private String SSql;
	private String SWhere;

	// Constructors

	/** default constructor */
	public TSummary104Id() {
	}

	/** minimal constructor */
	public TSummary104Id(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public TSummary104Id(Integer id, Integer xh, String targetName,
			String units, String code, Double region, Double yinchuan,
			Double wuzhong, Double shizuishan, Double guyuan, Double zhongwei,
			Double nongken, String fieldname, String tablename, String method,
			String SSql, String SWhere) {
		this.id = id;
		this.xh = xh;
		this.targetName = targetName;
		this.units = units;
		this.code = code;
		this.region = region;
		this.yinchuan = yinchuan;
		this.wuzhong = wuzhong;
		this.shizuishan = shizuishan;
		this.guyuan = guyuan;
		this.zhongwei = zhongwei;
		this.nongken = nongken;
		this.fieldname = fieldname;
		this.tablename = tablename;
		this.method = method;
		this.SSql = SSql;
		this.SWhere = SWhere;
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

	public Double getGuyuan() {
		return this.guyuan;
	}

	public void setGuyuan(Double guyuan) {
		this.guyuan = guyuan;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TSummary104Id))
			return false;
		TSummary104Id castOther = (TSummary104Id) other;

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
				&& ((this.getGuyuan() == castOther.getGuyuan()) || (this
						.getGuyuan() != null && castOther.getGuyuan() != null && this
						.getGuyuan().equals(castOther.getGuyuan())))
				&& ((this.getZhongwei() == castOther.getZhongwei()) || (this
						.getZhongwei() != null
						&& castOther.getZhongwei() != null && this
						.getZhongwei().equals(castOther.getZhongwei())))
				&& ((this.getNongken() == castOther.getNongken()) || (this
						.getNongken() != null && castOther.getNongken() != null && this
						.getNongken().equals(castOther.getNongken())))
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
				&& ((this.getSSql() == castOther.getSSql()) || (this.getSSql() != null
						&& castOther.getSSql() != null && this.getSSql()
						.equals(castOther.getSSql())))
				&& ((this.getSWhere() == castOther.getSWhere()) || (this
						.getSWhere() != null && castOther.getSWhere() != null && this
						.getSWhere().equals(castOther.getSWhere())));
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
				+ (getGuyuan() == null ? 0 : this.getGuyuan().hashCode());
		result = 37 * result
				+ (getZhongwei() == null ? 0 : this.getZhongwei().hashCode());
		result = 37 * result
				+ (getNongken() == null ? 0 : this.getNongken().hashCode());
		result = 37 * result
				+ (getFieldname() == null ? 0 : this.getFieldname().hashCode());
		result = 37 * result
				+ (getTablename() == null ? 0 : this.getTablename().hashCode());
		result = 37 * result
				+ (getMethod() == null ? 0 : this.getMethod().hashCode());
		result = 37 * result
				+ (getSSql() == null ? 0 : this.getSSql().hashCode());
		result = 37 * result
				+ (getSWhere() == null ? 0 : this.getSWhere().hashCode());
		return result;
	}

}