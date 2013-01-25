package com.wondersgroup.aiis.fims.service;

import java.util.Date;
import java.util.List;

import com.wondersgroup.aiis.fims.model.FlightLongTermPlan;
import com.wondersgroup.aiis.fims.model.DailyFlightPlan;
import com.wondersgroup.aiis.fims.model.NativeFlightLongTermPlan;

/**
 * 航班计划支持服务，贯穿原始长航班计划审核形成长航班计划，修正长航班计划，由长航班计划拆分成为日航班计划等步骤。
 * @author Jacky.Li
 */
public interface FlightPlanService {
	
	/**
	 * 通过原始长期航班计划形成长期航班计划
	 * @return FlightLongTermPlan
	 */
	public FlightLongTermPlan createFlightLongTermPlan(NativeFlightLongTermPlan nativeFlightLongTermPlan);
	
	/**
	 * 新增长期计划
	 * @param flightLongTermPlan
	 */
	public void createFlightLongTermPlan(FlightLongTermPlan flightLongTermPlan);
	
	/**
	 * 修改长期航班计划，根据最新信息进行Update，如无更新信息则保留原信息。
	 * @param flightLongTermPlan
	 * @return FlightLongTermPlan
	 */
	public FlightLongTermPlan modifyFlightLongTermPlan(FlightLongTermPlan flightLongTermPlan);
	
	/**
	 * 通过时间获得相应的长起航班计划信息
	 * @param date
	 * @return
	 */
	public List<FlightLongTermPlan> getFlightLongTermPlanByDate(Date date);
	
	/**
	 * 通过原始长期航班计划获得其生成的长期航班计划（最新版）
	 * @param nativeFlightLongTermPlan
	 * @return List<FlightLongTermPlan>
	 */
	public List<FlightLongTermPlan> getFlightLongTermPlanFromNative(NativeFlightLongTermPlan nativeFlightLongTermPlan);
	
	/**
	 * 拆分长航班计划，形成日航班计划
	 * @param flightLongTermPlan
	 * @return List<FlightPlan>
	 */
	public List<DailyFlightPlan> splitFlightLongTermPlan(FlightLongTermPlan flightLongTermPlan); 
	
	/**
	 * 复制日航班计划，同批航班复制需要自动更改航班号、起站、达站信息；
	 * @param flightPlan
	 * @return
	 */
	public DailyFlightPlan copyFlightPlan(DailyFlightPlan flightPlan);
	
	/**
	 * 删除日航班计划
	 * @param flightPlan
	 */
	public void removeFlightPlan(DailyFlightPlan flightPlan);
	

}
