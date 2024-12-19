package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="current_stock")

public class CurrentStockEntity {
	
	public CurrentStockEntity() {}
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	
	@Column(name = "CURRENT_STOCK_ID")
	private int currentPalletStockDetailsId;
	
	@Column(name ="PALLET_INFORMATION_ID")
	private int palletInformationId;
	
	@Column(name = "PALLET_CODE")
	private String palletCode;
	
	@Column(name  = "POSITION_ID")
	private int positionId;
	
	@Column(name = "POSITION_NAME")
	private String positionName;
	
	@Column(name = "SAP_REFERANCE_NUMBER")
	private String sapReferanceNumber;
	
	@Column(name = "GRN_NUMBER")
	private String grnNumber;
	
	@Column(name = "PO_NUMBER")
	private String poNumber;
	
	@Column(name = "PRODUCT_ID")
	private int productId;
	
	@Column(name = "PRODUCT_NAME")
	private String productName;

	@Column(name = "PRODUCT_VARIANT_ID")
	private int productVariantId;
	
	@Column(name ="PRODUCT_VARIANT_CODE")
	private String productVariantCode;
	
	@Column(name = "PRODUCT_VARIANT_NAME")
	private String productVariantName;
	
	@Column(name = "BATCH_NUMBER")
	private String batchNumber;
	
	@Column(name = "QUANTITY")
	private int quantity;
	
	@Column(name = "UOM")
	private String uom;
	
	@Column(name = "SAMPLE_QUANTITY")
	private int sampleQuantity;
	
	@Column(name = "WEIGHT")
	private float weight;
	
	@Column(name = "QUALITY_APPROVED_STATUS")
	private String qualityApprovedStatus;
	
	@Column(name = "REJECT_STATUS")
	private int rejectStatus;
	
	@Column(name = "EXPIRY_DATE")
	private String expiryDate;

	@Column(name = "LOAD_DATETIME")
	private String loadDatetime;
	
	@Column(name = "AREA_ID")
	private int areaId;
	
	@Column(name = "AREA_Name")
	private String areaName;
	
	@Column(name ="FLOOR_ID")
	private int floorId;
	
	@Column(name = "FLOOR_NAME")
	private String floorName;
	
	@Column(name = "RACK_ID")
	private int rackId;
	
	@Column(name = "RACK_NAME")
	private String rackName;
	
	@Column(name = "RACK_SIDE")
	private String rackSide;
	
	@Column(name = "POSITION_NUMBER_IN_RACK")
	private int positionNumberInRack;
	
	@Column(name ="USER_ID")
	private int userId;
	
	@Column(name = "USER_NAME")
	private String userName;

	public CurrentStockEntity(int currentPalletStockDetailsId, int palletInformationId, String palletCode,
			int positionId, String positionName, String sapReferanceNumber, String grnNumber, String poNumber,
			int productId, String productName, int productVariantId, String productVariantCode,
			String productVariantName, String batchNumber, int quantity, String uom, int sampleQuantity, float weight,
			String qualityApprovedStatus, int rejectStatus, String expiryDate, String loadDatetime, int areaId,
			String areaName, int floorId, String floorName, int rackId, String rackName, String rackSide,
			int positionNumberInRack, int userId, String userName) {
		super();
		this.currentPalletStockDetailsId = currentPalletStockDetailsId;
		this.palletInformationId = palletInformationId;
		this.palletCode = palletCode;
		this.positionId = positionId;
		this.positionName = positionName;
		this.sapReferanceNumber = sapReferanceNumber;
		this.grnNumber = grnNumber;
		this.poNumber = poNumber;
		this.productId = productId;
		this.productName = productName;
		this.productVariantId = productVariantId;
		this.productVariantCode = productVariantCode;
		this.productVariantName = productVariantName;
		this.batchNumber = batchNumber;
		this.quantity = quantity;
		this.uom = uom;
		this.sampleQuantity = sampleQuantity;
		this.weight = weight;
		this.qualityApprovedStatus = qualityApprovedStatus;
		this.rejectStatus = rejectStatus;
		this.expiryDate = expiryDate;
		this.loadDatetime = loadDatetime;
		this.areaId = areaId;
		this.areaName = areaName;
		this.floorId = floorId;
		this.floorName = floorName;
		this.rackId = rackId;
		this.rackName = rackName;
		this.rackSide = rackSide;
		this.positionNumberInRack = positionNumberInRack;
		this.userId = userId;
		this.userName = userName;
	}

	public int getCurrentPalletStockDetailsId() {
		return currentPalletStockDetailsId;
	}

	public void setCurrentPalletStockDetailsId(int currentPalletStockDetailsId) {
		this.currentPalletStockDetailsId = currentPalletStockDetailsId;
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

	public String getSapReferanceNumber() {
		return sapReferanceNumber;
	}

	public void setSapReferanceNumber(String sapReferanceNumber) {
		this.sapReferanceNumber = sapReferanceNumber;
	}

	public String getGrnNumber() {
		return grnNumber;
	}

	public void setGrnNumber(String grnNumber) {
		this.grnNumber = grnNumber;
	}

	public String getPoNumber() {
		return poNumber;
	}

	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductVariantId() {
		return productVariantId;
	}

	public void setProductVariantId(int productVariantId) {
		this.productVariantId = productVariantId;
	}

	public String getProductVariantCode() {
		return productVariantCode;
	}

	public void setProductVariantCode(String productVariantCode) {
		this.productVariantCode = productVariantCode;
	}

	public String getProductVariantName() {
		return productVariantName;
	}

	public void setProductVariantName(String productVariantName) {
		this.productVariantName = productVariantName;
	}

	public String getBatchNumber() {
		return batchNumber;
	}

	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public int getSampleQuantity() {
		return sampleQuantity;
	}

	public void setSampleQuantity(int sampleQuantity) {
		this.sampleQuantity = sampleQuantity;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getQualityApprovedStatus() {
		return qualityApprovedStatus;
	}

	public void setQualityApprovedStatus(String qualityApprovedStatus) {
		this.qualityApprovedStatus = qualityApprovedStatus;
	}

	public int getRejectStatus() {
		return rejectStatus;
	}

	public void setRejectStatus(int rejectStatus) {
		this.rejectStatus = rejectStatus;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getLoadDatetime() {
		return loadDatetime;
	}

	public void setLoadDatetime(String loadDatetime) {
		this.loadDatetime = loadDatetime;
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

	public int getPositionNumberInRack() {
		return positionNumberInRack;
	}

	public void setPositionNumberInRack(int positionNumberInRack) {
		this.positionNumberInRack = positionNumberInRack;
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

}
