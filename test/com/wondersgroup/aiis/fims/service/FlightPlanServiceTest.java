package com.wondersgroup.aiis.fims.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.wondersgroup.aiis.fims.model.FlightLongTermPlan;
import com.wondersgroup.aiis.fims.model.NativeFlightLongTermPlan;
import com.wondersgroup.aiis.fims.utils.DateUtil;

public class FlightPlanServiceTest {
	
	FlightPlanService flightPlanService = null;
	NativeFlightLongTermPlan nativeFlightLongTermPlan = new NativeFlightLongTermPlan(); 
	
	@Before
	public void ready(){
		nativeFlightLongTermPlan.setFlightNO("CES8317");
		nativeFlightLongTermPlan.setOriAirport("ZSSS");
		nativeFlightLongTermPlan.setDestAirport("ZSWX");
		nativeFlightLongTermPlan.setSchTimeOfArrival("0805");
		nativeFlightLongTermPlan.setSchTimeOfDeparture("1110");
		nativeFlightLongTermPlan.setStartTime(DateUtil.getDateFromString("2012-03-28"));
		nativeFlightLongTermPlan.setEndTime(DateUtil.getDateFromString("2012-10-30"));
		nativeFlightLongTermPlan.setCycle("1234567");
//		nativeFlightLongTermPlan.setViaAirport("ZSHC");
//		nativeFlightLongTermPlan.setJoinedFlight("CES168");
		nativeFlightLongTermPlan.setAircraftType("744");
		nativeFlightLongTermPlan.setTrafficType("正班");
		nativeFlightLongTermPlan.setAirLine("上海—杭州—无锡");		
	}
	
	@Test
	public void testCreateFlightLongTermPlan(){
		FlightLongTermPlan fltp01 = flightPlanService.createFlightLongTermPlan(nativeFlightLongTermPlan);
		FlightLongTermPlan fltp02 = flightPlanService.createFlightLongTermPlan(nativeFlightLongTermPlan);
		fltp01.setAirline("上海—北京");
		flightPlanService.modifyFlightLongTermPlan(fltp01);
		assertEquals(fltp01.getAircraftType(),fltp02.getAircraftType());
		assertEquals(fltp01.getDestAirport(),fltp02.getDestAirport());
		assertEquals(2,flightPlanService.getFlightLongTermPlanFromNative(nativeFlightLongTermPlan).size());
	}
	
	@Test
	public void testModifyFlightLongTermPlan(){
		
	}
	

}
