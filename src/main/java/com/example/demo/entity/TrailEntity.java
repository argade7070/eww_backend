package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="trail")
public class TrailEntity {

	public TrailEntity() {}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TRAIL_ID")
	private int auditId;

	
	@Column(name = "OPERATORS_ACTION")
	private String operatorActions;

	
	@Column(name = "FIELD")
	private String field;

	
	@Column(name = "REASON")
	private String reason;

	
	@Column(name = "BEFORE_VALUE")
	private int beforeValue;

	
	@Column(name = "AFTER_VALUE")
	private int afterValue;
	
	@Column(name = "USER_ID")
	private int userId;

	
	@Column(name = "USER_NAME")
	private String username;

	
	@Column(name = "CDATETIME")
	private String datetimeC;


	public TrailEntity(int auditId, String operatorActions, String field, String reason, int beforeValue,
			int afterValue, int userId, String username, String datetimeC) {
		super();
		this.auditId = auditId;
		this.operatorActions = operatorActions;
		this.field = field;
		this.reason = reason;
		this.beforeValue = beforeValue;
		this.afterValue = afterValue;
		this.userId = userId;
		this.username = username;
		this.datetimeC = datetimeC;
	}


	public int getAuditId() {
		return auditId;
	}


	public void setAuditId(int auditId) {
		this.auditId = auditId;
	}


	public String getOperatorActions() {
		return operatorActions;
	}


	public void setOperatorActions(String operatorActions) {
		this.operatorActions = operatorActions;
	}


	public String getField() {
		return field;
	}


	public void setField(String field) {
		this.field = field;
	}


	public String getReason() {
		return reason;
	}


	public void setReason(String reason) {
		this.reason = reason;
	}


	public int getBeforeValue() {
		return beforeValue;
	}


	public void setBeforeValue(int beforeValue) {
		this.beforeValue = beforeValue;
	}


	public int getAfterValue() {
		return afterValue;
	}


	public void setAfterValue(int afterValue) {
		this.afterValue = afterValue;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getDatetimeC() {
		return datetimeC;
	}


	public void setDatetimeC(String datetimeC) {
		this.datetimeC = datetimeC;
	}
	
	
}
