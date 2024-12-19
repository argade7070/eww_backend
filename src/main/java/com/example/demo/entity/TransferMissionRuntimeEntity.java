package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="transfer_missions_runtime")
public class TransferMissionRuntimeEntity {

	public TransferMissionRuntimeEntity() {}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="TRANSFER_MISSION_RUNTIME_ID")
	private long transferMissionRuntimeId;
	
	@Column(name="PALLET_INFORMTION_ID")
	private int palletInformationId;
	
	@Column(name="PALLET_CODE")
	private String palletCode;
	
	@Column(name="PREVIOUS_POSITION_ID")
	private int previousePositionId;
	
	@Column(name="PREVIOUS_POSITION_NAME")
	private String previousPositionName;
	
	@Column(name="TRANSFER_POSITION_ID")
	private int transferPositionId;
	
	@Column(name="TRANSFER_POSITION_NAME")
	private String transferPositionName;
	
	@Column(name="FLOOR_ID")
	private int floorId;
	
	@Column(name="FLOOR_NAME")
	private String floorName;
	
	@Column(name="AREA_ID")
	private int areaId;
	
	@Column(name="AREA_NAME")
	private String areaName;
	
	@Column(name="RACK_ID")
	private int rackId;
	
	@Column(name="RACK_NAME")
	private String rackName;
	
	@Column(name="RACK_SIDE")
	private String rackSide;
	
	@Column(name="RACK_COLUMN")
	private int rackColumn;
	
	@Column(name="POSITION_NUMBER_IN_RACK")
	private int positionNumberInRack;
	
	@Column(name="CDATETIME")
	private String cdatetime;
	
	@Column(name="TRANSFER_MISSION_START_DATETIME")
	private String transferMissionStartDatetime;
	
	@Column(name="TRANSFER_MISSION_END_DATETIME")
	private String transferMissionEndDatetime;
	
	@Column(name="TRANSFER_MISSION_STATUS")
	private String transferMissionStatus;
	
	@Column(name="SHIFT_ID")
	private int shiftId;
	
	@Column(name="SHIFT_NAME")
	private String shiftName;
	
	@Column(name="USER_ID")
	private int userId;
	
	@Column(name="USER_NAME")
	private String userName;
	
	@Column(name="TRANSFER_MISSION_IS_DELETED")
	private int transferMissionIsDeleted;

	public TransferMissionRuntimeEntity(long transferMissionRuntimeId, int palletInformationId, String palletCode,
			int previousePositionId, String previousPositionName, int transferPositionId, String transferPositionName,
			int floorId, String floorName, int areaId, String areaName, int rackId, String rackName, String rackSide,
			int rackColumn, int positionNumberInRack, String cdatetime, String transferMissionStartDatetime,
			String transferMissionEndDatetime, String transferMissionStatus, int shiftId, String shiftName, int userId,
			String userName, int transferMissionIsDeleted) {
		super();
		this.transferMissionRuntimeId = transferMissionRuntimeId;
		this.palletInformationId = palletInformationId;
		this.palletCode = palletCode;
		this.previousePositionId = previousePositionId;
		this.previousPositionName = previousPositionName;
		this.transferPositionId = transferPositionId;
		this.transferPositionName = transferPositionName;
		this.floorId = floorId;
		this.floorName = floorName;
		this.areaId = areaId;
		this.areaName = areaName;
		this.rackId = rackId;
		this.rackName = rackName;
		this.rackSide = rackSide;
		this.rackColumn = rackColumn;
		this.positionNumberInRack = positionNumberInRack;
		this.cdatetime = cdatetime;
		this.transferMissionStartDatetime = transferMissionStartDatetime;
		this.transferMissionEndDatetime = transferMissionEndDatetime;
		this.transferMissionStatus = transferMissionStatus;
		this.shiftId = shiftId;
		this.shiftName = shiftName;
		this.userId = userId;
		this.userName = userName;
		this.transferMissionIsDeleted = transferMissionIsDeleted;
	}

	public long getTransferMissionRuntimeId() {
		return transferMissionRuntimeId;
	}

	public void setTransferMissionRuntimeId(long transferMissionRuntimeId) {
		this.transferMissionRuntimeId = transferMissionRuntimeId;
	}

	public int getPalletInformationId() {
		return palletInformationId;
	}

	public void setPalletInformationId(int palletInformationId) {
		this.palletInformationId = palletInformationId;
	}

	public String getPalletCode() {
		return palletCode;
	}

	public void setPalletCode(String palletCode) {
		this.palletCode = palletCode;
	}

	public int getPreviousePositionId() {
		return previousePositionId;
	}

	public void setPreviousePositionId(int previousePositionId) {
		this.previousePositionId = previousePositionId;
	}

	public String getPreviousPositionName() {
		return previousPositionName;
	}

	public void setPreviousPositionName(String previousPositionName) {
		this.previousPositionName = previousPositionName;
	}

	public int getTransferPositionId() {
		return transferPositionId;
	}

	public void setTransferPositionId(int transferPositionId) {
		this.transferPositionId = transferPositionId;
	}

	public String getTransferPositionName() {
		return transferPositionName;
	}

	public void setTransferPositionName(String transferPositionName) {
		this.transferPositionName = transferPositionName;
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

	public int getRackId() {
		return rackId;
	}

	public void setRackId(int rackId) {
		this.rackId = rackId;
	}

	public String getRackName() {
		return rackName;
	}

	public void setRackName(String rackName) {
		this.rackName = rackName;
	}

	public String getRackSide() {
		return rackSide;
	}

	public void setRackSide(String rackSide) {
		this.rackSide = rackSide;
	}

	public int getRackColumn() {
		return rackColumn;
	}

	public void setRackColumn(int rackColumn) {
		this.rackColumn = rackColumn;
	}

	public int getPositionNumberInRack() {
		return positionNumberInRack;
	}

	public void setPositionNumberInRack(int positionNumberInRack) {
		this.positionNumberInRack = positionNumberInRack;
	}

	public String getCdatetime() {
		return cdatetime;
	}

	public void setCdatetime(String cdatetime) {
		this.cdatetime = cdatetime;
	}

	public String getTransferMissionStartDatetime() {
		return transferMissionStartDatetime;
	}

	public void setTransferMissionStartDatetime(String transferMissionStartDatetime) {
		this.transferMissionStartDatetime = transferMissionStartDatetime;
	}

	public String getTransferMissionEndDatetime() {
		return transferMissionEndDatetime;
	}

	public void setTransferMissionEndDatetime(String transferMissionEndDatetime) {
		this.transferMissionEndDatetime = transferMissionEndDatetime;
	}

	public String getTransferMissionStatus() {
		return transferMissionStatus;
	}

	public void setTransferMissionStatus(String transferMissionStatus) {
		this.transferMissionStatus = transferMissionStatus;
	}

	public int getShiftId() {
		return shiftId;
	}

	public void setShiftId(int shiftId) {
		this.shiftId = shiftId;
	}

	public String getShiftName() {
		return shiftName;
	}

	public void setShiftName(String shiftName) {
		this.shiftName = shiftName;
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

	public int getTransferMissionIsDeleted() {
		return transferMissionIsDeleted;
	}

	public void setTransferMissionIsDeleted(int transferMissionIsDeleted) {
		this.transferMissionIsDeleted = transferMissionIsDeleted;
	}
	
}
