package com.fourirsw.common;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;

public class TimeTablePrj {
	/*
	 * 2019.04.16
	 * 
	 * 최적화를 시켜 쓸만한 유틸이 될 때 까지 main에서 연습을 해볼 것이며
	 * 테스트가 끝나면 유용한 클래스를 만들어 보려 합니다.
	 */
	
	/*
	 * 약간의 버그가 있지만 현재까지 공휴일 제외 날짜를 카운트 해줌 
	 * 이제 시간까지 정확하게 처리하는 프로그램이 요구됨
	 * 
	 * 그 다음은 UI를 삽입하는 과정을 두면 좋겠음.
	 * 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//공휴일 삽입
		ArrayList<LocalDate> halidays = new ArrayList<LocalDate>();
		halidays.add(LocalDate.of(2019,1,1));		//신정 
		halidays.add(LocalDate.of(2019,2,4));		//설날 
		halidays.add(LocalDate.of(2019,2,5));		//설날 
		halidays.add(LocalDate.of(2019,2,6));		//설날 
		halidays.add(LocalDate.of(2019,3,1));		//삼일절 
		halidays.add(LocalDate.of(2019,5,6));		//어린이날 대체휴일 
		halidays.add(LocalDate.of(2019,6,6));		//현충일 
		halidays.add(LocalDate.of(2019,8,15));		//광복절 
		halidays.add(LocalDate.of(2019,9,12));		//추석 
		halidays.add(LocalDate.of(2019,9,13));		//추석 
		halidays.add(LocalDate.of(2019,9,14));		//추석 
		halidays.add(LocalDate.of(2019,10,3));		//개천절 
		halidays.add(LocalDate.of(2019,10,9));		//한글날 
		halidays.add(LocalDate.of(2019,12,25));		//크리스마스
		//추가 휴일
		halidays.add(LocalDate.of(2019,8,16));		//휴강


		System.out.println("2019년 공휴일 : " + halidays.size());

		int classTotalTime = 80;
		int classTime = 7;

		LocalDate startDay = LocalDate.of(2019, 8, 5);

		int cnt=0;
		int i=0;
		LocalDate countDay = startDay;
		DateTimeFormatter yoil_format = DateTimeFormatter.ofPattern("E", Locale.KOREAN);
		//DateTimeFormatter haliday;
		
		while(true) {
			countDay = startDay.plusDays(i++);
			String yoil = countDay.format(yoil_format);
			
			if(yoil.equals("토") || yoil.equals("일")) {
			}else {
				for(LocalDate someday : halidays) {
					if(countDay.equals(someday)) {
						countDay = startDay.plusDays(i++);
						yoil = countDay.format(yoil_format);
					}
				}
				cnt++;
				System.out.println(countDay + "(" + yoil + ")");
			}
			if( (cnt * classTime) >= classTotalTime ) break;
		}	
		System.out.println("cnt : " + cnt);

	}
}