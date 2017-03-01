package com.ningxia.wine.entity;

/**
 * T203Id entity. @author MyEclipse Persistence Tools
 */

public class T203Id implements java.io.Serializable {

	// Fields

	private Integer id;
	private String nd;
	private String gscode;
	private String gsname;
	private String gsoldneame;
	private String dwfzr;
	private String gzjg;
	private String shr;
	private String tbr;
	private String tbrdh;
	private String tbtime;
	private Double zdmjSp;
	private Double zdmjSj;
	private Double zzmjZs;
	private Double zzmjJj;
	private Double zzmjSscj;
	private Double zzmjZt;
	private Double zzmjFzss;
	private Integer tccsl;
	private Integer kfcws;
	private String jzjb;
	private String jzpjtime;
	private Integer jdnlDay;
	private Integer jdnlDayMax;
	private Integer dnjdrc;
	private Double kfrzl;
	private Double dnlysrZe;
	private Double dnlysrKfsr;
	private Double dnlysrCy;
	private Double scnlSheji;
	private Double scnlShiji;
	private Double scnlDncl;
	private Double jztzJh;
	private Double jztzYwc;
	private Double jztzDntc;
	private Double gjtzJh;
	private Double gjtzYwc;
	private Double gjtzDntc;
	private String whjdIf;
	private Double whjdTz;
	private Double sbtzZzJhtz;
	private Double sbtzZzYwc;
	private Double sbtzZzDn;
	private Double sbtzQclJhtz;
	private Double sbtzQclYwc;
	private Double sbtzQclDn;
	private Double sbtzFjJhtz;
	private Double sbtzFjYwc;
	private Double sbtzFjDn;
	private Double sbtzGzJhtz;
	private Double sbtzGzYwc;
	private Double sbtzGzDn;
	private Integer gzscnl;
	private Integer bxggsl;
	private Double bxgzrl;
	private Integer xmtsl;
	private Double xmtzrl;
	private Double wsclNl;
	private Double wsclYtz;
	private String wsclIfdb;
	private Double gspzrl;
	private String bz;
	private Double lytzJh;
	private Double lytzYwc;
	private Double lytzDntz;
	private String jzdlwz;
	private String gfcl;

	// Constructors

	/** default constructor */
	public T203Id() {
	}

