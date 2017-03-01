package com.ningxia.wine.entity;

/**
 * TSummary102WzId entity. @author MyEclipse Persistence Tools
 */

public class TSummary102WzId implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer xh;
	private String fieldname;
	private String tablename;
	private String name;
	private String dw;
	private String code;
	private Double wuzhong;
	private Double hongsipu;
	private Double litong;
	private Double yanchi;
	private Double tongxin;
	private Double qingtongxia;

	// Constructors

	/** default constructor */
	public TSummary102WzId() {
	}

	/** minimal constructor */
	public TSummary102WzId(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public TSummary102WzId(Integer id, Integer xh, String fieldname,
			String tablename, String name, String dw, String code,
			Double wuzhong, Double hongsipu, Double litong, Double yanchi,
			Double tongxin, Double qingtongxia) {
		this.id = id;
		this.xh = xh;
		this.fieldname = fieldname;
		this.tablename = tablename;
		this.name = name;
		this.dw = dw;
		this.code = code;
		this.wuzhong = wuzhong;
		this.hongsipu = hongsipu;
		this.litong = litong;
		this.yanchi = yanchi;
		this.tongxin = tongxin;
		this.qingtongxia = qingtongxia;
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

	public Double getWuzhong() {
		return this.wuzhong;
	}

	public void setWuzhong(Double wuzhong) {
		this.wuzhong = wuzhong;
	}

	public Double getHongsipu() {
		return this.hongsipu;
	}

	public void setHongsipu(Double hongsipu) {
		this.hongsipu = hongsipu;
	}

	public Double getLitong() {
		return this.litong;
	}

	public void setLitong(Double litong) {
		this.litong = litong;
	}

	public Double getYanchi() {
		return this.yanchi;
	}

	public void setYanchi(Double yanchi) {
		this.yanchi = yanchi;
	}

	public Double getTongxin() {
		return this.tongxin;
	}

	public void setTongxin(Double tongxin) {
		this.tongxin = tongxin;
	}

	public Double getQingtongxia() {
		return this.qingtongxia;
	}

	public void setQingtongxia(Double qingtongxia) {
		this.qingtongxia = qingtongxia;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TSummary102WzId))
			return false;
		TSummary102WzId castOther = (TSummary102WzId) other;

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
				&& ((this.getWuzhong() == castOther.getWuzhong()) || (this
						.getWuzhong() != null && castOther.getWuzhong() != null && this
						.getWuzhong().equals(castOther.getWuzhong())))
				&& ((this.getHongsipu() == castOther.getHongsipu()) || (this
						.getHongsipu() != null
						&& castOther.getHongsipu() != null && this
						.getHongsipu().equals(castOther.getHongsipu())))
				&& ((this.getLitong() == castOther.getLitong()) || (this
						.getLitong() != null && castOther.getLitong() != null && this
						.getLitong().equals(castOther.getLitong())))
				&& ((this.getYanchi() == castOther.getYanchi()) || (this
						.getYanchi() != null && castOther.getYanchi() != null && this
						.getYanchi().equals(castOther.getYanchi())))
				&& ((this.getTongxin() == castOther.getTongxin()) || (this
						.getTongxin() != null && castOther.getTongxin() != null && this
						.getTongxin().equals(castOther.getTongxin())))
				&& ((this.getQingtongxia() == castOther.getQingtongxia()) || (this
						.getQingtongxia() != null
						&& castOther.getQingtongxia() != null && this
						.getQingtongxia().equals(castOther.getQingtongxia())));
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
				+ (getWuzhong() == null ? 0 : this.getWuzhong().hashCode());
		result = 37 * result
				+ (getHongsipu() == null ? 0 : this.getHongsipu().hashCode());
		result = 37 * result
				+ (getLitong() == null ? 0 : this.getLitong().hashCode());
		result = 37 * result
				+ (getYanchi() == null ? 0 : this.getYanchi().hashCode());
		result = 37 * result
				+ (getTongxin() == null ? 0 : this.getTongxin().hashCode());
		result = 37
				* result
				+ (getQingtongxia() == null ? 0 : this.getQingtongxia()
						.hashCode());
		return result;
	}

}