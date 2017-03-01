package com.ningxia.wine.entity;

/**
 * T207Id entity. @author MyEclipse Persistence Tools
 */

public class T207Id implements java.io.Serializable {

	// Fields

	private String nd;
	private String gscode;
	private String gsname;
	private String gsoldneame;
	private String gzjg;
	private String dwfzr;
	private String shr;
	private String tbr;
	private String tbrdh;
	private String tbtime;
	private String jginfoZgbmname;
	private String jginfoBgdd;
	private String jginfoFr;
	private String jginfoFrlxfs;
	private Integer jginfoIfzmjg;
	private String jginfoZmjgName;
	private String jginfoZgfzrName;
	private String jginfoZgfzrLxdh;
	private Double gdzcGhtzze;
	private Double gdzcZxzjGj;
	private Double gdzcZxzjZzqcz;
	private Double gdzcZxzjZzqbm;
	private Double gdzcZxzjSx;
	private Double gdzcZczj;
	private Double gdzcSrtz;
	private Double jcjsSlSkGzl;
	private Double jcjsSlSkYwctz;
	private Double jcjsSlTjggGzl;
	private Double jcjsSlTjggYtz;
	private Double jcjsDl10kvYsGzl;
	private Double jcjsDl10kvYsYtz;
	private Double jcjsDl10kvYxGzl;
	private Double jcjsDl10kvYxYtz;
	private Double jcjsD10kvYxYtz;
	private Double jcjsDl6mYsGzl;
	private Double jcjsDl6mYsYtz;
	private Double jcjsDl6mYxGzl;
	private Double jcjsDl6mYxYtz;
	private Double jcjsLhMj;
	private Double jcjsLhYtz;
	private String bz;
	private Integer id;

	// Constructors

	/** default constructor */
	public T207Id() {
	}

	/** minimal constructor */
	public T207Id(String jginfoZgbmname, Integer id) {
		this.jginfoZgbmname = jginfoZgbmname;
		this.id = id;
	}

