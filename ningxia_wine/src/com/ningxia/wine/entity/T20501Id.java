package com.ningxia.wine.entity;

/**
 * T20501Id entity. @author MyEclipse Persistence Tools
 */

public class T20501Id implements java.io.Serializable {

	// Fields

	private String nd;
	private String gscode;
	private String name;
	private String xb;
	private String csrq;
	private String zw;
	private String whcd;
	private String rdsj;
	private String rdzzmc;
	private String lxfs;
	private Integer id;

	// Constructors

	/** default constructor */
	public T20501Id() {
	}

	/** minimal constructor */
	public T20501Id(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public T20501Id(String nd, String gscode, String name, String xb,
			String csrq, String zw, String whcd, String rdsj, String rdzzmc,
			String lxfs, Integer id) {
		this.nd = nd;
		this.gscode = gscode;
		this.name = name;
		this.xb = xb;
		this.csrq = csrq;
		this.zw = zw;
		this.whcd = whcd;
		this.rdsj = rdsj;
		this.rdzzmc = rdzzmc;
		this.lxfs = lxfs;
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

	public String getXb() {
		return this.xb;
	}

	public void setXb(String xb) {
		this.xb = xb;
	}

	public String getCsrq() {
		return this.csrq;
	}

	public void setCsrq(String csrq) {
		this.csrq = csrq;
	}

	public String getZw() {
		return this.zw;
	}

	public void setZw(String zw) {
		this.zw = zw;
	}

	public String getWhcd() {
		return this.whcd;
	}

	public void setWhcd(String whcd) {
		this.whcd = whcd;
	}

	public String getRdsj() {
		return this.rdsj;
	}

	public void setRdsj(String rdsj) {
		this.rdsj = rdsj;
	}

	public String getRdzzmc() {
		return this.rdzzmc;
	}

	public void setRdzzmc(String rdzzmc) {
		this.rdzzmc = rdzzmc;
	}

	public String getLxfs() {
		return this.lxfs;
	}

	public void setLxfs(String lxfs) {
		this.lxfs = lxfs;
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
		if (!(other instanceof T20501Id))
			return false;
		T20501Id castOther = (T20501Id) other;

		return ((this.getNd() == castOther.getNd()) || (this.getNd() != null
				&& castOther.getNd() != null && this.getNd().equals(
				castOther.getNd())))
				&& ((this.getGscode() == castOther.getGscode()) || (this
						.getGscode() != null && castOther.getGscode() != null && this
						.getGscode().equals(castOther.getGscode())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null
						&& castOther.getName() != null && this.getName()
						.equals(castOther.getName())))
				&& ((this.getXb() == castOther.getXb()) || (this.getXb() != null
						&& castOther.getXb() != null && this.getXb().equals(
						castOther.getXb())))
				&& ((this.getCsrq() == castOther.getCsrq()) || (this.getCsrq() != null
						&& castOther.getCsrq() != null && this.getCsrq()
						.equals(castOther.getCsrq())))
				&& ((this.getZw() == castOther.getZw()) || (this.getZw() != null
						&& castOther.getZw() != null && this.getZw().equals(
						castOther.getZw())))
				&& ((this.getWhcd() == castOther.getWhcd()) || (this.getWhcd() != null
						&& castOther.getWhcd() != null && this.getWhcd()
						.equals(castOther.getWhcd())))
				&& ((this.getRdsj() == castOther.getRdsj()) || (this.getRdsj() != null
						&& castOther.getRdsj() != null && this.getRdsj()
						.equals(castOther.getRdsj())))
				&& ((this.getRdzzmc() == castOther.getRdzzmc()) || (this
						.getRdzzmc() != null && castOther.getRdzzmc() != null && this
						.getRdzzmc().equals(castOther.getRdzzmc())))
				&& ((this.getLxfs() == castOther.getLxfs()) || (this.getLxfs() != null
						&& castOther.getLxfs() != null && this.getLxfs()
						.equals(castOther.getLxfs())))
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
		result = 37 * result + (getXb() == null ? 0 : this.getXb().hashCode());
		result = 37 * result
				+ (getCsrq() == null ? 0 : this.getCsrq().hashCode());
		result = 37 * result + (getZw() == null ? 0 : this.getZw().hashCode());
		result = 37 * result
				+ (getWhcd() == null ? 0 : this.getWhcd().hashCode());
		result = 37 * result
				+ (getRdsj() == null ? 0 : this.getRdsj().hashCode());
		result = 37 * result
				+ (getRdzzmc() == null ? 0 : this.getRdzzmc().hashCode());
		result = 37 * result
				+ (getLxfs() == null ? 0 : this.getLxfs().hashCode());
		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		return result;
	}

}