package com.wondersgroup.aiis.fims.service;

import java.util.List;

import com.wondersgroup.aiis.fims.model.DailyFlightPlan;
import com.wondersgroup.aiis.fims.model.FlightInfo;

public interface FlightInfoService {
	
	/**
	 * 由单条日航班计划转换成航班信息
	 * @param dailyFlightPlan
	 * @return
	 */
	public FlightInfo create(DailyFlightPlan dailyFlightPlan);
	
	/**
	 * 由一组日航班计划转换成一组航班信息计划
	 * @param dailyFlightPlan
	 * @return
	 */
	public List<FlightInfo> create(List<DailyFlightPlan> dailyFlightPlan);
	
}
