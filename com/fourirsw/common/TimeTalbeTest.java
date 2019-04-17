package com.fourirsw.common;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TimeTalbeTest {
	
	/*
	 * 2019.04.16
	 * 
	 * 그동안 율리우스력에 의해 누적된 오차를 그레고리력으로 바꾸며서 사라진 10일과 같이 역사적으로 이슈가
	 * 반영되지 않아 날짜 계산에 오차가 있었습니다. 
	 * Java8이 표준이 되면서 이러한 문제를 해결한 클래스가 등장하였고 LocalDate, LocalTime, LocalDateTime
	 * 클래스 입니다. 이를 사용하여 날짜계산를 보다 편하고 정확하게 할 수 있게 되었습니다.
	 * 
	 * 하지만 사용해보고 연습해 보아야 코드를 내것으로 할 수 있습니다. 
	 * 그래서 완벽한 코드보다 중간 연습 과정의 코드도 남겨 둡니다.
	 * 
	 */
	
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
