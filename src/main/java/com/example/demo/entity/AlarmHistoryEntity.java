package com.example.demo.entity;




import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

@Entity
@Table(name="alarm_history")
public class AlarmHistoryEntity {

	public AlarmHistoryEntity() {}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ALARM_HISTORY_ID")
	private int alarmHistoryId;
	
	@Positive(message = "equipmentId must zero or more")
	@Column(name = "EQUIPMENT_ID")
	private int equipmentId;
	
	@Column(name = "EQUIPMENT_NAME")
	@NotBlank(message = "equipmentName is mandatory")
	private String equipmentName;
	
	@Column(name = "EQUIPMENT_DESC")
	@NotBlank(message = "equipemetDesc is mandatory")
	private String equipmentDesc;
	
	@Column(name = "EQUIPMENT_ALARM_ID")
	@Positive(message = "equipmentAlarmId must be zero or more")
	private int equipmentAlarmId;
	
	@Column(name = "EQUIPMENT_ALARM_NAME")
	@NotBlank(message = "equipmentAlarmName is mandatory")
	private String equipmentAlarmName;
	
	@Column(name = "EQUIPMENT_ALARM_DESC")
	@NotBlank(message = "equipmentAlarmDesc is mandatory")
	private String equipmentAlarmDesc;
	
	@Column(name = "EQUIPMENT_ALARM_OCCURRED_DATETIME")
	@DateTimeFormat(pattern = "YYYY-MM-DD")
	@NotNull(message = "equipmentAlarmOccurredDateTime is mandatory")
	private String equipmentAlarmOccurredDateTime;
	
	@Column(name = "EQUIPMENT_ALARM_RESOLVED_DATETIME")
	@DateTimeFormat(pattern = "YYYY-MM-DD")
	@NotNull(message = "equipmentAlarmResolvedDateTime is mandatory")
	private String equipmentAlarmResolvedDateTime;
	
	@Positive(message = "equipmentAlarmStatus must zero or more")
	@Max(1)
	@Column(name = "EQUIPMENT_ALARM_STATUS")
	private int equipmentAlarmStatus;

	public AlarmHistoryEntity(int alarmHistoryId, @Positive(message = "equipmentId must zero or more") int equipmentId,
			@NotBlank(message = "equipmentName is mandatory") String equipmentName,
			@NotBlank(message = "equipemetDesc is mandatory") String equipmentDesc,
			@Positive(message = "equipmentAlarmId must be zero or more") int equipmentAlarmId,
			@NotBlank(message = "equipmentAlarmName is mandatory") String equipmentAlarmName,
			@NotBlank(message = "equipmentAlarmDesc is mandatory") String equipmentAlarmDesc,
			@NotNull(message = "equipmentAlarmOccurredDateTime is mandatory") String equipmentAlarmOccurredDateTime,
			@NotNull(message = "equipmentAlarmResolvedDateTime is mandatory") String equipmentAlarmResolvedDateTime,
			@Positive(message = "equipmentAlarmStatus must zero or more") @Max(1) int equipmentAlarmStatus) {
		super();
		this.alarmHistoryId = alarmHistoryId;
		this.equipmentId = equipmentId;
		this.equipmentName = equipmentName;
		this.equipmentDesc = equipmentDesc;
		this.equipmentAlarmId = equipmentAlarmId;
		this.equipmentAlarmName = equipmentAlarmName;
		this.equipmentAlarmDesc = equipmentAlarmDesc;
		this.equipmentAlarmOccurredDateTime = equipmentAlarmOccurredDateTime;
		this.equipmentAlarmResolvedDateTime = equipmentAlarmResolvedDateTime;
		this.equipmentAlarmStatus = equipmentAlarmStatus;
	}

	public int getAlarmHistoryId() {
		return alarmHistoryId;
	}

	public void setAlarmHistoryId(int alarmHistoryId) {
		this.alarmHistoryId = alarmHistoryId;
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

	public int getEquipmentAlarmId() {
		return equipmentAlarmId;
	}

	public void setEquipmentAlarmId(int equipmentAlarmId) {
		this.equipmentAlarmId = equipmentAlarmId;
	}

	public String getEquipmentAlarmName() {
		return equipmentAlarmName;
	}

	public void setEquipmentAlarmName(String equipmentAlarmName) {
		this.equipmentAlarmName = equipmentAlarmName;
	}

	public String getEquipmentAlarmDesc() {
		return equipmentAlarmDesc;
	}

	public void setEquipmentAlarmDesc(String equipmentAlarmDesc) {
		this.equipmentAlarmDesc = equipmentAlarmDesc;
	}

	public String getEquipmentAlarmOccurredDateTime() {
		return equipmentAlarmOccurredDateTime;
	}

	public void setEquipmentAlarmOccurredDateTime(String equipmentAlarmOccurredDateTime) {
		this.equipmentAlarmOccurredDateTime = equipmentAlarmOccurredDateTime;
	}

	public String getEquipmentAlarmResolvedDateTime() {
		return equipmentAlarmResolvedDateTime;
	}

	public void setEquipmentAlarmResolvedDateTime(String equipmentAlarmResolvedDateTime) {
		this.equipmentAlarmResolvedDateTime = equipmentAlarmResolvedDateTime;
	}

	public int getEquipmentAlarmStatus() {
		return equipmentAlarmStatus;
	}

	public void setEquipmentAlarmStatus(int equipmentAlarmStatus) {
		this.equipmentAlarmStatus = equipmentAlarmStatus;
	}

	
	
}
