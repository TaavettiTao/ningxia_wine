package com.ningxia.wine.entity;

/**
 * T20308Id entity. @author MyEclipse Persistence Tools
 */

public class T20308Id implements java.io.Serializable {

	// Fields

	private Integer id;
	private Long id203;
	private String nd;
	private String gscode;
	private String name;
	private String rzlx;
	private String zh;
	private String rzjg;
	private String rztime;
	private String yxq;
	private String bz;

	// Constructors

	/** default constructor */
	public T20308Id() {
	}

	/** minimal constructor */
	public T20308Id(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public T20308Id(Integer id, Long id203, String nd, String gscode,
			String name, String rzlx, String zh, String rzjg, String rztime,
			String yxq, String bz) {
		this.id = id;
		this.id203 = id203;
		this.nd = nd;
		this.gscode = gscode;
		this.name = name;
		this.rzlx = rzlx;
		this.zh = zh;
		this.rzjg = rzjg;
		this.rztime = rztime;
		this.yxq = yxq;
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

	public String getRzlx() {
		return this.rzlx;
	}

	public void setRzlx(String rzlx) {
		this.rzlx = rzlx;
	}

	public String getZh() {
		return this.zh;
	}

	public void setZh(String zh) {
		this.zh = zh;
	}

	public String getRzjg() {
		return this.rzjg;
	}

	public void setRzjg(String rzjg) {
		this.rzjg = rzjg;
	}

	public String getRztime() {
		return this.rztime;
	}

	public void setRztime(String rztime) {
		this.rztime = rztime;
	}

	public String getYxq() {
		return this.yxq;
	}

	public void setYxq(String yxq) {
		this.yxq = yxq;
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
		if (!(other instanceof T20308Id))
			return false;
		T20308Id castOther = (T20308Id) other;

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
				&& ((this.getRzlx() == castOther.getRzlx()) || (this.getRzlx() != null
						&& castOther.getRzlx() != null && this.getRzlx()
						.equals(castOther.getRzlx())))
				&& ((this.getZh() == castOther.getZh()) || (this.getZh() != null
						&& castOther.getZh() != null && this.getZh().equals(
						castOther.getZh())))
				&& ((this.getRzjg() == castOther.getRzjg()) || (this.getRzjg() != null
						&& castOther.getRzjg() != null && this.getRzjg()
						.equals(castOther.getRzjg())))
				&& ((this.getRztime() == castOther.getRztime()) || (this
						.getRztime() != null && castOther.getRztime() != null && this
						.getRztime().equals(castOther.getRztime())))
				&& ((this.getYxq() == castOther.getYxq()) || (this.getYxq() != null
						&& castOther.getYxq() != null && this.getYxq().equals(
						castOther.getYxq())))
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
		result = 37 * result
				+ (getRzlx() == null ? 0 : this.getRzlx().hashCode());
		result = 37 * result + (getZh() == null ? 0 : this.getZh().hashCode());
		result = 37 * result
				+ (getRzjg() == null ? 0 : this.getRzjg().hashCode());
		result = 37 * result
				+ (getRztime() == null ? 0 : this.getRztime().hashCode());
		result = 37 * result
				+ (getYxq() == null ? 0 : this.getYxq().hashCode());
		result = 37 * result + (getBz() == null ? 0 : this.getBz().hashCode());
		return result;
	}

}