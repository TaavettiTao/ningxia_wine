package com.ningxia.wine.entity;

/**
 * T40102OldId entity. @author MyEclipse Persistence Tools
 */

public class T40102OldId implements java.io.Serializable {

	// Fields

	private Integer id;
	private String nd;
	private String gscode;
	private String cplsCode;
	private String cplsName;
	private String cpName;
	private Integer pz2013;
	private Double gz2013;
	private Integer pz2014;
	private Double gz2014;
	private Integer pz2015;
	private Double gz2015;
	private Integer pz2016;
	private Double gz2016;
	private Integer pzHj;
	private Double gzHj;
	private String bz;

	// Constructors

	/** default constructor */
	public T40102OldId() {
	}

	/** minimal constructor */
	public T40102OldId(Integer id, Double gz2016) {
		this.id = id;
		this.gz2016 = gz2016;
	}

	/** full constructor */
	public T40102OldId(Integer id, String nd, String gscode, String cplsCode,
			String cplsName, String cpName, Integer pz2013, Double gz2013,
			Integer pz2014, Double gz2014, Integer pz2015, Double gz2015,
			Integer pz2016, Double gz2016, Integer pzHj, Double gzHj, String bz) {
		this.id = id;
		this.nd = nd;
		this.gscode = gscode;
		this.cplsCode = cplsCode;
		this.cplsName = cplsName;
		this.cpName = cpName;
		this.pz2013 = pz2013;
		this.gz2013 = gz2013;
		this.pz2014 = pz2014;
		this.gz2014 = gz2014;
		this.pz2015 = pz2015;
		this.gz2015 = gz2015;
		this.pz2016 = pz2016;
		this.gz2016 = gz2016;
		this.pzHj = pzHj;
		this.gzHj = gzHj;
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

	public String getCplsCode() {
		return this.cplsCode;
	}

	public void setCplsCode(String cplsCode) {
		this.cplsCode = cplsCode;
	}

	public String getCplsName() {
		return this.cplsName;
	}

	public void setCplsName(String cplsName) {
		this.cplsName = cplsName;
	}

	public String getCpName() {
		return this.cpName;
	}

	public void setCpName(String cpName) {
		this.cpName = cpName;
	}

	public Integer getPz2013() {
		return this.pz2013;
	}

	public void setPz2013(Integer pz2013) {
		this.pz2013 = pz2013;
	}

	public Double getGz2013() {
		return this.gz2013;
	}

	public void setGz2013(Double gz2013) {
		this.gz2013 = gz2013;
	}

	public Integer getPz2014() {
		return this.pz2014;
	}

	public void setPz2014(Integer pz2014) {
		this.pz2014 = pz2014;
	}

	public Double getGz2014() {
		return this.gz2014;
	}

	public void setGz2014(Double gz2014) {
		this.gz2014 = gz2014;
	}

	public Integer getPz2015() {
		return this.pz2015;
	}

	public void setPz2015(Integer pz2015) {
		this.pz2015 = pz2015;
	}

	public Double getGz2015() {
		return this.gz2015;
	}

	public void setGz2015(Double gz2015) {
		this.gz2015 = gz2015;
	}

	public Integer getPz2016() {
		return this.pz2016;
	}

	public void setPz2016(Integer pz2016) {
		this.pz2016 = pz2016;
	}

	public Double getGz2016() {
		return this.gz2016;
	}

	public void setGz2016(Double gz2016) {
		this.gz2016 = gz2016;
	}

	public Integer getPzHj() {
		return this.pzHj;
	}

	public void setPzHj(Integer pzHj) {
		this.pzHj = pzHj;
	}

	public Double getGzHj() {
		return this.gzHj;
	}

	public void setGzHj(Double gzHj) {
		this.gzHj = gzHj;
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
		if (!(other instanceof T40102OldId))
			return false;
		T40102OldId castOther = (T40102OldId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getNd() == castOther.getNd()) || (this.getNd() != null
						&& castOther.getNd() != null && this.getNd().equals(
						castOther.getNd())))
				&& ((this.getGscode() == castOther.getGscode()) || (this
						.getGscode() != null && castOther.getGscode() != null && this
						.getGscode().equals(castOther.getGscode())))
				&& ((this.getCplsCode() == castOther.getCplsCode()) || (this
						.getCplsCode() != null
						&& castOther.getCplsCode() != null && this
						.getCplsCode().equals(castOther.getCplsCode())))
				&& ((this.getCplsName() == castOther.getCplsName()) || (this
						.getCplsName() != null
						&& castOther.getCplsName() != null && this
						.getCplsName().equals(castOther.getCplsName())))
				&& ((this.getCpName() == castOther.getCpName()) || (this
						.getCpName() != null && castOther.getCpName() != null && this
						.getCpName().equals(castOther.getCpName())))
				&& ((this.getPz2013() == castOther.getPz2013()) || (this
						.getPz2013() != null && castOther.getPz2013() != null && this
						.getPz2013().equals(castOther.getPz2013())))
				&& ((this.getGz2013() == castOther.getGz2013()) || (this
						.getGz2013() != null && castOther.getGz2013() != null && this
						.getGz2013().equals(castOther.getGz2013())))
				&& ((this.getPz2014() == castOther.getPz2014()) || (this
						.getPz2014() != null && castOther.getPz2014() != null && this
						.getPz2014().equals(castOther.getPz2014())))
				&& ((this.getGz2014() == castOther.getGz2014()) || (this
						.getGz2014() != null && castOther.getGz2014() != null && this
						.getGz2014().equals(castOther.getGz2014())))
				&& ((this.getPz2015() == castOther.getPz2015()) || (this
						.getPz2015() != null && castOther.getPz2015() != null && this
						.getPz2015().equals(castOther.getPz2015())))
				&& ((this.getGz2015() == castOther.getGz2015()) || (this
						.getGz2015() != null && castOther.getGz2015() != null && this
						.getGz2015().equals(castOther.getGz2015())))
				&& ((this.getPz2016() == castOther.getPz2016()) || (this
						.getPz2016() != null && castOther.getPz2016() != null && this
						.getPz2016().equals(castOther.getPz2016())))
				&& ((this.getGz2016() == castOther.getGz2016()) || (this
						.getGz2016() != null && castOther.getGz2016() != null && this
						.getGz2016().equals(castOther.getGz2016())))
				&& ((this.getPzHj() == castOther.getPzHj()) || (this.getPzHj() != null
						&& castOther.getPzHj() != null && this.getPzHj()
						.equals(castOther.getPzHj())))
				&& ((this.getGzHj() == castOther.getGzHj()) || (this.getGzHj() != null
						&& castOther.getGzHj() != null && this.getGzHj()
						.equals(castOther.getGzHj())))
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
				+ (getCplsCode() == null ? 0 : this.getCplsCode().hashCode());
		result = 37 * result
				+ (getCplsName() == null ? 0 : this.getCplsName().hashCode());
		result = 37 * result
				+ (getCpName() == null ? 0 : this.getCpName().hashCode());
		result = 37 * result
				+ (getPz2013() == null ? 0 : this.getPz2013().hashCode());
		result = 37 * result
				+ (getGz2013() == null ? 0 : this.getGz2013().hashCode());
		result = 37 * result
				+ (getPz2014() == null ? 0 : this.getPz2014().hashCode());
		result = 37 * result
				+ (getGz2014() == null ? 0 : this.getGz2014().hashCode());
		result = 37 * result
				+ (getPz2015() == null ? 0 : this.getPz2015().hashCode());
		result = 37 * result
				+ (getGz2015() == null ? 0 : this.getGz2015().hashCode());
		result = 37 * result
				+ (getPz2016() == null ? 0 : this.getPz2016().hashCode());
		result = 37 * result
				+ (getGz2016() == null ? 0 : this.getGz2016().hashCode());
		result = 37 * result
				+ (getPzHj() == null ? 0 : this.getPzHj().hashCode());
		result = 37 * result
				+ (getGzHj() == null ? 0 : this.getGzHj().hashCode());
		result = 37 * result + (getBz() == null ? 0 : this.getBz().hashCode());
		return result;
	}

}