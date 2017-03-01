package com.ningxia.wine.entity;

/**
 * T401030101Id entity. @author MyEclipse Persistence Tools
 */

public class T401030101Id implements java.io.Serializable {

	// Fields

	private Integer id;
	private String nd;
	private String gscode;
	private String lx;
	private String jk;
	private Integer sl;
	private Double dj;
	private String cd;
	private String bz;

	// Constructors

	/** default constructor */
	public T401030101Id() {
	}

	/** minimal constructor */
	public T401030101Id(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public T401030101Id(Integer id, String nd, String gscode, String lx,
			String jk, Integer sl, Double dj, String cd, String bz) {
		this.id = id;
		this.nd = nd;
		this.gscode = gscode;
		this.lx = lx;
		this.jk = jk;
		this.sl = sl;
		this.dj = dj;
		this.cd = cd;
		this.bz = bz;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public String getLx() {
		return this.lx;
	}

	public void setLx(String lx) {
		this.lx = lx;
	}

	public String getJk() {
		return this.jk;
	}

	public void setJk(String jk) {
		this.jk = jk;
	}

	public Integer getSl() {
		return this.sl;
	}

	public void setSl(Integer sl) {
		this.sl = sl;
	}

	public Double getDj() {
		return this.dj;
	}

	public void setDj(Double dj) {
		this.dj = dj;
	}

	public String getCd() {
		return this.cd;
	}

	public void setCd(String cd) {
		this.cd = cd;
	}

	public String getBz() {
		return this.bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof T401030101Id))
			return false;
		T401030101Id castOther = (T401030101Id) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getNd() == castOther.getNd()) || (this.getNd() != null
						&& castOther.getNd() != null && this.getNd().equals(
						castOther.getNd())))
				&& ((this.getGscode() == castOther.getGscode()) || (this
						.getGscode() != null && castOther.getGscode() != null && this
						.getGscode().equals(castOther.getGscode())))
				&& ((this.getLx() == castOther.getLx()) || (this.getLx() != null
						&& castOther.getLx() != null && this.getLx().equals(
						castOther.getLx())))
				&& ((this.getJk() == castOther.getJk()) || (this.getJk() != null
						&& castOther.getJk() != null && this.getJk().equals(
						castOther.getJk())))
				&& ((this.getSl() == castOther.getSl()) || (this.getSl() != null
						&& castOther.getSl() != null && this.getSl().equals(
						castOther.getSl())))
				&& ((this.getDj() == castOther.getDj()) || (this.getDj() != null
						&& castOther.getDj() != null && this.getDj().equals(
						castOther.getDj())))
				&& ((this.getCd() == castOther.getCd()) || (this.getCd() != null
						&& castOther.getCd() != null && this.getCd().equals(
						castOther.getCd())))
				&& ((this.getBz() == castOther.getBz()) || (this.getBz() != null
						&& castOther.getBz() != null && this.getBz().equals(
						castOther.getBz())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result + (getNd() == null ? 0 : this.getNd().hashCode());
		result = 37 * result
				+ (getGscode() == null ? 0 : this.getGscode().hashCode());
		result = 37 * result + (getLx() == null ? 0 : this.getLx().hashCode());
		result = 37 * result + (getJk() == null ? 0 : this.getJk().hashCode());
		result = 37 * result + (getSl() == null ? 0 : this.getSl().hashCode());
		result = 37 * result + (getDj() == null ? 0 : this.getDj().hashCode());
		result = 37 * result + (getCd() == null ? 0 : this.getCd().hashCode());
		result = 37 * result + (getBz() == null ? 0 : this.getBz().hashCode());
		return result;
	}

}