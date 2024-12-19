package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="rack")
public class RackEntity {
	
	public RackEntity() {}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "RACK_ID")
	private int rackId;

	@Column(name = "AREA_ID")
	private int areaId;

	@Column(name = "FLOOR_ID")
	private int floorId;

	@Column(name = "RACK_NAME")
	private String rackName;

	@Column(name = "RACK_DESC")
	private String rackDesk;

	@Column(name = "RACK_NUMBER")
	private int rackNumber;

	@Column(name = "RACK_COLUMN")
	private int rackColumn;

	@Column(name = "RACK_SIDE")
	private String rackSide;

	@Column(name = "CDATETIME")
	private String cDateTime;

	@Column(name = "USER_ID")
	private int userId;

	@Column(name = "RACK_IS_ACTIVE")
	private int rackIsActive;

	@Column(name = "RACK_IS_DELETED")
	private int rackIsDeleted;

	public RackEntity(int rackId, int areaId, int floorId, String rackName, String rackDesk, int rackNumber,
			int rackColumn, String rackSide, String cDateTime, int userId, int rackIsActive, int rackIsDeleted) {
		super();
		this.rackId = rackId;
		this.areaId = areaId;
		this.floorId = floorId;
		this.rackName = rackName;
		this.rackDesk = rackDesk;
		this.rackNumber = rackNumber;
		this.rackColumn = rackColumn;
		this.rackSide = rackSide;
		this.cDateTime = cDateTime;
		this.userId = userId;
		this.rackIsActive = rackIsActive;
		this.rackIsDeleted = rackIsDeleted;
	}

	public int getRackId() {
		return rackId;
	}

	public void setRackId(int rackId) {
		this.rackId = rackId;
	}

	public int getAreaId() {
		return areaId;
	}

	public void setAreaId(int areaId) {
		this.areaId = areaId;
	}

	public int getFloorId() {
		return floorId;
	}

	public void setFloorId(int floorId) {
		this.floorId = floorId;
	}

	public String getRackName() {
		return rackName;
	}

	public void setRackName(String rackName) {
		this.rackName = rackName;
	}

	public String getRackDesk() {
		return rackDesk;
	}

	public void setRackDesk(String rackDesk) {
		this.rackDesk = rackDesk;
	}

	public int getRackNumber() {
		return rackNumber;
	}

	public void setRackNumber(int rackNumber) {
		this.rackNumber = rackNumber;
	}

	public int getRackColumn() {
		return rackColumn;
	}

	public void setRackColumn(int rackColumn) {
		this.rackColumn = rackColumn;
	}

	public String getRackSide() {
		return rackSide;
	}

	public void setRackSide(String rackSide) {
		this.rackSide = rackSide;
	}

	public String getcDateTime() {
		return cDateTime;
	}

	public void setcDateTime(String cDateTime) {
		this.cDateTime = cDateTime;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getRackIsActive() {
		return rackIsActive;
	}

	public void setRackIsActive(int rackIsActive) {
		this.rackIsActive = rackIsActive;
	}

	public int getRackIsDeleted() {
		return rackIsDeleted;
	}

	public void setRackIsDeleted(int rackIsDeleted) {
		this.rackIsDeleted = rackIsDeleted;
	}

	

}
