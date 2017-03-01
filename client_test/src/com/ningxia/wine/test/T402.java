package com.ningxia.wine.test;

/**
 * T402 entity. @author MyEclipse Persistence Tools
 */
/**
 * 
 * @author Administrator
 * 葡萄酒庄（企业）生产经营情况季报 
 *
 */
public class T402 implements java.io.Serializable {

	// Fields
    
	private Integer id;
	//季度
	private Integer season;
	//年度
	private String nd;
	
	private String gscode;
	private String gsname;
	private String gsoldname;
	//葡萄种植面积
	private Double ptzzmj;
	//本季度新增葡萄种植面积
	private Double ptzzmjXz;
	private Double jzjstr;
	private Double ptyjstr;
	private Double xjptytr;
	private Double gzptytr;
	private Double dljstr;
	private Double sljstr;
	private Double lhjstr;
	private Double sbgztr;
	private Double bjdyszl;
	private Double bjdggswctzSf;
	private Double bjdyfzl;
	private Double bjdwcflztz;
	private Double bjdyyzl;
	private Double bjdwcnyztr;
	private Integer zzglrys;
	private Integer bjdzzlsygzrc;
	private Double bjdzzlsygrrgze;
	private Double bjdzzlsygzfy;
	private Double ptjcczl;
	private Double hptjccl;
	private Double bptjccl;
	private Double bjdxsze;
	private Double pzjxssr;
	private Integer pzjxssl;
	private Double yzjxssl;
	private Double yzjxssr;
	private Integer jzdbjdzxcksl;
	private Integer bjdxzzxcksl;
	private Double bjdzxckxsje;
	private Integer dnjdcglyrs;
	private Double dnlysr;
	private Double kfsr;
	private Double cysr;
	private Double yxtr;

	// Constructors

	/** default constructor */
	public T402() {
	}

	/** minimal constructor */
	public T402(Integer season) {
		this.season = season;
	}

