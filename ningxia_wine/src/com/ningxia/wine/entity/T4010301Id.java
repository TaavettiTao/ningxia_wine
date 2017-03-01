package com.ningxia.wine.entity;

/**
 * T4010301Id entity. @author MyEclipse Persistence Tools
 */

public class T4010301Id implements java.io.Serializable {

	// Fields

	private Integer id;
	private String nd;
	private String gscode;
	private String code;
	private String name;
	private String dw;
	private Double sl;
	private Double je;
	private String qx;
	private String bz;

	// Constructors

	/** default constructor */
	public T4010301Id() {
	}

	/** minimal constructor */
	public T4010301Id(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public T4010301Id(Integer id, String nd, String gscode, String code,
			String name, String dw, Double sl, Double je, String qx, String bz) {
		this.id = id;
		this.nd = nd;
		this.gscode = gscode;
		this.code = code;
		this.name = name;
		this.dw = dw;
		this.sl = sl;
		this.je = je;
		this.qx = qx;
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

	public String getDw() {
		return this.dw;
	}

	public void setDw(String dw) {
		this.dw = dw;
	}

	public Double getSl() {
		return this.sl;
	}

	public void setSl(Double sl) {
		this.sl = sl;
	}

	public Double getJe() {
		return this.je;
	}

	public void setJe(Double je) {
		this.je = je;
	}

	public String getQx() {
		return this.qx;
	}

	public void setQx(String qx) {
		this.qx = qx;
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
		if (!(other instanceof T4010301Id))
			return false;
		T4010301Id castOther = (T4010301Id) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getNd() == castOther.getNd()) || (this.getNd() != null
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
				&& ((this.getDw() == castOther.getDw()) || (this.getDw() != null
						&& castOther.getDw() != null && this.getDw().equals(
						castOther.getDw())))
				&& ((this.getSl() == castOther.getSl()) || (this.getSl() != null
						&& castOther.getSl() != null && this.getSl().equals(
						castOther.getSl())))
				&& ((this.getJe() == castOther.getJe()) || (this.getJe() != null
						&& castOther.getJe() != null && this.getJe().equals(
						castOther.getJe())))
				&& ((this.getQx() == castOther.getQx()) || (this.getQx() != null
						&& castOther.getQx() != null && this.getQx().equals(
						castOther.getQx())))
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
				+ (getCode() == null ? 0 : this.getCode().hashCode());
		result = 37 * result
				+ (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result + (getDw() == null ? 0 : this.getDw().hashCode());
		result = 37 * result + (getSl() == null ? 0 : this.getSl().hashCode());
		result = 37 * result + (getJe() == null ? 0 : this.getJe().hashCode());
		result = 37 * result + (getQx() == null ? 0 : this.getQx().hashCode());
		result = 37 * result + (getBz() == null ? 0 : this.getBz().hashCode());
		return result;
	}

}