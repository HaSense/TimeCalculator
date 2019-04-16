package com.fourirsw.common;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TimeTalbeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int class1Time = 40;
		int day = 7;

		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println(currentDateTime);

		//오늘 무슨요일?

		LocalDateTime today = LocalDateTime.now();
		LocalDate time1 = LocalDate.of(2019, 5, 15);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd E", Locale.KOREAN);
		String text = today.format(dtf);
		System.out.println(text);

		String yoil = today.getDayOfWeek().toString();
		yoil = time1.getDayOfWeek().toString();
		//yoil = TimeCalculrator.changeYoilToKorean(yoil);
		dtf = DateTimeFormatter.ofPattern("E", Locale.KOREAN);
		System.out.println(today.format(dtf));

		dtf = DateTimeFormatter.ofPattern("E",Locale.KOREAN);
		yoil = time1.format(dtf);
		System.out.println(yoil);



		LocalDate startDay = LocalDate.of(2019, 1, 1);
		LocalDate endDay = LocalDate.of(2019, 1, 8);

		int cnt=0;
		int i=0;
		LocalDate countDay = startDay;
		while(true) {
			countDay = startDay.plusDays(i++);

			//yoil = countDay.getDayOfWeek().toString();
			//yoil = changeYoilToKorean(yoil);
			yoil = countDay.getDayOfWeek().toString();
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