	/** full constructor */
	public T402(Integer season, String nd, String gscode, String gsname,
			String gsoldname, Double ptzzmj, Double ptzzmjXz, Double jzjstr,
			Double ptyjstr, Double xjptytr, Double gzptytr, Double dljstr,
			Double sljstr, Double lhjstr, Double sbgztr, Double bjdyszl,
			Double bjdggswctzSf, Double bjdyfzl, Double bjdwcflztz,
			Double bjdyyzl, Double bjdwcnyztr, Integer zzglrys,
			Integer bjdzzlsygzrc, Double bjdzzlsygrrgze, Double bjdzzlsygzfy,
			Double ptjcczl, Double hptjccl, Double bptjccl, Double bjdxsze,
			Double pzjxssr, Integer pzjxssl, Double yzjxssl, Double yzjxssr,
			Integer jzdbjdzxcksl, Integer bjdxzzxcksl, Double bjdzxckxsje,
			Integer dnjdcglyrs, Double dnlysr, Double kfsr, Double cysr,
			Double yxtr) {
		this.season = season;
		this.nd = nd;
		this.gscode = gscode;
		this.gsname = gsname;
		this.gsoldname = gsoldname;
		this.ptzzmj = ptzzmj;
		this.ptzzmjXz = ptzzmjXz;
		this.jzjstr = jzjstr;
		this.ptyjstr = ptyjstr;
		this.xjptytr = xjptytr;
		this.gzptytr = gzptytr;
		this.dljstr = dljstr;
		this.sljstr = sljstr;
		this.lhjstr = lhjstr;
		this.sbgztr = sbgztr;
		this.bjdyszl = bjdyszl;
		this.bjdggswctzSf = bjdggswctzSf;
		this.bjdyfzl = bjdyfzl;
		this.bjdwcflztz = bjdwcflztz;
		this.bjdyyzl = bjdyyzl;
		this.bjdwcnyztr = bjdwcnyztr;
		this.zzglrys = zzglrys;
		this.bjdzzlsygzrc = bjdzzlsygzrc;
		this.bjdzzlsygrrgze = bjdzzlsygrrgze;
		this.bjdzzlsygzfy = bjdzzlsygzfy;
		this.ptjcczl = ptjcczl;
		this.hptjccl = hptjccl;
		this.bptjccl = bptjccl;
		this.bjdxsze = bjdxsze;
		this.pzjxssr = pzjxssr;
		this.pzjxssl = pzjxssl;
		this.yzjxssl = yzjxssl;
		this.yzjxssr = yzjxssr;
		this.jzdbjdzxcksl = jzdbjdzxcksl;
		this.bjdxzzxcksl = bjdxzzxcksl;
		this.bjdzxckxsje = bjdzxckxsje;
		this.dnjdcglyrs = dnjdcglyrs;
		this.dnlysr = dnlysr;
		this.kfsr = kfsr;
		this.cysr = cysr;
		this.yxtr = yxtr;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSeason() {
		return this.season;
	}

	public void setSeason(Integer season) {
		this.season = season;
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

	public String getGsoldname() {
		return this.gsoldname;
	}

	public void setGsoldname(String gsoldname) {
		this.gsoldname = gsoldname;
	}

	public Double getPtzzmj() {
		return this.ptzzmj;
	}

	public void setPtzzmj(Double ptzzmj) {
		this.ptzzmj = ptzzmj;
	}

	public Double getPtzzmjXz() {
		return this.ptzzmjXz;
	}

	public void setPtzzmjXz(Double ptzzmjXz) {
		this.ptzzmjXz = ptzzmjXz;
	}

	public Double getJzjstr() {
		return this.jzjstr;
	}

	public void setJzjstr(Double jzjstr) {
		this.jzjstr = jzjstr;
	}

	public Double getPtyjstr() {
		return this.ptyjstr;
	}

	public void setPtyjstr(Double ptyjstr) {
		this.ptyjstr = ptyjstr;
	}

	public Double getXjptytr() {
		return this.xjptytr;
	}

	public void setXjptytr(Double xjptytr) {
		this.xjptytr = xjptytr;
	}

	public Double getGzptytr() {
		return this.gzptytr;
	}

	public void setGzptytr(Double gzptytr) {
		this.gzptytr = gzptytr;
	}

	public Double getDljstr() {
		return this.dljstr;
	}

	public void setDljstr(Double dljstr) {
		this.dljstr = dljstr;
	}

	public Double getSljstr() {
		return this.sljstr;
	}

	public void setSljstr(Double sljstr) {
		this.sljstr = sljstr;
	}

	public Double getLhjstr() {
		return this.lhjstr;
	}

	public void setLhjstr(Double lhjstr) {
		this.lhjstr = lhjstr;
	}

	public Double getSbgztr() {
		return this.sbgztr;
	}

	public void setSbgztr(Double sbgztr) {
		this.sbgztr = sbgztr;
	}

	public Double getBjdyszl() {
		return this.bjdyszl;
	}

	public void setBjdyszl(Double bjdyszl) {
		this.bjdyszl = bjdyszl;
	}

	public Double getBjdggswctzSf() {
		return this.bjdggswctzSf;
	}

	public void setBjdggswctzSf(Double bjdggswctzSf) {
		this.bjdggswctzSf = bjdggswctzSf;
	}

	public Double getBjdyfzl() {
		return this.bjdyfzl;
	}

	public void setBjdyfzl(Double bjdyfzl) {
		this.bjdyfzl = bjdyfzl;
	}

	public Double getBjdwcflztz() {
		return this.bjdwcflztz;
	}

	public void setBjdwcflztz(Double bjdwcflztz) {
		this.bjdwcflztz = bjdwcflztz;
	}

	public Double getBjdyyzl() {
		return this.bjdyyzl;
	}

	public void setBjdyyzl(Double bjdyyzl) {
		this.bjdyyzl = bjdyyzl;
	}

	public Double getBjdwcnyztr() {
		return this.bjdwcnyztr;
	}

	public void setBjdwcnyztr(Double bjdwcnyztr) {
		this.bjdwcnyztr = bjdwcnyztr;
	}

	public Integer getZzglrys() {
		return this.zzglrys;
	}

	public void setZzglrys(Integer zzglrys) {
		this.zzglrys = zzglrys;
	}

	public Integer getBjdzzlsygzrc() {
		return this.bjdzzlsygzrc;
	}

	public void setBjdzzlsygzrc(Integer bjdzzlsygzrc) {
		this.bjdzzlsygzrc = bjdzzlsygzrc;
	}

	public Double getBjdzzlsygrrgze() {
		return this.bjdzzlsygrrgze;
	}

	public void setBjdzzlsygrrgze(Double bjdzzlsygrrgze) {
		this.bjdzzlsygrrgze = bjdzzlsygrrgze;
	}

	public Double getBjdzzlsygzfy() {
		return this.bjdzzlsygzfy;
	}

	public void setBjdzzlsygzfy(Double bjdzzlsygzfy) {
		this.bjdzzlsygzfy = bjdzzlsygzfy;
	}

	public Double getPtjcczl() {
		return this.ptjcczl;
	}

	public void setPtjcczl(Double ptjcczl) {
		this.ptjcczl = ptjcczl;
	}

	public Double getHptjccl() {
		return this.hptjccl;
	}

	public void setHptjccl(Double hptjccl) {
		this.hptjccl = hptjccl;
	}

	public Double getBptjccl() {
		return this.bptjccl;
	}

	public void setBptjccl(Double bptjccl) {
		this.bptjccl = bptjccl;
	}

	public Double getBjdxsze() {
		return this.bjdxsze;
	}

	public void setBjdxsze(Double bjdxsze) {
		this.bjdxsze = bjdxsze;
	}

	public Double getPzjxssr() {
		return this.pzjxssr;
	}

	public void setPzjxssr(Double pzjxssr) {
		this.pzjxssr = pzjxssr;
	}

	public Integer getPzjxssl() {
		return this.pzjxssl;
	}

	public void setPzjxssl(Integer pzjxssl) {
		this.pzjxssl = pzjxssl;
	}

	public Double getYzjxssl() {
		return this.yzjxssl;
	}

	public void setYzjxssl(Double yzjxssl) {
		this.yzjxssl = yzjxssl;
	}

	public Double getYzjxssr() {
		return this.yzjxssr;
	}

	public void setYzjxssr(Double yzjxssr) {
		this.yzjxssr = yzjxssr;
	}

	public Integer getJzdbjdzxcksl() {
		return this.jzdbjdzxcksl;
	}

	public void setJzdbjdzxcksl(Integer jzdbjdzxcksl) {
		this.jzdbjdzxcksl = jzdbjdzxcksl;
	}

	public Integer getBjdxzzxcksl() {
		return this.bjdxzzxcksl;
	}

	public void setBjdxzzxcksl(Integer bjdxzzxcksl) {
		this.bjdxzzxcksl = bjdxzzxcksl;
	}

	public Double getBjdzxckxsje() {
		return this.bjdzxckxsje;
	}

	public void setBjdzxckxsje(Double bjdzxckxsje) {
		this.bjdzxckxsje = bjdzxckxsje;
	}

	public Integer getDnjdcglyrs() {
		return this.dnjdcglyrs;
	}

	public void setDnjdcglyrs(Integer dnjdcglyrs) {
		this.dnjdcglyrs = dnjdcglyrs;
	}

	public Double getDnlysr() {
		return this.dnlysr;
	}

	public void setDnlysr(Double dnlysr) {
		this.dnlysr = dnlysr;
	}

	public Double getKfsr() {
		return this.kfsr;
	}

	public void setKfsr(Double kfsr) {
		this.kfsr = kfsr;
	}

	public Double getCysr() {
		return this.cysr;
	}

	public void setCysr(Double cysr) {
		this.cysr = cysr;
	}

	public Double getYxtr() {
		return this.yxtr;
	}

	public void setYxtr(Double yxtr) {
		this.yxtr = yxtr;
	}


}