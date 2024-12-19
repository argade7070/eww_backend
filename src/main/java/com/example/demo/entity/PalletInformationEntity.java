package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="pallet_information")
public class PalletInformationEntity {
	
 public PalletInformationEntity() {}
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "PALLET_INFORMATION_ID")
    private int palletInformationId;

    @Column(name = "PALLET_CODE")
     private String palletCode;

    @Column(name = "QUANTITY")
    private float quantity;

    @Column(name = "PALLET_STATUS_ID")
    private int palletStatusId;

    @Column(name = "PALLET_STATUS_NAME")
    private String palletStatusName;

    @Column(name = "IS_INFEED_MISSION_GENERATED")
    private int isInfeedMissionGenerated;

    @Column(name = "IS_OUTFEED_MISSION_GENERATED")
    private int isOutfeedMissionGenerated;

    @Column(name = "IS_TRANSFER_MANAGEMENT_MISSION_GENERATED")
    private int isTransferManagementMissionGenerated;
    
    @Column(name="STATION_WORKDONE")
    private  int stationWorkdone;
      
    @Column(name = "CDATETIME")
    private String cdatetime;

    @Column(name = "PALLET_INFORMATION_IS_DELETED")
    private int palletInformationIsDeleted;

	public PalletInformationEntity(int palletInformationId, String palletCode, float quantity, int palletStatusId,
			String palletStatusName, int isInfeedMissionGenerated, int isOutfeedMissionGenerated,
			int isTransferManagementMissionGenerated, int stationWorkdone, String cdatetime,
			int palletInformationIsDeleted) {
		super();
		this.palletInformationId = palletInformationId;
		this.palletCode = palletCode;
		this.quantity = quantity;
		this.palletStatusId = palletStatusId;
		this.palletStatusName = palletStatusName;
		this.isInfeedMissionGenerated = isInfeedMissionGenerated;
		this.isOutfeedMissionGenerated = isOutfeedMissionGenerated;
		this.isTransferManagementMissionGenerated = isTransferManagementMissionGenerated;
		this.stationWorkdone = stationWorkdone;
		this.cdatetime = cdatetime;
		this.palletInformationIsDeleted = palletInformationIsDeleted;
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

	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
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

	public int getIsInfeedMissionGenerated() {
		return isInfeedMissionGenerated;
	}

	public void setIsInfeedMissionGenerated(int isInfeedMissionGenerated) {
		this.isInfeedMissionGenerated = isInfeedMissionGenerated;
	}

	public int getIsOutfeedMissionGenerated() {
		return isOutfeedMissionGenerated;
	}

	public void setIsOutfeedMissionGenerated(int isOutfeedMissionGenerated) {
		this.isOutfeedMissionGenerated = isOutfeedMissionGenerated;
	}

	public int getIsTransferManagementMissionGenerated() {
		return isTransferManagementMissionGenerated;
	}

	public void setIsTransferManagementMissionGenerated(int isTransferManagementMissionGenerated) {
		this.isTransferManagementMissionGenerated = isTransferManagementMissionGenerated;
	}

	public int getStationWorkdone() {
		return stationWorkdone;
	}

	public void setStationWorkdone(int stationWorkdone) {
		this.stationWorkdone = stationWorkdone;
	}

	public String getCdatetime() {
		return cdatetime;
	}

	public void setCdatetime(String cdatetime) {
		this.cdatetime = cdatetime;
	}

	public int getPalletInformationIsDeleted() {
		return palletInformationIsDeleted;
	}

	public void setPalletInformationIsDeleted(int palletInformationIsDeleted) {
		this.palletInformationIsDeleted = palletInformationIsDeleted;
	}
}
