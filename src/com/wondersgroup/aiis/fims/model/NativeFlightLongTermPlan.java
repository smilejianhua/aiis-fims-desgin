package com.wondersgroup.aiis.fims.model;

import java.util.Date;
import java.util.List;

import com.wondersgroup.aiis.fims.vo.CodeShare;
import com.wondersgroup.aiis.fims.vo.ViaAirport;

/**
 * 原始长航班计划
 * 
 * @author Jacky.Li
 * 
 */
public class NativeFlightLongTermPlan {

	private long id;
	/* 航班号 */
	private String flightNO;
	/* 起始站 */
	private String oriAirport;
	/* 到达站 */
	private String destAirport;
	/* 计划起飞时间 */
	private String schTimeOfArrival;
	/* 计划降落时间 */
	private String schTimeOfDeparture;
	/* 计划开始时间 */
	private Date startTime;
	/* 计划结束时间 */
	private Date endTime;
	/* 经停机场 */
	private List<ViaAirport> viaAirport;
	/* 共享航班 */
	private List<CodeShare> joinedFlight;
	/* 机型 */
	private String aircraftType;
	/* 班期 */
	private String cycle;
	/* 航班性质 ，正班、补班等 */
	private String trafficType;
	/* 航线 */
	private String airLine;
	/* 备注 */
	private String comment;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFlightNO() {
		return flightNO;
	}

	public void setFlightNO(String flightNO) {
		this.flightNO = flightNO;
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

	public String getSchTimeOfArrival() {
		return schTimeOfArrival;
	}

	public void setSchTimeOfArrival(String schTimeOfArrival) {
		this.schTimeOfArrival = schTimeOfArrival;
	}

	public String getSchTimeOfDeparture() {
		return schTimeOfDeparture;
	}

	public void setSchTimeOfDeparture(String schTimeOfDeparture) {
		this.schTimeOfDeparture = schTimeOfDeparture;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public List<ViaAirport> getViaAirport() {
		return viaAirport;
	}

	public void setViaAirport(List<ViaAirport> viaAirport) {
		this.viaAirport = viaAirport;
	}

	public List<CodeShare> getJoinedFlight() {
		return joinedFlight;
	}

	public void setJoinedFlight(List<CodeShare> joinedFlight) {
		this.joinedFlight = joinedFlight;
	}

	public String getAircraftType() {
		return aircraftType;
	}

	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}

	public String getTrafficType() {
		return trafficType;
	}

	public void setTrafficType(String trafficType) {
		this.trafficType = trafficType;
	}

	public String getAirLine() {
		return airLine;
	}

	public void setAirLine(String airLine) {
		this.airLine = airLine;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getCycle() {
		return cycle;
	}

	public void setCycle(String cycle) {
		this.cycle = cycle;
	}

}
