import java.util.Date;

public class FlightLongTemPlan {
	
	private long id;
	/* 原始长计划 */
	private NativeFlightLongTermPlan oriLongFlightPlan;
	private String flightNO;
	private String startAirport;
	private String arriveAirport;
	private Date startTime;
	private Date arriveTime;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public NativeFlightLongTermPlan getOriLongFlightPlan() {
		return oriLongFlightPlan;
	}

	public void setOriLongFlightPlan(NativeFlightLongTermPlan oriLongFlightPlan) {
		this.oriLongFlightPlan = oriLongFlightPlan;
	}

	public String getFlightNO() {
		return flightNO;
	}

	public void setFlightNO(String flightNO) {
		this.flightNO = flightNO;
	}

	public String getStartAirport() {
		return startAirport;
	}

	public void setStartAirport(String startAirport) {
		this.startAirport = startAirport;
	}

	public String getArriveAirport() {
		return arriveAirport;
	}

	public void setArriveAirport(String arriveAirport) {
		this.arriveAirport = arriveAirport;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getArriveTime() {
		return arriveTime;
	}

	public void setArriveTime(Date arriveTime) {
		this.arriveTime = arriveTime;
	}

	public String getIATAName() {
		return IATAName;
	}

	public void setIATAName(String iATAName) {
		IATAName = iATAName;
	}

	public String getICAOName() {
		return ICAOName;
	}

	public void setICAOName(String iCAOName) {
		ICAOName = iCAOName;
	}

	private String IATAName;
	private String ICAOName;
}
