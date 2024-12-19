package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="alarm_troubleshot")
public class AlarmTroubleshotEntity {
	
	public AlarmTroubleshotEntity() {}
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "ALARM_TROUBLESHOOT_ID")
    private int alarmTroubleshootId;

    @Column(name = "EQUIPMENT_ALARM_ID")
     private int equipmentAlarmId;

    @Column(name = "ALARM_RESOLVE_STEPS")
    private String alarmResolveSteps;

	public AlarmTroubleshotEntity(int alarmTroubleshootId, int equipmentAlarmId, String alarmResolveSteps) {
		super();
		this.alarmTroubleshootId = alarmTroubleshootId;
		this.equipmentAlarmId = equipmentAlarmId;
		this.alarmResolveSteps = alarmResolveSteps;
	}

	public int getAlarmTroubleshootId() {
		return alarmTroubleshootId;
	}

	public void setAlarmTroubleshootId(int alarmTroubleshootId) {
		this.alarmTroubleshootId = alarmTroubleshootId;
	}

	public int getEquipmentAlarmId() {
		return equipmentAlarmId;
	}

	public void setEquipmentAlarmId(int equipmentAlarmId) {
		this.equipmentAlarmId = equipmentAlarmId;
	}

	public String getAlarmResolveSteps() {
		return alarmResolveSteps;
	}

	public void setAlarmResolveSteps(String alarmResolveSteps) {
		this.alarmResolveSteps = alarmResolveSteps;
	}
    
}
