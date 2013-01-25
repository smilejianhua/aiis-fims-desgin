package com.wondersgroup.aiis.fims.service.impl;

import java.io.File;
import java.util.List;

import com.wondersgroup.aiis.fims.model.NativeFlightLongTermPlan;
import com.wondersgroup.aiis.fims.service.ScheduleService;
import com.wondersgroup.aiis.fims.utils.schedule.ExcelToSchedule;
import com.wondersgroup.aiis.fims.utils.schedule.FileToSchedule;
import com.wondersgroup.aiis.fims.vo.Schedule;

public class ScheduleServiceImpl implements ScheduleService {
	
	private FileToSchedule fs = new ExcelToSchedule();
	
	@Override
	public List<Schedule> fileToSchedule(File file) {
		return null;
	}
	
	@Override
	public File scheduleToFile(List<Schedule> schedule) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void setFileToSchedule(FileToSchedule fs){
		this.fs = fs;
	}

	@Override
	public List<NativeFlightLongTermPlan> transformToNativeFlightLongTermPlan(Schedule schedule, String locationAirport) {
		// TODO Auto-generated method stub
		return null;
	}

}
