import java.util.List;

public interface FlightPlanService {
	
	/**
	 * ͨ��ԭʼ���ں���ƻ��γɳ��ں���ƻ�
	 * @return
	 */
	public FlightLongTemPlan createLongFlightPlan(NativeFlightLongTermPlan nativeLongFlightPlan);
	
	/**
	 * �޸ĳ��ں���ƻ�
	 * @param longFlightPlan
	 * @return
	 */
	public FlightLongTemPlan modifyLongFlightPlan(FlightLongTemPlan longFlightPlan);
	
	/**
	 * ��ֳ�����ƻ����γ��պ���ƻ�
	 * @param longFlightPlan
	 * @return
	 */
	public List<DailyFlightPlan> splitLongFlightPlan(FlightLongTemPlan longFlightPlan); 
}
