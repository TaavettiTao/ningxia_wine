package com.ningxia.wine.entity;

/**
 * T4010502Id entity. @author MyEclipse Persistence Tools
 */

public class T4010502Id implements java.io.Serializable {

	// Fields

	private Integer id;
	private String nd;
	private String gscode;
	private String name;
	private String dz;
	private String kytime;
	private String lxr;
	private String dh;
	private Integer czrs;
	private Double czrgz;
	private String bz;

	// Constructors

	/** default constructor */
	public T4010502Id() {
	}

	/** minimal constructor */
	public T4010502Id(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public T4010502Id(Integer id, String nd, String gscode, String name,
			String dz, String kytime, String lxr, String dh, Integer czrs,
			Double czrgz, String bz) {
		this.id = id;
		this.nd = nd;
		this.gscode = gscode;
		this.name = name;
		this.dz = dz;
		this.kytime = kytime;
		this.lxr = lxr;
		this.dh = dh;
		this.czrs = czrs;
		this.czrgz = czrgz;
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

	public String getDz() {
		return this.dz;
	}

	public void setDz(String dz) {
		this.dz = dz;
	}

	public String getKytime() {
		return this.kytime;
	}

	public void setKytime(String kytime) {
		this.kytime = kytime;
	}

	public String getLxr() {
		return this.lxr;
	}

	public void setLxr(String lxr) {
		this.lxr = lxr;
	}

	public String getDh() {
		return this.dh;
	}

	public void setDh(String dh) {
		this.dh = dh;
	}

	public Integer getCzrs() {
		return this.czrs;
	}

	public void setCzrs(Integer czrs) {
		this.czrs = czrs;
	}

	public Double getCzrgz() {
		return this.czrgz;
	}

	public void setCzrgz(Double czrgz) {
		this.czrgz = czrgz;
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
		if (!(other instanceof T4010502Id))
			return false;
		T4010502Id castOther = (T4010502Id) other;

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
				&& ((this.getDz() == castOther.getDz()) || (this.getDz() != null
						&& castOther.getDz() != null && this.getDz().equals(
						castOther.getDz())))
				&& ((this.getKytime() == castOther.getKytime()) || (this
						.getKytime() != null && castOther.getKytime() != null && this
						.getKytime().equals(castOther.getKytime())))
				&& ((this.getLxr() == castOther.getLxr()) || (this.getLxr() != null
						&& castOther.getLxr() != null && this.getLxr().equals(
						castOther.getLxr())))
				&& ((this.getDh() == castOther.getDh()) || (this.getDh() != null
						&& castOther.getDh() != null && this.getDh().equals(
						castOther.getDh())))
				&& ((this.getCzrs() == castOther.getCzrs()) || (this.getCzrs() != null
						&& castOther.getCzrs() != null && this.getCzrs()
						.equals(castOther.getCzrs())))
				&& ((this.getCzrgz() == castOther.getCzrgz()) || (this
						.getCzrgz() != null && castOther.getCzrgz() != null && this
						.getCzrgz().equals(castOther.getCzrgz())))
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
		result = 37 * result + (getDz() == null ? 0 : this.getDz().hashCode());
		result = 37 * result
				+ (getKytime() == null ? 0 : this.getKytime().hashCode());
		result = 37 * result
				+ (getLxr() == null ? 0 : this.getLxr().hashCode());
		result = 37 * result + (getDh() == null ? 0 : this.getDh().hashCode());
		result = 37 * result
				+ (getCzrs() == null ? 0 : this.getCzrs().hashCode());
		result = 37 * result
				+ (getCzrgz() == null ? 0 : this.getCzrgz().hashCode());
		result = 37 * result + (getBz() == null ? 0 : this.getBz().hashCode());
		return result;
	}

}