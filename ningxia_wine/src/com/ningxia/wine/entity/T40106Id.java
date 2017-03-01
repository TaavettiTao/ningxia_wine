package com.ningxia.wine.entity;

/**
 * T40106Id entity. @author MyEclipse Persistence Tools
 */

public class T40106Id implements java.io.Serializable {

	// Fields

	private Integer id;
	private String nd;
	private String gscode;
	private String name;
	private String zcdd;
	private Double nxsl;
	private Double nxse;
	private String bz;

	// Constructors

	/** default constructor */
	public T40106Id() {
	}

	/** minimal constructor */
	public T40106Id(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public T40106Id(Integer id, String nd, String gscode, String name,
			String zcdd, Double nxsl, Double nxse, String bz) {
		this.id = id;
		this.nd = nd;
		this.gscode = gscode;
		this.name = name;
		this.zcdd = zcdd;
		this.nxsl = nxsl;
		this.nxse = nxse;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getZcdd() {
		return this.zcdd;
	}

	public void setZcdd(String zcdd) {
		this.zcdd = zcdd;
	}

	public Double getNxsl() {
		return this.nxsl;
	}

	public void setNxsl(Double nxsl) {
		this.nxsl = nxsl;
	}

	public Double getNxse() {
		return this.nxse;
	}

	public void setNxse(Double nxse) {
		this.nxse = nxse;
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
		if (!(other instanceof T40106Id))
			return false;
		T40106Id castOther = (T40106Id) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getNd() == castOther.getNd()) || (this.getNd() != null
						&& castOther.getNd() != null && this.getNd().equals(
						castOther.getNd())))
				&& ((this.getGscode() == castOther.getGscode()) || (this
						.getGscode() != null && castOther.getGscode() != null && this
						.getGscode().equals(castOther.getGscode())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null
						&& castOther.getName() != null && this.getName()
						.equals(castOther.getName())))
				&& ((this.getZcdd() == castOther.getZcdd()) || (this.getZcdd() != null
						&& castOther.getZcdd() != null && this.getZcdd()
						.equals(castOther.getZcdd())))
				&& ((this.getNxsl() == castOther.getNxsl()) || (this.getNxsl() != null
						&& castOther.getNxsl() != null && this.getNxsl()
						.equals(castOther.getNxsl())))
				&& ((this.getNxse() == castOther.getNxse()) || (this.getNxse() != null
						&& castOther.getNxse() != null && this.getNxse()
						.equals(castOther.getNxse())))
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
		result = 37 * result
				+ (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result
				+ (getZcdd() == null ? 0 : this.getZcdd().hashCode());
		result = 37 * result
				+ (getNxsl() == null ? 0 : this.getNxsl().hashCode());
		result = 37 * result
				+ (getNxse() == null ? 0 : this.getNxse().hashCode());
		result = 37 * result + (getBz() == null ? 0 : this.getBz().hashCode());
		return result;
	}

}