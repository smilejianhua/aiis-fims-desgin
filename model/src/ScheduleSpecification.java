public class ScheduleSpecification {
	
	private Schedule schedule;
	private boolean result = false;
		
	public ScheduleSpecification(Schedule schedule){
		this.schedule = schedule;
	}
	
	/**
	 * ���շ���У����
	 * @return
	 */
	public boolean isValid(){
		return result; 
	}
	
	/**
	 * ����ŷ�����У��
	 * @return
	 */
	private boolean isFlightNoFit(){
		return result;
	}
}
