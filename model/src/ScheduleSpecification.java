public class ScheduleSpecification {
	
	private Schedule schedule;
	private boolean result = false;
		
	public ScheduleSpecification(Schedule schedule){
		this.schedule = schedule;
	}
	
	/**
	 * 最终返回校验结果
	 * @return
	 */
	public boolean isValid(){
		return result; 
	}
	
	/**
	 * 航班号符合性校验
	 * @return
	 */
	private boolean isFlightNoFit(){
		return result;
	}
}
