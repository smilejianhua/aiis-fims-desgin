import java.io.File;
import java.util.List;

public class ScheduleServiceImpl implements ScheduleService {
	
	private FileToSchedule fs = new ExcelToSchedule();

	public List<Schedule> fileToSchedule(File file) {
		// TODO Auto-generated method stub
		return null;
	}

	public File scheduleToFile(List<Schedule> schedule) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<FlightLongTemPlan> getLongFlightPlanFromNative(
			NativeFlightLongTermPlan nativeLongFlightPlan) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<NativeFlightLongTermPlan> transformToNativeLongFlightPlan(
			Schedule schedule, String locationAirport) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
