import java.util.Date;


public class ViaAirport {
	private long id;
	private DailyFlightPlan dailyFlightPlan;
	private String viaAirport;
	/* 起始时间 */
	private Date ArrivalTime;
	/* 到达时间 */
	private Date DepartureTime;
	/* 经停类型 */
	private String type;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public DailyFlightPlan getDailyFlightPlan() {
		return dailyFlightPlan;
	}

	public void setDailyFlightPlan(DailyFlightPlan dailyFlightPlan) {
		this.dailyFlightPlan = dailyFlightPlan;
	}

	public String getViaAirport() {
		return viaAirport;
	}

	public void setViaAirport(String viaAirport) {
		this.viaAirport = viaAirport;
	}

	public Date getArrivalTime() {
		return ArrivalTime;
	}

	public void setArrivalTime(Date arrivalTime) {
		ArrivalTime = arrivalTime;
	}

	public Date getDepartureTime() {
		return DepartureTime;
	}

	public void setDepartureTime(Date departureTime) {
		DepartureTime = departureTime;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
