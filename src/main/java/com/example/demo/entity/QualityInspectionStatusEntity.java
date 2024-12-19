package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="quality_inspection_status")
public class QualityInspectionStatusEntity {
	
	public QualityInspectionStatusEntity() {}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "QUALITY_INSPECTION_STATUS_ID")
	private int qualityInspectionStatusId;
	
	@Column(name = "QUALITY_INSPECTION_STATUS_NAME")
	private String qualityInspectionStatusName;
	
	@Column(name = "CDATETIME")
	private String cDatetime;

	public QualityInspectionStatusEntity(int qualityInspectionStatusId, String qualityInspectionStatusName,
			String cDatetime) {
		super();
		this.qualityInspectionStatusId = qualityInspectionStatusId;
		this.qualityInspectionStatusName = qualityInspectionStatusName;
		this.cDatetime = cDatetime;
	}

	public int getQualityInspectionStatusId() {
		return qualityInspectionStatusId;
	}

	public void setQualityInspectionStatusId(int qualityInspectionStatusId) {
		this.qualityInspectionStatusId = qualityInspectionStatusId;
	}

	public String getQualityInspectionStatusName() {
		return qualityInspectionStatusName;
	}

	public void setQualityInspectionStatusName(String qualityInspectionStatusName) {
		this.qualityInspectionStatusName = qualityInspectionStatusName;
	}

	public String getcDatetime() {
		return cDatetime;
	}

	public void setcDatetime(String cDatetime) {
		this.cDatetime = cDatetime;
	}

}
