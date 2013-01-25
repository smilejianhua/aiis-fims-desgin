package com.wondersgroup.aiis.fims.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.wondersgroup.aiis.fims.model.NativeFlightLongTermPlan;
import com.wondersgroup.aiis.fims.service.impl.ScheduleServiceImpl;
import com.wondersgroup.aiis.fims.vo.Schedule;

public class ScheduleServiceTest {
	
	private Schedule schedule = new Schedule();
	private ScheduleService scheduleService = new ScheduleServiceImpl();
	
	@Before
	public void ready(){		
		schedule.setFlightNO("CES8317/7/8/8");
		schedule.setAirport01("ZSSS");		
		schedule.setAirport01up("0805");
		schedule.setAirport01down("0920");
		schedule.setAirport02("ZSHC");
		schedule.setAirport02up("1010");
		schedule.setAirport02down("1110");
		schedule.setAirport03("ZSWZ");
		schedule.setAirport03up("1530");
		schedule.setAirport03down("1630");
		schedule.setAirport04("ZSHC");
		schedule.setAirport04up("1720");
		schedule.setAirport04down("1830");
		schedule.setAirport05("ZSSS");
		schedule.setStartTime(null);
		schedule.setEndTime(null);
		schedule.setCycle("1234..7");
	}
	
	@Test
	public void testScheduleToNativeLongFlightPlan(){
		List<NativeFlightLongTermPlan> list01 = scheduleService.transformToNativeFlightLongTermPlan(schedule, "ZSSS");
		assertEquals(2,list01.size());
		assertEquals("CES8317",list01.get(0).getFlightNO());
		assertEquals("ZSSS",list01.get(0).getOriAirport());
		List<NativeFlightLongTermPlan> list02 = scheduleService.transformToNativeFlightLongTermPlan(schedule, "ZSHC");
		assertEquals(4,list02.size());
	}
	
	@Test
	public void testGetLongFlightPlanFromNative(){
		
	}
	
	
}
