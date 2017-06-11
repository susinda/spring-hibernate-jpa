package org.susi.spring.hibernate.jpa.exersise.model;

import java.sql.Timestamp;
import java.util.concurrent.TimeUnit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TX_THROTTLE_INFO")
public class ThrottleInfo {


	@Id              
	@Column(name = "THROTTLE_ID")
	@GeneratedValue
	private Long throttleId;
	
	@Column(name = "CUR_COUNT")
	private int curCount;

	@Column(name = "MAX_COUNT")
	private int maxCount;
	
	@Column(name = "LAST_RESET_DATE")
	private Timestamp lastResetDate;
	
	@Column(name = "TIME_WINDOW")
	private int timeWindow;
	
	@Column(name = "TIME_WINDOW_UNIT")
	private TimeUnit timeWindowUnit;
	
	
	public Long getThrottleId() {
		return throttleId;
	}

	public void setThrottleId(Long throttleId) {
		this.throttleId = throttleId;
	}

	public int getCurCount() {
		return curCount;
	}

	public void setCurCount(int curCount) {
		this.curCount = curCount;
	}

	public int getMaxCount() {
		return maxCount;
	}

	public void setMaxCount(int maxCount) {
		this.maxCount = maxCount;
	}

	public Timestamp getLastResetDate() {
		return lastResetDate;
	}

	public void setLastResetDate(Timestamp lastResetDate) {
		this.lastResetDate = lastResetDate;
	}

	public int getTimeWindow() {
		return timeWindow;
	}

	public void setTimeWindow(int timeWindow) {
		this.timeWindow = timeWindow;
	}

	public TimeUnit getTimeWindowUnit() {
		return timeWindowUnit;
	}

	public void setTimeWindowUnit(TimeUnit timeWindowUnit) {
		this.timeWindowUnit = timeWindowUnit;
	}

}

