package com.example.demo.entity;

import java.util.List;

public class RackPosition {

	int rackId;
	List<PositionEntity> position;
	
	public int getRackId() {
		return rackId;
	}
	public void setRackId(int rackId) {
		this.rackId = rackId;
	}
	public List<PositionEntity> getPosition() {
		return position;
	}
	public void setPosition(List<PositionEntity> position) {
		this.position = position;
	}
	
	
}
