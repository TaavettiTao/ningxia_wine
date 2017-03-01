package com.ningxia.wine.entity;

/**
 * T204b01Id entity. @author MyEclipse Persistence Tools
 */

public class T204b01Id implements java.io.Serializable {

	// Fields

	private String nd;
	private String gscode;
	private String ptlsCode;
	private String ptlsName;
	private String code;
	private String name;
	private String lpys;
	private String lpls;
	private Double sl;
	private Double dj;
	private String cq;
	private String bz;
	private Integer id;

	// Constructors

	/** default constructor */
	public T204b01Id() {
	}

	/** minimal constructor */
	public T204b01Id(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public T204b01Id(String nd, String gscode, String ptlsCode,
			String ptlsName, String code, String name, String lpys,
			String lpls, Double sl, Double dj, String cq, String bz, Integer id) {
		this.nd = nd;
		this.gscode = gscode;
		this.ptlsCode = ptlsCode;
		this.ptlsName = ptlsName;
		this.code = code;
		this.name = name;
		this.lpys = lpys;
		this.lpls = lpls;
		this.sl = sl;
		this.dj = dj;
		this.cq = cq;
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

	public String getLpys() {
		return this.lpys;
	}

	public void setLpys(String lpys) {
		this.lpys = lpys;
	}

	public String getLpls() {
		return this.lpls;
	}

	public void setLpls(String lpls) {
		this.lpls = lpls;
	}

	public Double getSl() {
		return this.sl;
	}

	public void setSl(Double sl) {
		this.sl = sl;
	}

	public Double getDj() {
		return this.dj;
	}

	public void setDj(Double dj) {
		this.dj = dj;
	}

	public String getCq() {
		return this.cq;
	}

	public void setCq(String cq) {
		this.cq = cq;
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
		if (!(other instanceof T204b01Id))
			return false;
		T204b01Id castOther = (T204b01Id) other;

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
				&& ((this.getLpys() == castOther.getLpys()) || (this.getLpys() != null
						&& castOther.getLpys() != null && this.getLpys()
						.equals(castOther.getLpys())))
				&& ((this.getLpls() == castOther.getLpls()) || (this.getLpls() != null
						&& castOther.getLpls() != null && this.getLpls()
						.equals(castOther.getLpls())))
				&& ((this.getSl() == castOther.getSl()) || (this.getSl() != null
						&& castOther.getSl() != null && this.getSl().equals(
						castOther.getSl())))
				&& ((this.getDj() == castOther.getDj()) || (this.getDj() != null
						&& castOther.getDj() != null && this.getDj().equals(
						castOther.getDj())))
				&& ((this.getCq() == castOther.getCq()) || (this.getCq() != null
						&& castOther.getCq() != null && this.getCq().equals(
						castOther.getCq())))
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
				+ (getPtlsCode() == null ? 0 : this.getPtlsCode().hashCode());
		result = 37 * result
				+ (getPtlsName() == null ? 0 : this.getPtlsName().hashCode());
		result = 37 * result
				+ (getCode() == null ? 0 : this.getCode().hashCode());
		result = 37 * result
				+ (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result
				+ (getLpys() == null ? 0 : this.getLpys().hashCode());
		result = 37 * result
				+ (getLpls() == null ? 0 : this.getLpls().hashCode());
		result = 37 * result + (getSl() == null ? 0 : this.getSl().hashCode());
		result = 37 * result + (getDj() == null ? 0 : this.getDj().hashCode());
		result = 37 * result + (getCq() == null ? 0 : this.getCq().hashCode());
		result = 37 * result + (getBz() == null ? 0 : this.getBz().hashCode());
		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		return result;
	}

}