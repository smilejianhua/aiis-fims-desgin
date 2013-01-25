import java.util.List;

public interface FlightPlanService {
	
	/**
	 * 通过原始长期航班计划形成长期航班计划
	 * @return
	 */
	public FlightLongTemPlan createLongFlightPlan(NativeFlightLongTermPlan nativeLongFlightPlan);
	
	/**
	 * 修改长期航班计划
	 * @param longFlightPlan
	 * @return
	 */
	public FlightLongTemPlan modifyLongFlightPlan(FlightLongTemPlan longFlightPlan);
	
	/**
	 * 拆分长航班计划，形成日航班计划
	 * @param longFlightPlan
	 * @return
	 */
	public List<DailyFlightPlan> splitLongFlightPlan(FlightLongTemPlan longFlightPlan); 
}
