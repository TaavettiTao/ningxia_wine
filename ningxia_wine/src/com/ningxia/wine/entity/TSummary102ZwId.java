package com.ningxia.wine.entity;

/**
 * TSummary102ZwId entity. @author MyEclipse Persistence Tools
 */

public class TSummary102ZwId implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer xh;
	private String fieldname;
	private String tablename;
	private String name;
	private String dw;
	private String code;
	private Double zhongwei;
	private Double shapotouqu;
	private Double zhongningqu;
	private Double haiyuanxian;

	// Constructors

	/** default constructor */
	public TSummary102ZwId() {
	}

	/** minimal constructor */
	public TSummary102ZwId(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public TSummary102ZwId(Integer id, Integer xh, String fieldname,
			String tablename, String name, String dw, String code,
			Double zhongwei, Double shapotouqu, Double zhongningqu,
			Double haiyuanxian) {
		this.id = id;
		this.xh = xh;
		this.fieldname = fieldname;
		this.tablename = tablename;
		this.name = name;
		this.dw = dw;
		this.code = code;
		this.zhongwei = zhongwei;
		this.shapotouqu = shapotouqu;
		this.zhongningqu = zhongningqu;
		this.haiyuanxian = haiyuanxian;
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
		if (!(other instanceof TSummary102ZwId))
			return false;
		TSummary102ZwId castOther = (TSummary102ZwId) other;

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