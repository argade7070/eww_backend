package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="floor")
public class FloorEntity {
	
	public FloorEntity() {}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "FLOOR_ID")
	private int floorId;
	
	@Column(name = "FLOOR_NAME")
	private String floorName;
	
	@Column(name = "FLOOR_DESC")
	private String floorDesc;
	
	@Column(name = "USER_ID")
	private int userId;
	
	@Column(name = "USER_NAME")
	private String userName;
	
	@Column(name = "CDATETIME")
	private String cDateTime;
	
	@Column(name = "FLOOR_IS_ACTIVE")
	private int floorIsActive;
	
	@Column(name = "FLOOR_IS_DELETED")
	private int floorIsDeleted;

	public FloorEntity(int floorId, String floorName, String floorDesc, int userId, String userName, String cDateTime,
			int floorIsActive, int floorIsDeleted) {
		super();
		this.floorId = floorId;
		this.floorName = floorName;
		this.floorDesc = floorDesc;
		this.userId = userId;
		this.userName = userName;
		this.cDateTime = cDateTime;
		this.floorIsActive = floorIsActive;
		this.floorIsDeleted = floorIsDeleted;
	}

	public int getFloorId() {
		return floorId;
	}

	public void setFloorId(int floorId) {
		this.floorId = floorId;
	}

	public String getFloorName() {
		return floorName;
	}

	public void setFloorName(String floorName) {
		this.floorName = floorName;
	}

	public String getFloorDesc() {
		return floorDesc;
	}

	public void setFloorDesc(String floorDesc) {
		this.floorDesc = floorDesc;
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

	public int getFloorIsActive() {
		return floorIsActive;
	}

	public void setFloorIsActive(int floorIsActive) {
		this.floorIsActive = floorIsActive;
	}

	public int getFloorIsDeleted() {
		return floorIsDeleted;
	}

	public void setFloorIsDeleted(int floorIsDeleted) {
		this.floorIsDeleted = floorIsDeleted;
	}
	

}
