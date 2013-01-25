package com.wondersgroup.aiis.fims.model;

import java.util.Date;
import java.util.List;

import com.wondersgroup.aiis.fims.vo.CodeShare;
import com.wondersgroup.aiis.fims.vo.ViaAirport;

/**
 * 日航班计划模型，由长航班计划拆分而成。可以通过FlightPlanService进行数据、信息更新，但必须保证和源长期计划的关联和
 * 
 * @author Jacky.Li
 */
public class DailyFlightPlan implements ConnectionFlight {

	private long id;
	private FlightLongTermPlan flightLongTermPlan;
	/* 进离港标示 */
	private String flag;
	/* 航班号 */
	private String flightNO;
	/* 航班状态 ，有三个可选值Scheduled计划、Operation营运、Not Perform不执行 */
	private String status;
	/* 机号 */
	private String aircraftReg;
	/* 机型 */
	private String aircraftType;
	/* 航班属性，国际 International、国内 National、地区Region、混合Mixed */
	private String flightType;
	/* 航班性质 ，正班、补班等 */
	private String flightNature;
	/* 起始站 */
	private String oriAirport;
	/* 到达站 */
	private String destAirport;
	/* 计划起飞时间 */
	private Date schTimeOfArrival;
	/* 计划降落时间 */
	private Date schTimeOfDeparture;
	/* 共享航班 */
	private List<CodeShare> codeShare;
	/* 经停机场 */
	private List<ViaAirport> viaAirport;
	/* 是否连班 */
	private boolean isConnectionFlight;
	/* 备注 */
	private String comment;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public FlightLongTermPlan getFlightLongTermPlan() {
		return flightLongTermPlan;
	}

	public void setFlightLongTermPlan(FlightLongTermPlan flightLongTermPlan) {
		this.flightLongTermPlan = flightLongTermPlan;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getFlightNO() {
		return flightNO;
	}

	public void setFlightNO(String flightNO) {
		this.flightNO = flightNO;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAircraftReg() {
		return aircraftReg;
	}

	public void setAircraftReg(String aircraftReg) {
		this.aircraftReg = aircraftReg;
	}

	public String getAircraftType() {
		return aircraftType;
	}

	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}

	public String getFlightType() {
		return flightType;
	}

	public void setFlightType(String flightType) {
		this.flightType = flightType;
	}

	public String getFlightNature() {
		return flightNature;
	}

	public void setFlightNature(String flightNature) {
		this.flightNature = flightNature;
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

	public Date getSchTimeOfArrival() {
		return schTimeOfArrival;
	}

	public void setSchTimeOfArrival(Date schTimeOfArrival) {
		this.schTimeOfArrival = schTimeOfArrival;
	}

	public Date getSchTimeOfDeparture() {
		return schTimeOfDeparture;
	}

	public void setSchTimeOfDeparture(Date schTimeOfDeparture) {
		this.schTimeOfDeparture = schTimeOfDeparture;
	}

	public List<CodeShare> getCodeShare() {
		return codeShare;
	}

	public void setCodeShare(List<CodeShare> codeShare) {
		this.codeShare = codeShare;
	}

	public List<ViaAirport> getViaAirport() {
		return viaAirport;
	}

	public void setViaAirport(List<ViaAirport> viaAirport) {
		this.viaAirport = viaAirport;
	}

	public boolean isConnectionFlight() {
		return isConnectionFlight;
	}

	public void setConnectionFlight(boolean isConnectionFlight) {
		this.isConnectionFlight = isConnectionFlight;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}