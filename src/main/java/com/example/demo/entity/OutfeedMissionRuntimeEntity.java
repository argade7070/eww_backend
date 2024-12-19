package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="outfeed_missions")
public class OutfeedMissionRuntimeEntity {

	public OutfeedMissionRuntimeEntity() {}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="OUTFEED_MISSION_ID")
	private long outfeedMissionId;
	
	@Column(name = "ORDER_ID")
	private int orderId;

	@Column(name = "PALLET_INFORMATION_ID")
	private int palletInformationId;

	@Column(name = "PALLET_CODE")
	private String palletCode;

	@Column(name = "QUANTITY")
	private int quantity;

	@Column(name = "FLOOR_ID")
	private int floorId;

	@Column(name = "FLOOR_NAME")
	private String floorName;

	@Column(name = "AREA_ID")
	private int areaId;

	@Column(name = "AREA_NAME")
	private String areaName;

	@Column(name = "RACK_ID")
	private int rackId;

	@Column(name = "RACK_NAME")
	private String rackName;

	@Column(name = "RACK_SIDE")
	private String rackSide;

	@Column(name = "POSITION_ID")
	private int positionId;

	@Column(name = "POSITION_NAME")
	private String positionName;

	@Column(name = "POSITION_NUMBER_IN_RACK")
	private int positionNumberInRack;

	@Column(name = "CDATETIME")
	private String cDateTime;

	@Column(name = "OUTFEED_MISSION_START_DATETIME")
	private String outfeedMissionStartDateTime;

	@Column(name = "OUTFEED_MISSION_END_DATETIME")
	private String outfeedMissionEndDateTime;

	@Column(name = "OUTFEED_MISSION_STATUS")
	private String outfeedMissionStatus;

	@Column(name = "OUTFEED_MISSION_IS_DELETED")
	private int outfeedMissionIsDeleted;

	@Column(name = "WMS_TRANSFER_ORDER_ID")
	private String wmsTransferOrderId;

	@Column(name = "SHIFT_ID")
	private int shiftId;

	@Column(name = "SHIFT_NAME")
	private String shiftName;

	@Column(name = "PALLET_STATUS_ID")
	private int palletStatusId;

	@Column(name = "PALLET_STATUS_NAME")
	private String palletStatusName;

	@Column(name = "FILLED_PERCENTAGE")
	private int filledPercentage;

	public OutfeedMissionRuntimeEntity(long outfeedMissionId, int orderId, int palletInformationId, String palletCode,
			int quantity, int floorId, String floorName, int areaId, String areaName, int rackId, String rackName,
			String rackSide, int positionId, String positionName, int positionNumberInRack, String cDateTime,
			String outfeedMissionStartDateTime, String outfeedMissionEndDateTime, String outfeedMissionStatus,
			int outfeedMissionIsDeleted, String wmsTransferOrderId, int shiftId, String shiftName, int palletStatusId,
			String palletStatusName, int filledPercentage) {
		super();
		this.outfeedMissionId = outfeedMissionId;
		this.orderId = orderId;
		this.palletInformationId = palletInformationId;
		this.palletCode = palletCode;
		this.quantity = quantity;
		this.floorId = floorId;
		this.floorName = floorName;
		this.areaId = areaId;
		this.areaName = areaName;
		this.rackId = rackId;
		this.rackName = rackName;
		this.rackSide = rackSide;
		this.positionId = positionId;
		this.positionName = positionName;
		this.positionNumberInRack = positionNumberInRack;
		this.cDateTime = cDateTime;
		this.outfeedMissionStartDateTime = outfeedMissionStartDateTime;
		this.outfeedMissionEndDateTime = outfeedMissionEndDateTime;
		this.outfeedMissionStatus = outfeedMissionStatus;
		this.outfeedMissionIsDeleted = outfeedMissionIsDeleted;
		this.wmsTransferOrderId = wmsTransferOrderId;
		this.shiftId = shiftId;
		this.shiftName = shiftName;
		this.palletStatusId = palletStatusId;
		this.palletStatusName = palletStatusName;
		this.filledPercentage = filledPercentage;
	}

	public long getOutfeedMissionId() {
		return outfeedMissionId;
	}

	public void setOutfeedMissionId(long outfeedMissionId) {
		this.outfeedMissionId = outfeedMissionId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
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

	public String getcDateTime() {
		return cDateTime;
	}

	public void setcDateTime(String cDateTime) {
		this.cDateTime = cDateTime;
	}

	public String getOutfeedMissionStartDateTime() {
		return outfeedMissionStartDateTime;
	}

	public void setOutfeedMissionStartDateTime(String outfeedMissionStartDateTime) {
		this.outfeedMissionStartDateTime = outfeedMissionStartDateTime;
	}

	public String getOutfeedMissionEndDateTime() {
		return outfeedMissionEndDateTime;
	}

	public void setOutfeedMissionEndDateTime(String outfeedMissionEndDateTime) {
		this.outfeedMissionEndDateTime = outfeedMissionEndDateTime;
	}

	public String getOutfeedMissionStatus() {
		return outfeedMissionStatus;
	}

	public void setOutfeedMissionStatus(String outfeedMissionStatus) {
		this.outfeedMissionStatus = outfeedMissionStatus;
	}

	public int getOutfeedMissionIsDeleted() {
		return outfeedMissionIsDeleted;
	}

	public void setOutfeedMissionIsDeleted(int outfeedMissionIsDeleted) {
		this.outfeedMissionIsDeleted = outfeedMissionIsDeleted;
	}

	public String getWmsTransferOrderId() {
		return wmsTransferOrderId;
	}

	public void setWmsTransferOrderId(String wmsTransferOrderId) {
		this.wmsTransferOrderId = wmsTransferOrderId;
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

	public int getFilledPercentage() {
		return filledPercentage;
	}

	public void setFilledPercentage(int filledPercentage) {
		this.filledPercentage = filledPercentage;
	}
	
}
