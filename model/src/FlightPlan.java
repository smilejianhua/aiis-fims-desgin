import java.util.List;

public class FlightPlan {
	
	private long id;
	private FlightLongTemPlan longFlightPlan;
	/* ����۱�ʾ */
	private String flag;
	/* ����� */
	private String flightNO;
	/* ����״̬ ����������ѡֵScheduled�ƻ���OperationӪ�ˡ�Not Perform��ִ��*/
	private String status;
	/* ���� */
	private String aircraftReg;
	/* ���� */
	private String aircraftType;
	/* �������ԣ����� International������ National������Region�����Mixed */
	private String flightType;
	/* �������� */
	private String trafficType;
	/* ��ʼվ */
	private String OriAirport;
	/* ����վ */
	private String DestAirport;
	/* ��ע */
	private String comment;	
	/* ������ */
	private List<JoinedFlight> joinedFlight;
	/* ��ͣ���� */
	private List<ViaAirport> viaAirport;

	public FlightLongTemPlan getLongFlightPlan() {
		return longFlightPlan;
	}

	public void setLongFlightPlan(FlightLongTemPlan longFlightPlan) {
		this.longFlightPlan = longFlightPlan;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getFlightNO() {
		return flightNO;
	}

	public void setFlightNO(String flightNO) {
		this.flightNO = flightNO;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAircraftReg() {
		return aircraftReg;
	}

	public void setAircraftReg(String aircraftReg) {
		this.aircraftReg = aircraftReg;
	}

	public String getAircraftType() {
		return aircraftType;
	}

	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}

	public String getFlightType() {
		return flightType;
	}

	public void setFlightType(String flightType) {
		this.flightType = flightType;
	}

	public String getTrafficType() {
		return trafficType;
	}

	public void setTrafficType(String trafficType) {
		this.trafficType = trafficType;
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

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public List<JoinedFlight> getJoinedFlight() {
		return joinedFlight;
	}

	public void setJoinedFlight(List<JoinedFlight> joinedFlight) {
		this.joinedFlight = joinedFlight;
	}

	public List<ViaAirport> getViaAirport() {
		return viaAirport;
	}

	public void setViaAirport(List<ViaAirport> viaAirport) {
		this.viaAirport = viaAirport;
	}
}
