package com.ningxia.wine.entity;

/**
 * T20204Id entity. @author MyEclipse Persistence Tools
 */

public class T20204Id implements java.io.Serializable {

	// Fields

	private String nd;
	private String gscode;
	private String zb;
	private String bptime;
	private String dj;
	private String bz;
	private Long id202;
	private Integer id;

	// Constructors

	/** default constructor */
	public T20204Id() {
	}

	/** minimal constructor */
	public T20204Id(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public T20204Id(String nd, String gscode, String zb, String bptime,
			String dj, String bz, Long id202, Integer id) {
		this.nd = nd;
		this.gscode = gscode;
		this.zb = zb;
		this.bptime = bptime;
		this.dj = dj;
		this.bz = bz;
		this.id202 = id202;
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

	public String getZb() {
		return this.zb;
	}

	public void setZb(String zb) {
		this.zb = zb;
	}

	public String getBptime() {
		return this.bptime;
	}

	public void setBptime(String bptime) {
		this.bptime = bptime;
	}

	public String getDj() {
		return this.dj;
	}

	public void setDj(String dj) {
		this.dj = dj;
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
		if (!(other instanceof T20204Id))
			return false;
		T20204Id castOther = (T20204Id) other;

		return ((this.getNd() == castOther.getNd()) || (this.getNd() != null
				&& castOther.getNd() != null && this.getNd().equals(
				castOther.getNd())))
				&& ((this.getGscode() == castOther.getGscode()) || (this
						.getGscode() != null && castOther.getGscode() != null && this
						.getGscode().equals(castOther.getGscode())))
				&& ((this.getZb() == castOther.getZb()) || (this.getZb() != null
						&& castOther.getZb() != null && this.getZb().equals(
						castOther.getZb())))
				&& ((this.getBptime() == castOther.getBptime()) || (this
						.getBptime() != null && castOther.getBptime() != null && this
						.getBptime().equals(castOther.getBptime())))
				&& ((this.getDj() == castOther.getDj()) || (this.getDj() != null
						&& castOther.getDj() != null && this.getDj().equals(
						castOther.getDj())))
				&& ((this.getBz() == castOther.getBz()) || (this.getBz() != null
						&& castOther.getBz() != null && this.getBz().equals(
						castOther.getBz())))
				&& ((this.getId202() == castOther.getId202()) || (this
						.getId202() != null && castOther.getId202() != null && this
						.getId202().equals(castOther.getId202())))
				&& ((this.getId() == castOther.getId()) || (this.getId() != null
						&& castOther.getId() != null && this.getId().equals(
						castOther.getId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getNd() == null ? 0 : this.getNd().hashCode());
		result = 37 * result
				+ (getGscode() == null ? 0 : this.getGscode().hashCode());
		result = 37 * result + (getZb() == null ? 0 : this.getZb().hashCode());
		result = 37 * result
				+ (getBptime() == null ? 0 : this.getBptime().hashCode());
		result = 37 * result + (getDj() == null ? 0 : this.getDj().hashCode());
		result = 37 * result + (getBz() == null ? 0 : this.getBz().hashCode());
		result = 37 * result
				+ (getId202() == null ? 0 : this.getId202().hashCode());
		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		return result;
	}

}