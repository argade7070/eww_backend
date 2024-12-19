package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="transfer_mission")
public class TransferMissionEntity {

	public TransferMissionEntity() {}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TRANSFER_PALLET_MISSION_DETAILS_ID")
	private int transferPalletMissionDetailsId;

	@Column(name = "PALLET_INFORMATION_ID")
	private int palletInformationId;

	@Column(name = "PALLET_CODE")
	private String palletCode;

	@Column(name = "POSITION_ID")
	private int positionId;

	@Column(name = "POSITION_NAME")
	private String positionName;

	@Column(name = "TRANSFER_POSITION_ID")
	private int transferPositionId;

	@Column(name = "TRANSFER_POSITION_NAME")
	private String transferPositionName;

	@Column(name = "IS_MISSION_GENERATED")
	private int isMissionGenerated;

	@Column(name = "IS_MANUAL_MISSION")
	private int isManualMission;

	@Column(name = "USER_ID")
	private int userId;

	@Column(name = "USER_NAME")
	private String userName;

	@Column(name = "CDATETIME")
	private String cDateTime;

	public TransferMissionEntity(int transferPalletMissionDetailsId, int palletInformationId, String palletCode,
			int positionId, String positionName, int transferPositionId, String transferPositionName,
			int isMissionGenerated, int isManualMission, int userId, String userName, String cDateTime) {
		super();
		this.transferPalletMissionDetailsId = transferPalletMissionDetailsId;
		this.palletInformationId = palletInformationId;
		this.palletCode = palletCode;
		this.positionId = positionId;
		this.positionName = positionName;
		this.transferPositionId = transferPositionId;
		this.transferPositionName = transferPositionName;
		this.isMissionGenerated = isMissionGenerated;
		this.isManualMission = isManualMission;
		this.userId = userId;
		this.userName = userName;
		this.cDateTime = cDateTime;
	}

	public int getTransferPalletMissionDetailsId() {
		return transferPalletMissionDetailsId;
	}

	public void setTransferPalletMissionDetailsId(int transferPalletMissionDetailsId) {
		this.transferPalletMissionDetailsId = transferPalletMissionDetailsId;
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

	public int getIsMissionGenerated() {
		return isMissionGenerated;
	}

	public void setIsMissionGenerated(int isMissionGenerated) {
		this.isMissionGenerated = isMissionGenerated;
	}

	public int getIsManualMission() {
		return isManualMission;
	}

	public void setIsManualMission(int isManualMission) {
		this.isManualMission = isManualMission;
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

	
}
