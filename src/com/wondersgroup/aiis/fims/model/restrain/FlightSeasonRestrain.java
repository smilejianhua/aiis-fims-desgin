package com.wondersgroup.aiis.fims.model.restrain;

import com.wondersgroup.aiis.fims.model.FlightSeason;

/**
 * 
 * @author Jacky.Li
 */
public class FlightSeasonRestrain {
	
	private FlightSeason fs;
	
	public FlightSeasonRestrain(FlightSeason fs){
		this.fs = fs;
	}
	
	//是否有效
	public boolean isValid(){
		return false;
	}
}
