import java.io.File;
import java.util.List;

public interface ScheduleService {
	
	/**
	 * ���ļ��γ����״̬��Schedule����δ��������֤�����н���չʾ������ʾ��˽����
	 * ʵ�ַ����ڽ��л������ļ��Ϸ��Լ��顣
	 * @param file
	 * @return List<Schedule>����
	 */
	public List<Schedule> fileToSchedule(File file);
	
	/**
	 * ��Schedule����������ʱ�̱��ļ������Ƽ�ʹ�á�
	 * @param schedule
	 * @return
	 */
	public File scheduleToFile(List<Schedule> schedule);
	
	/**
	 * �γ�ԭʼ���೤�ڼƻ���ǰ��Ҫ����Ӧ��Schedule������������У�顣
	 * @param schedule
	 * @return
	 */
	public List<NativeFlightLongTermPlan> transformToNativeLongFlightPlan(Schedule schedule, String locationAirport);
	
	/**
	 * 
	 * @param nativeLongFlightPlan
	 * @return
	 */
	public List<FlightLongTemPlan> getLongFlightPlanFromNative(NativeFlightLongTermPlan nativeLongFlightPlan);
}
