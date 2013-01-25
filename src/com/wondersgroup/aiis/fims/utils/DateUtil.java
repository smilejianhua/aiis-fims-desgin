package com.wondersgroup.aiis.fims.utils;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;

public class DateUtil {
	
	/**
	 * 获取相应日期是星期几
	 * @param date
	 * @return
	 */
	public String getWeekDay (Date date){
		return null;
	}
	
	public static Date getDateFromString(String date){
		try {
			return DateFormat.getDateInstance().parse(date);
		}
		catch (ParseException e) {
			e.printStackTrace();
			return null;
		}		
	}
	
	
}
