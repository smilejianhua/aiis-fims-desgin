import java.util.*;

public class NativeFlightLongTermPlan {
	
	private long id;
	private String flightNO;
	private String startAirport;
	private String arriveAirport;
	private Date startTime;
	private Date arriveTime;
	private String IATAName;
	private String ICAOName;
	
	private Schedule schedule;
	
	private boolean isIATA = false;
	
	public boolean isIATA(){
		return isIATA;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFlightNO() {
		return flightNO;
	}

	public void setFlightNO(String flightNO) {
		this.flightNO = flightNO;
	}

	public String getStartLocation() {
		return startAirport;
	}

	public void setStartLocation(String startLocation) {
		this.startAirport = startLocation;
	}

	public String getArriveLocation() {
		return arriveAirport;
	}

	public void setArriveLocation(String arriveLocation) {
		this.arriveAirport = arriveLocation;
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
}
