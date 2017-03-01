package com.ningxia.wine.entity;

/**
 * T20801Id entity. @author MyEclipse Persistence Tools
 */

public class T20801Id implements java.io.Serializable {

	// Fields

	private Integer id;
	private String nd;
	private String gscode;
	private String gsname;
	private String cyname;
	private String fzrname;
	private String fzrtel;

	// Constructors

	/** default constructor */
	public T20801Id() {
	}

	/** minimal constructor */
	public T20801Id(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public T20801Id(Integer id, String nd, String gscode, String gsname,
			String cyname, String fzrname, String fzrtel) {
		this.id = id;
		this.nd = nd;
		this.gscode = gscode;
		this.gsname = gsname;
		this.cyname = cyname;
		this.fzrname = fzrname;
		this.fzrtel = fzrtel;
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

	public String getGsname() {
		return this.gsname;
	}

	public void setGsname(String gsname) {
		this.gsname = gsname;
	}

	public String getCyname() {
		return this.cyname;
	}

	public void setCyname(String cyname) {
		this.cyname = cyname;
	}

	public String getFzrname() {
		return this.fzrname;
	}

	public void setFzrname(String fzrname) {
		this.fzrname = fzrname;
	}

	public String getFzrtel() {
		return this.fzrtel;
	}

	public void setFzrtel(String fzrtel) {
		this.fzrtel = fzrtel;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof T20801Id))
			return false;
		T20801Id castOther = (T20801Id) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getNd() == castOther.getNd()) || (this.getNd() != null
						&& castOther.getNd() != null && this.getNd().equals(
						castOther.getNd())))
				&& ((this.getGscode() == castOther.getGscode()) || (this
						.getGscode() != null && castOther.getGscode() != null && this
						.getGscode().equals(castOther.getGscode())))
				&& ((this.getGsname() == castOther.getGsname()) || (this
						.getGsname() != null && castOther.getGsname() != null && this
						.getGsname().equals(castOther.getGsname())))
				&& ((this.getCyname() == castOther.getCyname()) || (this
						.getCyname() != null && castOther.getCyname() != null && this
						.getCyname().equals(castOther.getCyname())))
				&& ((this.getFzrname() == castOther.getFzrname()) || (this
						.getFzrname() != null && castOther.getFzrname() != null && this
						.getFzrname().equals(castOther.getFzrname())))
				&& ((this.getFzrtel() == castOther.getFzrtel()) || (this
						.getFzrtel() != null && castOther.getFzrtel() != null && this
						.getFzrtel().equals(castOther.getFzrtel())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result + (getNd() == null ? 0 : this.getNd().hashCode());
		result = 37 * result
				+ (getGscode() == null ? 0 : this.getGscode().hashCode());
		result = 37 * result
				+ (getGsname() == null ? 0 : this.getGsname().hashCode());
		result = 37 * result
				+ (getCyname() == null ? 0 : this.getCyname().hashCode());
		result = 37 * result
				+ (getFzrname() == null ? 0 : this.getFzrname().hashCode());
		result = 37 * result
				+ (getFzrtel() == null ? 0 : this.getFzrtel().hashCode());
		return result;
	}

}