	/** full constructor */
	public T207Id(String nd, String gscode, String gsname, String gsoldneame,
			String gzjg, String dwfzr, String shr, String tbr, String tbrdh,
			String tbtime, String jginfoZgbmname, String jginfoBgdd,
			String jginfoFr, String jginfoFrlxfs, Integer jginfoIfzmjg,
			String jginfoZmjgName, String jginfoZgfzrName,
			String jginfoZgfzrLxdh, Double gdzcGhtzze, Double gdzcZxzjGj,
			Double gdzcZxzjZzqcz, Double gdzcZxzjZzqbm, Double gdzcZxzjSx,
			Double gdzcZczj, Double gdzcSrtz, Double jcjsSlSkGzl,
			Double jcjsSlSkYwctz, Double jcjsSlTjggGzl, Double jcjsSlTjggYtz,
			Double jcjsDl10kvYsGzl, Double jcjsDl10kvYsYtz,
			Double jcjsDl10kvYxGzl, Double jcjsDl10kvYxYtz,
			Double jcjsD10kvYxYtz, Double jcjsDl6mYsGzl, Double jcjsDl6mYsYtz,
			Double jcjsDl6mYxGzl, Double jcjsDl6mYxYtz, Double jcjsLhMj,
			Double jcjsLhYtz, String bz, Integer id) {
		this.nd = nd;
		this.gscode = gscode;
		this.gsname = gsname;
		this.gsoldneame = gsoldneame;
		this.gzjg = gzjg;
		this.dwfzr = dwfzr;
		this.shr = shr;
		this.tbr = tbr;
		this.tbrdh = tbrdh;
		this.tbtime = tbtime;
		this.jginfoZgbmname = jginfoZgbmname;
		this.jginfoBgdd = jginfoBgdd;
		this.jginfoFr = jginfoFr;
		this.jginfoFrlxfs = jginfoFrlxfs;
		this.jginfoIfzmjg = jginfoIfzmjg;
		this.jginfoZmjgName = jginfoZmjgName;
		this.jginfoZgfzrName = jginfoZgfzrName;
		this.jginfoZgfzrLxdh = jginfoZgfzrLxdh;
		this.gdzcGhtzze = gdzcGhtzze;
		this.gdzcZxzjGj = gdzcZxzjGj;
		this.gdzcZxzjZzqcz = gdzcZxzjZzqcz;
		this.gdzcZxzjZzqbm = gdzcZxzjZzqbm;
		this.gdzcZxzjSx = gdzcZxzjSx;
		this.gdzcZczj = gdzcZczj;
		this.gdzcSrtz = gdzcSrtz;
		this.jcjsSlSkGzl = jcjsSlSkGzl;
		this.jcjsSlSkYwctz = jcjsSlSkYwctz;
		this.jcjsSlTjggGzl = jcjsSlTjggGzl;
		this.jcjsSlTjggYtz = jcjsSlTjggYtz;
		this.jcjsDl10kvYsGzl = jcjsDl10kvYsGzl;
		this.jcjsDl10kvYsYtz = jcjsDl10kvYsYtz;
		this.jcjsDl10kvYxGzl = jcjsDl10kvYxGzl;
		this.jcjsDl10kvYxYtz = jcjsDl10kvYxYtz;
		this.jcjsD10kvYxYtz = jcjsD10kvYxYtz;
		this.jcjsDl6mYsGzl = jcjsDl6mYsGzl;
		this.jcjsDl6mYsYtz = jcjsDl6mYsYtz;
		this.jcjsDl6mYxGzl = jcjsDl6mYxGzl;
		this.jcjsDl6mYxYtz = jcjsDl6mYxYtz;
		this.jcjsLhMj = jcjsLhMj;
		this.jcjsLhYtz = jcjsLhYtz;
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

	public String getGsname() {
		return this.gsname;
	}

	public void setGsname(String gsname) {
		this.gsname = gsname;
	}

	public String getGsoldneame() {
		return this.gsoldneame;
	}

	public void setGsoldneame(String gsoldneame) {
		this.gsoldneame = gsoldneame;
	}

	public String getGzjg() {
		return this.gzjg;
	}

	public void setGzjg(String gzjg) {
		this.gzjg = gzjg;
	}

	public String getDwfzr() {
		return this.dwfzr;
	}

	public void setDwfzr(String dwfzr) {
		this.dwfzr = dwfzr;
	}

	public String getShr() {
		return this.shr;
	}

	public void setShr(String shr) {
		this.shr = shr;
	}

	public String getTbr() {
		return this.tbr;
	}

	public void setTbr(String tbr) {
		this.tbr = tbr;
	}

	public String getTbrdh() {
		return this.tbrdh;
	}

	public void setTbrdh(String tbrdh) {
		this.tbrdh = tbrdh;
	}

	public String getTbtime() {
		return this.tbtime;
	}

	public void setTbtime(String tbtime) {
		this.tbtime = tbtime;
	}

	public String getJginfoZgbmname() {
		return this.jginfoZgbmname;
	}

	public void setJginfoZgbmname(String jginfoZgbmname) {
		this.jginfoZgbmname = jginfoZgbmname;
	}

	public String getJginfoBgdd() {
		return this.jginfoBgdd;
	}

	public void setJginfoBgdd(String jginfoBgdd) {
		this.jginfoBgdd = jginfoBgdd;
	}

	public String getJginfoFr() {
		return this.jginfoFr;
	}

	public void setJginfoFr(String jginfoFr) {
		this.jginfoFr = jginfoFr;
	}

	public String getJginfoFrlxfs() {
		return this.jginfoFrlxfs;
	}

	public void setJginfoFrlxfs(String jginfoFrlxfs) {
		this.jginfoFrlxfs = jginfoFrlxfs;
	}

	public Integer getJginfoIfzmjg() {
		return this.jginfoIfzmjg;
	}

	public void setJginfoIfzmjg(Integer jginfoIfzmjg) {
		this.jginfoIfzmjg = jginfoIfzmjg;
	}

	public String getJginfoZmjgName() {
		return this.jginfoZmjgName;
	}

	public void setJginfoZmjgName(String jginfoZmjgName) {
		this.jginfoZmjgName = jginfoZmjgName;
	}

	public String getJginfoZgfzrName() {
		return this.jginfoZgfzrName;
	}

	public void setJginfoZgfzrName(String jginfoZgfzrName) {
		this.jginfoZgfzrName = jginfoZgfzrName;
	}

	public String getJginfoZgfzrLxdh() {
		return this.jginfoZgfzrLxdh;
	}

	public void setJginfoZgfzrLxdh(String jginfoZgfzrLxdh) {
		this.jginfoZgfzrLxdh = jginfoZgfzrLxdh;
	}

	public Double getGdzcGhtzze() {
		return this.gdzcGhtzze;
	}

	public void setGdzcGhtzze(Double gdzcGhtzze) {
		this.gdzcGhtzze = gdzcGhtzze;
	}

	public Double getGdzcZxzjGj() {
		return this.gdzcZxzjGj;
	}

	public void setGdzcZxzjGj(Double gdzcZxzjGj) {
		this.gdzcZxzjGj = gdzcZxzjGj;
	}

	public Double getGdzcZxzjZzqcz() {
		return this.gdzcZxzjZzqcz;
	}

	public void setGdzcZxzjZzqcz(Double gdzcZxzjZzqcz) {
		this.gdzcZxzjZzqcz = gdzcZxzjZzqcz;
	}

	public Double getGdzcZxzjZzqbm() {
		return this.gdzcZxzjZzqbm;
	}

	public void setGdzcZxzjZzqbm(Double gdzcZxzjZzqbm) {
		this.gdzcZxzjZzqbm = gdzcZxzjZzqbm;
	}

	public Double getGdzcZxzjSx() {
		return this.gdzcZxzjSx;
	}

	public void setGdzcZxzjSx(Double gdzcZxzjSx) {
		this.gdzcZxzjSx = gdzcZxzjSx;
	}

	public Double getGdzcZczj() {
		return this.gdzcZczj;
	}

	public void setGdzcZczj(Double gdzcZczj) {
		this.gdzcZczj = gdzcZczj;
	}

	public Double getGdzcSrtz() {
		return this.gdzcSrtz;
	}

	public void setGdzcSrtz(Double gdzcSrtz) {
		this.gdzcSrtz = gdzcSrtz;
	}

	public Double getJcjsSlSkGzl() {
		return this.jcjsSlSkGzl;
	}

	public void setJcjsSlSkGzl(Double jcjsSlSkGzl) {
		this.jcjsSlSkGzl = jcjsSlSkGzl;
	}

	public Double getJcjsSlSkYwctz() {
		return this.jcjsSlSkYwctz;
	}

	public void setJcjsSlSkYwctz(Double jcjsSlSkYwctz) {
		this.jcjsSlSkYwctz = jcjsSlSkYwctz;
	}

	public Double getJcjsSlTjggGzl() {
		return this.jcjsSlTjggGzl;
	}

	public void setJcjsSlTjggGzl(Double jcjsSlTjggGzl) {
		this.jcjsSlTjggGzl = jcjsSlTjggGzl;
	}

	public Double getJcjsSlTjggYtz() {
		return this.jcjsSlTjggYtz;
	}

	public void setJcjsSlTjggYtz(Double jcjsSlTjggYtz) {
		this.jcjsSlTjggYtz = jcjsSlTjggYtz;
	}

	public Double getJcjsDl10kvYsGzl() {
		return this.jcjsDl10kvYsGzl;
	}

	public void setJcjsDl10kvYsGzl(Double jcjsDl10kvYsGzl) {
		this.jcjsDl10kvYsGzl = jcjsDl10kvYsGzl;
	}

	public Double getJcjsDl10kvYsYtz() {
		return this.jcjsDl10kvYsYtz;
	}

	public void setJcjsDl10kvYsYtz(Double jcjsDl10kvYsYtz) {
		this.jcjsDl10kvYsYtz = jcjsDl10kvYsYtz;
	}

	public Double getJcjsDl10kvYxGzl() {
		return this.jcjsDl10kvYxGzl;
	}

	public void setJcjsDl10kvYxGzl(Double jcjsDl10kvYxGzl) {
		this.jcjsDl10kvYxGzl = jcjsDl10kvYxGzl;
	}

	public Double getJcjsDl10kvYxYtz() {
		return this.jcjsDl10kvYxYtz;
	}

	public void setJcjsDl10kvYxYtz(Double jcjsDl10kvYxYtz) {
		this.jcjsDl10kvYxYtz = jcjsDl10kvYxYtz;
	}

	public Double getJcjsD10kvYxYtz() {
		return this.jcjsD10kvYxYtz;
	}

	public void setJcjsD10kvYxYtz(Double jcjsD10kvYxYtz) {
		this.jcjsD10kvYxYtz = jcjsD10kvYxYtz;
	}

	public Double getJcjsDl6mYsGzl() {
		return this.jcjsDl6mYsGzl;
	}

	public void setJcjsDl6mYsGzl(Double jcjsDl6mYsGzl) {
		this.jcjsDl6mYsGzl = jcjsDl6mYsGzl;
	}

	public Double getJcjsDl6mYsYtz() {
		return this.jcjsDl6mYsYtz;
	}

	public void setJcjsDl6mYsYtz(Double jcjsDl6mYsYtz) {
		this.jcjsDl6mYsYtz = jcjsDl6mYsYtz;
	}

	public Double getJcjsDl6mYxGzl() {
		return this.jcjsDl6mYxGzl;
	}

	public void setJcjsDl6mYxGzl(Double jcjsDl6mYxGzl) {
		this.jcjsDl6mYxGzl = jcjsDl6mYxGzl;
	}

	public Double getJcjsDl6mYxYtz() {
		return this.jcjsDl6mYxYtz;
	}

	public void setJcjsDl6mYxYtz(Double jcjsDl6mYxYtz) {
		this.jcjsDl6mYxYtz = jcjsDl6mYxYtz;
	}

	public Double getJcjsLhMj() {
		return this.jcjsLhMj;
	}

	public void setJcjsLhMj(Double jcjsLhMj) {
		this.jcjsLhMj = jcjsLhMj;
	}

	public Double getJcjsLhYtz() {
		return this.jcjsLhYtz;
	}

	public void setJcjsLhYtz(Double jcjsLhYtz) {
		this.jcjsLhYtz = jcjsLhYtz;
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
		if (!(other instanceof T207Id))
			return false;
		T207Id castOther = (T207Id) other;

		return ((this.getNd() == castOther.getNd()) || (this.getNd() != null
				&& castOther.getNd() != null && this.getNd().equals(
				castOther.getNd())))
				&& ((this.getGscode() == castOther.getGscode()) || (this
						.getGscode() != null && castOther.getGscode() != null && this
						.getGscode().equals(castOther.getGscode())))
				&& ((this.getGsname() == castOther.getGsname()) || (this
						.getGsname() != null && castOther.getGsname() != null && this
						.getGsname().equals(castOther.getGsname())))
				&& ((this.getGsoldneame() == castOther.getGsoldneame()) || (this
						.getGsoldneame() != null
						&& castOther.getGsoldneame() != null && this
						.getGsoldneame().equals(castOther.getGsoldneame())))
				&& ((this.getGzjg() == castOther.getGzjg()) || (this.getGzjg() != null
						&& castOther.getGzjg() != null && this.getGzjg()
						.equals(castOther.getGzjg())))
				&& ((this.getDwfzr() == castOther.getDwfzr()) || (this
						.getDwfzr() != null && castOther.getDwfzr() != null && this
						.getDwfzr().equals(castOther.getDwfzr())))
				&& ((this.getShr() == castOther.getShr()) || (this.getShr() != null
						&& castOther.getShr() != null && this.getShr().equals(
						castOther.getShr())))
				&& ((this.getTbr() == castOther.getTbr()) || (this.getTbr() != null
						&& castOther.getTbr() != null && this.getTbr().equals(
						castOther.getTbr())))
				&& ((this.getTbrdh() == castOther.getTbrdh()) || (this
						.getTbrdh() != null && castOther.getTbrdh() != null && this
						.getTbrdh().equals(castOther.getTbrdh())))
				&& ((this.getTbtime() == castOther.getTbtime()) || (this
						.getTbtime() != null && castOther.getTbtime() != null && this
						.getTbtime().equals(castOther.getTbtime())))
				&& ((this.getJginfoZgbmname() == castOther.getJginfoZgbmname()) || (this
						.getJginfoZgbmname() != null
						&& castOther.getJginfoZgbmname() != null && this
						.getJginfoZgbmname().equals(
								castOther.getJginfoZgbmname())))
				&& ((this.getJginfoBgdd() == castOther.getJginfoBgdd()) || (this
						.getJginfoBgdd() != null
						&& castOther.getJginfoBgdd() != null && this
						.getJginfoBgdd().equals(castOther.getJginfoBgdd())))
				&& ((this.getJginfoFr() == castOther.getJginfoFr()) || (this
						.getJginfoFr() != null
						&& castOther.getJginfoFr() != null && this
						.getJginfoFr().equals(castOther.getJginfoFr())))
				&& ((this.getJginfoFrlxfs() == castOther.getJginfoFrlxfs()) || (this
						.getJginfoFrlxfs() != null
						&& castOther.getJginfoFrlxfs() != null && this
						.getJginfoFrlxfs().equals(castOther.getJginfoFrlxfs())))
				&& ((this.getJginfoIfzmjg() == castOther.getJginfoIfzmjg()) || (this
						.getJginfoIfzmjg() != null
						&& castOther.getJginfoIfzmjg() != null && this
						.getJginfoIfzmjg().equals(castOther.getJginfoIfzmjg())))
				&& ((this.getJginfoZmjgName() == castOther.getJginfoZmjgName()) || (this
						.getJginfoZmjgName() != null
						&& castOther.getJginfoZmjgName() != null && this
						.getJginfoZmjgName().equals(
								castOther.getJginfoZmjgName())))
				&& ((this.getJginfoZgfzrName() == castOther
						.getJginfoZgfzrName()) || (this.getJginfoZgfzrName() != null
						&& castOther.getJginfoZgfzrName() != null && this
						.getJginfoZgfzrName().equals(
								castOther.getJginfoZgfzrName())))
				&& ((this.getJginfoZgfzrLxdh() == castOther
						.getJginfoZgfzrLxdh()) || (this.getJginfoZgfzrLxdh() != null
						&& castOther.getJginfoZgfzrLxdh() != null && this
						.getJginfoZgfzrLxdh().equals(
								castOther.getJginfoZgfzrLxdh())))
				&& ((this.getGdzcGhtzze() == castOther.getGdzcGhtzze()) || (this
						.getGdzcGhtzze() != null
						&& castOther.getGdzcGhtzze() != null && this
						.getGdzcGhtzze().equals(castOther.getGdzcGhtzze())))
				&& ((this.getGdzcZxzjGj() == castOther.getGdzcZxzjGj()) || (this
						.getGdzcZxzjGj() != null
						&& castOther.getGdzcZxzjGj() != null && this
						.getGdzcZxzjGj().equals(castOther.getGdzcZxzjGj())))
				&& ((this.getGdzcZxzjZzqcz() == castOther.getGdzcZxzjZzqcz()) || (this
						.getGdzcZxzjZzqcz() != null
						&& castOther.getGdzcZxzjZzqcz() != null && this
						.getGdzcZxzjZzqcz()
						.equals(castOther.getGdzcZxzjZzqcz())))
				&& ((this.getGdzcZxzjZzqbm() == castOther.getGdzcZxzjZzqbm()) || (this
						.getGdzcZxzjZzqbm() != null
						&& castOther.getGdzcZxzjZzqbm() != null && this
						.getGdzcZxzjZzqbm()
						.equals(castOther.getGdzcZxzjZzqbm())))
				&& ((this.getGdzcZxzjSx() == castOther.getGdzcZxzjSx()) || (this
						.getGdzcZxzjSx() != null
						&& castOther.getGdzcZxzjSx() != null && this
						.getGdzcZxzjSx().equals(castOther.getGdzcZxzjSx())))
				&& ((this.getGdzcZczj() == castOther.getGdzcZczj()) || (this
						.getGdzcZczj() != null
						&& castOther.getGdzcZczj() != null && this
						.getGdzcZczj().equals(castOther.getGdzcZczj())))
				&& ((this.getGdzcSrtz() == castOther.getGdzcSrtz()) || (this
						.getGdzcSrtz() != null
						&& castOther.getGdzcSrtz() != null && this
						.getGdzcSrtz().equals(castOther.getGdzcSrtz())))
				&& ((this.getJcjsSlSkGzl() == castOther.getJcjsSlSkGzl()) || (this
						.getJcjsSlSkGzl() != null
						&& castOther.getJcjsSlSkGzl() != null && this
						.getJcjsSlSkGzl().equals(castOther.getJcjsSlSkGzl())))
				&& ((this.getJcjsSlSkYwctz() == castOther.getJcjsSlSkYwctz()) || (this
						.getJcjsSlSkYwctz() != null
						&& castOther.getJcjsSlSkYwctz() != null && this
						.getJcjsSlSkYwctz()
						.equals(castOther.getJcjsSlSkYwctz())))
				&& ((this.getJcjsSlTjggGzl() == castOther.getJcjsSlTjggGzl()) || (this
						.getJcjsSlTjggGzl() != null
						&& castOther.getJcjsSlTjggGzl() != null && this
						.getJcjsSlTjggGzl()
						.equals(castOther.getJcjsSlTjggGzl())))
				&& ((this.getJcjsSlTjggYtz() == castOther.getJcjsSlTjggYtz()) || (this
						.getJcjsSlTjggYtz() != null
						&& castOther.getJcjsSlTjggYtz() != null && this
						.getJcjsSlTjggYtz()
						.equals(castOther.getJcjsSlTjggYtz())))
				&& ((this.getJcjsDl10kvYsGzl() == castOther
						.getJcjsDl10kvYsGzl()) || (this.getJcjsDl10kvYsGzl() != null
						&& castOther.getJcjsDl10kvYsGzl() != null && this
						.getJcjsDl10kvYsGzl().equals(
								castOther.getJcjsDl10kvYsGzl())))
				&& ((this.getJcjsDl10kvYsYtz() == castOther
						.getJcjsDl10kvYsYtz()) || (this.getJcjsDl10kvYsYtz() != null
						&& castOther.getJcjsDl10kvYsYtz() != null && this
						.getJcjsDl10kvYsYtz().equals(
								castOther.getJcjsDl10kvYsYtz())))
				&& ((this.getJcjsDl10kvYxGzl() == castOther
						.getJcjsDl10kvYxGzl()) || (this.getJcjsDl10kvYxGzl() != null
						&& castOther.getJcjsDl10kvYxGzl() != null && this
						.getJcjsDl10kvYxGzl().equals(
								castOther.getJcjsDl10kvYxGzl())))
				&& ((this.getJcjsDl10kvYxYtz() == castOther
						.getJcjsDl10kvYxYtz()) || (this.getJcjsDl10kvYxYtz() != null
						&& castOther.getJcjsDl10kvYxYtz() != null && this
						.getJcjsDl10kvYxYtz().equals(
								castOther.getJcjsDl10kvYxYtz())))
				&& ((this.getJcjsD10kvYxYtz() == castOther.getJcjsD10kvYxYtz()) || (this
						.getJcjsD10kvYxYtz() != null
						&& castOther.getJcjsD10kvYxYtz() != null && this
						.getJcjsD10kvYxYtz().equals(
								castOther.getJcjsD10kvYxYtz())))
				&& ((this.getJcjsDl6mYsGzl() == castOther.getJcjsDl6mYsGzl()) || (this
						.getJcjsDl6mYsGzl() != null
						&& castOther.getJcjsDl6mYsGzl() != null && this
						.getJcjsDl6mYsGzl()
						.equals(castOther.getJcjsDl6mYsGzl())))
				&& ((this.getJcjsDl6mYsYtz() == castOther.getJcjsDl6mYsYtz()) || (this
						.getJcjsDl6mYsYtz() != null
						&& castOther.getJcjsDl6mYsYtz() != null && this
						.getJcjsDl6mYsYtz()
						.equals(castOther.getJcjsDl6mYsYtz())))
				&& ((this.getJcjsDl6mYxGzl() == castOther.getJcjsDl6mYxGzl()) || (this
						.getJcjsDl6mYxGzl() != null
						&& castOther.getJcjsDl6mYxGzl() != null && this
						.getJcjsDl6mYxGzl()
						.equals(castOther.getJcjsDl6mYxGzl())))
				&& ((this.getJcjsDl6mYxYtz() == castOther.getJcjsDl6mYxYtz()) || (this
						.getJcjsDl6mYxYtz() != null
						&& castOther.getJcjsDl6mYxYtz() != null && this
						.getJcjsDl6mYxYtz()
						.equals(castOther.getJcjsDl6mYxYtz())))
				&& ((this.getJcjsLhMj() == castOther.getJcjsLhMj()) || (this
						.getJcjsLhMj() != null
						&& castOther.getJcjsLhMj() != null && this
						.getJcjsLhMj().equals(castOther.getJcjsLhMj())))
				&& ((this.getJcjsLhYtz() == castOther.getJcjsLhYtz()) || (this
						.getJcjsLhYtz() != null
						&& castOther.getJcjsLhYtz() != null && this
						.getJcjsLhYtz().equals(castOther.getJcjsLhYtz())))
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
				+ (getGsname() == null ? 0 : this.getGsname().hashCode());
		result = 37
				* result
				+ (getGsoldneame() == null ? 0 : this.getGsoldneame()
						.hashCode());
		result = 37 * result
				+ (getGzjg() == null ? 0 : this.getGzjg().hashCode());
		result = 37 * result
				+ (getDwfzr() == null ? 0 : this.getDwfzr().hashCode());
		result = 37 * result
				+ (getShr() == null ? 0 : this.getShr().hashCode());
		result = 37 * result
				+ (getTbr() == null ? 0 : this.getTbr().hashCode());
		result = 37 * result
				+ (getTbrdh() == null ? 0 : this.getTbrdh().hashCode());
		result = 37 * result
				+ (getTbtime() == null ? 0 : this.getTbtime().hashCode());
		result = 37
				* result
				+ (getJginfoZgbmname() == null ? 0 : this.getJginfoZgbmname()
						.hashCode());
		result = 37
				* result
				+ (getJginfoBgdd() == null ? 0 : this.getJginfoBgdd()
						.hashCode());
		result = 37 * result
				+ (getJginfoFr() == null ? 0 : this.getJginfoFr().hashCode());
		result = 37
				* result
				+ (getJginfoFrlxfs() == null ? 0 : this.getJginfoFrlxfs()
						.hashCode());
		result = 37
				* result
				+ (getJginfoIfzmjg() == null ? 0 : this.getJginfoIfzmjg()
						.hashCode());
		result = 37
				* result
				+ (getJginfoZmjgName() == null ? 0 : this.getJginfoZmjgName()
						.hashCode());
		result = 37
				* result
				+ (getJginfoZgfzrName() == null ? 0 : this.getJginfoZgfzrName()
						.hashCode());
		result = 37
				* result
				+ (getJginfoZgfzrLxdh() == null ? 0 : this.getJginfoZgfzrLxdh()
						.hashCode());
		result = 37
				* result
				+ (getGdzcGhtzze() == null ? 0 : this.getGdzcGhtzze()
						.hashCode());
		result = 37
				* result
				+ (getGdzcZxzjGj() == null ? 0 : this.getGdzcZxzjGj()
						.hashCode());
		result = 37
				* result
				+ (getGdzcZxzjZzqcz() == null ? 0 : this.getGdzcZxzjZzqcz()
						.hashCode());
		result = 37
				* result
				+ (getGdzcZxzjZzqbm() == null ? 0 : this.getGdzcZxzjZzqbm()
						.hashCode());
		result = 37
				* result
				+ (getGdzcZxzjSx() == null ? 0 : this.getGdzcZxzjSx()
						.hashCode());
		result = 37 * result
				+ (getGdzcZczj() == null ? 0 : this.getGdzcZczj().hashCode());
		result = 37 * result
				+ (getGdzcSrtz() == null ? 0 : this.getGdzcSrtz().hashCode());
		result = 37
				* result
				+ (getJcjsSlSkGzl() == null ? 0 : this.getJcjsSlSkGzl()
						.hashCode());
		result = 37
				* result
				+ (getJcjsSlSkYwctz() == null ? 0 : this.getJcjsSlSkYwctz()
						.hashCode());
		result = 37
				* result
				+ (getJcjsSlTjggGzl() == null ? 0 : this.getJcjsSlTjggGzl()
						.hashCode());
		result = 37
				* result
				+ (getJcjsSlTjggYtz() == null ? 0 : this.getJcjsSlTjggYtz()
						.hashCode());
		result = 37
				* result
				+ (getJcjsDl10kvYsGzl() == null ? 0 : this.getJcjsDl10kvYsGzl()
						.hashCode());
		result = 37
				* result
				+ (getJcjsDl10kvYsYtz() == null ? 0 : this.getJcjsDl10kvYsYtz()
						.hashCode());
		result = 37
				* result
				+ (getJcjsDl10kvYxGzl() == null ? 0 : this.getJcjsDl10kvYxGzl()
						.hashCode());
		result = 37
				* result
				+ (getJcjsDl10kvYxYtz() == null ? 0 : this.getJcjsDl10kvYxYtz()
						.hashCode());
		result = 37
				* result
				+ (getJcjsD10kvYxYtz() == null ? 0 : this.getJcjsD10kvYxYtz()
						.hashCode());
		result = 37
				* result
				+ (getJcjsDl6mYsGzl() == null ? 0 : this.getJcjsDl6mYsGzl()
						.hashCode());
		result = 37
				* result
				+ (getJcjsDl6mYsYtz() == null ? 0 : this.getJcjsDl6mYsYtz()
						.hashCode());
		result = 37
				* result
				+ (getJcjsDl6mYxGzl() == null ? 0 : this.getJcjsDl6mYxGzl()
						.hashCode());
		result = 37
				* result
				+ (getJcjsDl6mYxYtz() == null ? 0 : this.getJcjsDl6mYxYtz()
						.hashCode());
		result = 37 * result
				+ (getJcjsLhMj() == null ? 0 : this.getJcjsLhMj().hashCode());
		result = 37 * result
				+ (getJcjsLhYtz() == null ? 0 : this.getJcjsLhYtz().hashCode());
		result = 37 * result + (getBz() == null ? 0 : this.getBz().hashCode());
		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		return result;
	}

}