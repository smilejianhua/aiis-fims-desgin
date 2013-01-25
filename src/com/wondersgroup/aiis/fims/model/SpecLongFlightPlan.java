package com.wondersgroup.aiis.fims.model;

import java.util.Date;

/**
 * 特殊长期航班计划
 * 
 * @author Jacky.Li
 */
public class SpecLongFlightPlan {

	private long id;
	private String name;
	private Date startTime;
	private Date endTime;
	/* 枚举执行日期存储 */
	private Date[] executeTime;
	private String flightNO;
	private String companyName;
	private String airplaneNO;
	private String airplaneType;
	private String leaveAirport;
	private String arriveAirport;
	private Date leaveTime;
	private Date arriveTime;
	/* 批文号 */
	private String approvalNumber;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}



}
