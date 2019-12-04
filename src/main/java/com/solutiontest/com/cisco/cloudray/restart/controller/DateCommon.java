package com.solutiontest.com.cisco.cloudray.restart.controller;

import java.util.Calendar;
import java.util.Date;

public class DateCommon {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MINUTE, 50);
		diffTime(cal.getTime());
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
