import java.util.List;

public class FlightPlan {
	
	private long id;
	private FlightLongTemPlan longFlightPlan;
	/* 进离港标示 */
	private String flag;
	/* 航班号 */
	private String flightNO;
	/* 航班状态 ，有三个可选值Scheduled计划、Operation营运、Not Perform不执行*/
	private String status;
	/* 机号 */
	private String aircraftReg;
	/* 机型 */
	private String aircraftType;
	/* 航班属性，国际 International、国内 National、地区Region、混合Mixed */
	private String flightType;
	/* 航班性质 */
	private String trafficType;
	/* 起始站 */
	private String OriAirport;
	/* 到达站 */
	private String DestAirport;
	/* 备注 */
	private String comment;	
	/* 共享航班 */
	private List<JoinedFlight> joinedFlight;
	/* 经停机场 */
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
