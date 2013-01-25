public interface FlightSeasonService {

	FlightSeason lnkFlightSeason = null;
	
	/**
	 * 增加航季信息
	 * @param flightSeason
	 */
	public void addFlightSeason(FlightSeason flightSeason);
	
	/**
	 * 删除航季信息
	 * @param flightSeason
	 */
	public void removeFlightSeason(FlightSeason flightSeason);
	
	/**
	 * 更新航季信息
	 * @param flightSeason
	 */
	public void updateFlightSeason(FlightSeason flightSeason);
}
