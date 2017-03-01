package com.ningxia.wine.entity;

/**
 * TMenuId entity. @author MyEclipse Persistence Tools
 */

public class TMenuId implements java.io.Serializable {

	// Fields

	private Integer id;
	private String text;
	private String link;
	private Integer parentId;
	private String bz;

	// Constructors

	/** default constructor */
	public TMenuId() {
	}

	/** full constructor */
	public TMenuId(Integer id, String text, String link, Integer parentId,
			String bz) {
		this.id = id;
		this.text = text;
		this.link = link;
		this.parentId = parentId;
		this.bz = bz;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Integer getParentId() {
		return this.parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
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
		if (!(other instanceof TMenuId))
			return false;
		TMenuId castOther = (TMenuId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getText() == castOther.getText()) || (this.getText() != null
						&& castOther.getText() != null && this.getText()
						.equals(castOther.getText())))
				&& ((this.getLink() == castOther.getLink()) || (this.getLink() != null
						&& castOther.getLink() != null && this.getLink()
						.equals(castOther.getLink())))
				&& ((this.getParentId() == castOther.getParentId()) || (this
						.getParentId() != null
						&& castOther.getParentId() != null && this
						.getParentId().equals(castOther.getParentId())))
				&& ((this.getBz() == castOther.getBz()) || (this.getBz() != null
						&& castOther.getBz() != null && this.getBz().equals(
						castOther.getBz())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getText() == null ? 0 : this.getText().hashCode());
		result = 37 * result
				+ (getLink() == null ? 0 : this.getLink().hashCode());
		result = 37 * result
				+ (getParentId() == null ? 0 : this.getParentId().hashCode());
		result = 37 * result + (getBz() == null ? 0 : this.getBz().hashCode());
		return result;
	}

}