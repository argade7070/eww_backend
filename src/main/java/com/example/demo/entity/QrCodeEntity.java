package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="qr_code")
public class QrCodeEntity {
	
	public QrCodeEntity() {}

	@Id
	@GeneratedValue(strategy = 	GenerationType.IDENTITY)
	@Column(name = "QR_CODE_ID")
	private int qrCodeId;
	
	@Column(name="QR_CODE_DATA")
	private String qrCodeData;
	
	@Column(name="IS_QR_CODE_GENERATED")
	private int isQRCodeGenerated;
	
	@Column(name="QRCODE")
	private byte[] qrCode;

	public QrCodeEntity(int qrCodeId, String qrCodeData, int isQRCodeGenerated, byte[] qrCode) {
		super();
		this.qrCodeId = qrCodeId;
		this.qrCodeData = qrCodeData;
		this.isQRCodeGenerated = isQRCodeGenerated;
		this.qrCode = qrCode;
	}

	public int getQrCodeId() {
		return qrCodeId;
	}

	public void setQrCodeId(int qrCodeId) {
		this.qrCodeId = qrCodeId;
	}

	public String getQrCodeData() {
		return qrCodeData;
	}

	public void setQrCodeData(String qrCodeData) {
		this.qrCodeData = qrCodeData;
	}

	public int getIsQRCodeGenerated() {
		return isQRCodeGenerated;
	}

	public void setIsQRCodeGenerated(int isQRCodeGenerated) {
		this.isQRCodeGenerated = isQRCodeGenerated;
	}

	public byte[] getQrCode() {
		return qrCode;
	}

	public void setQrCode(byte[] qrCode) {
		this.qrCode = qrCode;
	}

}
