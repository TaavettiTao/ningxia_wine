package com.ningxia.wine.entity;

/**
 * T4010302Id entity. @author MyEclipse Persistence Tools
 */

public class T4010302Id implements java.io.Serializable {

	// Fields

	private String nd;
	private String gscode;
	private String code;
	private String name;
	private Integer sl;
	private Double zb;
	private String bz;
	private Integer id;

	// Constructors

	/** default constructor */
	public T4010302Id() {
	}

	/** minimal constructor */
	public T4010302Id(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public T4010302Id(String nd, String gscode, String code, String name,
			Integer sl, Double zb, String bz, Integer id) {
		this.nd = nd;
		this.gscode = gscode;
		this.code = code;
		this.name = name;
		this.sl = sl;
		this.zb = zb;
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

	public Integer getSl() {
		return this.sl;
	}

	public void setSl(Integer sl) {
		this.sl = sl;
	}

	public Double getZb() {
		return this.zb;
	}

	public void setZb(Double zb) {
		this.zb = zb;
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
		if (!(other instanceof T4010302Id))
			return false;
		T4010302Id castOther = (T4010302Id) other;

		return ((this.getNd() == castOther.getNd()) || (this.getNd() != null
				&& castOther.getNd() != null && this.getNd().equals(
				castOther.getNd())))
				&& ((this.getGscode() == castOther.getGscode()) || (this
						.getGscode() != null && castOther.getGscode() != null && this
						.getGscode().equals(castOther.getGscode())))
				&& ((this.getCode() == castOther.getCode()) || (this.getCode() != null
						&& castOther.getCode() != null && this.getCode()
						.equals(castOther.getCode())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null
						&& castOther.getName() != null && this.getName()
						.equals(castOther.getName())))
				&& ((this.getSl() == castOther.getSl()) || (this.getSl() != null
						&& castOther.getSl() != null && this.getSl().equals(
						castOther.getSl())))
				&& ((this.getZb() == castOther.getZb()) || (this.getZb() != null
						&& castOther.getZb() != null && this.getZb().equals(
						castOther.getZb())))
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
				+ (getCode() == null ? 0 : this.getCode().hashCode());
		result = 37 * result
				+ (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result + (getSl() == null ? 0 : this.getSl().hashCode());
		result = 37 * result + (getZb() == null ? 0 : this.getZb().hashCode());
		result = 37 * result + (getBz() == null ? 0 : this.getBz().hashCode());
		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		return result;
	}

}