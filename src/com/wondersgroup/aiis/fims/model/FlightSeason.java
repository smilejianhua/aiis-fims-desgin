package com.wondersgroup.aiis.fims.model;

import java.util.Date;

import com.wondersgroup.aiis.fims.model.restrain.FlightSeasonRestrain;

/**
 * 航季对象维护
 * 
 * @author Jacky.Li
 */
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
//		if startTime < 06.01 setName(""); 
//		if startTime > 06.01 setName("");
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public boolean restrain(){
		FlightSeasonRestrain fsRestrain = new FlightSeasonRestrain(this);
		return fsRestrain.isValid();
	}
	
	public void save(){		
	}
	
	public void update(){
		
	}
	
	public void remove(){
		
	}
}
