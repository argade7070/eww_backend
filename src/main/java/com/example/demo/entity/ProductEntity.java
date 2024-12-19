package com.example.demo.entity;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product")
public class ProductEntity {
	
	public ProductEntity() {}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PRODUCT_ID")
	private int productId;

	@Column(name = "PRODUCT_NAME")
	private String productName;

	@Column(name = "PRODUCT_DESC")
	private String productDesc;

	@Column(name = "USER_ID")
	private int userId;

	@Column(name = "USER_NAME")
	private String userName;

	@Column(name = "CDATETIME")
	@DateTimeFormat(pattern = "YYYY-MM-DD")
	private LocalDateTime cdatetime=LocalDateTime.now();

	@Column(name = "PRODUCT_IS_ACTIVE")
	private int productIsActive;

	@Column(name = "PRODUCT_IS_DELETED")
	private int productVariantIsDeleted;

	public ProductEntity(int productId, String productName, String productDesc, int userId, String userName,
			LocalDateTime cdatetime, int productIsActive, int productVariantIsDeleted) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDesc = productDesc;
		this.userId = userId;
		this.userName = userName;
		this.cdatetime = cdatetime;
		this.productIsActive = productIsActive;
		this.productVariantIsDeleted = productVariantIsDeleted;
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

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
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

	public LocalDateTime getCdatetime() {
		return cdatetime;
	}

	public void setCdatetime(LocalDateTime cdatetime) {
		this.cdatetime = cdatetime;
	}

	public int getProductIsActive() {
		return productIsActive;
	}

	public void setProductIsActive(int productIsActive) {
		this.productIsActive = productIsActive;
	}

	public int getProductVariantIsDeleted() {
		return productVariantIsDeleted;
	}

	public void setProductVariantIsDeleted(int productVariantIsDeleted) {
		this.productVariantIsDeleted = productVariantIsDeleted;
	}

}
