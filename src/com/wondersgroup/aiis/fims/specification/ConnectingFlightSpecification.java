package com.wondersgroup.aiis.fims.specification;

import java.util.List;

import com.wondersgroup.aiis.fims.model.DailyFlightPlan;
import com.wondersgroup.aiis.fims.specification.connection.ConnectionFlightRule;
import com.wondersgroup.aiis.fims.vo.ConnectingFlight;

/**
 * 自动连班规则判定
 * @author Jacky.Li
 */
public class ConnectingFlightSpecification {
	
	private DailyFlightPlan firstFlightPlan;
	private DailyFlightPlan secondFlightPlan;
	private List<ConnectionFlightRule> connectionFlightRule;
	private ConnectingFlight connectingFlight;
	
	public ConnectingFlightSpecification(DailyFlightPlan firstFlightPlan, DailyFlightPlan secondFlightPlan){
		this.firstFlightPlan = firstFlightPlan;
		this.secondFlightPlan = secondFlightPlan;
	}
	
	/**
	 * 初期确定两个日计划是一个进港、一个离港，否则不存在连班可能
	 * @return
	 */
	public boolean init(){
		return false;
	}
	
	/**
	 * 根据机号进行连班安排
	 * @return
	 */
	public boolean isConnectionFlightByAircraftReg(){
		return false;
	}

	/**
	 * 根据航班号来判断是否连班
	 * @return
	 */
	public boolean isConnectionFlightByFlightNO(){
		return false;
	}
	
	/**
	 * 根据历史数据进行连班
	 * @return
	 */
	public boolean isConnectionFlightByHistory(){
		return false;
	}
	
	/**
	 * 根据起降机场进行连班
	 * @return
	 */
	public boolean isConnectionFlightByAirport(){
		return false;
	}
	
	
}
