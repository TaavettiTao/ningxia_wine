package com.ningxia.wine.entity;

/**
 * T20307Id entity. @author MyEclipse Persistence Tools
 */

public class T20307Id implements java.io.Serializable {

	// Fields

	private Integer id;
	private Long id203;
	private String nd;
	private String gscode;
	private String name;
	private String nr;
	private String hjtime;
	private String hjdj;
	private String bz;

	// Constructors

	/** default constructor */
	public T20307Id() {
	}

	/** minimal constructor */
	public T20307Id(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public T20307Id(Integer id, Long id203, String nd, String gscode,
			String name, String nr, String hjtime, String hjdj, String bz) {
		this.id = id;
		this.id203 = id203;
		this.nd = nd;
		this.gscode = gscode;
		this.name = name;
		this.nr = nr;
		this.hjtime = hjtime;
		this.hjdj = hjdj;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNr() {
		return this.nr;
	}

	public void setNr(String nr) {
		this.nr = nr;
	}

	public String getHjtime() {
		return this.hjtime;
	}

	public void setHjtime(String hjtime) {
		this.hjtime = hjtime;
	}

	public String getHjdj() {
		return this.hjdj;
	}

	public void setHjdj(String hjdj) {
		this.hjdj = hjdj;
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
		if (!(other instanceof T20307Id))
			return false;
		T20307Id castOther = (T20307Id) other;

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
				&& ((this.getName() == castOther.getName()) || (this.getName() != null
						&& castOther.getName() != null && this.getName()
						.equals(castOther.getName())))
				&& ((this.getNr() == castOther.getNr()) || (this.getNr() != null
						&& castOther.getNr() != null && this.getNr().equals(
						castOther.getNr())))
				&& ((this.getHjtime() == castOther.getHjtime()) || (this
						.getHjtime() != null && castOther.getHjtime() != null && this
						.getHjtime().equals(castOther.getHjtime())))
				&& ((this.getHjdj() == castOther.getHjdj()) || (this.getHjdj() != null
						&& castOther.getHjdj() != null && this.getHjdj()
						.equals(castOther.getHjdj())))
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
				+ (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result + (getNr() == null ? 0 : this.getNr().hashCode());
		result = 37 * result
				+ (getHjtime() == null ? 0 : this.getHjtime().hashCode());
		result = 37 * result
				+ (getHjdj() == null ? 0 : this.getHjdj().hashCode());
		result = 37 * result + (getBz() == null ? 0 : this.getBz().hashCode());
		return result;
	}

}