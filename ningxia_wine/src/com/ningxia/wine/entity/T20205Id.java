package com.ningxia.wine.entity;

/**
 * T20205Id entity. @author MyEclipse Persistence Tools
 */

public class T20205Id implements java.io.Serializable {

	// Fields

	private Long id202;
	private Integer id;
	private String nd;
	private String gscode;
	private String lx;
	private String zb;
	private String rztime;
	private Double mj;
	private String zh;
	private String bz;

	// Constructors

	/** default constructor */
	public T20205Id() {
	}

	/** minimal constructor */
	public T20205Id(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public T20205Id(Long id202, Integer id, String nd, String gscode,
			String lx, String zb, String rztime, Double mj, String zh, String bz) {
		this.id202 = id202;
		this.id = id;
		this.nd = nd;
		this.gscode = gscode;
		this.lx = lx;
		this.zb = zb;
		this.rztime = rztime;
		this.mj = mj;
		this.zh = zh;
		this.bz = bz;
	}

	// Property accessors

	public Long getId202() {
		return this.id202;
	}

	public void setId202(Long id202) {
		this.id202 = id202;
	}

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

	public String getZb() {
		return this.zb;
	}

	public void setZb(String zb) {
		this.zb = zb;
	}

	public String getRztime() {
		return this.rztime;
	}

	public void setRztime(String rztime) {
		this.rztime = rztime;
	}

	public Double getMj() {
		return this.mj;
	}

	public void setMj(Double mj) {
		this.mj = mj;
	}

	public String getZh() {
		return this.zh;
	}

	public void setZh(String zh) {
		this.zh = zh;
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
		if (!(other instanceof T20205Id))
			return false;
		T20205Id castOther = (T20205Id) other;

		return ((this.getId202() == castOther.getId202()) || (this.getId202() != null
				&& castOther.getId202() != null && this.getId202().equals(
				castOther.getId202())))
				&& ((this.getId() == castOther.getId()) || (this.getId() != null
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
				&& ((this.getZb() == castOther.getZb()) || (this.getZb() != null
						&& castOther.getZb() != null && this.getZb().equals(
						castOther.getZb())))
				&& ((this.getRztime() == castOther.getRztime()) || (this
						.getRztime() != null && castOther.getRztime() != null && this
						.getRztime().equals(castOther.getRztime())))
				&& ((this.getMj() == castOther.getMj()) || (this.getMj() != null
						&& castOther.getMj() != null && this.getMj().equals(
						castOther.getMj())))
				&& ((this.getZh() == castOther.getZh()) || (this.getZh() != null
						&& castOther.getZh() != null && this.getZh().equals(
						castOther.getZh())))
				&& ((this.getBz() == castOther.getBz()) || (this.getBz() != null
						&& castOther.getBz() != null && this.getBz().equals(
						castOther.getBz())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getId202() == null ? 0 : this.getId202().hashCode());
		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result + (getNd() == null ? 0 : this.getNd().hashCode());
		result = 37 * result
				+ (getGscode() == null ? 0 : this.getGscode().hashCode());
		result = 37 * result + (getLx() == null ? 0 : this.getLx().hashCode());
		result = 37 * result + (getZb() == null ? 0 : this.getZb().hashCode());
		result = 37 * result
				+ (getRztime() == null ? 0 : this.getRztime().hashCode());
		result = 37 * result + (getMj() == null ? 0 : this.getMj().hashCode());
		result = 37 * result + (getZh() == null ? 0 : this.getZh().hashCode());
		result = 37 * result + (getBz() == null ? 0 : this.getBz().hashCode());
		return result;
	}

}