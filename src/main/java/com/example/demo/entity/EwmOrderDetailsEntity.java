package com.example.demo.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "smart_ewm_order_details")
public class EwmOrderDetailsEntity {
	
	public EwmOrderDetailsEntity() {}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ORDER_ID")
	private int orderId;
	
	@Column(name ="TOTAL_ORDERS")
	private int totalOrder;
	
	@Column(name = "EXECUTED")
	private int executed;
	
	@Column(name  = "REMAINING")
	private int remaining;
	
	@Column(name = "PERCENTAGE")
	private float percentage;
	
	@Column(name = "CDATETIME")
	private String cdatetime;
	
	@Column(name = "ASRS_ORDER_IS_DELETED")
	private int asrsOrderIsDeleted;
	

	public EwmOrderDetailsEntity(int orderId, int totalOrder, int executed, int remaining, float percentage,
			String cdatetime, int asrsOrderIsDeleted) {
		super();
		this.orderId = orderId;
		this.totalOrder = totalOrder;
		this.executed = executed;
		this.remaining = remaining;
		this.percentage = percentage;
		this.cdatetime = cdatetime;
		this.asrsOrderIsDeleted = asrsOrderIsDeleted;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getTotalOrder() {
		return totalOrder;
	}

	public void setTotalOrder(int totalOrder) {
		this.totalOrder = totalOrder;
	}

	public int getExecuted() {
		return executed;
	}

	public void setExecuted(int executed) {
		this.executed = executed;
	}

	public int getRemaining() {
		return remaining;
	}

	public void setRemaining(int remaining) {
		this.remaining = remaining;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	public String getCdatetime() {
		return cdatetime;
	}

	public void setCdatetime(String cdatetime) {
		this.cdatetime = cdatetime;
	}

	public int getAsrsOrderIsDeleted() {
		return asrsOrderIsDeleted;
	}

	public void setAsrsOrderIsDeleted(int asrsOrderIsDeleted) {
		this.asrsOrderIsDeleted = asrsOrderIsDeleted;
	}
	

}
