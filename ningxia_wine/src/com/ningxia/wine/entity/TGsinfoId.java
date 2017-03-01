package com.ningxia.wine.entity;

/**
 * TGsinfoId entity. @author MyEclipse Persistence Tools
 */

public class TGsinfoId implements java.io.Serializable {

	// Fields

	private String gsname;
	private String oldname;
	private String gscode;
	private String xqQuCode;
	private String xqXianCode;
	private String xqXiangCode;
	private String xqCunCode;
	private String xqQuName;
	private String xqXianName;
	private String xqXiangName;
	private String xqCunName;
	private String zzjgdm;
	private String fr;
	private String password;
	private String email;
	private Integer state;
	private String remark;
	private Integer ifNkjt;
	private Integer id;

	// Constructors

	/** default constructor */
	public TGsinfoId() {
	}

	/** minimal constructor */
	public TGsinfoId(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public TGsinfoId(String gsname, String oldname, String gscode,
			String xqQuCode, String xqXianCode, String xqXiangCode,
			String xqCunCode, String xqQuName, String xqXianName,
			String xqXiangName, String xqCunName, String zzjgdm, String fr,
			String password, String email, Integer state, String remark,
			Integer ifNkjt, Integer id) {
		this.gsname = gsname;
		this.oldname = oldname;
		this.gscode = gscode;
		this.xqQuCode = xqQuCode;
		this.xqXianCode = xqXianCode;
		this.xqXiangCode = xqXiangCode;
		this.xqCunCode = xqCunCode;
		this.xqQuName = xqQuName;
		this.xqXianName = xqXianName;
		this.xqXiangName = xqXiangName;
		this.xqCunName = xqCunName;
		this.zzjgdm = zzjgdm;
		this.fr = fr;
		this.password = password;
		this.email = email;
		this.state = state;
		this.remark = remark;
		this.ifNkjt = ifNkjt;
		this.id = id;
	}

	// Property accessors

	public String getGsname() {
		return this.gsname;
	}

	public void setGsname(String gsname) {
		this.gsname = gsname;
	}

	public String getOldname() {
		return this.oldname;
	}

	public void setOldname(String oldname) {
		this.oldname = oldname;
	}

	public String getGscode() {
		return this.gscode;
	}

	public void setGscode(String gscode) {
		this.gscode = gscode;
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

	public String getZzjgdm() {
		return this.zzjgdm;
	}

	public void setZzjgdm(String zzjgdm) {
		this.zzjgdm = zzjgdm;
	}

	public String getFr() {
		return this.fr;
	}

	public void setFr(String fr) {
		this.fr = fr;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getIfNkjt() {
		return this.ifNkjt;
	}

	public void setIfNkjt(Integer ifNkjt) {
		this.ifNkjt = ifNkjt;
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
		if (!(other instanceof TGsinfoId))
			return false;
		TGsinfoId castOther = (TGsinfoId) other;

		return ((this.getGsname() == castOther.getGsname()) || (this
				.getGsname() != null && castOther.getGsname() != null && this
				.getGsname().equals(castOther.getGsname())))
				&& ((this.getOldname() == castOther.getOldname()) || (this
						.getOldname() != null && castOther.getOldname() != null && this
						.getOldname().equals(castOther.getOldname())))
				&& ((this.getGscode() == castOther.getGscode()) || (this
						.getGscode() != null && castOther.getGscode() != null && this
						.getGscode().equals(castOther.getGscode())))
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
				&& ((this.getZzjgdm() == castOther.getZzjgdm()) || (this
						.getZzjgdm() != null && castOther.getZzjgdm() != null && this
						.getZzjgdm().equals(castOther.getZzjgdm())))
				&& ((this.getFr() == castOther.getFr()) || (this.getFr() != null
						&& castOther.getFr() != null && this.getFr().equals(
						castOther.getFr())))
				&& ((this.getPassword() == castOther.getPassword()) || (this
						.getPassword() != null
						&& castOther.getPassword() != null && this
						.getPassword().equals(castOther.getPassword())))
				&& ((this.getEmail() == castOther.getEmail()) || (this
						.getEmail() != null && castOther.getEmail() != null && this
						.getEmail().equals(castOther.getEmail())))
				&& ((this.getState() == castOther.getState()) || (this
						.getState() != null && castOther.getState() != null && this
						.getState().equals(castOther.getState())))
				&& ((this.getRemark() == castOther.getRemark()) || (this
						.getRemark() != null && castOther.getRemark() != null && this
						.getRemark().equals(castOther.getRemark())))
				&& ((this.getIfNkjt() == castOther.getIfNkjt()) || (this
						.getIfNkjt() != null && castOther.getIfNkjt() != null && this
						.getIfNkjt().equals(castOther.getIfNkjt())))
				&& ((this.getId() == castOther.getId()) || (this.getId() != null
						&& castOther.getId() != null && this.getId().equals(
						castOther.getId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getGsname() == null ? 0 : this.getGsname().hashCode());
		result = 37 * result
				+ (getOldname() == null ? 0 : this.getOldname().hashCode());
		result = 37 * result
				+ (getGscode() == null ? 0 : this.getGscode().hashCode());
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
		result = 37 * result
				+ (getZzjgdm() == null ? 0 : this.getZzjgdm().hashCode());
		result = 37 * result + (getFr() == null ? 0 : this.getFr().hashCode());
		result = 37 * result
				+ (getPassword() == null ? 0 : this.getPassword().hashCode());
		result = 37 * result
				+ (getEmail() == null ? 0 : this.getEmail().hashCode());
		result = 37 * result
				+ (getState() == null ? 0 : this.getState().hashCode());
		result = 37 * result
				+ (getRemark() == null ? 0 : this.getRemark().hashCode());
		result = 37 * result
				+ (getIfNkjt() == null ? 0 : this.getIfNkjt().hashCode());
		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		return result;
	}

}