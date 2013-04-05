package org.alsoran.utility;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Converter {

	public static double hmsToSeconds(String time) {
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	    Date reference = null;
	    double seconds = 0;
		try {
			reference = dateFormat.parse("00:00:00");
		} catch (ParseException ignored) {		}
	    Date date = null;
		try {
			date = dateFormat.parse(time);
		    seconds = (date.getTime() - reference.getTime()) / 1000L;
		} catch (ParseException e) {
			seconds = msToSeconds(time);
		}
		return seconds;
	}
	private  static double msToSeconds(String time) {
		String missingHour = String.format("00:%s", time);
		double seconds = 0;
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	    Date reference = null;
		try {
			reference = dateFormat.parse("00:00:00");
		} catch (ParseException ignored) {		}
	    Date date = null;
		try {
			date = dateFormat.parse(missingHour);
		    seconds = (date.getTime() - reference.getTime()) / 1000L;
		} catch (ParseException e) {
			seconds = sToSeconds(time);
		}
		return seconds;
	}
	private  static double sToSeconds(String time) {
		String missingHourMinutes = String.format("00:00:%s", time);
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	    Date reference = null;
	    long seconds = 0;
		try {
			reference = dateFormat.parse("00:00:00");
		} catch (ParseException ignored) {		}
	    Date date = null;
		try {
			date = dateFormat.parse(missingHourMinutes);
		    seconds = (date.getTime() - reference.getTime()) / 1000L;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return seconds;
	}
	
	public static String secondsToHMS(int totalSeconds) {
		int m = totalSeconds / 60;
		int s = totalSeconds - (m * 60);
		int h = 0;
		while(m > 59) {
			h = h + 1;
			m = m - 60;
		}		
		String hms = 
		String.format("%02d:%02d:%02d", h, m, s);
		return hms;
	}
	public static double milestoMeters(double miles) {
		return miles * 1609;
	}

	public static double meterstoMiles(double meters) {
		return (meters * 1) / 1609;
	}


}
