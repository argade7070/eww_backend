package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="outfeed_missions")
public class OutfeedMissionEntity {
	
	public OutfeedMissionEntity() {}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "OUTFEED_MISSION_ID")
	private int manualOutfeedMissionDetailsId;

	@Column(name = "PALLET_INFORMATION_ID")
	private int palletInformationDetailsId;

	@Column(name = "PALLET_CODE")
	private String palletCode; 
	
	@Column(name = "POSITION_ID")
	private int positionId;

	@Column(name = "POSITION_NAME")
	private String positionName;

	@Column(name = "IS_MISSION_GENERATED")
	private int isMissionGenerated;

	@Column(name = "USER_ID")
	private int userId;

	@Column(name = "USER_NAME")
	private String userName;

	@Column(name = "CDATETIME")
	private String cDateTime;

	public OutfeedMissionEntity(int manualOutfeedMissionDetailsId, int palletInformationDetailsId, String palletCode,
			int positionId, String positionName, int isMissionGenerated, int userId, String userName,
			String cDateTime) {
		super();
		this.manualOutfeedMissionDetailsId = manualOutfeedMissionDetailsId;
		this.palletInformationDetailsId = palletInformationDetailsId;
		this.palletCode = palletCode;
		this.positionId = positionId;
		this.positionName = positionName;
		this.isMissionGenerated = isMissionGenerated;
		this.userId = userId;
		this.userName = userName;
		this.cDateTime = cDateTime;
	}

	public int getManualOutfeedMissionDetailsId() {
		return manualOutfeedMissionDetailsId;
	}

	public void setManualOutfeedMissionDetailsId(int manualOutfeedMissionDetailsId) {
		this.manualOutfeedMissionDetailsId = manualOutfeedMissionDetailsId;
	}

	public int getPalletInformationDetailsId() {
		return palletInformationDetailsId;
	}

	public void setPalletInformationDetailsId(int palletInformationDetailsId) {
		this.palletInformationDetailsId = palletInformationDetailsId;
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

	public int getIsMissionGenerated() {
		return isMissionGenerated;
	}

	public void setIsMissionGenerated(int isMissionGenerated) {
		this.isMissionGenerated = isMissionGenerated;
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
