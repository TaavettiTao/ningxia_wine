package com.ningxia.wine.entity;
/**
 * T201Jishiinfo entity. @author MyEclipse Persistence Tools
 */

public class T201Jishiinfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private String nd;
	private String gscode;
	private String name;
	private Integer jsgzid;
	private String jsgzname;
	private String csrq;
	private String zc;
	private String xl;
	private String gjss;
	private String gj;
	private String qjss;
	private String qj;
	private String zgzh;
	private Integer zypxtsQn;
	private Integer zypxtsGn;
	private Integer zypxtsGw;
	private String bz;

	// Constructors

	/** default constructor */
	public T201Jishiinfo() {
	}

	/** full constructor */
	public T201Jishiinfo(String nd, String gscode, String name, Integer jsgzid,
			String jsgzname, String csrq, String zc, String xl, String gjss,
			String gj, String qjss, String qj, String zgzh, Integer zypxtsQn,
			Integer zypxtsGn, Integer zypxtsGw, String bz) {
		this.nd = nd;
		this.gscode = gscode;
		this.name = name;
		this.jsgzid = jsgzid;
		this.jsgzname = jsgzname;
		this.csrq = csrq;
		this.zc = zc;
		this.xl = xl;
		this.gjss = gjss;
		this.gj = gj;
		this.qjss = qjss;
		this.qj = qj;
		this.zgzh = zgzh;
		this.zypxtsQn = zypxtsQn;
		this.zypxtsGn = zypxtsGn;
		this.zypxtsGw = zypxtsGw;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getJsgzid() {
		return this.jsgzid;
	}

	public void setJsgzid(Integer jsgzid) {
		this.jsgzid = jsgzid;
	}

	public String getJsgzname() {
		return this.jsgzname;
	}

	public void setJsgzname(String jsgzname) {
		this.jsgzname = jsgzname;
	}

	public String getCsrq() {
		return this.csrq;
	}

	public void setCsrq(String csrq) {
		this.csrq = csrq;
	}

	public String getZc() {
		return this.zc;
	}

	public void setZc(String zc) {
		this.zc = zc;
	}

	public String getXl() {
		return this.xl;
	}

	public void setXl(String xl) {
		this.xl = xl;
	}

	public String getGjss() {
		return this.gjss;
	}

	public void setGjss(String gjss) {
		this.gjss = gjss;
	}

	public String getGj() {
		return this.gj;
	}

	public void setGj(String gj) {
		this.gj = gj;
	}

	public String getQjss() {
		return this.qjss;
	}

	public void setQjss(String qjss) {
		this.qjss = qjss;
	}

	public String getQj() {
		return this.qj;
	}

	public void setQj(String qj) {
		this.qj = qj;
	}

	public String getZgzh() {
		return this.zgzh;
	}

	public void setZgzh(String zgzh) {
		this.zgzh = zgzh;
	}

	public Integer getZypxtsQn() {
		return this.zypxtsQn;
	}

	public void setZypxtsQn(Integer zypxtsQn) {
		this.zypxtsQn = zypxtsQn;
	}

	public Integer getZypxtsGn() {
		return this.zypxtsGn;
	}

	public void setZypxtsGn(Integer zypxtsGn) {
		this.zypxtsGn = zypxtsGn;
	}

	public Integer getZypxtsGw() {
		return this.zypxtsGw;
	}

	public void setZypxtsGw(Integer zypxtsGw) {
		this.zypxtsGw = zypxtsGw;
	}

	public String getBz() {
		return this.bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

}