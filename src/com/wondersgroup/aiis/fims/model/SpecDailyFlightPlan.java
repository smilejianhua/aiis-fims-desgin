package com.wondersgroup.aiis.fims.model;

/**
 * 特殊日航班计划
 * 
 * @author Jacky.Li
 */
public class SpecDailyFlightPlan {

	private long id;
	private SpecLongFlightPlan specLongFlightPlan;
	private String flightNO;
	private String airplaneNO;
	/* 航班性质：包括正班、补班等等 */
	private String flightNature;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public SpecLongFlightPlan getSpecLongFlightPlan() {
		return specLongFlightPlan;
	}

	public void setSpecLongFlightPlan(SpecLongFlightPlan specLongFlightPlan) {
		this.specLongFlightPlan = specLongFlightPlan;
	}

	public String getFlightNO() {
		return flightNO;
	}

	public void setFlightNO(String flightNO) {
		this.flightNO = flightNO;
	}

	public String getAirplaneNO() {
		return airplaneNO;
	}

	public void setAirplaneNO(String airplaneNO) {
		this.airplaneNO = airplaneNO;
	}

	public String getFlightNature() {
		return flightNature;
	}

	public void setFlightNature(String flightNature) {
		this.flightNature = flightNature;
	}

}
