package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="stacker_position")
public class StackerPositionEntity {
	
	public StackerPositionEntity() {}

	@Id
	@GeneratedValue(strategy = 	GenerationType.IDENTITY)
	
	@Column(name = "STACKER_POSITION_ID")
	private int stackerPositionId;
	
	@Column(name = "EQUIPMENT_ID")
	private int equipmentId;
	
	@Column(name="STACKER_IS_PRESENT")
	private int stackerIsPresent;
	
	@Column(name = "MIN_VALUE")
	private int minValue;
	
	@Column(name="MAX_VALUE")
	private int maxValue;

	public StackerPositionEntity(int stackerPositionId, int equipmentId, int stackerIsPresent, int minValue,
			int maxValue) {
		super();
		this.stackerPositionId = stackerPositionId;
		this.equipmentId = equipmentId;
		this.stackerIsPresent = stackerIsPresent;
		this.minValue = minValue;
		this.maxValue = maxValue;
	}

	public int getStackerPositionId() {
		return stackerPositionId;
	}

	public void setStackerPositionId(int stackerPositionId) {
		this.stackerPositionId = stackerPositionId;
	}

	public int getEquipmentId() {
		return equipmentId;
	}

	public void setEquipmentId(int equipmentId) {
		this.equipmentId = equipmentId;
	}

	public int getStackerIsPresent() {
		return stackerIsPresent;
	}

	public void setStackerIsPresent(int stackerIsPresent) {
		this.stackerIsPresent = stackerIsPresent;
	}

	public int getMinValue() {
		return minValue;
	}

	public void setMinValue(int minValue) {
		this.minValue = minValue;
	}

	public int getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(int maxValue) {
		this.maxValue = maxValue;
	}
}
