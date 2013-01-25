import java.io.File;
import java.util.List;

public interface FileToSchedule {
	
	public List<Schedule> transform(File file);

	public static class DailyFlightPlan {
	
		private long id;
		private FlightLongTemPlan longFlightPlan;
		private String flightNO;
	
		public FlightLongTemPlan getLongFlightPlan() {
			return longFlightPlan;
		}
	
		public void setLongFlightPlan(FlightLongTemPlan longFlightPlan) {
			this.longFlightPlan = longFlightPlan;
		}
	}
}