	/** minimal constructor */
	public T203Id(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public T203Id(Integer id, String nd, String gscode, String gsname,
			String gsoldneame, String dwfzr, String gzjg, String shr,
			String tbr, String tbrdh, String tbtime, Double zdmjSp,
			Double zdmjSj, Double zzmjZs, Double zzmjJj, Double zzmjSscj,
			Double zzmjZt, Double zzmjFzss, Integer tccsl, Integer kfcws,
			String jzjb, String jzpjtime, Integer jdnlDay, Integer jdnlDayMax,
			Integer dnjdrc, Double kfrzl, Double dnlysrZe, Double dnlysrKfsr,
			Double dnlysrCy, Double scnlSheji, Double scnlShiji,
			Double scnlDncl, Double jztzJh, Double jztzYwc, Double jztzDntc,
			Double gjtzJh, Double gjtzYwc, Double gjtzDntc, String whjdIf,
			Double whjdTz, Double sbtzZzJhtz, Double sbtzZzYwc,
			Double sbtzZzDn, Double sbtzQclJhtz, Double sbtzQclYwc,
			Double sbtzQclDn, Double sbtzFjJhtz, Double sbtzFjYwc,
			Double sbtzFjDn, Double sbtzGzJhtz, Double sbtzGzYwc,
			Double sbtzGzDn, Integer gzscnl, Integer bxggsl, Double bxgzrl,
			Integer xmtsl, Double xmtzrl, Double wsclNl, Double wsclYtz,
			String wsclIfdb, Double gspzrl, String bz, Double lytzJh,
			Double lytzYwc, Double lytzDntz, String jzdlwz, String gfcl) {
		this.id = id;
		this.nd = nd;
		this.gscode = gscode;
		this.gsname = gsname;
		this.gsoldneame = gsoldneame;
		this.dwfzr = dwfzr;
		this.gzjg = gzjg;
		this.shr = shr;
		this.tbr = tbr;
		this.tbrdh = tbrdh;
		this.tbtime = tbtime;
		this.zdmjSp = zdmjSp;
		this.zdmjSj = zdmjSj;
		this.zzmjZs = zzmjZs;
		this.zzmjJj = zzmjJj;
		this.zzmjSscj = zzmjSscj;
		this.zzmjZt = zzmjZt;
		this.zzmjFzss = zzmjFzss;
		this.tccsl = tccsl;
		this.kfcws = kfcws;
		this.jzjb = jzjb;
		this.jzpjtime = jzpjtime;
		this.jdnlDay = jdnlDay;
		this.jdnlDayMax = jdnlDayMax;
		this.dnjdrc = dnjdrc;
		this.kfrzl = kfrzl;
		this.dnlysrZe = dnlysrZe;
		this.dnlysrKfsr = dnlysrKfsr;
		this.dnlysrCy = dnlysrCy;
		this.scnlSheji = scnlSheji;
		this.scnlShiji = scnlShiji;
		this.scnlDncl = scnlDncl;
		this.jztzJh = jztzJh;
		this.jztzYwc = jztzYwc;
		this.jztzDntc = jztzDntc;
		this.gjtzJh = gjtzJh;
		this.gjtzYwc = gjtzYwc;
		this.gjtzDntc = gjtzDntc;
		this.whjdIf = whjdIf;
		this.whjdTz = whjdTz;
		this.sbtzZzJhtz = sbtzZzJhtz;
		this.sbtzZzYwc = sbtzZzYwc;
		this.sbtzZzDn = sbtzZzDn;
		this.sbtzQclJhtz = sbtzQclJhtz;
		this.sbtzQclYwc = sbtzQclYwc;
		this.sbtzQclDn = sbtzQclDn;
		this.sbtzFjJhtz = sbtzFjJhtz;
		this.sbtzFjYwc = sbtzFjYwc;
		this.sbtzFjDn = sbtzFjDn;
		this.sbtzGzJhtz = sbtzGzJhtz;
		this.sbtzGzYwc = sbtzGzYwc;
		this.sbtzGzDn = sbtzGzDn;
		this.gzscnl = gzscnl;
		this.bxggsl = bxggsl;
		this.bxgzrl = bxgzrl;
		this.xmtsl = xmtsl;
		this.xmtzrl = xmtzrl;
		this.wsclNl = wsclNl;
		this.wsclYtz = wsclYtz;
		this.wsclIfdb = wsclIfdb;
		this.gspzrl = gspzrl;
		this.bz = bz;
		this.lytzJh = lytzJh;
		this.lytzYwc = lytzYwc;
		this.lytzDntz = lytzDntz;
		this.jzdlwz = jzdlwz;
		this.gfcl = gfcl;
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

	public String getDwfzr() {
		return this.dwfzr;
	}

	public void setDwfzr(String dwfzr) {
		this.dwfzr = dwfzr;
	}

	public String getGzjg() {
		return this.gzjg;
	}

	public void setGzjg(String gzjg) {
		this.gzjg = gzjg;
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

	public Double getZdmjSp() {
		return this.zdmjSp;
	}

	public void setZdmjSp(Double zdmjSp) {
		this.zdmjSp = zdmjSp;
	}

	public Double getZdmjSj() {
		return this.zdmjSj;
	}

	public void setZdmjSj(Double zdmjSj) {
		this.zdmjSj = zdmjSj;
	}

	public Double getZzmjZs() {
		return this.zzmjZs;
	}

	public void setZzmjZs(Double zzmjZs) {
		this.zzmjZs = zzmjZs;
	}

	public Double getZzmjJj() {
		return this.zzmjJj;
	}

	public void setZzmjJj(Double zzmjJj) {
		this.zzmjJj = zzmjJj;
	}

	public Double getZzmjSscj() {
		return this.zzmjSscj;
	}

	public void setZzmjSscj(Double zzmjSscj) {
		this.zzmjSscj = zzmjSscj;
	}

	public Double getZzmjZt() {
		return this.zzmjZt;
	}

	public void setZzmjZt(Double zzmjZt) {
		this.zzmjZt = zzmjZt;
	}

	public Double getZzmjFzss() {
		return this.zzmjFzss;
	}

	public void setZzmjFzss(Double zzmjFzss) {
		this.zzmjFzss = zzmjFzss;
	}

	public Integer getTccsl() {
		return this.tccsl;
	}

	public void setTccsl(Integer tccsl) {
		this.tccsl = tccsl;
	}

	public Integer getKfcws() {
		return this.kfcws;
	}

	public void setKfcws(Integer kfcws) {
		this.kfcws = kfcws;
	}

	public String getJzjb() {
		return this.jzjb;
	}

	public void setJzjb(String jzjb) {
		this.jzjb = jzjb;
	}

	public String getJzpjtime() {
		return this.jzpjtime;
	}

	public void setJzpjtime(String jzpjtime) {
		this.jzpjtime = jzpjtime;
	}

	public Integer getJdnlDay() {
		return this.jdnlDay;
	}

	public void setJdnlDay(Integer jdnlDay) {
		this.jdnlDay = jdnlDay;
	}

	public Integer getJdnlDayMax() {
		return this.jdnlDayMax;
	}

	public void setJdnlDayMax(Integer jdnlDayMax) {
		this.jdnlDayMax = jdnlDayMax;
	}

	public Integer getDnjdrc() {
		return this.dnjdrc;
	}

	public void setDnjdrc(Integer dnjdrc) {
		this.dnjdrc = dnjdrc;
	}

	public Double getKfrzl() {
		return this.kfrzl;
	}

	public void setKfrzl(Double kfrzl) {
		this.kfrzl = kfrzl;
	}

	public Double getDnlysrZe() {
		return this.dnlysrZe;
	}

	public void setDnlysrZe(Double dnlysrZe) {
		this.dnlysrZe = dnlysrZe;
	}

	public Double getDnlysrKfsr() {
		return this.dnlysrKfsr;
	}

	public void setDnlysrKfsr(Double dnlysrKfsr) {
		this.dnlysrKfsr = dnlysrKfsr;
	}

	public Double getDnlysrCy() {
		return this.dnlysrCy;
	}

	public void setDnlysrCy(Double dnlysrCy) {
		this.dnlysrCy = dnlysrCy;
	}

	public Double getScnlSheji() {
		return this.scnlSheji;
	}

	public void setScnlSheji(Double scnlSheji) {
		this.scnlSheji = scnlSheji;
	}

	public Double getScnlShiji() {
		return this.scnlShiji;
	}

	public void setScnlShiji(Double scnlShiji) {
		this.scnlShiji = scnlShiji;
	}

	public Double getScnlDncl() {
		return this.scnlDncl;
	}

	public void setScnlDncl(Double scnlDncl) {
		this.scnlDncl = scnlDncl;
	}

	public Double getJztzJh() {
		return this.jztzJh;
	}

	public void setJztzJh(Double jztzJh) {
		this.jztzJh = jztzJh;
	}

	public Double getJztzYwc() {
		return this.jztzYwc;
	}

	public void setJztzYwc(Double jztzYwc) {
		this.jztzYwc = jztzYwc;
	}

	public Double getJztzDntc() {
		return this.jztzDntc;
	}

	public void setJztzDntc(Double jztzDntc) {
		this.jztzDntc = jztzDntc;
	}

	public Double getGjtzJh() {
		return this.gjtzJh;
	}

	public void setGjtzJh(Double gjtzJh) {
		this.gjtzJh = gjtzJh;
	}

	public Double getGjtzYwc() {
		return this.gjtzYwc;
	}

	public void setGjtzYwc(Double gjtzYwc) {
		this.gjtzYwc = gjtzYwc;
	}

	public Double getGjtzDntc() {
		return this.gjtzDntc;
	}

	public void setGjtzDntc(Double gjtzDntc) {
		this.gjtzDntc = gjtzDntc;
	}

	public String getWhjdIf() {
		return this.whjdIf;
	}

	public void setWhjdIf(String whjdIf) {
		this.whjdIf = whjdIf;
	}

	public Double getWhjdTz() {
		return this.whjdTz;
	}

	public void setWhjdTz(Double whjdTz) {
		this.whjdTz = whjdTz;
	}

	public Double getSbtzZzJhtz() {
		return this.sbtzZzJhtz;
	}

	public void setSbtzZzJhtz(Double sbtzZzJhtz) {
		this.sbtzZzJhtz = sbtzZzJhtz;
	}

	public Double getSbtzZzYwc() {
		return this.sbtzZzYwc;
	}

	public void setSbtzZzYwc(Double sbtzZzYwc) {
		this.sbtzZzYwc = sbtzZzYwc;
	}

	public Double getSbtzZzDn() {
		return this.sbtzZzDn;
	}

	public void setSbtzZzDn(Double sbtzZzDn) {
		this.sbtzZzDn = sbtzZzDn;
	}

	public Double getSbtzQclJhtz() {
		return this.sbtzQclJhtz;
	}

	public void setSbtzQclJhtz(Double sbtzQclJhtz) {
		this.sbtzQclJhtz = sbtzQclJhtz;
	}

	public Double getSbtzQclYwc() {
		return this.sbtzQclYwc;
	}

	public void setSbtzQclYwc(Double sbtzQclYwc) {
		this.sbtzQclYwc = sbtzQclYwc;
	}

	public Double getSbtzQclDn() {
		return this.sbtzQclDn;
	}

	public void setSbtzQclDn(Double sbtzQclDn) {
		this.sbtzQclDn = sbtzQclDn;
	}

	public Double getSbtzFjJhtz() {
		return this.sbtzFjJhtz;
	}

	public void setSbtzFjJhtz(Double sbtzFjJhtz) {
		this.sbtzFjJhtz = sbtzFjJhtz;
	}

	public Double getSbtzFjYwc() {
		return this.sbtzFjYwc;
	}

	public void setSbtzFjYwc(Double sbtzFjYwc) {
		this.sbtzFjYwc = sbtzFjYwc;
	}

	public Double getSbtzFjDn() {
		return this.sbtzFjDn;
	}

	public void setSbtzFjDn(Double sbtzFjDn) {
		this.sbtzFjDn = sbtzFjDn;
	}

	public Double getSbtzGzJhtz() {
		return this.sbtzGzJhtz;
	}

	public void setSbtzGzJhtz(Double sbtzGzJhtz) {
		this.sbtzGzJhtz = sbtzGzJhtz;
	}

	public Double getSbtzGzYwc() {
		return this.sbtzGzYwc;
	}

	public void setSbtzGzYwc(Double sbtzGzYwc) {
		this.sbtzGzYwc = sbtzGzYwc;
	}

	public Double getSbtzGzDn() {
		return this.sbtzGzDn;
	}

	public void setSbtzGzDn(Double sbtzGzDn) {
		this.sbtzGzDn = sbtzGzDn;
	}

	public Integer getGzscnl() {
		return this.gzscnl;
	}

	public void setGzscnl(Integer gzscnl) {
		this.gzscnl = gzscnl;
	}

	public Integer getBxggsl() {
		return this.bxggsl;
	}

	public void setBxggsl(Integer bxggsl) {
		this.bxggsl = bxggsl;
	}

	public Double getBxgzrl() {
		return this.bxgzrl;
	}

	public void setBxgzrl(Double bxgzrl) {
		this.bxgzrl = bxgzrl;
	}

	public Integer getXmtsl() {
		return this.xmtsl;
	}

	public void setXmtsl(Integer xmtsl) {
		this.xmtsl = xmtsl;
	}

	public Double getXmtzrl() {
		return this.xmtzrl;
	}

	public void setXmtzrl(Double xmtzrl) {
		this.xmtzrl = xmtzrl;
	}

	public Double getWsclNl() {
		return this.wsclNl;
	}

	public void setWsclNl(Double wsclNl) {
		this.wsclNl = wsclNl;
	}

	public Double getWsclYtz() {
		return this.wsclYtz;
	}

	public void setWsclYtz(Double wsclYtz) {
		this.wsclYtz = wsclYtz;
	}

	public String getWsclIfdb() {
		return this.wsclIfdb;
	}

	public void setWsclIfdb(String wsclIfdb) {
		this.wsclIfdb = wsclIfdb;
	}

	public Double getGspzrl() {
		return this.gspzrl;
	}

	public void setGspzrl(Double gspzrl) {
		this.gspzrl = gspzrl;
	}

	public String getBz() {
		return this.bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	public Double getLytzJh() {
		return this.lytzJh;
	}

	public void setLytzJh(Double lytzJh) {
		this.lytzJh = lytzJh;
	}

	public Double getLytzYwc() {
		return this.lytzYwc;
	}

	public void setLytzYwc(Double lytzYwc) {
		this.lytzYwc = lytzYwc;
	}

	public Double getLytzDntz() {
		return this.lytzDntz;
	}

	public void setLytzDntz(Double lytzDntz) {
		this.lytzDntz = lytzDntz;
	}

	public String getJzdlwz() {
		return this.jzdlwz;
	}

	public void setJzdlwz(String jzdlwz) {
		this.jzdlwz = jzdlwz;
	}

	public String getGfcl() {
		return this.gfcl;
	}

	public void setGfcl(String gfcl) {
		this.gfcl = gfcl;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof T203Id))
			return false;
		T203Id castOther = (T203Id) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getNd() == castOther.getNd()) || (this.getNd() != null
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
				&& ((this.getDwfzr() == castOther.getDwfzr()) || (this
						.getDwfzr() != null && castOther.getDwfzr() != null && this
						.getDwfzr().equals(castOther.getDwfzr())))
				&& ((this.getGzjg() == castOther.getGzjg()) || (this.getGzjg() != null
						&& castOther.getGzjg() != null && this.getGzjg()
						.equals(castOther.getGzjg())))
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
				&& ((this.getZdmjSp() == castOther.getZdmjSp()) || (this
						.getZdmjSp() != null && castOther.getZdmjSp() != null && this
						.getZdmjSp().equals(castOther.getZdmjSp())))
				&& ((this.getZdmjSj() == castOther.getZdmjSj()) || (this
						.getZdmjSj() != null && castOther.getZdmjSj() != null && this
						.getZdmjSj().equals(castOther.getZdmjSj())))
				&& ((this.getZzmjZs() == castOther.getZzmjZs()) || (this
						.getZzmjZs() != null && castOther.getZzmjZs() != null && this
						.getZzmjZs().equals(castOther.getZzmjZs())))
				&& ((this.getZzmjJj() == castOther.getZzmjJj()) || (this
						.getZzmjJj() != null && castOther.getZzmjJj() != null && this
						.getZzmjJj().equals(castOther.getZzmjJj())))
				&& ((this.getZzmjSscj() == castOther.getZzmjSscj()) || (this
						.getZzmjSscj() != null
						&& castOther.getZzmjSscj() != null && this
						.getZzmjSscj().equals(castOther.getZzmjSscj())))
				&& ((this.getZzmjZt() == castOther.getZzmjZt()) || (this
						.getZzmjZt() != null && castOther.getZzmjZt() != null && this
						.getZzmjZt().equals(castOther.getZzmjZt())))
				&& ((this.getZzmjFzss() == castOther.getZzmjFzss()) || (this
						.getZzmjFzss() != null
						&& castOther.getZzmjFzss() != null && this
						.getZzmjFzss().equals(castOther.getZzmjFzss())))
				&& ((this.getTccsl() == castOther.getTccsl()) || (this
						.getTccsl() != null && castOther.getTccsl() != null && this
						.getTccsl().equals(castOther.getTccsl())))
				&& ((this.getKfcws() == castOther.getKfcws()) || (this
						.getKfcws() != null && castOther.getKfcws() != null && this
						.getKfcws().equals(castOther.getKfcws())))
				&& ((this.getJzjb() == castOther.getJzjb()) || (this.getJzjb() != null
						&& castOther.getJzjb() != null && this.getJzjb()
						.equals(castOther.getJzjb())))
				&& ((this.getJzpjtime() == castOther.getJzpjtime()) || (this
						.getJzpjtime() != null
						&& castOther.getJzpjtime() != null && this
						.getJzpjtime().equals(castOther.getJzpjtime())))
				&& ((this.getJdnlDay() == castOther.getJdnlDay()) || (this
						.getJdnlDay() != null && castOther.getJdnlDay() != null && this
						.getJdnlDay().equals(castOther.getJdnlDay())))
				&& ((this.getJdnlDayMax() == castOther.getJdnlDayMax()) || (this
						.getJdnlDayMax() != null
						&& castOther.getJdnlDayMax() != null && this
						.getJdnlDayMax().equals(castOther.getJdnlDayMax())))
				&& ((this.getDnjdrc() == castOther.getDnjdrc()) || (this
						.getDnjdrc() != null && castOther.getDnjdrc() != null && this
						.getDnjdrc().equals(castOther.getDnjdrc())))
				&& ((this.getKfrzl() == castOther.getKfrzl()) || (this
						.getKfrzl() != null && castOther.getKfrzl() != null && this
						.getKfrzl().equals(castOther.getKfrzl())))
				&& ((this.getDnlysrZe() == castOther.getDnlysrZe()) || (this
						.getDnlysrZe() != null
						&& castOther.getDnlysrZe() != null && this
						.getDnlysrZe().equals(castOther.getDnlysrZe())))
				&& ((this.getDnlysrKfsr() == castOther.getDnlysrKfsr()) || (this
						.getDnlysrKfsr() != null
						&& castOther.getDnlysrKfsr() != null && this
						.getDnlysrKfsr().equals(castOther.getDnlysrKfsr())))
				&& ((this.getDnlysrCy() == castOther.getDnlysrCy()) || (this
						.getDnlysrCy() != null
						&& castOther.getDnlysrCy() != null && this
						.getDnlysrCy().equals(castOther.getDnlysrCy())))
				&& ((this.getScnlSheji() == castOther.getScnlSheji()) || (this
						.getScnlSheji() != null
						&& castOther.getScnlSheji() != null && this
						.getScnlSheji().equals(castOther.getScnlSheji())))
				&& ((this.getScnlShiji() == castOther.getScnlShiji()) || (this
						.getScnlShiji() != null
						&& castOther.getScnlShiji() != null && this
						.getScnlShiji().equals(castOther.getScnlShiji())))
				&& ((this.getScnlDncl() == castOther.getScnlDncl()) || (this
						.getScnlDncl() != null
						&& castOther.getScnlDncl() != null && this
						.getScnlDncl().equals(castOther.getScnlDncl())))
				&& ((this.getJztzJh() == castOther.getJztzJh()) || (this
						.getJztzJh() != null && castOther.getJztzJh() != null && this
						.getJztzJh().equals(castOther.getJztzJh())))
				&& ((this.getJztzYwc() == castOther.getJztzYwc()) || (this
						.getJztzYwc() != null && castOther.getJztzYwc() != null && this
						.getJztzYwc().equals(castOther.getJztzYwc())))
				&& ((this.getJztzDntc() == castOther.getJztzDntc()) || (this
						.getJztzDntc() != null
						&& castOther.getJztzDntc() != null && this
						.getJztzDntc().equals(castOther.getJztzDntc())))
				&& ((this.getGjtzJh() == castOther.getGjtzJh()) || (this
						.getGjtzJh() != null && castOther.getGjtzJh() != null && this
						.getGjtzJh().equals(castOther.getGjtzJh())))
				&& ((this.getGjtzYwc() == castOther.getGjtzYwc()) || (this
						.getGjtzYwc() != null && castOther.getGjtzYwc() != null && this
						.getGjtzYwc().equals(castOther.getGjtzYwc())))
				&& ((this.getGjtzDntc() == castOther.getGjtzDntc()) || (this
						.getGjtzDntc() != null
						&& castOther.getGjtzDntc() != null && this
						.getGjtzDntc().equals(castOther.getGjtzDntc())))
				&& ((this.getWhjdIf() == castOther.getWhjdIf()) || (this
						.getWhjdIf() != null && castOther.getWhjdIf() != null && this
						.getWhjdIf().equals(castOther.getWhjdIf())))
				&& ((this.getWhjdTz() == castOther.getWhjdTz()) || (this
						.getWhjdTz() != null && castOther.getWhjdTz() != null && this
						.getWhjdTz().equals(castOther.getWhjdTz())))
				&& ((this.getSbtzZzJhtz() == castOther.getSbtzZzJhtz()) || (this
						.getSbtzZzJhtz() != null
						&& castOther.getSbtzZzJhtz() != null && this
						.getSbtzZzJhtz().equals(castOther.getSbtzZzJhtz())))
				&& ((this.getSbtzZzYwc() == castOther.getSbtzZzYwc()) || (this
						.getSbtzZzYwc() != null
						&& castOther.getSbtzZzYwc() != null && this
						.getSbtzZzYwc().equals(castOther.getSbtzZzYwc())))
				&& ((this.getSbtzZzDn() == castOther.getSbtzZzDn()) || (this
						.getSbtzZzDn() != null
						&& castOther.getSbtzZzDn() != null && this
						.getSbtzZzDn().equals(castOther.getSbtzZzDn())))
				&& ((this.getSbtzQclJhtz() == castOther.getSbtzQclJhtz()) || (this
						.getSbtzQclJhtz() != null
						&& castOther.getSbtzQclJhtz() != null && this
						.getSbtzQclJhtz().equals(castOther.getSbtzQclJhtz())))
				&& ((this.getSbtzQclYwc() == castOther.getSbtzQclYwc()) || (this
						.getSbtzQclYwc() != null
						&& castOther.getSbtzQclYwc() != null && this
						.getSbtzQclYwc().equals(castOther.getSbtzQclYwc())))
				&& ((this.getSbtzQclDn() == castOther.getSbtzQclDn()) || (this
						.getSbtzQclDn() != null
						&& castOther.getSbtzQclDn() != null && this
						.getSbtzQclDn().equals(castOther.getSbtzQclDn())))
				&& ((this.getSbtzFjJhtz() == castOther.getSbtzFjJhtz()) || (this
						.getSbtzFjJhtz() != null
						&& castOther.getSbtzFjJhtz() != null && this
						.getSbtzFjJhtz().equals(castOther.getSbtzFjJhtz())))
				&& ((this.getSbtzFjYwc() == castOther.getSbtzFjYwc()) || (this
						.getSbtzFjYwc() != null
						&& castOther.getSbtzFjYwc() != null && this
						.getSbtzFjYwc().equals(castOther.getSbtzFjYwc())))
				&& ((this.getSbtzFjDn() == castOther.getSbtzFjDn()) || (this
						.getSbtzFjDn() != null
						&& castOther.getSbtzFjDn() != null && this
						.getSbtzFjDn().equals(castOther.getSbtzFjDn())))
				&& ((this.getSbtzGzJhtz() == castOther.getSbtzGzJhtz()) || (this
						.getSbtzGzJhtz() != null
						&& castOther.getSbtzGzJhtz() != null && this
						.getSbtzGzJhtz().equals(castOther.getSbtzGzJhtz())))
				&& ((this.getSbtzGzYwc() == castOther.getSbtzGzYwc()) || (this
						.getSbtzGzYwc() != null
						&& castOther.getSbtzGzYwc() != null && this
						.getSbtzGzYwc().equals(castOther.getSbtzGzYwc())))
				&& ((this.getSbtzGzDn() == castOther.getSbtzGzDn()) || (this
						.getSbtzGzDn() != null
						&& castOther.getSbtzGzDn() != null && this
						.getSbtzGzDn().equals(castOther.getSbtzGzDn())))
				&& ((this.getGzscnl() == castOther.getGzscnl()) || (this
						.getGzscnl() != null && castOther.getGzscnl() != null && this
						.getGzscnl().equals(castOther.getGzscnl())))
				&& ((this.getBxggsl() == castOther.getBxggsl()) || (this
						.getBxggsl() != null && castOther.getBxggsl() != null && this
						.getBxggsl().equals(castOther.getBxggsl())))
				&& ((this.getBxgzrl() == castOther.getBxgzrl()) || (this
						.getBxgzrl() != null && castOther.getBxgzrl() != null && this
						.getBxgzrl().equals(castOther.getBxgzrl())))
				&& ((this.getXmtsl() == castOther.getXmtsl()) || (this
						.getXmtsl() != null && castOther.getXmtsl() != null && this
						.getXmtsl().equals(castOther.getXmtsl())))
				&& ((this.getXmtzrl() == castOther.getXmtzrl()) || (this
						.getXmtzrl() != null && castOther.getXmtzrl() != null && this
						.getXmtzrl().equals(castOther.getXmtzrl())))
				&& ((this.getWsclNl() == castOther.getWsclNl()) || (this
						.getWsclNl() != null && castOther.getWsclNl() != null && this
						.getWsclNl().equals(castOther.getWsclNl())))
				&& ((this.getWsclYtz() == castOther.getWsclYtz()) || (this
						.getWsclYtz() != null && castOther.getWsclYtz() != null && this
						.getWsclYtz().equals(castOther.getWsclYtz())))
				&& ((this.getWsclIfdb() == castOther.getWsclIfdb()) || (this
						.getWsclIfdb() != null
						&& castOther.getWsclIfdb() != null && this
						.getWsclIfdb().equals(castOther.getWsclIfdb())))
				&& ((this.getGspzrl() == castOther.getGspzrl()) || (this
						.getGspzrl() != null && castOther.getGspzrl() != null && this
						.getGspzrl().equals(castOther.getGspzrl())))
				&& ((this.getBz() == castOther.getBz()) || (this.getBz() != null
						&& castOther.getBz() != null && this.getBz().equals(
						castOther.getBz())))
				&& ((this.getLytzJh() == castOther.getLytzJh()) || (this
						.getLytzJh() != null && castOther.getLytzJh() != null && this
						.getLytzJh().equals(castOther.getLytzJh())))
				&& ((this.getLytzYwc() == castOther.getLytzYwc()) || (this
						.getLytzYwc() != null && castOther.getLytzYwc() != null && this
						.getLytzYwc().equals(castOther.getLytzYwc())))
				&& ((this.getLytzDntz() == castOther.getLytzDntz()) || (this
						.getLytzDntz() != null
						&& castOther.getLytzDntz() != null && this
						.getLytzDntz().equals(castOther.getLytzDntz())))
				&& ((this.getJzdlwz() == castOther.getJzdlwz()) || (this
						.getJzdlwz() != null && castOther.getJzdlwz() != null && this
						.getJzdlwz().equals(castOther.getJzdlwz())))
				&& ((this.getGfcl() == castOther.getGfcl()) || (this.getGfcl() != null
						&& castOther.getGfcl() != null && this.getGfcl()
						.equals(castOther.getGfcl())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
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
				+ (getDwfzr() == null ? 0 : this.getDwfzr().hashCode());
		result = 37 * result
				+ (getGzjg() == null ? 0 : this.getGzjg().hashCode());
		result = 37 * result
				+ (getShr() == null ? 0 : this.getShr().hashCode());
		result = 37 * result
				+ (getTbr() == null ? 0 : this.getTbr().hashCode());
		result = 37 * result
				+ (getTbrdh() == null ? 0 : this.getTbrdh().hashCode());
		result = 37 * result
				+ (getTbtime() == null ? 0 : this.getTbtime().hashCode());
		result = 37 * result
				+ (getZdmjSp() == null ? 0 : this.getZdmjSp().hashCode());
		result = 37 * result
				+ (getZdmjSj() == null ? 0 : this.getZdmjSj().hashCode());
		result = 37 * result
				+ (getZzmjZs() == null ? 0 : this.getZzmjZs().hashCode());
		result = 37 * result
				+ (getZzmjJj() == null ? 0 : this.getZzmjJj().hashCode());
		result = 37 * result
				+ (getZzmjSscj() == null ? 0 : this.getZzmjSscj().hashCode());
		result = 37 * result
				+ (getZzmjZt() == null ? 0 : this.getZzmjZt().hashCode());
		result = 37 * result
				+ (getZzmjFzss() == null ? 0 : this.getZzmjFzss().hashCode());
		result = 37 * result
				+ (getTccsl() == null ? 0 : this.getTccsl().hashCode());
		result = 37 * result
				+ (getKfcws() == null ? 0 : this.getKfcws().hashCode());
		result = 37 * result
				+ (getJzjb() == null ? 0 : this.getJzjb().hashCode());
		result = 37 * result
				+ (getJzpjtime() == null ? 0 : this.getJzpjtime().hashCode());
		result = 37 * result
				+ (getJdnlDay() == null ? 0 : this.getJdnlDay().hashCode());
		result = 37
				* result
				+ (getJdnlDayMax() == null ? 0 : this.getJdnlDayMax()
						.hashCode());
		result = 37 * result
				+ (getDnjdrc() == null ? 0 : this.getDnjdrc().hashCode());
		result = 37 * result
				+ (getKfrzl() == null ? 0 : this.getKfrzl().hashCode());
		result = 37 * result
				+ (getDnlysrZe() == null ? 0 : this.getDnlysrZe().hashCode());
		result = 37
				* result
				+ (getDnlysrKfsr() == null ? 0 : this.getDnlysrKfsr()
						.hashCode());
		result = 37 * result
				+ (getDnlysrCy() == null ? 0 : this.getDnlysrCy().hashCode());
		result = 37 * result
				+ (getScnlSheji() == null ? 0 : this.getScnlSheji().hashCode());
		result = 37 * result
				+ (getScnlShiji() == null ? 0 : this.getScnlShiji().hashCode());
		result = 37 * result
				+ (getScnlDncl() == null ? 0 : this.getScnlDncl().hashCode());
		result = 37 * result
				+ (getJztzJh() == null ? 0 : this.getJztzJh().hashCode());
		result = 37 * result
				+ (getJztzYwc() == null ? 0 : this.getJztzYwc().hashCode());
		result = 37 * result
				+ (getJztzDntc() == null ? 0 : this.getJztzDntc().hashCode());
		result = 37 * result
				+ (getGjtzJh() == null ? 0 : this.getGjtzJh().hashCode());
		result = 37 * result
				+ (getGjtzYwc() == null ? 0 : this.getGjtzYwc().hashCode());
		result = 37 * result
				+ (getGjtzDntc() == null ? 0 : this.getGjtzDntc().hashCode());
		result = 37 * result
				+ (getWhjdIf() == null ? 0 : this.getWhjdIf().hashCode());
		result = 37 * result
				+ (getWhjdTz() == null ? 0 : this.getWhjdTz().hashCode());
		result = 37
				* result
				+ (getSbtzZzJhtz() == null ? 0 : this.getSbtzZzJhtz()
						.hashCode());
		result = 37 * result
				+ (getSbtzZzYwc() == null ? 0 : this.getSbtzZzYwc().hashCode());
		result = 37 * result
				+ (getSbtzZzDn() == null ? 0 : this.getSbtzZzDn().hashCode());
		result = 37
				* result
				+ (getSbtzQclJhtz() == null ? 0 : this.getSbtzQclJhtz()
						.hashCode());
		result = 37
				* result
				+ (getSbtzQclYwc() == null ? 0 : this.getSbtzQclYwc()
						.hashCode());
		result = 37 * result
				+ (getSbtzQclDn() == null ? 0 : this.getSbtzQclDn().hashCode());
		result = 37
				* result
				+ (getSbtzFjJhtz() == null ? 0 : this.getSbtzFjJhtz()
						.hashCode());
		result = 37 * result
				+ (getSbtzFjYwc() == null ? 0 : this.getSbtzFjYwc().hashCode());
		result = 37 * result
				+ (getSbtzFjDn() == null ? 0 : this.getSbtzFjDn().hashCode());
		result = 37
				* result
				+ (getSbtzGzJhtz() == null ? 0 : this.getSbtzGzJhtz()
						.hashCode());
		result = 37 * result
				+ (getSbtzGzYwc() == null ? 0 : this.getSbtzGzYwc().hashCode());
		result = 37 * result
				+ (getSbtzGzDn() == null ? 0 : this.getSbtzGzDn().hashCode());
		result = 37 * result
				+ (getGzscnl() == null ? 0 : this.getGzscnl().hashCode());
		result = 37 * result
				+ (getBxggsl() == null ? 0 : this.getBxggsl().hashCode());
		result = 37 * result
				+ (getBxgzrl() == null ? 0 : this.getBxgzrl().hashCode());
		result = 37 * result
				+ (getXmtsl() == null ? 0 : this.getXmtsl().hashCode());
		result = 37 * result
				+ (getXmtzrl() == null ? 0 : this.getXmtzrl().hashCode());
		result = 37 * result
				+ (getWsclNl() == null ? 0 : this.getWsclNl().hashCode());
		result = 37 * result
				+ (getWsclYtz() == null ? 0 : this.getWsclYtz().hashCode());
		result = 37 * result
				+ (getWsclIfdb() == null ? 0 : this.getWsclIfdb().hashCode());
		result = 37 * result
				+ (getGspzrl() == null ? 0 : this.getGspzrl().hashCode());
		result = 37 * result + (getBz() == null ? 0 : this.getBz().hashCode());
		result = 37 * result
				+ (getLytzJh() == null ? 0 : this.getLytzJh().hashCode());
		result = 37 * result
				+ (getLytzYwc() == null ? 0 : this.getLytzYwc().hashCode());
		result = 37 * result
				+ (getLytzDntz() == null ? 0 : this.getLytzDntz().hashCode());
		result = 37 * result
				+ (getJzdlwz() == null ? 0 : this.getJzdlwz().hashCode());
		result = 37 * result
				+ (getGfcl() == null ? 0 : this.getGfcl().hashCode());
		return result;
	}

}