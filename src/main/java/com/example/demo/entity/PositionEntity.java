package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="position")
public class PositionEntity {

	public PositionEntity() {}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "POSITION_ID")
	private int positionId;

	@Column(name = "RACK_ID")
	private int rackId;

	@Column(name = "AREA_ID")
	private int areaId;

	@Column(name = "FLOOR_ID")
	private int floorId;

	@Column(name = "POSITION_NAME")
	private String positionName;

	@Column(name = "POSITION_DESC")
	private String positionDesc;

	@Column(name = "POSITION_NUMBER_IN_RACK")
	private int positionNumberInRack;

	@Column(name = "POSITION_IS_ALLOCATED")
	private int positionIsAllocated;

	@Column(name = "POSITION_IS_EMPTY")
	private int emptyPalletPosition;
	
	@Column(name="IS_MATERIAL_LOADED")
	private int isMaterialLoaded;

	@Column(name = "CDATETIME")
	private String cDateTime;

	@Column(name = "USER_ID")
	private int userId;

	@Column(name = "USER_NAME")
	private String userName;

	@Column(name = "POSITION_IS_ACTIVE")
	private int positionIsActive;

	@Column(name = "POSITION_IS_DELETED")
	private int positionIsDeleted;
	
	@Column(name = "IS_MANUAL_DISPATCH")
	private int isManualDispatch;

	public PositionEntity(int positionId, int rackId, int areaId, int floorId, String positionName, String positionDesc,
			int positionNumberInRack, int positionIsAllocated, int emptyPalletPosition, int isMaterialLoaded,
			String cDateTime, int userId, String userName, int positionIsActive, int positionIsDeleted,
			int isManualDispatch) {
		super();
		this.positionId = positionId;
		this.rackId = rackId;
		this.areaId = areaId;
		this.floorId = floorId;
		this.positionName = positionName;
		this.positionDesc = positionDesc;
		this.positionNumberInRack = positionNumberInRack;
		this.positionIsAllocated = positionIsAllocated;
		this.emptyPalletPosition = emptyPalletPosition;
		this.isMaterialLoaded = isMaterialLoaded;
		this.cDateTime = cDateTime;
		this.userId = userId;
		this.userName = userName;
		this.positionIsActive = positionIsActive;
		this.positionIsDeleted = positionIsDeleted;
		this.isManualDispatch = isManualDispatch;
	}

	public int getPositionId() {
		return positionId;
	}

	public void setPositionId(int positionId) {
		this.positionId = positionId;
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

	public String getPositionName() {
		return positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	public String getPositionDesc() {
		return positionDesc;
	}

	public void setPositionDesc(String positionDesc) {
		this.positionDesc = positionDesc;
	}

	public int getPositionNumberInRack() {
		return positionNumberInRack;
	}

	public void setPositionNumberInRack(int positionNumberInRack) {
		this.positionNumberInRack = positionNumberInRack;
	}

	public int getPositionIsAllocated() {
		return positionIsAllocated;
	}

	public void setPositionIsAllocated(int positionIsAllocated) {
		this.positionIsAllocated = positionIsAllocated;
	}

	public int getEmptyPalletPosition() {
		return emptyPalletPosition;
	}

	public void setEmptyPalletPosition(int emptyPalletPosition) {
		this.emptyPalletPosition = emptyPalletPosition;
	}

	public int getIsMaterialLoaded() {
		return isMaterialLoaded;
	}

	public void setIsMaterialLoaded(int isMaterialLoaded) {
		this.isMaterialLoaded = isMaterialLoaded;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getPositionIsActive() {
		return positionIsActive;
	}

	public void setPositionIsActive(int positionIsActive) {
		this.positionIsActive = positionIsActive;
	}

	public int getPositionIsDeleted() {
		return positionIsDeleted;
	}

	public void setPositionIsDeleted(int positionIsDeleted) {
		this.positionIsDeleted = positionIsDeleted;
	}

	public int getIsManualDispatch() {
		return isManualDispatch;
	}

	public void setIsManualDispatch(int isManualDispatch) {
		this.isManualDispatch = isManualDispatch;
	}
	
	
}
