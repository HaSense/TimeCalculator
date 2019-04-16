package com.fourirsw.common;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TimeTablePrj {

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