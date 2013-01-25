package com.wondersgroup.aiis.fims.vo;

import com.wondersgroup.aiis.fims.model.DailyFlightPlan;

/**
 * 连班值对象，包含两个日航班计划
 * 
 * @author Jacky.Li
 */
public class ConnectingFlight {

	private DailyFlightPlan firstFlightPlan;
	private DailyFlightPlan secondFlightPlan;

	public DailyFlightPlan getFirstFlightPlan() {
		return firstFlightPlan;
	}

	public void setFirstFlightPlan(DailyFlightPlan firstFlightPlan) {
		this.firstFlightPlan = firstFlightPlan;
	}

	public DailyFlightPlan getSecondFlightPlan() {
		return secondFlightPlan;
	}

	public void setSecondFlightPlan(DailyFlightPlan secondFlightPlan) {
		this.secondFlightPlan = secondFlightPlan;
	}
}