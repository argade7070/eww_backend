package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="infeed_missions")
public class InfeedMissionRuntimeEntity {
	
	public InfeedMissionRuntimeEntity() {}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "INFEED_MISSION_ID")
	private int infeedMissionId;

	@Column(name = "TRANSFER_ORDER_ID")
	private String transferOrderId;

	@Column(name = "PALLET_INFORMATION_ID")
	private int palletInformationId;

	@Column(name = "PALLET_CODE")
	private String palletCode;

	@Column(name = "FILLED_PERCENTAGE")
	private int filledPercentage;

	@Column(name = "QUANTITY")
	private int quantity;

	@Column(name = "AREA_ID")
	private int areaId;

	@Column(name = "AREA_NAME")
	private String areaName;

	@Column(name = "FLOOR_ID")
	private int floorId;

	@Column(name = "FLOOR_NAME")
	private String floorName;

	@Column(name = "RACK_ID")
	private int rackId;

	@Column(name = "RACK_NAME")
	private String rackName;

	@Column(name = "RACK_SIDE")
	private String rackSide;

	@Column(name = "RACK_COLUMN")
	private int rackColumn;

	@Column(name = "POSITION_ID")
	private int positionId;

	@Column(name = "POSITION_NAME")
	private String positionName;

	@Column(name = "POSITION_NUMBER_IN_RACK")
	private int positionNumberInRack;

	@Column(name = "PALLET_STATUS_ID")
	private int palletStatusId;

	@Column(name = "PALLET_STATUS_NAME")
	private String palletStatusName;

	@Column(name = "CDATETIME")
	private String cDatetime;

	@Column(name = "INFEED_MISSION_START_DATETIME")
	private String infeedMissionStartDateTime;

	@Column(name = "INFEED_MISSION_END_DATETIME")
	private String infeedMissionEndDateTime;

	@Column(name = "INFEED_MISSION_STATUS")
	private String infeedMissionStatus;

	@Column(name = "INFEED_MISSION_IS_DELETED")
	private int infeedMissionIsDeleted;
	
	@Column(name="SHIFT_ID")
	private int shiftId;
	
	@Column(name="SHIFT_NAME")
	private String shiftName;

	public InfeedMissionRuntimeEntity(int infeedMissionId, String transferOrderId, int palletInformationId,
			String palletCode, int filledPercentage, int quantity, int areaId, String areaName, int floorId,
			String floorName, int rackId, String rackName, String rackSide, int rackColumn, int positionId,
			String positionName, int positionNumberInRack, int palletStatusId, String palletStatusName,
			String cDatetime, String infeedMissionStartDateTime, String infeedMissionEndDateTime,
			String infeedMissionStatus, int infeedMissionIsDeleted, int shiftId, String shiftName) {
		super();
		this.infeedMissionId = infeedMissionId;
		this.transferOrderId = transferOrderId;
		this.palletInformationId = palletInformationId;
		this.palletCode = palletCode;
		this.filledPercentage = filledPercentage;
		this.quantity = quantity;
		this.areaId = areaId;
		this.areaName = areaName;
		this.floorId = floorId;
		this.floorName = floorName;
		this.rackId = rackId;
		this.rackName = rackName;
		this.rackSide = rackSide;
		this.rackColumn = rackColumn;
		this.positionId = positionId;
		this.positionName = positionName;
		this.positionNumberInRack = positionNumberInRack;
		this.palletStatusId = palletStatusId;
		this.palletStatusName = palletStatusName;
		this.cDatetime = cDatetime;
		this.infeedMissionStartDateTime = infeedMissionStartDateTime;
		this.infeedMissionEndDateTime = infeedMissionEndDateTime;
		this.infeedMissionStatus = infeedMissionStatus;
		this.infeedMissionIsDeleted = infeedMissionIsDeleted;
		this.shiftId = shiftId;
		this.shiftName = shiftName;
	}

	public int getInfeedMissionId() {
		return infeedMissionId;
	}

	public void setInfeedMissionId(int infeedMissionId) {
		this.infeedMissionId = infeedMissionId;
	}

	public String getTransferOrderId() {
		return transferOrderId;
	}

	public void setTransferOrderId(String transferOrderId) {
		this.transferOrderId = transferOrderId;
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

	public int getFilledPercentage() {
		return filledPercentage;
	}

	public void setFilledPercentage(int filledPercentage) {
		this.filledPercentage = filledPercentage;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
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

	public int getPositionId() {
		return positionId;
	}

	public void setPositionId(int positionId) {
		this.positionId = positionId;
	}

	public String getPositionName() {
		return positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	public int getPositionNumberInRack() {
		return positionNumberInRack;
	}

	public void setPositionNumberInRack(int positionNumberInRack) {
		this.positionNumberInRack = positionNumberInRack;
	}

	public int getPalletStatusId() {
		return palletStatusId;
	}

	public void setPalletStatusId(int palletStatusId) {
		this.palletStatusId = palletStatusId;
	}

	public String getPalletStatusName() {
		return palletStatusName;
	}

	public void setPalletStatusName(String palletStatusName) {
		this.palletStatusName = palletStatusName;
	}

	public String getcDatetime() {
		return cDatetime;
	}

	public void setcDatetime(String cDatetime) {
		this.cDatetime = cDatetime;
	}

	public String getInfeedMissionStartDateTime() {
		return infeedMissionStartDateTime;
	}

	public void setInfeedMissionStartDateTime(String infeedMissionStartDateTime) {
		this.infeedMissionStartDateTime = infeedMissionStartDateTime;
	}

	public String getInfeedMissionEndDateTime() {
		return infeedMissionEndDateTime;
	}

	public void setInfeedMissionEndDateTime(String infeedMissionEndDateTime) {
		this.infeedMissionEndDateTime = infeedMissionEndDateTime;
	}

	public String getInfeedMissionStatus() {
		return infeedMissionStatus;
	}

	public void setInfeedMissionStatus(String infeedMissionStatus) {
		this.infeedMissionStatus = infeedMissionStatus;
	}

	public int getInfeedMissionIsDeleted() {
		return infeedMissionIsDeleted;
	}

	public void setInfeedMissionIsDeleted(int infeedMissionIsDeleted) {
		this.infeedMissionIsDeleted = infeedMissionIsDeleted;
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


}
