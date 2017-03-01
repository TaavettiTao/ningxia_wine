package com.ningxia.wine.entity;

/**
 * T20601Id entity. @author MyEclipse Persistence Tools
 */

public class T20601Id implements java.io.Serializable {

	// Fields

	private String nd;
	private String gscode;
	private String ptlsCode;
	private String ptlsName;
	private String code;
	private String name;
	private String mmly;
	private Double zzmj;
	private Double dnmc;
	private Double cl;
	private Double xxdj;
	private Double xxe;
	private String bz;
	private Integer id;
	private Integer id206;

	// Constructors

	/** default constructor */
	public T20601Id() {
	}

	/** minimal constructor */
	public T20601Id(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public T20601Id(String nd, String gscode, String ptlsCode, String ptlsName,
			String code, String name, String mmly, Double zzmj, Double dnmc,
			Double cl, Double xxdj, Double xxe, String bz, Integer id,
			Integer id206) {
		this.nd = nd;
		this.gscode = gscode;
		this.ptlsCode = ptlsCode;
		this.ptlsName = ptlsName;
		this.code = code;
		this.name = name;
		this.mmly = mmly;
		this.zzmj = zzmj;
		this.dnmc = dnmc;
		this.cl = cl;
		this.xxdj = xxdj;
		this.xxe = xxe;
		this.bz = bz;
		this.id = id;
		this.id206 = id206;
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

	public String getPtlsCode() {
		return this.ptlsCode;
	}

	public void setPtlsCode(String ptlsCode) {
		this.ptlsCode = ptlsCode;
	}

	public String getPtlsName() {
		return this.ptlsName;
	}

	public void setPtlsName(String ptlsName) {
		this.ptlsName = ptlsName;
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

	public String getMmly() {
		return this.mmly;
	}

	public void setMmly(String mmly) {
		this.mmly = mmly;
	}

	public Double getZzmj() {
		return this.zzmj;
	}

	public void setZzmj(Double zzmj) {
		this.zzmj = zzmj;
	}

	public Double getDnmc() {
		return this.dnmc;
	}

	public void setDnmc(Double dnmc) {
		this.dnmc = dnmc;
	}

	public Double getCl() {
		return this.cl;
	}

	public void setCl(Double cl) {
		this.cl = cl;
	}

	public Double getXxdj() {
		return this.xxdj;
	}

	public void setXxdj(Double xxdj) {
		this.xxdj = xxdj;
	}

	public Double getXxe() {
		return this.xxe;
	}

	public void setXxe(Double xxe) {
		this.xxe = xxe;
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

	public Integer getId206() {
		return this.id206;
	}

	public void setId206(Integer id206) {
		this.id206 = id206;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof T20601Id))
			return false;
		T20601Id castOther = (T20601Id) other;

		return ((this.getNd() == castOther.getNd()) || (this.getNd() != null
				&& castOther.getNd() != null && this.getNd().equals(
				castOther.getNd())))
				&& ((this.getGscode() == castOther.getGscode()) || (this
						.getGscode() != null && castOther.getGscode() != null && this
						.getGscode().equals(castOther.getGscode())))
				&& ((this.getPtlsCode() == castOther.getPtlsCode()) || (this
						.getPtlsCode() != null
						&& castOther.getPtlsCode() != null && this
						.getPtlsCode().equals(castOther.getPtlsCode())))
				&& ((this.getPtlsName() == castOther.getPtlsName()) || (this
						.getPtlsName() != null
						&& castOther.getPtlsName() != null && this
						.getPtlsName().equals(castOther.getPtlsName())))
				&& ((this.getCode() == castOther.getCode()) || (this.getCode() != null
						&& castOther.getCode() != null && this.getCode()
						.equals(castOther.getCode())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null
						&& castOther.getName() != null && this.getName()
						.equals(castOther.getName())))
				&& ((this.getMmly() == castOther.getMmly()) || (this.getMmly() != null
						&& castOther.getMmly() != null && this.getMmly()
						.equals(castOther.getMmly())))
				&& ((this.getZzmj() == castOther.getZzmj()) || (this.getZzmj() != null
						&& castOther.getZzmj() != null && this.getZzmj()
						.equals(castOther.getZzmj())))
				&& ((this.getDnmc() == castOther.getDnmc()) || (this.getDnmc() != null
						&& castOther.getDnmc() != null && this.getDnmc()
						.equals(castOther.getDnmc())))
				&& ((this.getCl() == castOther.getCl()) || (this.getCl() != null
						&& castOther.getCl() != null && this.getCl().equals(
						castOther.getCl())))
				&& ((this.getXxdj() == castOther.getXxdj()) || (this.getXxdj() != null
						&& castOther.getXxdj() != null && this.getXxdj()
						.equals(castOther.getXxdj())))
				&& ((this.getXxe() == castOther.getXxe()) || (this.getXxe() != null
						&& castOther.getXxe() != null && this.getXxe().equals(
						castOther.getXxe())))
				&& ((this.getBz() == castOther.getBz()) || (this.getBz() != null
						&& castOther.getBz() != null && this.getBz().equals(
						castOther.getBz())))
				&& ((this.getId() == castOther.getId()) || (this.getId() != null
						&& castOther.getId() != null && this.getId().equals(
						castOther.getId())))
				&& ((this.getId206() == castOther.getId206()) || (this
						.getId206() != null && castOther.getId206() != null && this
						.getId206().equals(castOther.getId206())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getNd() == null ? 0 : this.getNd().hashCode());
		result = 37 * result
				+ (getGscode() == null ? 0 : this.getGscode().hashCode());
		result = 37 * result
				+ (getPtlsCode() == null ? 0 : this.getPtlsCode().hashCode());
		result = 37 * result
				+ (getPtlsName() == null ? 0 : this.getPtlsName().hashCode());
		result = 37 * result
				+ (getCode() == null ? 0 : this.getCode().hashCode());
		result = 37 * result
				+ (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result
				+ (getMmly() == null ? 0 : this.getMmly().hashCode());
		result = 37 * result
				+ (getZzmj() == null ? 0 : this.getZzmj().hashCode());
		result = 37 * result
				+ (getDnmc() == null ? 0 : this.getDnmc().hashCode());
		result = 37 * result + (getCl() == null ? 0 : this.getCl().hashCode());
		result = 37 * result
				+ (getXxdj() == null ? 0 : this.getXxdj().hashCode());
		result = 37 * result
				+ (getXxe() == null ? 0 : this.getXxe().hashCode());
		result = 37 * result + (getBz() == null ? 0 : this.getBz().hashCode());
		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getId206() == null ? 0 : this.getId206().hashCode());
		return result;
	}

}