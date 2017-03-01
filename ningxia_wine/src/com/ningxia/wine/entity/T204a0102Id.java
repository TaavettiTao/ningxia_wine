package com.ningxia.wine.entity;

/**
 * T204a0102Id entity. @author MyEclipse Persistence Tools
 */

public class T204a0102Id implements java.io.Serializable {

	// Fields

	private String nd;
	private String gscode;
	private String name;
	private Double yl;
	private String fs;
	private Integer cs;
	private String bz;
	private Integer id;

	// Constructors

	/** default constructor */
	public T204a0102Id() {
	}

	/** minimal constructor */
	public T204a0102Id(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public T204a0102Id(String nd, String gscode, String name, Double yl,
			String fs, Integer cs, String bz, Integer id) {
		this.nd = nd;
		this.gscode = gscode;
		this.name = name;
		this.yl = yl;
		this.fs = fs;
		this.cs = cs;
		this.bz = bz;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getYl() {
		return this.yl;
	}

	public void setYl(Double yl) {
		this.yl = yl;
	}

	public String getFs() {
		return this.fs;
	}

	public void setFs(String fs) {
		this.fs = fs;
	}

	public Integer getCs() {
		return this.cs;
	}

	public void setCs(Integer cs) {
		this.cs = cs;
	}

	public String getBz() {
		return this.bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
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
		if (!(other instanceof T204a0102Id))
			return false;
		T204a0102Id castOther = (T204a0102Id) other;

		return ((this.getNd() == castOther.getNd()) || (this.getNd() != null
				&& castOther.getNd() != null && this.getNd().equals(
				castOther.getNd())))
				&& ((this.getGscode() == castOther.getGscode()) || (this
						.getGscode() != null && castOther.getGscode() != null && this
						.getGscode().equals(castOther.getGscode())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null
						&& castOther.getName() != null && this.getName()
						.equals(castOther.getName())))
				&& ((this.getYl() == castOther.getYl()) || (this.getYl() != null
						&& castOther.getYl() != null && this.getYl().equals(
						castOther.getYl())))
				&& ((this.getFs() == castOther.getFs()) || (this.getFs() != null
						&& castOther.getFs() != null && this.getFs().equals(
						castOther.getFs())))
				&& ((this.getCs() == castOther.getCs()) || (this.getCs() != null
						&& castOther.getCs() != null && this.getCs().equals(
						castOther.getCs())))
				&& ((this.getBz() == castOther.getBz()) || (this.getBz() != null
						&& castOther.getBz() != null && this.getBz().equals(
						castOther.getBz())))
				&& ((this.getId() == castOther.getId()) || (this.getId() != null
						&& castOther.getId() != null && this.getId().equals(
						castOther.getId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getNd() == null ? 0 : this.getNd().hashCode());
		result = 37 * result
				+ (getGscode() == null ? 0 : this.getGscode().hashCode());
		result = 37 * result
				+ (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result + (getYl() == null ? 0 : this.getYl().hashCode());
		result = 37 * result + (getFs() == null ? 0 : this.getFs().hashCode());
		result = 37 * result + (getCs() == null ? 0 : this.getCs().hashCode());
		result = 37 * result + (getBz() == null ? 0 : this.getBz().hashCode());
		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		return result;
	}

}