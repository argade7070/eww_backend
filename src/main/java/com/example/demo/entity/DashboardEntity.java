package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="dashboard")
public class DashboardEntity {
	
	public DashboardEntity() {}
	
	@Id
	@GeneratedValue(strategy = 	GenerationType.IDENTITY)
	@Column(name = "DASHBOARD_ID")
	private int wmsDashbordId;
	
	@Column(name ="INFEED_COUNT")
	private int infeedCount;
	
	@Column(name = "OUTFEED_COUNT")
	private int outfeedCount;
	
	@Column(name  = "ALARM_COUNT")
	private int alarmCount;
	
	@Column(name = "EMPTY_PALLET_COUNT")
	private int emptyPalletCount;
	
	@Column(name = "CURRENT_STOCK")
	private int currentStock;
	
	@Column(name = "EXPIRED")
	private int expired;
	
	@Column(name = "WITHIN_FIVE_DAYS")
	private int withinFiveDays;
	
	@Column(name = "WITHIN_ONE_MONTH")
	private int withinOneMonth;
	
	@Column(name = "CDATETIME")
	private String cdatetime;

	public DashboardEntity(int wmsDashbordId, int infeedCount, int outfeedCount, int alarmCount, int emptyPalletCount,
			int currentStock, int expired, int withinFiveDays, int withinOneMonth, String cdatetime) {
		super();
		this.wmsDashbordId = wmsDashbordId;
		this.infeedCount = infeedCount;
		this.outfeedCount = outfeedCount;
		this.alarmCount = alarmCount;
		this.emptyPalletCount = emptyPalletCount;
		this.currentStock = currentStock;
		this.expired = expired;
		this.withinFiveDays = withinFiveDays;
		this.withinOneMonth = withinOneMonth;
		this.cdatetime = cdatetime;
	}

	public int getWmsDashbordId() {
		return wmsDashbordId;
	}

	public void setWmsDashbordId(int wmsDashbordId) {
		this.wmsDashbordId = wmsDashbordId;
	}

	public int getInfeedCount() {
		return infeedCount;
	}

	public void setInfeedCount(int infeedCount) {
		this.infeedCount = infeedCount;
	}

	public int getOutfeedCount() {
		return outfeedCount;
	}

	public void setOutfeedCount(int outfeedCount) {
		this.outfeedCount = outfeedCount;
	}

	public int getAlarmCount() {
		return alarmCount;
	}

	public void setAlarmCount(int alarmCount) {
		this.alarmCount = alarmCount;
	}

	public int getEmptyPalletCount() {
		return emptyPalletCount;
	}

	public void setEmptyPalletCount(int emptyPalletCount) {
		this.emptyPalletCount = emptyPalletCount;
	}

	public int getCurrentStock() {
		return currentStock;
	}

	public void setCurrentStock(int currentStock) {
		this.currentStock = currentStock;
	}

	public int getExpired() {
		return expired;
	}

	public void setExpired(int expired) {
		this.expired = expired;
	}

	public int getWithinFiveDays() {
		return withinFiveDays;
	}

	public void setWithinFiveDays(int withinFiveDays) {
		this.withinFiveDays = withinFiveDays;
	}

	public int getWithinOneMonth() {
		return withinOneMonth;
	}

	public void setWithinOneMonth(int withinOneMonth) {
		this.withinOneMonth = withinOneMonth;
	}

	public String getCdatetime() {
		return cdatetime;
	}

	public void setCdatetime(String cdatetime) {
		this.cdatetime = cdatetime;
	}

}
