import java.util.Date;

public class FlightSeason {
	
	private long id;
	private String name;
	private Date startTime;
	private Date endTime;
	private String comment;
	private boolean status;
	
	private boolean checkTime(){
//		if Date < Today; return false;
//		if endTime < startTime; return false;
		return false;
	}
	
	private void setNameAutomatic(){
//		if startTime < 06.01 setName("ÏÄÇï¼¾"); 
//		if startTime > 06.01 setName("¶¬´º¼¾");
	}
	
}
