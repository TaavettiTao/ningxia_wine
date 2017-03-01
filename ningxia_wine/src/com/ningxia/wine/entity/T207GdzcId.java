package com.ningxia.wine.entity;

/**
 * T207GdzcId entity. @author MyEclipse Persistence Tools
 */

public class T207GdzcId implements java.io.Serializable {

	// Fields

	private Integer id;
	private String nd;
	private String gscode;
	private Integer xh;
	private String zbname;
	private String jldw;
	private String zbcode;
	private Integer parentid;
	private String bz;

	// Constructors

	/** default constructor */
	public T207GdzcId() {
	}

	/** minimal constructor */
	public T207GdzcId(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public T207GdzcId(Integer id, String nd, String gscode, Integer xh,
			String zbname, String jldw, String zbcode, Integer parentid,
			String bz) {
		this.id = id;
		this.nd = nd;
		this.gscode = gscode;
		this.xh = xh;
		this.zbname = zbname;
		this.jldw = jldw;
		this.zbcode = zbcode;
		this.parentid = parentid;
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

	public Integer getXh() {
		return this.xh;
	}

	public void setXh(Integer xh) {
		this.xh = xh;
	}

	public String getZbname() {
		return this.zbname;
	}

	public void setZbname(String zbname) {
		this.zbname = zbname;
	}

	public String getJldw() {
		return this.jldw;
	}

	public void setJldw(String jldw) {
		this.jldw = jldw;
	}

	public String getZbcode() {
		return this.zbcode;
	}

	public void setZbcode(String zbcode) {
		this.zbcode = zbcode;
	}

	public Integer getParentid() {
		return this.parentid;
	}

	public void setParentid(Integer parentid) {
		this.parentid = parentid;
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
		if (!(other instanceof T207GdzcId))
			return false;
		T207GdzcId castOther = (T207GdzcId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getNd() == castOther.getNd()) || (this.getNd() != null
						&& castOther.getNd() != null && this.getNd().equals(
						castOther.getNd())))
				&& ((this.getGscode() == castOther.getGscode()) || (this
						.getGscode() != null && castOther.getGscode() != null && this
						.getGscode().equals(castOther.getGscode())))
				&& ((this.getXh() == castOther.getXh()) || (this.getXh() != null
						&& castOther.getXh() != null && this.getXh().equals(
						castOther.getXh())))
				&& ((this.getZbname() == castOther.getZbname()) || (this
						.getZbname() != null && castOther.getZbname() != null && this
						.getZbname().equals(castOther.getZbname())))
				&& ((this.getJldw() == castOther.getJldw()) || (this.getJldw() != null
						&& castOther.getJldw() != null && this.getJldw()
						.equals(castOther.getJldw())))
				&& ((this.getZbcode() == castOther.getZbcode()) || (this
						.getZbcode() != null && castOther.getZbcode() != null && this
						.getZbcode().equals(castOther.getZbcode())))
				&& ((this.getParentid() == castOther.getParentid()) || (this
						.getParentid() != null
						&& castOther.getParentid() != null && this
						.getParentid().equals(castOther.getParentid())))
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
		result = 37 * result + (getXh() == null ? 0 : this.getXh().hashCode());
		result = 37 * result
				+ (getZbname() == null ? 0 : this.getZbname().hashCode());
		result = 37 * result
				+ (getJldw() == null ? 0 : this.getJldw().hashCode());
		result = 37 * result
				+ (getZbcode() == null ? 0 : this.getZbcode().hashCode());
		result = 37 * result
				+ (getParentid() == null ? 0 : this.getParentid().hashCode());
		result = 37 * result + (getBz() == null ? 0 : this.getBz().hashCode());
		return result;
	}

}