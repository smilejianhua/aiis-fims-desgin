package com.wondersgroup.aiis.fims.vo;

import java.util.Date;

import com.wondersgroup.aiis.fims.model.DailyFlightPlan;

/**
 * 共享航班信息表，和日航班计划（航班信息）关联，作为值对象表述。
 * 
 * @author Jacky.Li
 */
public class CodeShare {

	private long id;
	private DailyFlightPlan dailyFlightPlan;
	/* 共享代码 */
	private String codeShare;
	/* 起始站 */
	private String oriAirport;
	/* 到达站 */
	private String destAirport;
	/* 起始时间 */
	private Date timeOfArrival;
	/* 到达时间 */
	private Date timeOfDepartment;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public DailyFlightPlan getDailyFlighPlan() {
		return dailyFlightPlan;
	}

	public void setDailyFlighPlan(DailyFlightPlan dailyFlighPlan) {
		this.dailyFlightPlan = dailyFlighPlan;
	}

	public String getCodeShare() {
		return codeShare;
	}

	public void setCodeShare(String codeShare) {
		this.codeShare = codeShare;
	}

	public String getOriAirport() {
		return oriAirport;
	}

	public void setOriAirport(String oriAirport) {
		this.oriAirport = oriAirport;
	}

	public String getDestAirport() {
		return destAirport;
	}

	public void setDestAirport(String destAirport) {
		this.destAirport = destAirport;
	}

	public Date getTimeOfArrival() {
		return timeOfArrival;
	}

	public void setTimeOfArrival(Date timeOfArrival) {
		this.timeOfArrival = timeOfArrival;
	}

	public Date getTimeOfDepartment() {
		return timeOfDepartment;
	}

	public void setTimeOfDepartment(Date timeOfDepartment) {
		this.timeOfDepartment = timeOfDepartment;
	}

}
