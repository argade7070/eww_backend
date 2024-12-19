package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="mapping_floor")
public class MappingFloorEntity {
	
	public MappingFloorEntity() {}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "FLOOR_AREA_MAPPING_ID")
	private int floorAreaMappingid;

	@Column(name = "FLOOR_ID")
	private int floorId;

	@Column(name = "FLOOR_NAME")
	private String floorName;
	
	@Column(name = "AREA_ID")
	private int areaId;
	
	@Column(name = "AREA_NAME")
	private String areaName;

	@Column(name = "INFEED_IS_ACTIVE")
	private int infeedIsActive;
	
	@Column(name="OUTFEED_IS_ACTIVE")
	private int outfeedIsActive;
	
	@Column(name="USER_ID")
	private int userId;
	
	@Column(name="USER_NAME")
	private String userName;
}
