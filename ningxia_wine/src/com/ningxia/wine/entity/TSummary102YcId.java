package com.ningxia.wine.entity;

/**
 * TSummary102YcId entity. @author MyEclipse Persistence Tools
 */

public class TSummary102YcId implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer xh;
	private String fieldname;
	private String tablename;
	private String name;
	private String dw;
	private String code;
	private Double yinchuan;
	private Double xingqingqu;
	private Double xixiaqu;
	private Double jinfengqu;
	private Double yongningxian;
	private Double helanxian;
	private Double lingwushi;

	// Constructors

	/** default constructor */
	public TSummary102YcId() {
	}

	/** minimal constructor */
	public TSummary102YcId(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public TSummary102YcId(Integer id, Integer xh, String fieldname,
			String tablename, String name, String dw, String code,
			Double yinchuan, Double xingqingqu, Double xixiaqu,
			Double jinfengqu, Double yongningxian, Double helanxian,
			Double lingwushi) {
		this.id = id;
		this.xh = xh;
		this.fieldname = fieldname;
		this.tablename = tablename;
		this.name = name;
		this.dw = dw;
		this.code = code;
		this.yinchuan = yinchuan;
		this.xingqingqu = xingqingqu;
		this.xixiaqu = xixiaqu;
		this.jinfengqu = jinfengqu;
		this.yongningxian = yongningxian;
		this.helanxian = helanxian;
		this.lingwushi = lingwushi;
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

	public Double getYinchuan() {
		return this.yinchuan;
	}

	public void setYinchuan(Double yinchuan) {
		this.yinchuan = yinchuan;
	}

	public Double getXingqingqu() {
		return this.xingqingqu;
	}

	public void setXingqingqu(Double xingqingqu) {
		this.xingqingqu = xingqingqu;
	}

	public Double getXixiaqu() {
		return this.xixiaqu;
	}

	public void setXixiaqu(Double xixiaqu) {
		this.xixiaqu = xixiaqu;
	}

	public Double getJinfengqu() {
		return this.jinfengqu;
	}

	public void setJinfengqu(Double jinfengqu) {
		this.jinfengqu = jinfengqu;
	}

	public Double getYongningxian() {
		return this.yongningxian;
	}

	public void setYongningxian(Double yongningxian) {
		this.yongningxian = yongningxian;
	}

	public Double getHelanxian() {
		return this.helanxian;
	}

	public void setHelanxian(Double helanxian) {
		this.helanxian = helanxian;
	}

	public Double getLingwushi() {
		return this.lingwushi;
	}

	public void setLingwushi(Double lingwushi) {
		this.lingwushi = lingwushi;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TSummary102YcId))
			return false;
		TSummary102YcId castOther = (TSummary102YcId) other;

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
				&& ((this.getYinchuan() == castOther.getYinchuan()) || (this
						.getYinchuan() != null
						&& castOther.getYinchuan() != null && this
						.getYinchuan().equals(castOther.getYinchuan())))
				&& ((this.getXingqingqu() == castOther.getXingqingqu()) || (this
						.getXingqingqu() != null
						&& castOther.getXingqingqu() != null && this
						.getXingqingqu().equals(castOther.getXingqingqu())))
				&& ((this.getXixiaqu() == castOther.getXixiaqu()) || (this
						.getXixiaqu() != null && castOther.getXixiaqu() != null && this
						.getXixiaqu().equals(castOther.getXixiaqu())))
				&& ((this.getJinfengqu() == castOther.getJinfengqu()) || (this
						.getJinfengqu() != null
						&& castOther.getJinfengqu() != null && this
						.getJinfengqu().equals(castOther.getJinfengqu())))
				&& ((this.getYongningxian() == castOther.getYongningxian()) || (this
						.getYongningxian() != null
						&& castOther.getYongningxian() != null && this
						.getYongningxian().equals(castOther.getYongningxian())))
				&& ((this.getHelanxian() == castOther.getHelanxian()) || (this
						.getHelanxian() != null
						&& castOther.getHelanxian() != null && this
						.getHelanxian().equals(castOther.getHelanxian())))
				&& ((this.getLingwushi() == castOther.getLingwushi()) || (this
						.getLingwushi() != null
						&& castOther.getLingwushi() != null && this
						.getLingwushi().equals(castOther.getLingwushi())));
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
				+ (getYinchuan() == null ? 0 : this.getYinchuan().hashCode());
		result = 37
				* result
				+ (getXingqingqu() == null ? 0 : this.getXingqingqu()
						.hashCode());
		result = 37 * result
				+ (getXixiaqu() == null ? 0 : this.getXixiaqu().hashCode());
		result = 37 * result
				+ (getJinfengqu() == null ? 0 : this.getJinfengqu().hashCode());
		result = 37
				* result
				+ (getYongningxian() == null ? 0 : this.getYongningxian()
						.hashCode());
		result = 37 * result
				+ (getHelanxian() == null ? 0 : this.getHelanxian().hashCode());
		result = 37 * result
				+ (getLingwushi() == null ? 0 : this.getLingwushi().hashCode());
		return result;
	}

}