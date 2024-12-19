package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product_varient")
public class ProductVarientEntity {
	
public ProductVarientEntity() {}

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "PRODUCT_VARIANT_ID")
private int productVariantId;

@Column(name = "PRODUCT_VARIANT_CODE")
private String productVariantCode;

@Column(name = "PRODUCT_ID")
private int productId;

@Column(name = "PRODUCT_NAME")
private String productName;

@Column(name = "PRODUCT_VARIANT_NAME")
private String productVariantname;

@Column(name = "PRODUCT_VARIANT_DESC")
private String productVariantDesc;

@Column(name = "QUANTITY")
private int quantity;

@Column(name = "USER_ID")
private int userId;

@Column(name = "USER_NAME")
private String userName;

@Column(name = "INSPECTION_IN_DAYS")
private int inspectionInDays = 720;

@Column(name = "PRODUCT_VARIANT_IS_ACTIVE")
private int productVariantIsActive;

@Column(name = "PRODUCT_VARIANT_IS_DELETED")
private int productVariantIsDeleted;

@Column(name = "AGEING_DAYS")
private int aegingDays;

@Column(name = "CDATETIME")
private String cdatetime;

public ProductVarientEntity(int productVariantId, String productVariantCode, int productId, String productName,
		String productVariantname, String productVariantDesc, int quantity, int userId, String userName,
		int inspectionInDays, int productVariantIsActive, int productVariantIsDeleted, int aegingDays,
		String cdatetime) {
	super();
	this.productVariantId = productVariantId;
	this.productVariantCode = productVariantCode;
	this.productId = productId;
	this.productName = productName;
	this.productVariantname = productVariantname;
	this.productVariantDesc = productVariantDesc;
	this.quantity = quantity;
	this.userId = userId;
	this.userName = userName;
	this.inspectionInDays = inspectionInDays;
	this.productVariantIsActive = productVariantIsActive;
	this.productVariantIsDeleted = productVariantIsDeleted;
	this.aegingDays = aegingDays;
	this.cdatetime = cdatetime;
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

public String getProductVariantname() {
	return productVariantname;
}

public void setProductVariantname(String productVariantname) {
	this.productVariantname = productVariantname;
}

public String getProductVariantDesc() {
	return productVariantDesc;
}

public void setProductVariantDesc(String productVariantDesc) {
	this.productVariantDesc = productVariantDesc;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
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

public int getInspectionInDays() {
	return inspectionInDays;
}

public void setInspectionInDays(int inspectionInDays) {
	this.inspectionInDays = inspectionInDays;
}

public int getProductVariantIsActive() {
	return productVariantIsActive;
}

public void setProductVariantIsActive(int productVariantIsActive) {
	this.productVariantIsActive = productVariantIsActive;
}

public int getProductVariantIsDeleted() {
	return productVariantIsDeleted;
}

public void setProductVariantIsDeleted(int productVariantIsDeleted) {
	this.productVariantIsDeleted = productVariantIsDeleted;
}

public int getAegingDays() {
	return aegingDays;
}

public void setAegingDays(int aegingDays) {
	this.aegingDays = aegingDays;
}

public String getCdatetime() {
	return cdatetime;
}

public void setCdatetime(String cdatetime) {
	this.cdatetime = cdatetime;
}
}
