public interface FlightSeasonService {

	FlightSeason lnkFlightSeason = null;
	
	/**
	 * ���Ӻ�����Ϣ
	 * @param flightSeason
	 */
	public void addFlightSeason(FlightSeason flightSeason);
	
	/**
	 * ɾ��������Ϣ
	 * @param flightSeason
	 */
	public void removeFlightSeason(FlightSeason flightSeason);
	
	/**
	 * ���º�����Ϣ
	 * @param flightSeason
	 */
	public void updateFlightSeason(FlightSeason flightSeason);
}
