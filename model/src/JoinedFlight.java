import java.util.Date;

import FileToSchedule.DailyFlightPlan;

public class JoinedFlight {
	
	private long id;
	private DailyFlightPlan dailyFlighPlan;
	/* ������� */
	private String joinedNumber;
	/* ��ʼվ */
	private String OriAirport;
	/* ����վ */
	private String DestAirport;
	/* ��ʼʱ�� */
	private Date ArrivalTime;
	/* ����ʱ�� */
	private Date DepartureTime;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public DailyFlightPlan getDailyFlighPlan() {
		return dailyFlighPlan;
	}

	public void setDailyFlighPlan(DailyFlightPlan dailyFlighPlan) {
		this.dailyFlighPlan = dailyFlighPlan;
	}

	public String getJoinedNumber() {
		return joinedNumber;
	}

	public void setJoinedNumber(String joinedNumber) {
		this.joinedNumber = joinedNumber;
	}

	public String getOriAirport() {
		return OriAirport;
	}

	public void setOriAirport(String oriAirport) {
		OriAirport = oriAirport;
	}

	public String getDestAirport() {
		return DestAirport;
	}

	public void setDestAirport(String destAirport) {
		DestAirport = destAirport;
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
}
