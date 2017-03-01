package com.ningxia.wine.entity;

/**
 * TPtpzId entity. @author MyEclipse Persistence Tools
 */

public class TPtpzId implements java.io.Serializable {

	// Fields

	private String code;
	private String name;
	private String bmname;
	private String py;
	private String ss;
	private String zl;
	private String bz;

	// Constructors

	/** default constructor */
	public TPtpzId() {
	}

	/** minimal constructor */
	public TPtpzId(String code) {
		this.code = code;
	}

	/** full constructor */
	public TPtpzId(String code, String name, String bmname, String py,
			String ss, String zl, String bz) {
		this.code = code;
		this.name = name;
		this.bmname = bmname;
		this.py = py;
		this.ss = ss;
		this.zl = zl;
		this.bz = bz;
	}

	// Property accessors

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBmname() {
		return this.bmname;
	}

	public void setBmname(String bmname) {
		this.bmname = bmname;
	}

	public String getPy() {
		return this.py;
	}

	public void setPy(String py) {
		this.py = py;
	}

	public String getSs() {
		return this.ss;
	}

	public void setSs(String ss) {
		this.ss = ss;
	}

	public String getZl() {
		return this.zl;
	}

	public void setZl(String zl) {
		this.zl = zl;
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
		if (!(other instanceof TPtpzId))
			return false;
		TPtpzId castOther = (TPtpzId) other;

		return ((this.getCode() == castOther.getCode()) || (this.getCode() != null
				&& castOther.getCode() != null && this.getCode().equals(
				castOther.getCode())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null
						&& castOther.getName() != null && this.getName()
						.equals(castOther.getName())))
				&& ((this.getBmname() == castOther.getBmname()) || (this
						.getBmname() != null && castOther.getBmname() != null && this
						.getBmname().equals(castOther.getBmname())))
				&& ((this.getPy() == castOther.getPy()) || (this.getPy() != null
						&& castOther.getPy() != null && this.getPy().equals(
						castOther.getPy())))
				&& ((this.getSs() == castOther.getSs()) || (this.getSs() != null
						&& castOther.getSs() != null && this.getSs().equals(
						castOther.getSs())))
				&& ((this.getZl() == castOther.getZl()) || (this.getZl() != null
						&& castOther.getZl() != null && this.getZl().equals(
						castOther.getZl())))
				&& ((this.getBz() == castOther.getBz()) || (this.getBz() != null
						&& castOther.getBz() != null && this.getBz().equals(
						castOther.getBz())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCode() == null ? 0 : this.getCode().hashCode());
		result = 37 * result
				+ (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result
				+ (getBmname() == null ? 0 : this.getBmname().hashCode());
		result = 37 * result + (getPy() == null ? 0 : this.getPy().hashCode());
		result = 37 * result + (getSs() == null ? 0 : this.getSs().hashCode());
		result = 37 * result + (getZl() == null ? 0 : this.getZl().hashCode());
		result = 37 * result + (getBz() == null ? 0 : this.getBz().hashCode());
		return result;
	}

}