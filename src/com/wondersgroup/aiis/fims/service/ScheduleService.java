package com.wondersgroup.aiis.fims.service;

import java.io.File;
import java.util.List;

import com.wondersgroup.aiis.fims.model.FlightLongTermPlan;
import com.wondersgroup.aiis.fims.model.NativeFlightLongTermPlan;
import com.wondersgroup.aiis.fims.vo.Schedule;

public interface ScheduleService {
	
	/**
	 * 由文件形成最初状态的Schedule对象，未经检验验证。可有界面展示，并演示审核结果。
	 * 实现方法内进行基本的文件合法性检验。
	 * @param file
	 * @return List<Schedule>对象
	 */
	public List<Schedule> fileToSchedule(File file);
	
	/**
	 * 由Schedule对象反向生成时刻表文件，不推荐使用。
	 * @param schedule
	 * @return
	 */
	public File scheduleToFile(List<Schedule> schedule);
	
	/**
	 * 形成原始航班长期计划，前提要求相应的Schedule对象进行了相关校验。
	 * @param schedule
	 * @return
	 */
	public List<NativeFlightLongTermPlan> transformToNativeFlightLongTermPlan(Schedule schedule, String locationAirport);
		
}
