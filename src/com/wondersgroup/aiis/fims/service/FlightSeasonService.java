package com.wondersgroup.aiis.fims.service;

import com.wondersgroup.aiis.fims.model.FlightSeason;

public interface FlightSeasonService {
	
	/**
	 * @param flightSeason
	 */
	public void addFlightSeason(FlightSeason flightSeason);
	
	/**
	 * @param flightSeason
	 */
	public void removeFlightSeason(FlightSeason flightSeason);
	
	/**
	 * @param flightSeason
	 */
	public void updateFlightSeason(FlightSeason flightSeason);

}
