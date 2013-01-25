package com.wondersgroup.aiis.fims.model;

import java.util.Date;
import java.util.List;

import com.wondersgroup.aiis.fims.vo.CodeShare;
import com.wondersgroup.aiis.fims.vo.ViaAirport;

public class FlightLongTermPlan {
	
	private long id;
	/* 原始长计划 */
	private NativeFlightLongTermPlan nativeFlightLongTermPlan;
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
	private List<CodeShare> codeShare;
	/* 机型 */
	private String aircraftType;
	/* 航班性质 ，正班、补班等 */
	private String flightNature;
	/* 班期 */
	private String frequency;
	/* 航线 */
	private String airline;
	/* 备注 */
	private String comment;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public NativeFlightLongTermPlan getNativeFlightLongTermPlan() {
		return nativeFlightLongTermPlan;
	}

	public void setNativeFlightLongTermPlan(NativeFlightLongTermPlan nativeFlightLongTermPlan) {
		this.nativeFlightLongTermPlan = nativeFlightLongTermPlan;
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

	public List<CodeShare> getCodeShare() {
		return codeShare;
	}

	public void setCodeShare(List<CodeShare> codeShare) {
		this.codeShare = codeShare;
	}

	public String getAircraftType() {
		return aircraftType;
	}

	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}

	public String getFlightNature() {
		return flightNature;
	}

	public void setFlightNature(String flightNature) {
		this.flightNature = flightNature;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
