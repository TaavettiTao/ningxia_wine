package com.ningxia.wine.entity;

/**
 * T201Id entity. @author MyEclipse Persistence Tools
 */

public class T201Id implements java.io.Serializable {

	// Fields

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
	private String szcode;
	private String qydjtime;
	private String lxfs;
	private String xzqydm;
	private String xxdz;
	private String dlwz;
	private String qyyx;
	private String dhhm;
	private String lxr;
	private String czhm;
	private String qyczlx;
	private String qygm;
	private String sscq;
	private String ssxq;
	private String zjzgbm;
	private String jzmc;
	private String jytime;
	private String tctime;
	private Double yjcpmj;
	private Double yjjcn;
	private Double zdmj;
	private Double dnjjZzq;
	private Double dnjjShi;
	private Double dnjjXian;
	private Double dnjjZje;
	private Double dnbzZzq;
	private Double dnbzShi;
	private Double dnbzXian;
	private Double dnbzZje;
	private Integer ygGl;
	private Integer ygSc;
	private Integer ygNysc;
	private Integer ygSlg;
	private Integer ygZrs;
	private Double gzGlry;
	private Double gzScry;
	private Double gzNysc;
	private Double gzZje;
	private String bz;
	private String xqQuCode;
	private String xqXianCode;
	private String xqXiangCode;
	private String xqCunCode;
	private String xqQuName;
	private String xqXianName;
	private String xqXiangName;
	private String xqCunName;
	private Double companyGpsLongitude;
	private Double companyGpsLatitude;
	private String producingAreaCityCode;
	private String producingAreaCityName;
	private String producingAreaCountyCode;
	private String producingAreaCountyName;
	private String legalRepresentative;
	private Integer whetherCompanyNongken;
	private Integer id;
	private Integer hasQsinfo;
	private String qsNumber;
	private String getQsTime;
	private Integer qsDuration;
	private Integer jxjyrsZs;
	private Integer jxjyrsXpx;
	private Integer jxjyrsQpx;
	private Integer jxjyrsGnpx;
	private Integer jxjyrsGwpx;

	// Constructors

	/** default constructor */
	public T201Id() {
	}

