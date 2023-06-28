package ch11_api.sec07_date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;

public class Ex03_Calendar {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;	// 월은 1을 더해주어야 함
		int day = now.get(Calendar.DAY_OF_MONTH);
		int date = now.get(Calendar.DAY_OF_WEEK); 	// 요일
		int amPm = now.get(Calendar.AM_PM);
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int time = now.get(Calendar.SECOND);
		LocalDate today = LocalDate.now();
		DayOfWeek date2 = today.getDayOfWeek();
		String[] dates = "일, 월, 화 ,수 ,목, 금, 토".split(", ");
		
		System.out.printf("%d-%d-%d %s %d%d:%02d:%02d",year, month, day, dates[date2.getValue()] + "요일", amPm, hour, minute, time);
	}

}
