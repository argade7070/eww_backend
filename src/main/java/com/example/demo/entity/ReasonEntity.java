package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="reason")
public class ReasonEntity {
	
	public ReasonEntity() {}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "REASON_ID")
	private int reasonId;

	
	@Column(name = "OPERATOR_ACTIONS")
	private String operatorAction;


	@Column(name = "REASON")
	private String reason;

	
	@Column(name = "CDATETIME")
	private String cdatetime;

	@Column(name = "REASON_IS_DELETED")
	private int reasonIsDeleted;

	public ReasonEntity(int reasonId, String operatorAction, String reason, String cdatetime, int reasonIsDeleted) {
		super();
		this.reasonId = reasonId;
		this.operatorAction = operatorAction;
		this.reason = reason;
		this.cdatetime = cdatetime;
		this.reasonIsDeleted = reasonIsDeleted;
	}

	public int getReasonId() {
		return reasonId;
	}

	public void setReasonId(int reasonId) {
		this.reasonId = reasonId;
	}

	public String getOperatorAction() {
		return operatorAction;
	}

	public void setOperatorAction(String operatorAction) {
		this.operatorAction = operatorAction;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getCdatetime() {
		return cdatetime;
	}

	public void setCdatetime(String cdatetime) {
		this.cdatetime = cdatetime;
	}

	public int getReasonIsDeleted() {
		return reasonIsDeleted;
	}

	public void setReasonIsDeleted(int reasonIsDeleted) {
		this.reasonIsDeleted = reasonIsDeleted;
	}
	
}
