package com.ningxia.wine.protocol.req;

/**
 * 
 * @author Administrator
 * T402新增请求
 */
public class T402AddReq {
	
	    private String sessionId;
	
		//季度
		private Integer season;
		//年度
		private String nd="";
		
		private String gscode="";
		private String gsname="";
		private String gsoldname="";
		//葡萄种植面积
		private Double ptzzmj=0.0;
		//本季度新增葡萄种植面积
		private Double ptzzmjXz=0.0;
		private Double jzjstr=0.0;
		private Double ptyjstr=0.0;
		private Double xjptytr=0.0;
		private Double gzptytr=0.0;
		private Double dljstr=0.0;
		private Double sljstr=0.0;
		private Double lhjstr=0.0;
		private Double sbgztr=0.0;
		private Double bjdyszl=0.0;
		private Double bjdggswctzSf=0.0;
		private Double bjdyfzl=0.0;
		private Double bjdwcflztz=0.0;
		private Double bjdyyzl=0.0;
		private Double bjdwcnyztr=0.0;
		private Integer zzglrys=0;
		private Integer bjdzzlsygzrc=0;
		private Double bjdzzlsygrrgze=0.0;
		private Double bjdzzlsygzfy=0.0;
		private Double ptjcczl=0.0;
		private Double hptjccl=0.0;
		private Double bptjccl=0.0;
		private Double bjdxsze=0.0;
		private Double pzjxssr=0.0;
		private Integer pzjxssl=0;
		private Double yzjxssl=0.0;
		private Double yzjxssr=0.0;
		private Integer jzdbjdzxcksl=0;
		private Integer bjdxzzxcksl=0;
		private Double bjdzxckxsje=0.0;
		private Integer dnjdcglyrs=0;
		private Double dnlysr=0.0;
		private Double kfsr=0.0;
		private Double cysr=0.0;
		private Double yxtr=0.0;
		public Integer getSeason() {
			return season;
		}
		public void setSeason(Integer season) {
			this.season = season;
		}
		public String getNd() {
			return nd;
		}
		public void setNd(String nd) {
			this.nd = nd;
		}
		public String getGscode() {
			return gscode;
		}
		public void setGscode(String gscode) {
			this.gscode = gscode;
		}
		public String getGsname() {
			return gsname;
		}
		public void setGsname(String gsname) {
			this.gsname = gsname;
		}
		public String getGsoldname() {
			return gsoldname;
		}
		public void setGsoldname(String gsoldname) {
			this.gsoldname = gsoldname;
		}
		public Double getPtzzmj() {
			return ptzzmj;
		}
		public void setPtzzmj(Double ptzzmj) {
			this.ptzzmj = ptzzmj;
		}
		public Double getPtzzmjXz() {
			return ptzzmjXz;
		}
		public void setPtzzmjXz(Double ptzzmjXz) {
			this.ptzzmjXz = ptzzmjXz;
		}
		public Double getJzjstr() {
			return jzjstr;
		}
		public void setJzjstr(Double jzjstr) {
			this.jzjstr = jzjstr;
		}
		public Double getPtyjstr() {
			return ptyjstr;
		}
		public void setPtyjstr(Double ptyjstr) {
			this.ptyjstr = ptyjstr;
		}
		public Double getXjptytr() {
			return xjptytr;
		}
		public void setXjptytr(Double xjptytr) {
			this.xjptytr = xjptytr;
		}
		public Double getGzptytr() {
			return gzptytr;
		}
		public void setGzptytr(Double gzptytr) {
			this.gzptytr = gzptytr;
		}
		public Double getDljstr() {
			return dljstr;
		}
		public void setDljstr(Double dljstr) {
			this.dljstr = dljstr;
		}
		public Double getSljstr() {
			return sljstr;
		}
		public void setSljstr(Double sljstr) {
			this.sljstr = sljstr;
		}
		public Double getLhjstr() {
			return lhjstr;
		}
		public void setLhjstr(Double lhjstr) {
			this.lhjstr = lhjstr;
		}
		public Double getSbgztr() {
			return sbgztr;
		}
		public void setSbgztr(Double sbgztr) {
			this.sbgztr = sbgztr;
		}
		public Double getBjdyszl() {
			return bjdyszl;
		}
		public void setBjdyszl(Double bjdyszl) {
			this.bjdyszl = bjdyszl;
		}
		public Double getBjdggswctzSf() {
			return bjdggswctzSf;
		}
		public void setBjdggswctzSf(Double bjdggswctzSf) {
			this.bjdggswctzSf = bjdggswctzSf;
		}
		public Double getBjdyfzl() {
			return bjdyfzl;
		}
		public void setBjdyfzl(Double bjdyfzl) {
			this.bjdyfzl = bjdyfzl;
		}
		public Double getBjdwcflztz() {
			return bjdwcflztz;
		}
		public void setBjdwcflztz(Double bjdwcflztz) {
			this.bjdwcflztz = bjdwcflztz;
		}
		public Double getBjdyyzl() {
			return bjdyyzl;
		}
		public void setBjdyyzl(Double bjdyyzl) {
			this.bjdyyzl = bjdyyzl;
		}
		public Double getBjdwcnyztr() {
			return bjdwcnyztr;
		}
		public void setBjdwcnyztr(Double bjdwcnyztr) {
			this.bjdwcnyztr = bjdwcnyztr;
		}
		public Integer getZzglrys() {
			return zzglrys;
		}
		public void setZzglrys(Integer zzglrys) {
			this.zzglrys = zzglrys;
		}
		public Integer getBjdzzlsygzrc() {
			return bjdzzlsygzrc;
		}
		public void setBjdzzlsygzrc(Integer bjdzzlsygzrc) {
			this.bjdzzlsygzrc = bjdzzlsygzrc;
		}
		public Double getBjdzzlsygrrgze() {
			return bjdzzlsygrrgze;
		}
		public void setBjdzzlsygrrgze(Double bjdzzlsygrrgze) {
			this.bjdzzlsygrrgze = bjdzzlsygrrgze;
		}
		public Double getBjdzzlsygzfy() {
			return bjdzzlsygzfy;
		}
		public void setBjdzzlsygzfy(Double bjdzzlsygzfy) {
			this.bjdzzlsygzfy = bjdzzlsygzfy;
		}
		public Double getPtjcczl() {
			return ptjcczl;
		}
		public void setPtjcczl(Double ptjcczl) {
			this.ptjcczl = ptjcczl;
		}
		public Double getHptjccl() {
			return hptjccl;
		}
		public void setHptjccl(Double hptjccl) {
			this.hptjccl = hptjccl;
		}
		public Double getBptjccl() {
			return bptjccl;
		}
		public void setBptjccl(Double bptjccl) {
			this.bptjccl = bptjccl;
		}
		public Double getBjdxsze() {
			return bjdxsze;
		}
		public void setBjdxsze(Double bjdxsze) {
			this.bjdxsze = bjdxsze;
		}
		public Double getPzjxssr() {
			return pzjxssr;
		}
		public void setPzjxssr(Double pzjxssr) {
			this.pzjxssr = pzjxssr;
		}
		public Integer getPzjxssl() {
			return pzjxssl;
		}
		public void setPzjxssl(Integer pzjxssl) {
			this.pzjxssl = pzjxssl;
		}
		public Double getYzjxssl() {
			return yzjxssl;
		}
		public void setYzjxssl(Double yzjxssl) {
			this.yzjxssl = yzjxssl;
		}
		public Double getYzjxssr() {
			return yzjxssr;
		}
		public void setYzjxssr(Double yzjxssr) {
			this.yzjxssr = yzjxssr;
		}
		public Integer getJzdbjdzxcksl() {
			return jzdbjdzxcksl;
		}
		public void setJzdbjdzxcksl(Integer jzdbjdzxcksl) {
			this.jzdbjdzxcksl = jzdbjdzxcksl;
		}
		public Integer getBjdxzzxcksl() {
			return bjdxzzxcksl;
		}
		public void setBjdxzzxcksl(Integer bjdxzzxcksl) {
			this.bjdxzzxcksl = bjdxzzxcksl;
		}
		public Double getBjdzxckxsje() {
			return bjdzxckxsje;
		}
		public void setBjdzxckxsje(Double bjdzxckxsje) {
			this.bjdzxckxsje = bjdzxckxsje;
		}
		public Integer getDnjdcglyrs() {
			return dnjdcglyrs;
		}
		public void setDnjdcglyrs(Integer dnjdcglyrs) {
			this.dnjdcglyrs = dnjdcglyrs;
		}
		public Double getDnlysr() {
			return dnlysr;
		}
		public void setDnlysr(Double dnlysr) {
			this.dnlysr = dnlysr;
		}
		public Double getKfsr() {
			return kfsr;
		}
		public void setKfsr(Double kfsr) {
			this.kfsr = kfsr;
		}
		public Double getCysr() {
			return cysr;
		}
		public void setCysr(Double cysr) {
			this.cysr = cysr;
		}
		public Double getYxtr() {
			return yxtr;
		}
		public void setYxtr(Double yxtr) {
			this.yxtr = yxtr;
		}
		
		public void setSessionId(String sessionId) {
			this.sessionId = sessionId;
		}
		
		public String getSessionId() {
			return sessionId;
		}
}
