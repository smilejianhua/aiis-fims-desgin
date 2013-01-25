package com.wondersgroup.aiis.fims.specification;

import com.wondersgroup.aiis.fims.vo.Schedule;

/**
 * 时刻表校验类，明确时刻表是否符合相应规定
 * @author Jacky.Li
 *
 */
public class ScheduleSpecification {
	
	private Schedule schedule;
	private boolean result = false;
		
	public ScheduleSpecification(Schedule schedule){
		this.schedule = schedule;
	}
	
	/**
	 * 最终返回校验结果
	 * @return
	 */
	public boolean isValid(){
		isFlightNOLegal();
		isCircleLegal();		
		if(result == true){
			schedule.setValid(true);
		}
		return result; 		
	}
	
	/**
	 * 航班号符合性校验
	 * @return
	 */
	private void isFlightNOLegal(){
		result = false;
	}
	
	/**
	 * 周期有效性校验
	 * @return
	 */
	private void isCircleLegal(){
		result = false;;
	}

}
