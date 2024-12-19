package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="area")
public class AreaEntity {
	
	public AreaEntity() {}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "AREA_ID")
	private int areaId;
	
	@Column(name = "AREA_NAME")
	private String areaName;
	
	@Column(name = "AREA_DESC")
	private String areaDesc;
	
	@Column(name = "USER_ID")
	private int userId;
	
	@Column(name = "USER_NAME")
	private String userName;
	
	@Column(name = "CDATETIME")
	private String cDateTime;
	
	@Column(name = "AREA_IS_ACTIVE")
	private int areaIsActive;
	
	@Column(name = "AREA_IS_DELETED")
	private int areaIsDeleted;

	public AreaEntity(int areaId, String areaName, String areaDesc, int userId, String userName, String cDateTime,
			int areaIsActive, int areaIsDeleted) {
		super();
		this.areaId = areaId;
		this.areaName = areaName;
		this.areaDesc = areaDesc;
		this.userId = userId;
		this.userName = userName;
		this.cDateTime = cDateTime;
		this.areaIsActive = areaIsActive;
		this.areaIsDeleted = areaIsDeleted;
	}

	public int getAreaId() {
		return areaId;
	}

	public void setAreaId(int areaId) {
		this.areaId = areaId;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getAreaDesc() {
		return areaDesc;
	}

	public void setAreaDesc(String areaDesc) {
		this.areaDesc = areaDesc;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getcDateTime() {
		return cDateTime;
	}

	public void setcDateTime(String cDateTime) {
		this.cDateTime = cDateTime;
	}

	public int getAreaIsActive() {
		return areaIsActive;
	}

	public void setAreaIsActive(int areaIsActive) {
		this.areaIsActive = areaIsActive;
	}

	public int getAreaIsDeleted() {
		return areaIsDeleted;
	}

	public void setAreaIsDeleted(int areaIsDeleted) {
		this.areaIsDeleted = areaIsDeleted;
	}

}
