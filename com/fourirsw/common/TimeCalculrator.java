package com.fourirsw.common;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

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
	//날짜 카운트 함수, 평일만
	public int countDays() {
		LocalDate startDay = LocalDate.of(2019, 1, 1);
		LocalDate endDay = LocalDate.of(2019, 1, 8);
		
		int cnt=0;
		int i=0;
		LocalDate countDay = startDay;
		DateTimeFormatter yoil_format = DateTimeFormatter.ofPattern("E", Locale.KOREAN);
		
		while(true) {
			countDay = startDay.plusDays(i++);
			String yoil = countDay.format(yoil_format);
			if(yoil.equals("SATURDAY") || yoil.equals("SUNDAY")) {
			}else {
				cnt++;
				System.out.println(countDay + "(" + yoil + ")");
			}
			if(countDay.equals(endDay) ) break;
		}	
		System.out.println("cnt : " + cnt);
		
		return cnt;
	}
	
	public void countDays2() {
		/*
		 * 미완성 중임.
		 * 1. 공휴일 제거 기능이 들어가야 하고
		 * 2. 1교시 부터 시작하지 않을 시 버그가 있음
		 * 3. 
		 */
		int classTotalTime = 80;
		int classTime = 7;
		
		LocalDate startDay = LocalDate.of(2019, 8, 5);

		int cnt=0;
		int i=0;
		LocalDate countDay = startDay;
		DateTimeFormatter yoil_format = DateTimeFormatter.ofPattern("E", Locale.KOREAN);

		while(true) {
			countDay = startDay.plusDays(i++);
			String yoil = countDay.format(yoil_format);
			if(yoil.equals("토") || yoil.equals("일")) {
			}else {
				cnt++;
				System.out.println(countDay + "(" + yoil + ")");
				
			}
			if( (cnt * classTime) >= classTotalTime ) break;
		}	
		System.out.println("cnt : " + cnt);
	}
}

