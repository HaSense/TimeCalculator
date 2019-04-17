package com.fourirsw.common;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TimeTablePrj {
	/*
	 * 2019.04.16
	 * 
	 * 최적화를 시켜 쓸만한 유틸이 될 때 까지 main에서 연습을 해볼 것이며
	 * 테스트가 끝나면 유용한 클래스를 만들어 보려 합니다.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
	}	
}