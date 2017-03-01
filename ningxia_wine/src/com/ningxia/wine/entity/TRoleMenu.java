package com.ningxia.wine.entity;

/**
 * TRoleMenu entity. @author MyEclipse Persistence Tools
 */

public class TRoleMenu implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer roleId;
	private Integer menuId;

	// Constructors

	/** default constructor */
	public TRoleMenu() {
	}

	/** full constructor */
	public TRoleMenu(Integer roleId, Integer menuId) {
		this.roleId = roleId;
		this.menuId = menuId;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Integer getMenuId() {
		return this.menuId;
	}

	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}

}