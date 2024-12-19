package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="equipment")

public class EquipmentEntity {
	
	public EquipmentEntity() {}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EQUIPMENT_ID")
	private int equipmentId;

	@Column(name = "EQUIPMENT_NAME")
	private String equipmentName;

	@Column(name = "EQUIPMENT_DESC")
	private String equipmentDesc;

	@Column(name = "USER_ID")
	private int userId;

	@Column(name = "USER_NAME")
	private String userName;

	@Column(name = "CDATETIME")
	private String cDateTime;

	@Column(name = "EQUIPMENT_IS_ACTIVE")
	private int equipmentIsActive;

	@Column(name = "EQUIPMENT_IS_DELETED")
	private int equipmentIsDeleted;

	public EquipmentEntity(int equipmentId, String equipmentName, String equipmentDesc, int userId, String userName,
			String cDateTime, int equipmentIsActive, int equipmentIsDeleted) {
		super();
		this.equipmentId = equipmentId;
		this.equipmentName = equipmentName;
		this.equipmentDesc = equipmentDesc;
		this.userId = userId;
		this.userName = userName;
		this.cDateTime = cDateTime;
		this.equipmentIsActive = equipmentIsActive;
		this.equipmentIsDeleted = equipmentIsDeleted;
	}

	public int getEquipmentId() {
		return equipmentId;
	}

	public void setEquipmentId(int equipmentId) {
		this.equipmentId = equipmentId;
	}

	public String getEquipmentName() {
		return equipmentName;
	}

	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}

	public String getEquipmentDesc() {
		return equipmentDesc;
	}

	public void setEquipmentDesc(String equipmentDesc) {
		this.equipmentDesc = equipmentDesc;
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

	public int getEquipmentIsActive() {
		return equipmentIsActive;
	}

	public void setEquipmentIsActive(int equipmentIsActive) {
		this.equipmentIsActive = equipmentIsActive;
	}

	public int getEquipmentIsDeleted() {
		return equipmentIsDeleted;
	}

	public void setEquipmentIsDeleted(int equipmentIsDeleted) {
		this.equipmentIsDeleted = equipmentIsDeleted;
	}
}
