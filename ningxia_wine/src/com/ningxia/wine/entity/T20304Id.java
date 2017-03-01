package com.ningxia.wine.entity;

/**
 * T20304Id entity. @author MyEclipse Persistence Tools
 */

public class T20304Id implements java.io.Serializable {

	// Fields

	private Integer id;
	private Long id203;
	private String nd;
	private String gscode;
	private String sbls;
	private String name;
	private String xh;
	private Integer sl;
	private String dw;
	private Double dj;
	private Double ze;
	private String bz;

	// Constructors

	/** default constructor */
	public T20304Id() {
	}

	/** minimal constructor */
	public T20304Id(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public T20304Id(Integer id, Long id203, String nd, String gscode,
			String sbls, String name, String xh, Integer sl, String dw,
			Double dj, Double ze, String bz) {
		this.id = id;
		this.id203 = id203;
		this.nd = nd;
		this.gscode = gscode;
		this.sbls = sbls;
		this.name = name;
		this.xh = xh;
		this.sl = sl;
		this.dw = dw;
		this.dj = dj;
		this.ze = ze;
		this.bz = bz;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getId203() {
		return this.id203;
	}

	public void setId203(Long id203) {
		this.id203 = id203;
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

	public String getSbls() {
		return this.sbls;
	}

	public void setSbls(String sbls) {
		this.sbls = sbls;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getXh() {
		return this.xh;
	}

	public void setXh(String xh) {
		this.xh = xh;
	}

	public Integer getSl() {
		return this.sl;
	}

	public void setSl(Integer sl) {
		this.sl = sl;
	}

	public String getDw() {
		return this.dw;
	}

	public void setDw(String dw) {
		this.dw = dw;
	}

	public Double getDj() {
		return this.dj;
	}

	public void setDj(Double dj) {
		this.dj = dj;
	}

	public Double getZe() {
		return this.ze;
	}

	public void setZe(Double ze) {
		this.ze = ze;
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
		if (!(other instanceof T20304Id))
			return false;
		T20304Id castOther = (T20304Id) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getId203() == castOther.getId203()) || (this
						.getId203() != null && castOther.getId203() != null && this
						.getId203().equals(castOther.getId203())))
				&& ((this.getNd() == castOther.getNd()) || (this.getNd() != null
						&& castOther.getNd() != null && this.getNd().equals(
						castOther.getNd())))
				&& ((this.getGscode() == castOther.getGscode()) || (this
						.getGscode() != null && castOther.getGscode() != null && this
						.getGscode().equals(castOther.getGscode())))
				&& ((this.getSbls() == castOther.getSbls()) || (this.getSbls() != null
						&& castOther.getSbls() != null && this.getSbls()
						.equals(castOther.getSbls())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null
						&& castOther.getName() != null && this.getName()
						.equals(castOther.getName())))
				&& ((this.getXh() == castOther.getXh()) || (this.getXh() != null
						&& castOther.getXh() != null && this.getXh().equals(
						castOther.getXh())))
				&& ((this.getSl() == castOther.getSl()) || (this.getSl() != null
						&& castOther.getSl() != null && this.getSl().equals(
						castOther.getSl())))
				&& ((this.getDw() == castOther.getDw()) || (this.getDw() != null
						&& castOther.getDw() != null && this.getDw().equals(
						castOther.getDw())))
				&& ((this.getDj() == castOther.getDj()) || (this.getDj() != null
						&& castOther.getDj() != null && this.getDj().equals(
						castOther.getDj())))
				&& ((this.getZe() == castOther.getZe()) || (this.getZe() != null
						&& castOther.getZe() != null && this.getZe().equals(
						castOther.getZe())))
				&& ((this.getBz() == castOther.getBz()) || (this.getBz() != null
						&& castOther.getBz() != null && this.getBz().equals(
						castOther.getBz())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getId203() == null ? 0 : this.getId203().hashCode());
		result = 37 * result + (getNd() == null ? 0 : this.getNd().hashCode());
		result = 37 * result
				+ (getGscode() == null ? 0 : this.getGscode().hashCode());
		result = 37 * result
				+ (getSbls() == null ? 0 : this.getSbls().hashCode());
		result = 37 * result
				+ (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result + (getXh() == null ? 0 : this.getXh().hashCode());
		result = 37 * result + (getSl() == null ? 0 : this.getSl().hashCode());
		result = 37 * result + (getDw() == null ? 0 : this.getDw().hashCode());
		result = 37 * result + (getDj() == null ? 0 : this.getDj().hashCode());
		result = 37 * result + (getZe() == null ? 0 : this.getZe().hashCode());
		result = 37 * result + (getBz() == null ? 0 : this.getBz().hashCode());
		return result;
	}

}