	/** minimal constructor */
	public T201Id(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public T201Id(String nd, String gscode, String gsname, String gsoldneame,
			String dwfzr, String gzjg, String shr, String tbr, String tbrdh,
			String tbtime, String szcode, String qydjtime, String lxfs,
			String xzqydm, String xxdz, String dlwz, String qyyx, String dhhm,
			String lxr, String czhm, String qyczlx, String qygm, String sscq,
			String ssxq, String zjzgbm, String jzmc, String jytime,
			String tctime, Double yjcpmj, Double yjjcn, Double zdmj,
			Double dnjjZzq, Double dnjjShi, Double dnjjXian, Double dnjjZje,
			Double dnbzZzq, Double dnbzShi, Double dnbzXian, Double dnbzZje,
			Integer ygGl, Integer ygSc, Integer ygNysc, Integer ygSlg,
			Integer ygZrs, Double gzGlry, Double gzScry, Double gzNysc,
			Double gzZje, String bz, String xqQuCode, String xqXianCode,
			String xqXiangCode, String xqCunCode, String xqQuName,
			String xqXianName, String xqXiangName, String xqCunName,
			Double companyGpsLongitude, Double companyGpsLatitude,
			String producingAreaCityCode, String producingAreaCityName,
			String producingAreaCountyCode, String producingAreaCountyName,
			String legalRepresentative, Integer whetherCompanyNongken,
			Integer id, Integer hasQsinfo, String qsNumber, String getQsTime,
			Integer qsDuration, Integer jxjyrsZs, Integer jxjyrsXpx,
			Integer jxjyrsQpx, Integer jxjyrsGnpx, Integer jxjyrsGwpx) {
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
		this.szcode = szcode;
		this.qydjtime = qydjtime;
		this.lxfs = lxfs;
		this.xzqydm = xzqydm;
		this.xxdz = xxdz;
		this.dlwz = dlwz;
		this.qyyx = qyyx;
		this.dhhm = dhhm;
		this.lxr = lxr;
		this.czhm = czhm;
		this.qyczlx = qyczlx;
		this.qygm = qygm;
		this.sscq = sscq;
		this.ssxq = ssxq;
		this.zjzgbm = zjzgbm;
		this.jzmc = jzmc;
		this.jytime = jytime;
		this.tctime = tctime;
		this.yjcpmj = yjcpmj;
		this.yjjcn = yjjcn;
		this.zdmj = zdmj;
		this.dnjjZzq = dnjjZzq;
		this.dnjjShi = dnjjShi;
		this.dnjjXian = dnjjXian;
		this.dnjjZje = dnjjZje;
		this.dnbzZzq = dnbzZzq;
		this.dnbzShi = dnbzShi;
		this.dnbzXian = dnbzXian;
		this.dnbzZje = dnbzZje;
		this.ygGl = ygGl;
		this.ygSc = ygSc;
		this.ygNysc = ygNysc;
		this.ygSlg = ygSlg;
		this.ygZrs = ygZrs;
		this.gzGlry = gzGlry;
		this.gzScry = gzScry;
		this.gzNysc = gzNysc;
		this.gzZje = gzZje;
		this.bz = bz;
		this.xqQuCode = xqQuCode;
		this.xqXianCode = xqXianCode;
		this.xqXiangCode = xqXiangCode;
		this.xqCunCode = xqCunCode;
		this.xqQuName = xqQuName;
		this.xqXianName = xqXianName;
		this.xqXiangName = xqXiangName;
		this.xqCunName = xqCunName;
		this.companyGpsLongitude = companyGpsLongitude;
		this.companyGpsLatitude = companyGpsLatitude;
		this.producingAreaCityCode = producingAreaCityCode;
		this.producingAreaCityName = producingAreaCityName;
		this.producingAreaCountyCode = producingAreaCountyCode;
		this.producingAreaCountyName = producingAreaCountyName;
		this.legalRepresentative = legalRepresentative;
		this.whetherCompanyNongken = whetherCompanyNongken;
		this.id = id;
		this.hasQsinfo = hasQsinfo;
		this.qsNumber = qsNumber;
		this.getQsTime = getQsTime;
		this.qsDuration = qsDuration;
		this.jxjyrsZs = jxjyrsZs;
		this.jxjyrsXpx = jxjyrsXpx;
		this.jxjyrsQpx = jxjyrsQpx;
		this.jxjyrsGnpx = jxjyrsGnpx;
		this.jxjyrsGwpx = jxjyrsGwpx;
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

	public String getSzcode() {
		return this.szcode;
	}

	public void setSzcode(String szcode) {
		this.szcode = szcode;
	}

	public String getQydjtime() {
		return this.qydjtime;
	}

	public void setQydjtime(String qydjtime) {
		this.qydjtime = qydjtime;
	}

	public String getLxfs() {
		return this.lxfs;
	}

	public void setLxfs(String lxfs) {
		this.lxfs = lxfs;
	}

	public String getXzqydm() {
		return this.xzqydm;
	}

	public void setXzqydm(String xzqydm) {
		this.xzqydm = xzqydm;
	}

	public String getXxdz() {
		return this.xxdz;
	}

	public void setXxdz(String xxdz) {
		this.xxdz = xxdz;
	}

	public String getDlwz() {
		return this.dlwz;
	}

	public void setDlwz(String dlwz) {
		this.dlwz = dlwz;
	}

	public String getQyyx() {
		return this.qyyx;
	}

	public void setQyyx(String qyyx) {
		this.qyyx = qyyx;
	}

	public String getDhhm() {
		return this.dhhm;
	}

	public void setDhhm(String dhhm) {
		this.dhhm = dhhm;
	}

	public String getLxr() {
		return this.lxr;
	}

	public void setLxr(String lxr) {
		this.lxr = lxr;
	}

	public String getCzhm() {
		return this.czhm;
	}

	public void setCzhm(String czhm) {
		this.czhm = czhm;
	}

	public String getQyczlx() {
		return this.qyczlx;
	}

	public void setQyczlx(String qyczlx) {
		this.qyczlx = qyczlx;
	}

	public String getQygm() {
		return this.qygm;
	}

	public void setQygm(String qygm) {
		this.qygm = qygm;
	}

	public String getSscq() {
		return this.sscq;
	}

	public void setSscq(String sscq) {
		this.sscq = sscq;
	}

	public String getSsxq() {
		return this.ssxq;
	}

	public void setSsxq(String ssxq) {
		this.ssxq = ssxq;
	}

	public String getZjzgbm() {
		return this.zjzgbm;
	}

	public void setZjzgbm(String zjzgbm) {
		this.zjzgbm = zjzgbm;
	}

	public String getJzmc() {
		return this.jzmc;
	}

	public void setJzmc(String jzmc) {
		this.jzmc = jzmc;
	}

	public String getJytime() {
		return this.jytime;
	}

	public void setJytime(String jytime) {
		this.jytime = jytime;
	}

	public String getTctime() {
		return this.tctime;
	}

	public void setTctime(String tctime) {
		this.tctime = tctime;
	}

	public Double getYjcpmj() {
		return this.yjcpmj;
	}

	public void setYjcpmj(Double yjcpmj) {
		this.yjcpmj = yjcpmj;
	}

	public Double getYjjcn() {
		return this.yjjcn;
	}

	public void setYjjcn(Double yjjcn) {
		this.yjjcn = yjjcn;
	}

	public Double getZdmj() {
		return this.zdmj;
	}

	public void setZdmj(Double zdmj) {
		this.zdmj = zdmj;
	}

	public Double getDnjjZzq() {
		return this.dnjjZzq;
	}

	public void setDnjjZzq(Double dnjjZzq) {
		this.dnjjZzq = dnjjZzq;
	}

	public Double getDnjjShi() {
		return this.dnjjShi;
	}

	public void setDnjjShi(Double dnjjShi) {
		this.dnjjShi = dnjjShi;
	}

	public Double getDnjjXian() {
		return this.dnjjXian;
	}

	public void setDnjjXian(Double dnjjXian) {
		this.dnjjXian = dnjjXian;
	}

	public Double getDnjjZje() {
		return this.dnjjZje;
	}

	public void setDnjjZje(Double dnjjZje) {
		this.dnjjZje = dnjjZje;
	}

	public Double getDnbzZzq() {
		return this.dnbzZzq;
	}

	public void setDnbzZzq(Double dnbzZzq) {
		this.dnbzZzq = dnbzZzq;
	}

	public Double getDnbzShi() {
		return this.dnbzShi;
	}

	public void setDnbzShi(Double dnbzShi) {
		this.dnbzShi = dnbzShi;
	}

	public Double getDnbzXian() {
		return this.dnbzXian;
	}

	public void setDnbzXian(Double dnbzXian) {
		this.dnbzXian = dnbzXian;
	}

	public Double getDnbzZje() {
		return this.dnbzZje;
	}

	public void setDnbzZje(Double dnbzZje) {
		this.dnbzZje = dnbzZje;
	}

	public Integer getYgGl() {
		return this.ygGl;
	}

	public void setYgGl(Integer ygGl) {
		this.ygGl = ygGl;
	}

	public Integer getYgSc() {
		return this.ygSc;
	}

	public void setYgSc(Integer ygSc) {
		this.ygSc = ygSc;
	}

	public Integer getYgNysc() {
		return this.ygNysc;
	}

	public void setYgNysc(Integer ygNysc) {
		this.ygNysc = ygNysc;
	}

	public Integer getYgSlg() {
		return this.ygSlg;
	}

	public void setYgSlg(Integer ygSlg) {
		this.ygSlg = ygSlg;
	}

	public Integer getYgZrs() {
		return this.ygZrs;
	}

	public void setYgZrs(Integer ygZrs) {
		this.ygZrs = ygZrs;
	}

	public Double getGzGlry() {
		return this.gzGlry;
	}

	public void setGzGlry(Double gzGlry) {
		this.gzGlry = gzGlry;
	}

	public Double getGzScry() {
		return this.gzScry;
	}

	public void setGzScry(Double gzScry) {
		this.gzScry = gzScry;
	}

	public Double getGzNysc() {
		return this.gzNysc;
	}

	public void setGzNysc(Double gzNysc) {
		this.gzNysc = gzNysc;
	}

	public Double getGzZje() {
		return this.gzZje;
	}

	public void setGzZje(Double gzZje) {
		this.gzZje = gzZje;
	}

	public String getBz() {
		return this.bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	public String getXqQuCode() {
		return this.xqQuCode;
	}

	public void setXqQuCode(String xqQuCode) {
		this.xqQuCode = xqQuCode;
	}

	public String getXqXianCode() {
		return this.xqXianCode;
	}

	public void setXqXianCode(String xqXianCode) {
		this.xqXianCode = xqXianCode;
	}

	public String getXqXiangCode() {
		return this.xqXiangCode;
	}

	public void setXqXiangCode(String xqXiangCode) {
		this.xqXiangCode = xqXiangCode;
	}

	public String getXqCunCode() {
		return this.xqCunCode;
	}

	public void setXqCunCode(String xqCunCode) {
		this.xqCunCode = xqCunCode;
	}

	public String getXqQuName() {
		return this.xqQuName;
	}

	public void setXqQuName(String xqQuName) {
		this.xqQuName = xqQuName;
	}

	public String getXqXianName() {
		return this.xqXianName;
	}

	public void setXqXianName(String xqXianName) {
		this.xqXianName = xqXianName;
	}

	public String getXqXiangName() {
		return this.xqXiangName;
	}

	public void setXqXiangName(String xqXiangName) {
		this.xqXiangName = xqXiangName;
	}

	public String getXqCunName() {
		return this.xqCunName;
	}

	public void setXqCunName(String xqCunName) {
		this.xqCunName = xqCunName;
	}

	public Double getCompanyGpsLongitude() {
		return this.companyGpsLongitude;
	}

	public void setCompanyGpsLongitude(Double companyGpsLongitude) {
		this.companyGpsLongitude = companyGpsLongitude;
	}

	public Double getCompanyGpsLatitude() {
		return this.companyGpsLatitude;
	}

	public void setCompanyGpsLatitude(Double companyGpsLatitude) {
		this.companyGpsLatitude = companyGpsLatitude;
	}

	public String getProducingAreaCityCode() {
		return this.producingAreaCityCode;
	}

	public void setProducingAreaCityCode(String producingAreaCityCode) {
		this.producingAreaCityCode = producingAreaCityCode;
	}

	public String getProducingAreaCityName() {
		return this.producingAreaCityName;
	}

	public void setProducingAreaCityName(String producingAreaCityName) {
		this.producingAreaCityName = producingAreaCityName;
	}

	public String getProducingAreaCountyCode() {
		return this.producingAreaCountyCode;
	}

	public void setProducingAreaCountyCode(String producingAreaCountyCode) {
		this.producingAreaCountyCode = producingAreaCountyCode;
	}

	public String getProducingAreaCountyName() {
		return this.producingAreaCountyName;
	}

	public void setProducingAreaCountyName(String producingAreaCountyName) {
		this.producingAreaCountyName = producingAreaCountyName;
	}

	public String getLegalRepresentative() {
		return this.legalRepresentative;
	}

	public void setLegalRepresentative(String legalRepresentative) {
		this.legalRepresentative = legalRepresentative;
	}

	public Integer getWhetherCompanyNongken() {
		return this.whetherCompanyNongken;
	}

	public void setWhetherCompanyNongken(Integer whetherCompanyNongken) {
		this.whetherCompanyNongken = whetherCompanyNongken;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getHasQsinfo() {
		return this.hasQsinfo;
	}

	public void setHasQsinfo(Integer hasQsinfo) {
		this.hasQsinfo = hasQsinfo;
	}

	public String getQsNumber() {
		return this.qsNumber;
	}

	public void setQsNumber(String qsNumber) {
		this.qsNumber = qsNumber;
	}

	public String getGetQsTime() {
		return this.getQsTime;
	}

	public void setGetQsTime(String getQsTime) {
		this.getQsTime = getQsTime;
	}

	public Integer getQsDuration() {
		return this.qsDuration;
	}

	public void setQsDuration(Integer qsDuration) {
		this.qsDuration = qsDuration;
	}

	public Integer getJxjyrsZs() {
		return this.jxjyrsZs;
	}

	public void setJxjyrsZs(Integer jxjyrsZs) {
		this.jxjyrsZs = jxjyrsZs;
	}

	public Integer getJxjyrsXpx() {
		return this.jxjyrsXpx;
	}

	public void setJxjyrsXpx(Integer jxjyrsXpx) {
		this.jxjyrsXpx = jxjyrsXpx;
	}

	public Integer getJxjyrsQpx() {
		return this.jxjyrsQpx;
	}

	public void setJxjyrsQpx(Integer jxjyrsQpx) {
		this.jxjyrsQpx = jxjyrsQpx;
	}

	public Integer getJxjyrsGnpx() {
		return this.jxjyrsGnpx;
	}

	public void setJxjyrsGnpx(Integer jxjyrsGnpx) {
		this.jxjyrsGnpx = jxjyrsGnpx;
	}

	public Integer getJxjyrsGwpx() {
		return this.jxjyrsGwpx;
	}

	public void setJxjyrsGwpx(Integer jxjyrsGwpx) {
		this.jxjyrsGwpx = jxjyrsGwpx;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof T201Id))
			return false;
		T201Id castOther = (T201Id) other;

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
				&& ((this.getSzcode() == castOther.getSzcode()) || (this
						.getSzcode() != null && castOther.getSzcode() != null && this
						.getSzcode().equals(castOther.getSzcode())))
				&& ((this.getQydjtime() == castOther.getQydjtime()) || (this
						.getQydjtime() != null
						&& castOther.getQydjtime() != null && this
						.getQydjtime().equals(castOther.getQydjtime())))
				&& ((this.getLxfs() == castOther.getLxfs()) || (this.getLxfs() != null
						&& castOther.getLxfs() != null && this.getLxfs()
						.equals(castOther.getLxfs())))
				&& ((this.getXzqydm() == castOther.getXzqydm()) || (this
						.getXzqydm() != null && castOther.getXzqydm() != null && this
						.getXzqydm().equals(castOther.getXzqydm())))
				&& ((this.getXxdz() == castOther.getXxdz()) || (this.getXxdz() != null
						&& castOther.getXxdz() != null && this.getXxdz()
						.equals(castOther.getXxdz())))
				&& ((this.getDlwz() == castOther.getDlwz()) || (this.getDlwz() != null
						&& castOther.getDlwz() != null && this.getDlwz()
						.equals(castOther.getDlwz())))
				&& ((this.getQyyx() == castOther.getQyyx()) || (this.getQyyx() != null
						&& castOther.getQyyx() != null && this.getQyyx()
						.equals(castOther.getQyyx())))
				&& ((this.getDhhm() == castOther.getDhhm()) || (this.getDhhm() != null
						&& castOther.getDhhm() != null && this.getDhhm()
						.equals(castOther.getDhhm())))
				&& ((this.getLxr() == castOther.getLxr()) || (this.getLxr() != null
						&& castOther.getLxr() != null && this.getLxr().equals(
						castOther.getLxr())))
				&& ((this.getCzhm() == castOther.getCzhm()) || (this.getCzhm() != null
						&& castOther.getCzhm() != null && this.getCzhm()
						.equals(castOther.getCzhm())))
				&& ((this.getQyczlx() == castOther.getQyczlx()) || (this
						.getQyczlx() != null && castOther.getQyczlx() != null && this
						.getQyczlx().equals(castOther.getQyczlx())))
				&& ((this.getQygm() == castOther.getQygm()) || (this.getQygm() != null
						&& castOther.getQygm() != null && this.getQygm()
						.equals(castOther.getQygm())))
				&& ((this.getSscq() == castOther.getSscq()) || (this.getSscq() != null
						&& castOther.getSscq() != null && this.getSscq()
						.equals(castOther.getSscq())))
				&& ((this.getSsxq() == castOther.getSsxq()) || (this.getSsxq() != null
						&& castOther.getSsxq() != null && this.getSsxq()
						.equals(castOther.getSsxq())))
				&& ((this.getZjzgbm() == castOther.getZjzgbm()) || (this
						.getZjzgbm() != null && castOther.getZjzgbm() != null && this
						.getZjzgbm().equals(castOther.getZjzgbm())))
				&& ((this.getJzmc() == castOther.getJzmc()) || (this.getJzmc() != null
						&& castOther.getJzmc() != null && this.getJzmc()
						.equals(castOther.getJzmc())))
				&& ((this.getJytime() == castOther.getJytime()) || (this
						.getJytime() != null && castOther.getJytime() != null && this
						.getJytime().equals(castOther.getJytime())))
				&& ((this.getTctime() == castOther.getTctime()) || (this
						.getTctime() != null && castOther.getTctime() != null && this
						.getTctime().equals(castOther.getTctime())))
				&& ((this.getYjcpmj() == castOther.getYjcpmj()) || (this
						.getYjcpmj() != null && castOther.getYjcpmj() != null && this
						.getYjcpmj().equals(castOther.getYjcpmj())))
				&& ((this.getYjjcn() == castOther.getYjjcn()) || (this
						.getYjjcn() != null && castOther.getYjjcn() != null && this
						.getYjjcn().equals(castOther.getYjjcn())))
				&& ((this.getZdmj() == castOther.getZdmj()) || (this.getZdmj() != null
						&& castOther.getZdmj() != null && this.getZdmj()
						.equals(castOther.getZdmj())))
				&& ((this.getDnjjZzq() == castOther.getDnjjZzq()) || (this
						.getDnjjZzq() != null && castOther.getDnjjZzq() != null && this
						.getDnjjZzq().equals(castOther.getDnjjZzq())))
				&& ((this.getDnjjShi() == castOther.getDnjjShi()) || (this
						.getDnjjShi() != null && castOther.getDnjjShi() != null && this
						.getDnjjShi().equals(castOther.getDnjjShi())))
				&& ((this.getDnjjXian() == castOther.getDnjjXian()) || (this
						.getDnjjXian() != null
						&& castOther.getDnjjXian() != null && this
						.getDnjjXian().equals(castOther.getDnjjXian())))
				&& ((this.getDnjjZje() == castOther.getDnjjZje()) || (this
						.getDnjjZje() != null && castOther.getDnjjZje() != null && this
						.getDnjjZje().equals(castOther.getDnjjZje())))
				&& ((this.getDnbzZzq() == castOther.getDnbzZzq()) || (this
						.getDnbzZzq() != null && castOther.getDnbzZzq() != null && this
						.getDnbzZzq().equals(castOther.getDnbzZzq())))
				&& ((this.getDnbzShi() == castOther.getDnbzShi()) || (this
						.getDnbzShi() != null && castOther.getDnbzShi() != null && this
						.getDnbzShi().equals(castOther.getDnbzShi())))
				&& ((this.getDnbzXian() == castOther.getDnbzXian()) || (this
						.getDnbzXian() != null
						&& castOther.getDnbzXian() != null && this
						.getDnbzXian().equals(castOther.getDnbzXian())))
				&& ((this.getDnbzZje() == castOther.getDnbzZje()) || (this
						.getDnbzZje() != null && castOther.getDnbzZje() != null && this
						.getDnbzZje().equals(castOther.getDnbzZje())))
				&& ((this.getYgGl() == castOther.getYgGl()) || (this.getYgGl() != null
						&& castOther.getYgGl() != null && this.getYgGl()
						.equals(castOther.getYgGl())))
				&& ((this.getYgSc() == castOther.getYgSc()) || (this.getYgSc() != null
						&& castOther.getYgSc() != null && this.getYgSc()
						.equals(castOther.getYgSc())))
				&& ((this.getYgNysc() == castOther.getYgNysc()) || (this
						.getYgNysc() != null && castOther.getYgNysc() != null && this
						.getYgNysc().equals(castOther.getYgNysc())))
				&& ((this.getYgSlg() == castOther.getYgSlg()) || (this
						.getYgSlg() != null && castOther.getYgSlg() != null && this
						.getYgSlg().equals(castOther.getYgSlg())))
				&& ((this.getYgZrs() == castOther.getYgZrs()) || (this
						.getYgZrs() != null && castOther.getYgZrs() != null && this
						.getYgZrs().equals(castOther.getYgZrs())))
				&& ((this.getGzGlry() == castOther.getGzGlry()) || (this
						.getGzGlry() != null && castOther.getGzGlry() != null && this
						.getGzGlry().equals(castOther.getGzGlry())))
				&& ((this.getGzScry() == castOther.getGzScry()) || (this
						.getGzScry() != null && castOther.getGzScry() != null && this
						.getGzScry().equals(castOther.getGzScry())))
				&& ((this.getGzNysc() == castOther.getGzNysc()) || (this
						.getGzNysc() != null && castOther.getGzNysc() != null && this
						.getGzNysc().equals(castOther.getGzNysc())))
				&& ((this.getGzZje() == castOther.getGzZje()) || (this
						.getGzZje() != null && castOther.getGzZje() != null && this
						.getGzZje().equals(castOther.getGzZje())))
				&& ((this.getBz() == castOther.getBz()) || (this.getBz() != null
						&& castOther.getBz() != null && this.getBz().equals(
						castOther.getBz())))
				&& ((this.getXqQuCode() == castOther.getXqQuCode()) || (this
						.getXqQuCode() != null
						&& castOther.getXqQuCode() != null && this
						.getXqQuCode().equals(castOther.getXqQuCode())))
				&& ((this.getXqXianCode() == castOther.getXqXianCode()) || (this
						.getXqXianCode() != null
						&& castOther.getXqXianCode() != null && this
						.getXqXianCode().equals(castOther.getXqXianCode())))
				&& ((this.getXqXiangCode() == castOther.getXqXiangCode()) || (this
						.getXqXiangCode() != null
						&& castOther.getXqXiangCode() != null && this
						.getXqXiangCode().equals(castOther.getXqXiangCode())))
				&& ((this.getXqCunCode() == castOther.getXqCunCode()) || (this
						.getXqCunCode() != null
						&& castOther.getXqCunCode() != null && this
						.getXqCunCode().equals(castOther.getXqCunCode())))
				&& ((this.getXqQuName() == castOther.getXqQuName()) || (this
						.getXqQuName() != null
						&& castOther.getXqQuName() != null && this
						.getXqQuName().equals(castOther.getXqQuName())))
				&& ((this.getXqXianName() == castOther.getXqXianName()) || (this
						.getXqXianName() != null
						&& castOther.getXqXianName() != null && this
						.getXqXianName().equals(castOther.getXqXianName())))
				&& ((this.getXqXiangName() == castOther.getXqXiangName()) || (this
						.getXqXiangName() != null
						&& castOther.getXqXiangName() != null && this
						.getXqXiangName().equals(castOther.getXqXiangName())))
				&& ((this.getXqCunName() == castOther.getXqCunName()) || (this
						.getXqCunName() != null
						&& castOther.getXqCunName() != null && this
						.getXqCunName().equals(castOther.getXqCunName())))
				&& ((this.getCompanyGpsLongitude() == castOther
						.getCompanyGpsLongitude()) || (this
						.getCompanyGpsLongitude() != null
						&& castOther.getCompanyGpsLongitude() != null && this
						.getCompanyGpsLongitude().equals(
								castOther.getCompanyGpsLongitude())))
				&& ((this.getCompanyGpsLatitude() == castOther
						.getCompanyGpsLatitude()) || (this
						.getCompanyGpsLatitude() != null
						&& castOther.getCompanyGpsLatitude() != null && this
						.getCompanyGpsLatitude().equals(
								castOther.getCompanyGpsLatitude())))
				&& ((this.getProducingAreaCityCode() == castOther
						.getProducingAreaCityCode()) || (this
						.getProducingAreaCityCode() != null
						&& castOther.getProducingAreaCityCode() != null && this
						.getProducingAreaCityCode().equals(
								castOther.getProducingAreaCityCode())))
				&& ((this.getProducingAreaCityName() == castOther
						.getProducingAreaCityName()) || (this
						.getProducingAreaCityName() != null
						&& castOther.getProducingAreaCityName() != null && this
						.getProducingAreaCityName().equals(
								castOther.getProducingAreaCityName())))
				&& ((this.getProducingAreaCountyCode() == castOther
						.getProducingAreaCountyCode()) || (this
						.getProducingAreaCountyCode() != null
						&& castOther.getProducingAreaCountyCode() != null && this
						.getProducingAreaCountyCode().equals(
								castOther.getProducingAreaCountyCode())))
				&& ((this.getProducingAreaCountyName() == castOther
						.getProducingAreaCountyName()) || (this
						.getProducingAreaCountyName() != null
						&& castOther.getProducingAreaCountyName() != null && this
						.getProducingAreaCountyName().equals(
								castOther.getProducingAreaCountyName())))
				&& ((this.getLegalRepresentative() == castOther
						.getLegalRepresentative()) || (this
						.getLegalRepresentative() != null
						&& castOther.getLegalRepresentative() != null && this
						.getLegalRepresentative().equals(
								castOther.getLegalRepresentative())))
				&& ((this.getWhetherCompanyNongken() == castOther
						.getWhetherCompanyNongken()) || (this
						.getWhetherCompanyNongken() != null
						&& castOther.getWhetherCompanyNongken() != null && this
						.getWhetherCompanyNongken().equals(
								castOther.getWhetherCompanyNongken())))
				&& ((this.getId() == castOther.getId()) || (this.getId() != null
						&& castOther.getId() != null && this.getId().equals(
						castOther.getId())))
				&& ((this.getHasQsinfo() == castOther.getHasQsinfo()) || (this
						.getHasQsinfo() != null
						&& castOther.getHasQsinfo() != null && this
						.getHasQsinfo().equals(castOther.getHasQsinfo())))
				&& ((this.getQsNumber() == castOther.getQsNumber()) || (this
						.getQsNumber() != null
						&& castOther.getQsNumber() != null && this
						.getQsNumber().equals(castOther.getQsNumber())))
				&& ((this.getGetQsTime() == castOther.getGetQsTime()) || (this
						.getGetQsTime() != null
						&& castOther.getGetQsTime() != null && this
						.getGetQsTime().equals(castOther.getGetQsTime())))
				&& ((this.getQsDuration() == castOther.getQsDuration()) || (this
						.getQsDuration() != null
						&& castOther.getQsDuration() != null && this
						.getQsDuration().equals(castOther.getQsDuration())))
				&& ((this.getJxjyrsZs() == castOther.getJxjyrsZs()) || (this
						.getJxjyrsZs() != null
						&& castOther.getJxjyrsZs() != null && this
						.getJxjyrsZs().equals(castOther.getJxjyrsZs())))
				&& ((this.getJxjyrsXpx() == castOther.getJxjyrsXpx()) || (this
						.getJxjyrsXpx() != null
						&& castOther.getJxjyrsXpx() != null && this
						.getJxjyrsXpx().equals(castOther.getJxjyrsXpx())))
				&& ((this.getJxjyrsQpx() == castOther.getJxjyrsQpx()) || (this
						.getJxjyrsQpx() != null
						&& castOther.getJxjyrsQpx() != null && this
						.getJxjyrsQpx().equals(castOther.getJxjyrsQpx())))
				&& ((this.getJxjyrsGnpx() == castOther.getJxjyrsGnpx()) || (this
						.getJxjyrsGnpx() != null
						&& castOther.getJxjyrsGnpx() != null && this
						.getJxjyrsGnpx().equals(castOther.getJxjyrsGnpx())))
				&& ((this.getJxjyrsGwpx() == castOther.getJxjyrsGwpx()) || (this
						.getJxjyrsGwpx() != null
						&& castOther.getJxjyrsGwpx() != null && this
						.getJxjyrsGwpx().equals(castOther.getJxjyrsGwpx())));
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
				+ (getSzcode() == null ? 0 : this.getSzcode().hashCode());
		result = 37 * result
				+ (getQydjtime() == null ? 0 : this.getQydjtime().hashCode());
		result = 37 * result
				+ (getLxfs() == null ? 0 : this.getLxfs().hashCode());
		result = 37 * result
				+ (getXzqydm() == null ? 0 : this.getXzqydm().hashCode());
		result = 37 * result
				+ (getXxdz() == null ? 0 : this.getXxdz().hashCode());
		result = 37 * result
				+ (getDlwz() == null ? 0 : this.getDlwz().hashCode());
		result = 37 * result
				+ (getQyyx() == null ? 0 : this.getQyyx().hashCode());
		result = 37 * result
				+ (getDhhm() == null ? 0 : this.getDhhm().hashCode());
		result = 37 * result
				+ (getLxr() == null ? 0 : this.getLxr().hashCode());
		result = 37 * result
				+ (getCzhm() == null ? 0 : this.getCzhm().hashCode());
		result = 37 * result
				+ (getQyczlx() == null ? 0 : this.getQyczlx().hashCode());
		result = 37 * result
				+ (getQygm() == null ? 0 : this.getQygm().hashCode());
		result = 37 * result
				+ (getSscq() == null ? 0 : this.getSscq().hashCode());
		result = 37 * result
				+ (getSsxq() == null ? 0 : this.getSsxq().hashCode());
		result = 37 * result
				+ (getZjzgbm() == null ? 0 : this.getZjzgbm().hashCode());
		result = 37 * result
				+ (getJzmc() == null ? 0 : this.getJzmc().hashCode());
		result = 37 * result
				+ (getJytime() == null ? 0 : this.getJytime().hashCode());
		result = 37 * result
				+ (getTctime() == null ? 0 : this.getTctime().hashCode());
		result = 37 * result
				+ (getYjcpmj() == null ? 0 : this.getYjcpmj().hashCode());
		result = 37 * result
				+ (getYjjcn() == null ? 0 : this.getYjjcn().hashCode());
		result = 37 * result
				+ (getZdmj() == null ? 0 : this.getZdmj().hashCode());
		result = 37 * result
				+ (getDnjjZzq() == null ? 0 : this.getDnjjZzq().hashCode());
		result = 37 * result
				+ (getDnjjShi() == null ? 0 : this.getDnjjShi().hashCode());
		result = 37 * result
				+ (getDnjjXian() == null ? 0 : this.getDnjjXian().hashCode());
		result = 37 * result
				+ (getDnjjZje() == null ? 0 : this.getDnjjZje().hashCode());
		result = 37 * result
				+ (getDnbzZzq() == null ? 0 : this.getDnbzZzq().hashCode());
		result = 37 * result
				+ (getDnbzShi() == null ? 0 : this.getDnbzShi().hashCode());
		result = 37 * result
				+ (getDnbzXian() == null ? 0 : this.getDnbzXian().hashCode());
		result = 37 * result
				+ (getDnbzZje() == null ? 0 : this.getDnbzZje().hashCode());
		result = 37 * result
				+ (getYgGl() == null ? 0 : this.getYgGl().hashCode());
		result = 37 * result
				+ (getYgSc() == null ? 0 : this.getYgSc().hashCode());
		result = 37 * result
				+ (getYgNysc() == null ? 0 : this.getYgNysc().hashCode());
		result = 37 * result
				+ (getYgSlg() == null ? 0 : this.getYgSlg().hashCode());
		result = 37 * result
				+ (getYgZrs() == null ? 0 : this.getYgZrs().hashCode());
		result = 37 * result
				+ (getGzGlry() == null ? 0 : this.getGzGlry().hashCode());
		result = 37 * result
				+ (getGzScry() == null ? 0 : this.getGzScry().hashCode());
		result = 37 * result
				+ (getGzNysc() == null ? 0 : this.getGzNysc().hashCode());
		result = 37 * result
				+ (getGzZje() == null ? 0 : this.getGzZje().hashCode());
		result = 37 * result + (getBz() == null ? 0 : this.getBz().hashCode());
		result = 37 * result
				+ (getXqQuCode() == null ? 0 : this.getXqQuCode().hashCode());
		result = 37
				* result
				+ (getXqXianCode() == null ? 0 : this.getXqXianCode()
						.hashCode());
		result = 37
				* result
				+ (getXqXiangCode() == null ? 0 : this.getXqXiangCode()
						.hashCode());
		result = 37 * result
				+ (getXqCunCode() == null ? 0 : this.getXqCunCode().hashCode());
		result = 37 * result
				+ (getXqQuName() == null ? 0 : this.getXqQuName().hashCode());
		result = 37
				* result
				+ (getXqXianName() == null ? 0 : this.getXqXianName()
						.hashCode());
		result = 37
				* result
				+ (getXqXiangName() == null ? 0 : this.getXqXiangName()
						.hashCode());
		result = 37 * result
				+ (getXqCunName() == null ? 0 : this.getXqCunName().hashCode());
		result = 37
				* result
				+ (getCompanyGpsLongitude() == null ? 0 : this
						.getCompanyGpsLongitude().hashCode());
		result = 37
				* result
				+ (getCompanyGpsLatitude() == null ? 0 : this
						.getCompanyGpsLatitude().hashCode());
		result = 37
				* result
				+ (getProducingAreaCityCode() == null ? 0 : this
						.getProducingAreaCityCode().hashCode());
		result = 37
				* result
				+ (getProducingAreaCityName() == null ? 0 : this
						.getProducingAreaCityName().hashCode());
		result = 37
				* result
				+ (getProducingAreaCountyCode() == null ? 0 : this
						.getProducingAreaCountyCode().hashCode());
		result = 37
				* result
				+ (getProducingAreaCountyName() == null ? 0 : this
						.getProducingAreaCountyName().hashCode());
		result = 37
				* result
				+ (getLegalRepresentative() == null ? 0 : this
						.getLegalRepresentative().hashCode());
		result = 37
				* result
				+ (getWhetherCompanyNongken() == null ? 0 : this
						.getWhetherCompanyNongken().hashCode());
		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getHasQsinfo() == null ? 0 : this.getHasQsinfo().hashCode());
		result = 37 * result
				+ (getQsNumber() == null ? 0 : this.getQsNumber().hashCode());
		result = 37 * result
				+ (getGetQsTime() == null ? 0 : this.getGetQsTime().hashCode());
		result = 37
				* result
				+ (getQsDuration() == null ? 0 : this.getQsDuration()
						.hashCode());
		result = 37 * result
				+ (getJxjyrsZs() == null ? 0 : this.getJxjyrsZs().hashCode());
		result = 37 * result
				+ (getJxjyrsXpx() == null ? 0 : this.getJxjyrsXpx().hashCode());
		result = 37 * result
				+ (getJxjyrsQpx() == null ? 0 : this.getJxjyrsQpx().hashCode());
		result = 37
				* result
				+ (getJxjyrsGnpx() == null ? 0 : this.getJxjyrsGnpx()
						.hashCode());
		result = 37
				* result
				+ (getJxjyrsGwpx() == null ? 0 : this.getJxjyrsGwpx()
						.hashCode());
		return result;
	}

}