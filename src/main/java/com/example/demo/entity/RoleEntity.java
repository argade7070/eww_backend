package com.example.demo.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="role")
public class RoleEntity {

	public RoleEntity() {}
	
	@Id
	@Column(name = "ROLE_ID")
	private int roleId;
	
	@Column(name = "ROLE_NAME")
	private String roleName;
	
	@Column(name = "ROLE_DESC")
	private String roleDesc;
	
	@Column(name = "ROLE_CDATETIME")
	private LocalDateTime cDateTime=LocalDateTime.now();
	
	@Column(name = "ROLE_IS_DELETED")
	private int roleIsDeleted;

	public RoleEntity(int roleId, String roleName, String roleDesc, LocalDateTime cDateTime, int roleIsDeleted) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.roleDesc = roleDesc;
		this.cDateTime = cDateTime;
		this.roleIsDeleted = roleIsDeleted;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDesc() {
		return roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

	public LocalDateTime getcDateTime() {
		return cDateTime;
	}

	public void setcDateTime(LocalDateTime cDateTime) {
		this.cDateTime = cDateTime;
	}

	public int getRoleIsDeleted() {
		return roleIsDeleted;
	}

	public void setRoleIsDeleted(int roleIsDeleted) {
		this.roleIsDeleted = roleIsDeleted;
	}

}
