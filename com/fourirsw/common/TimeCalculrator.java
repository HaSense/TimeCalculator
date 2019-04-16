package com.fourirsw.common;

public class TimeCalculrator {
	
	
	public static String changeYoilToKorean(String yoil) {
		switch(yoil) {
		case "MONDAY":    yoil = "월"; break;
		case "TUESDAY":   yoil = "화"; break;
		case "WEDNESDAY": yoil = "수"; break;
		case "THURSDAY":  yoil = "목"; break;
		case "FRIDAY":    yoil = "금"; break;
		case "SATURDAY":  yoil = "토"; break;
		case "SUNDAY":    yoil = "일"; break;
		}
		return yoil;
	}
}
