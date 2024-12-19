package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="pallet_operation_history")
public class PalletOperationHistoryEntity {
	
	public PalletOperationHistoryEntity() {}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "PALLET_RETRIEVAL_HISTORY_ID")
	private int palletRetrievalHistoryId;

	@Column(name = "TRANSFER_ORDER_ID")
	private String transferOrderId;

	@Column(name = "PALLET_INFORMATION_ID")
	private int palletInformationId;

	@Column(name = "PALLET_CODE")
	private String palletCode;

	@Column(name = "ORDER_ID")
	private int orderId;
	
	@Column(name="SAP_ORDER_NO")
	private String sapOrderNo;

	@Column(name = "PRODUCT_ID")
	private int productId;

	@Column(name = "PRODUCT_NAME")
	private String productName;

	@Column(name = "PRODUCT_VARIANT_ID")
	private int productVariantId;

	@Column(name = "PRODUCT_VARIANT_CODE")
	private String productVariantCode;

	@Column(name = "PRODUCT_VARIANT_NAME")
	private String productVariantName;

	@Column(name = "QUANTITY")
	private int quantity;

	@Column(name = "POSITION_NAME")
	private String positionName;

	@Column(name = "OPERATION")
	private String operation;
	
	@Column(name = "USER_ID")
	private int userId;

	@Column(name = "USER_NAME")
	private String userName;

	@Column(name = "LOAD_DATETIME")
	private String loadDateTime;

	@Column(name = "AREA_ID")
	private int areaId;

	@Column(name = "AREA_NAME")
	private String areaName;

	@Column(name = "FLOOR_ID")
	private int floorId;

	@Column(name = "FLOOR_NAME")
	private String floorName;

	@Column(name = "EXPIRY_DATE")
	private String expiryDate;

	public PalletOperationHistoryEntity(int palletRetrievalHistoryId, String transferOrderId, int palletInformationId,
			String palletCode, int orderId, String sapOrderNo, int productId, String productName, int productVariantId,
			String productVariantCode, String productVariantName, int quantity, String positionName, String operation,
			int userId, String userName, String loadDateTime, int areaId, String areaName, int floorId,
			String floorName, String expiryDate) {
		super();
		this.palletRetrievalHistoryId = palletRetrievalHistoryId;
		this.transferOrderId = transferOrderId;
		this.palletInformationId = palletInformationId;
		this.palletCode = palletCode;
		this.orderId = orderId;
		this.sapOrderNo = sapOrderNo;
		this.productId = productId;
		this.productName = productName;
		this.productVariantId = productVariantId;
		this.productVariantCode = productVariantCode;
		this.productVariantName = productVariantName;
		this.quantity = quantity;
		this.positionName = positionName;
		this.operation = operation;
		this.userId = userId;
		this.userName = userName;
		this.loadDateTime = loadDateTime;
		this.areaId = areaId;
		this.areaName = areaName;
		this.floorId = floorId;
		this.floorName = floorName;
		this.expiryDate = expiryDate;
	}

	public int getPalletRetrievalHistoryId() {
		return palletRetrievalHistoryId;
	}

	public void setPalletRetrievalHistoryId(int palletRetrievalHistoryId) {
		this.palletRetrievalHistoryId = palletRetrievalHistoryId;
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

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getSapOrderNo() {
		return sapOrderNo;
	}

	public void setSapOrderNo(String sapOrderNo) {
		this.sapOrderNo = sapOrderNo;
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getPositionName() {
		return positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
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

	public String getLoadDateTime() {
		return loadDateTime;
	}

	public void setLoadDateTime(String loadDateTime) {
		this.loadDateTime = loadDateTime;
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

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

}
