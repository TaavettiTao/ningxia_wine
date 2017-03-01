package com.ningxia.wine.entity;

/**
 * T20203Id entity. @author MyEclipse Persistence Tools
 */

public class T20203Id implements java.io.Serializable {

	// Fields

	private String nd;
	private String gscode;
	private String pz;
	private String zm;
	private String pzly;
	private String dztime;
	private Double zzmj;
	private Double cl;
	private Double xsdj;
	private String bz;
	private Long id202;
	private String ptname;
	private String ptCode;
	private Integer id;

	// Constructors

	/** default constructor */
	public T20203Id() {
	}

	/** minimal constructor */
	public T20203Id(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public T20203Id(String nd, String gscode, String pz, String zm,
			String pzly, String dztime, Double zzmj, Double cl, Double xsdj,
			String bz, Long id202, String ptname, String ptCode, Integer id) {
		this.nd = nd;
		this.gscode = gscode;
		this.pz = pz;
		this.zm = zm;
		this.pzly = pzly;
		this.dztime = dztime;
		this.zzmj = zzmj;
		this.cl = cl;
		this.xsdj = xsdj;
		this.bz = bz;
		this.id202 = id202;
		this.ptname = ptname;
		this.ptCode = ptCode;
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

	public String getPz() {
		return this.pz;
	}

	public void setPz(String pz) {
		this.pz = pz;
	}

	public String getZm() {
		return this.zm;
	}

	public void setZm(String zm) {
		this.zm = zm;
	}

	public String getPzly() {
		return this.pzly;
	}

	public void setPzly(String pzly) {
		this.pzly = pzly;
	}

	public String getDztime() {
		return this.dztime;
	}

	public void setDztime(String dztime) {
		this.dztime = dztime;
	}

	public Double getZzmj() {
		return this.zzmj;
	}

	public void setZzmj(Double zzmj) {
		this.zzmj = zzmj;
	}

	public Double getCl() {
		return this.cl;
	}

	public void setCl(Double cl) {
		this.cl = cl;
	}

	public Double getXsdj() {
		return this.xsdj;
	}

	public void setXsdj(Double xsdj) {
		this.xsdj = xsdj;
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

	public String getPtname() {
		return this.ptname;
	}

	public void setPtname(String ptname) {
		this.ptname = ptname;
	}

	public String getPtCode() {
		return this.ptCode;
	}

	public void setPtCode(String ptCode) {
		this.ptCode = ptCode;
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
		if (!(other instanceof T20203Id))
			return false;
		T20203Id castOther = (T20203Id) other;

		return ((this.getNd() == castOther.getNd()) || (this.getNd() != null
				&& castOther.getNd() != null && this.getNd().equals(
				castOther.getNd())))
				&& ((this.getGscode() == castOther.getGscode()) || (this
						.getGscode() != null && castOther.getGscode() != null && this
						.getGscode().equals(castOther.getGscode())))
				&& ((this.getPz() == castOther.getPz()) || (this.getPz() != null
						&& castOther.getPz() != null && this.getPz().equals(
						castOther.getPz())))
				&& ((this.getZm() == castOther.getZm()) || (this.getZm() != null
						&& castOther.getZm() != null && this.getZm().equals(
						castOther.getZm())))
				&& ((this.getPzly() == castOther.getPzly()) || (this.getPzly() != null
						&& castOther.getPzly() != null && this.getPzly()
						.equals(castOther.getPzly())))
				&& ((this.getDztime() == castOther.getDztime()) || (this
						.getDztime() != null && castOther.getDztime() != null && this
						.getDztime().equals(castOther.getDztime())))
				&& ((this.getZzmj() == castOther.getZzmj()) || (this.getZzmj() != null
						&& castOther.getZzmj() != null && this.getZzmj()
						.equals(castOther.getZzmj())))
				&& ((this.getCl() == castOther.getCl()) || (this.getCl() != null
						&& castOther.getCl() != null && this.getCl().equals(
						castOther.getCl())))
				&& ((this.getXsdj() == castOther.getXsdj()) || (this.getXsdj() != null
						&& castOther.getXsdj() != null && this.getXsdj()
						.equals(castOther.getXsdj())))
				&& ((this.getBz() == castOther.getBz()) || (this.getBz() != null
						&& castOther.getBz() != null && this.getBz().equals(
						castOther.getBz())))
				&& ((this.getId202() == castOther.getId202()) || (this
						.getId202() != null && castOther.getId202() != null && this
						.getId202().equals(castOther.getId202())))
				&& ((this.getPtname() == castOther.getPtname()) || (this
						.getPtname() != null && castOther.getPtname() != null && this
						.getPtname().equals(castOther.getPtname())))
				&& ((this.getPtCode() == castOther.getPtCode()) || (this
						.getPtCode() != null && castOther.getPtCode() != null && this
						.getPtCode().equals(castOther.getPtCode())))
				&& ((this.getId() == castOther.getId()) || (this.getId() != null
						&& castOther.getId() != null && this.getId().equals(
						castOther.getId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getNd() == null ? 0 : this.getNd().hashCode());
		result = 37 * result
				+ (getGscode() == null ? 0 : this.getGscode().hashCode());
		result = 37 * result + (getPz() == null ? 0 : this.getPz().hashCode());
		result = 37 * result + (getZm() == null ? 0 : this.getZm().hashCode());
		result = 37 * result
				+ (getPzly() == null ? 0 : this.getPzly().hashCode());
		result = 37 * result
				+ (getDztime() == null ? 0 : this.getDztime().hashCode());
		result = 37 * result
				+ (getZzmj() == null ? 0 : this.getZzmj().hashCode());
		result = 37 * result + (getCl() == null ? 0 : this.getCl().hashCode());
		result = 37 * result
				+ (getXsdj() == null ? 0 : this.getXsdj().hashCode());
		result = 37 * result + (getBz() == null ? 0 : this.getBz().hashCode());
		result = 37 * result
				+ (getId202() == null ? 0 : this.getId202().hashCode());
		result = 37 * result
				+ (getPtname() == null ? 0 : this.getPtname().hashCode());
		result = 37 * result
				+ (getPtCode() == null ? 0 : this.getPtCode().hashCode());
		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		return result;
	}

}