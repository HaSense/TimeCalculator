package com.fourirsw.common;

public class TimeCalculrator {
	
	/*
	 * 2019.04.16
	 * 
	 * 유용한 함수를 만들어 봅니다.
	 * 
	 */
	
	/* 단순 enum을 한글로 변환할 때 사용. DateTimeFormatter와 Locale을 사용한다면
	 * 사용하지 않아도 되지만 예전 방식으로 요일을 계산하고 싶다면 유용한 함  
	*/
	public static String changeYoiltoKorean(String yoil) {
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
