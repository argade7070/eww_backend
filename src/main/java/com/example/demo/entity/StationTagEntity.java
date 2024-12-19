package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="station_tag")
public class StationTagEntity {

	public StationTagEntity() {}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "STATION_TAG_DETAILS_ID")
	private int stationTagDetailsId;
	
	@Column(name = "STATION_ID")
	private int stationId;
	
	@Column(name = "STATION_NAME")
	private String stationName;
	
	@Column(name = "PLC_TAG_NAME")
	private String plcTagName;
	
	@Column(name = "PLC_TAG_TYPE")
	private String plcTagType;
	
	@Column(name = "CURRENT_VALUE")
	private String currentValue;
	
	@Column(name = "TRANSFER_ORDER_ID")
	private String wmsTransferOrderId;
	
	@Column(name = "CC_AKNOWLEDGEMENT")
	private int ccAknowledgement;
	
	@Column(name = "CDATETIME")
	private String cDateTime;

	public StationTagEntity(int stationTagDetailsId, int stationId, String stationName, String plcTagName,
			String plcTagType, String currentValue, String wmsTransferOrderId, int ccAknowledgement, String cDateTime) {
		super();
		this.stationTagDetailsId = stationTagDetailsId;
		this.stationId = stationId;
		this.stationName = stationName;
		this.plcTagName = plcTagName;
		this.plcTagType = plcTagType;
		this.currentValue = currentValue;
		this.wmsTransferOrderId = wmsTransferOrderId;
		this.ccAknowledgement = ccAknowledgement;
		this.cDateTime = cDateTime;
	}

	public int getStationTagDetailsId() {
		return stationTagDetailsId;
	}

	public void setStationTagDetailsId(int stationTagDetailsId) {
		this.stationTagDetailsId = stationTagDetailsId;
	}

	public int getStationId() {
		return stationId;
	}

	public void setStationId(int stationId) {
		this.stationId = stationId;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public String getPlcTagName() {
		return plcTagName;
	}

	public void setPlcTagName(String plcTagName) {
		this.plcTagName = plcTagName;
	}

	public String getPlcTagType() {
		return plcTagType;
	}

	public void setPlcTagType(String plcTagType) {
		this.plcTagType = plcTagType;
	}

	public String getCurrentValue() {
		return currentValue;
	}

	public void setCurrentValue(String currentValue) {
		this.currentValue = currentValue;
	}

	public String getWmsTransferOrderId() {
		return wmsTransferOrderId;
	}

	public void setWmsTransferOrderId(String wmsTransferOrderId) {
		this.wmsTransferOrderId = wmsTransferOrderId;
	}

	public int getCcAknowledgement() {
		return ccAknowledgement;
	}

	public void setCcAknowledgement(int ccAknowledgement) {
		this.ccAknowledgement = ccAknowledgement;
	}

	public String getcDateTime() {
		return cDateTime;
	}

	public void setcDateTime(String cDateTime) {
		this.cDateTime = cDateTime;
	}
	

}
