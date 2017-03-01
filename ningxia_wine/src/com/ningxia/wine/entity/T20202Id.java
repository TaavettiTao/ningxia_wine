package com.ningxia.wine.entity;

/**
 * T20202Id entity. @author MyEclipse Persistence Tools
 */

public class T20202Id implements java.io.Serializable {

	// Fields

	private String nd;
	private String gscode;
	private String pz;
	private String zm;
	private String gysname;
	private String dztime;
	private Double zzmj;
	private Double zcl;
	private Double zyl;
	private Double xl;
	private Double wxdj;
	private String wxqx;
	private String bz;
	private Long id202;
	private String ptname;
	private String ptCode;
	private Integer id;

	// Constructors

	/** default constructor */
	public T20202Id() {
	}

	/** minimal constructor */
	public T20202Id(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public T20202Id(String nd, String gscode, String pz, String zm,
			String gysname, String dztime, Double zzmj, Double zcl, Double zyl,
			Double xl, Double wxdj, String wxqx, String bz, Long id202,
			String ptname, String ptCode, Integer id) {
		this.nd = nd;
		this.gscode = gscode;
		this.pz = pz;
		this.zm = zm;
		this.gysname = gysname;
		this.dztime = dztime;
		this.zzmj = zzmj;
		this.zcl = zcl;
		this.zyl = zyl;
		this.xl = xl;
		this.wxdj = wxdj;
		this.wxqx = wxqx;
		this.bz = bz;
		this.id202 = id202;
		this.ptname = ptname;
		this.ptCode = ptCode;
		this.id = id;
	}

	// Property accessors

	public String getNd() {
		return this.nd;
	}

	public void setNd(String nd) {
		this.nd = nd;
	}

	public String getGscode() {
		return this.gscode;
	}

	public void setGscode(String gscode) {
		this.gscode = gscode;
	}

	public String getPz() {
		return this.pz;
	}

	public void setPz(String pz) {
		this.pz = pz;
	}

	public String getZm() {
		return this.zm;
	}

	public void setZm(String zm) {
		this.zm = zm;
	}

	public String getGysname() {
		return this.gysname;
	}

	public void setGysname(String gysname) {
		this.gysname = gysname;
	}

	public String getDztime() {
		return this.dztime;
	}

	public void setDztime(String dztime) {
		this.dztime = dztime;
	}

	public Double getZzmj() {
		return this.zzmj;
	}

	public void setZzmj(Double zzmj) {
		this.zzmj = zzmj;
	}

	public Double getZcl() {
		return this.zcl;
	}

	public void setZcl(Double zcl) {
		this.zcl = zcl;
	}

	public Double getZyl() {
		return this.zyl;
	}

	public void setZyl(Double zyl) {
		this.zyl = zyl;
	}

	public Double getXl() {
		return this.xl;
	}

	public void setXl(Double xl) {
		this.xl = xl;
	}

	public Double getWxdj() {
		return this.wxdj;
	}

	public void setWxdj(Double wxdj) {
		this.wxdj = wxdj;
	}

	public String getWxqx() {
		return this.wxqx;
	}

	public void setWxqx(String wxqx) {
		this.wxqx = wxqx;
	}

	public String getBz() {
		return this.bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	public Long getId202() {
		return this.id202;
	}

	public void setId202(Long id202) {
		this.id202 = id202;
	}

	public String getPtname() {
		return this.ptname;
	}

	public void setPtname(String ptname) {
		this.ptname = ptname;
	}

	public String getPtCode() {
		return this.ptCode;
	}

	public void setPtCode(String ptCode) {
		this.ptCode = ptCode;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof T20202Id))
			return false;
		T20202Id castOther = (T20202Id) other;

		return ((this.getNd() == castOther.getNd()) || (this.getNd() != null
				&& castOther.getNd() != null && this.getNd().equals(
				castOther.getNd())))
				&& ((this.getGscode() == castOther.getGscode()) || (this
						.getGscode() != null && castOther.getGscode() != null && this
						.getGscode().equals(castOther.getGscode())))
				&& ((this.getPz() == castOther.getPz()) || (this.getPz() != null
						&& castOther.getPz() != null && this.getPz().equals(
						castOther.getPz())))
				&& ((this.getZm() == castOther.getZm()) || (this.getZm() != null
						&& castOther.getZm() != null && this.getZm().equals(
						castOther.getZm())))
				&& ((this.getGysname() == castOther.getGysname()) || (this
						.getGysname() != null && castOther.getGysname() != null && this
						.getGysname().equals(castOther.getGysname())))
				&& ((this.getDztime() == castOther.getDztime()) || (this
						.getDztime() != null && castOther.getDztime() != null && this
						.getDztime().equals(castOther.getDztime())))
				&& ((this.getZzmj() == castOther.getZzmj()) || (this.getZzmj() != null
						&& castOther.getZzmj() != null && this.getZzmj()
						.equals(castOther.getZzmj())))
				&& ((this.getZcl() == castOther.getZcl()) || (this.getZcl() != null
						&& castOther.getZcl() != null && this.getZcl().equals(
						castOther.getZcl())))
				&& ((this.getZyl() == castOther.getZyl()) || (this.getZyl() != null
						&& castOther.getZyl() != null && this.getZyl().equals(
						castOther.getZyl())))
				&& ((this.getXl() == castOther.getXl()) || (this.getXl() != null
						&& castOther.getXl() != null && this.getXl().equals(
						castOther.getXl())))
				&& ((this.getWxdj() == castOther.getWxdj()) || (this.getWxdj() != null
						&& castOther.getWxdj() != null && this.getWxdj()
						.equals(castOther.getWxdj())))
				&& ((this.getWxqx() == castOther.getWxqx()) || (this.getWxqx() != null
						&& castOther.getWxqx() != null && this.getWxqx()
						.equals(castOther.getWxqx())))
				&& ((this.getBz() == castOther.getBz()) || (this.getBz() != null
						&& castOther.getBz() != null && this.getBz().equals(
						castOther.getBz())))
				&& ((this.getId202() == castOther.getId202()) || (this
						.getId202() != null && castOther.getId202() != null && this
						.getId202().equals(castOther.getId202())))
				&& ((this.getPtname() == castOther.getPtname()) || (this
						.getPtname() != null && castOther.getPtname() != null && this
						.getPtname().equals(castOther.getPtname())))
				&& ((this.getPtCode() == castOther.getPtCode()) || (this
						.getPtCode() != null && castOther.getPtCode() != null && this
						.getPtCode().equals(castOther.getPtCode())))
				&& ((this.getId() == castOther.getId()) || (this.getId() != null
						&& castOther.getId() != null && this.getId().equals(
						castOther.getId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getNd() == null ? 0 : this.getNd().hashCode());
		result = 37 * result
				+ (getGscode() == null ? 0 : this.getGscode().hashCode());
		result = 37 * result + (getPz() == null ? 0 : this.getPz().hashCode());
		result = 37 * result + (getZm() == null ? 0 : this.getZm().hashCode());
		result = 37 * result
				+ (getGysname() == null ? 0 : this.getGysname().hashCode());
		result = 37 * result
				+ (getDztime() == null ? 0 : this.getDztime().hashCode());
		result = 37 * result
				+ (getZzmj() == null ? 0 : this.getZzmj().hashCode());
		result = 37 * result
				+ (getZcl() == null ? 0 : this.getZcl().hashCode());
		result = 37 * result
				+ (getZyl() == null ? 0 : this.getZyl().hashCode());
		result = 37 * result + (getXl() == null ? 0 : this.getXl().hashCode());
		result = 37 * result
				+ (getWxdj() == null ? 0 : this.getWxdj().hashCode());
		result = 37 * result
				+ (getWxqx() == null ? 0 : this.getWxqx().hashCode());
		result = 37 * result + (getBz() == null ? 0 : this.getBz().hashCode());
		result = 37 * result
				+ (getId202() == null ? 0 : this.getId202().hashCode());
		result = 37 * result
				+ (getPtname() == null ? 0 : this.getPtname().hashCode());
		result = 37 * result
				+ (getPtCode() == null ? 0 : this.getPtCode().hashCode());
		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		return result;
	}

}