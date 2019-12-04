package com.solutiontest.common.testproject;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	public static void main(String[] args) {
/*
		System.err.println(getDateByMonth(-1));
		System.err.println(getDateByMonth(1));
		
		System.out.println("==================================");
		Calendar calNow = Calendar.getInstance();
		calNow.set(Calendar.MONTH, 6);
		System.out.println("Current Date  :"+calNow.getTime());
		Date date = setDays(120,calNow.getTime());
		System.out.println("date : "+ date);
		System.out.println("is it after specified date - LICENSE EXPIARED  :"+date.before(new Date()));
		convertDateToMilliSeconds(new Date());
		
*/		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MINUTE, 50);
		diffTime(cal.getTime());
	}

	public static Date getDateByMonth(int month){
    	Calendar calNow = Calendar.getInstance();
		calNow.add(Calendar.MONTH, month);
		return calNow.getTime();
    }
	
	public static Date setDays(int days, Date createdDate) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(createdDate);
		cal.add(Calendar.DAY_OF_YEAR, days);
		return cal.getTime();
	}
	
	public static long convertDateToMilliSeconds(Date date) {
        System.out.println("Date is : " + date);
        long milliseconds = date.getTime();
        System.out.println("Milliseconds since January 1, 1970, 00:00:00 GMT : " + milliseconds);      
        return milliseconds;
	}
	
	public static void diffTime(Date oldDate) {
		Date currentDate = new Date();
		long milliseconds= currentDate.getTime()-oldDate.getTime();
		System.out.println("Diff Milli seconds  :"+milliseconds);
		String msg = null;
        long min = milliseconds/(60 * 1000);
        System.out.println("Diff in total minutes : "+min);
        
        if(min > 59) {
			long diffSeconds = milliseconds / 1000 % 60;
			long diffMinutes = milliseconds / (60 * 1000) % 60;
			long diffHours = milliseconds / (60 * 60 * 1000) % 24;
			long diffDays = milliseconds / (24 * 60 * 60 * 1000);
			StringBuilder sb = new StringBuilder();
			if(diffDays > 0) {
				sb.append(diffDays).append(" Day(s) : ");
			}else {
				sb.append(diffHours).append("h : ").append(diffMinutes).append("m : ")
				.append(diffSeconds).append("s");
			}
			msg = sb.toString();
					
        }else {
        	msg = min+" minutes ago";
        }
        System.out.println("Time diff is format : "+msg);
  
	}
}
