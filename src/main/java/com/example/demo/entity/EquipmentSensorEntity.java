package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="equipment_sensor")
public class EquipmentSensorEntity {
	
	public EquipmentSensorEntity() {}
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)

	    @Column(name = "EQUIPMENT_SENSOR_ID")
	    private int equipmentSensorId;

	    @Column(name = "EQUIPMENT_ID")
	     private int equipmentId;

	    @Column(name = "EQUIPMENT_SENSOR_NAME")
	    private String equipmentSensorName;
	    
	    @Column(name="EQUIPMENT_SENSOR_DESC")
	    private String equipmentSensorDesc;
	    
	    @Column(name="SENSOR_DIAGRAM_VIEW")
	    private String sensorDiagramView;
	    
	    @Column(name="EQUIPMENT_SENSOR_TAG")
	    private String equipmentSensorTag;
	    
	    @Column(name="EQUIPMENT_SENSOR_STATUS")
	    private int equipmentSensorStatus;
	    
	    @Column(name="CDATETIME")
	    private String cdatetime;
	    
	    @Column(name="EQUIPMENT_SENSOR_IS_DELETED")
	    private int equipmentSensorIsDeleted;

		public EquipmentSensorEntity(int equipmentSensorId, int equipmentId, String equipmentSensorName,
				String equipmentSensorDesc, String sensorDiagramView, String equipmentSensorTag,
				int equipmentSensorStatus, String cdatetime, int equipmentSensorIsDeleted) {
			super();
			this.equipmentSensorId = equipmentSensorId;
			this.equipmentId = equipmentId;
			this.equipmentSensorName = equipmentSensorName;
			this.equipmentSensorDesc = equipmentSensorDesc;
			this.sensorDiagramView = sensorDiagramView;
			this.equipmentSensorTag = equipmentSensorTag;
			this.equipmentSensorStatus = equipmentSensorStatus;
			this.cdatetime = cdatetime;
			this.equipmentSensorIsDeleted = equipmentSensorIsDeleted;
		}

		public int getEquipmentSensorId() {
			return equipmentSensorId;
		}

		public void setEquipmentSensorId(int equipmentSensorId) {
			this.equipmentSensorId = equipmentSensorId;
		}

		public int getEquipmentId() {
			return equipmentId;
		}

		public void setEquipmentId(int equipmentId) {
			this.equipmentId = equipmentId;
		}

		public String getEquipmentSensorName() {
			return equipmentSensorName;
		}

		public void setEquipmentSensorName(String equipmentSensorName) {
			this.equipmentSensorName = equipmentSensorName;
		}

		public String getEquipmentSensorDesc() {
			return equipmentSensorDesc;
		}

		public void setEquipmentSensorDesc(String equipmentSensorDesc) {
			this.equipmentSensorDesc = equipmentSensorDesc;
		}

		public String getSensorDiagramView() {
			return sensorDiagramView;
		}

		public void setSensorDiagramView(String sensorDiagramView) {
			this.sensorDiagramView = sensorDiagramView;
		}

		public String getEquipmentSensorTag() {
			return equipmentSensorTag;
		}

		public void setEquipmentSensorTag(String equipmentSensorTag) {
			this.equipmentSensorTag = equipmentSensorTag;
		}

		public int getEquipmentSensorStatus() {
			return equipmentSensorStatus;
		}

		public void setEquipmentSensorStatus(int equipmentSensorStatus) {
			this.equipmentSensorStatus = equipmentSensorStatus;
		}

		public String getCdatetime() {
			return cdatetime;
		}

		public void setCdatetime(String cdatetime) {
			this.cdatetime = cdatetime;
		}

		public int getEquipmentSensorIsDeleted() {
			return equipmentSensorIsDeleted;
		}

		public void setEquipmentSensorIsDeleted(int equipmentSensorIsDeleted) {
			this.equipmentSensorIsDeleted = equipmentSensorIsDeleted;
		}

}
