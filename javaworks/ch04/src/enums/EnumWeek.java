package enums;

import java.util.Calendar;

public class EnumWeek {

	public static void main(String[] args) {
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		
		//System.out.println(cal.get(Calendar.YEAR));
		int day = cal.get(Calendar.DAY_OF_WEEK);
		//1-일 2-월 3-화 4-수 5-목 6-금 7-토
		//System.out.println(day);
	
		switch(day) {
		case 1:
			today =Week.일; break;
		case 2:
			today =Week.월; break;
		case 3:
			today =Week.화; break;
		case 4:
			today =Week.수; break;
		case 5:
			today =Week.목; break;
		case 6:
			today =Week.금; break;
		case 7:
			today =Week.토; break;
		}
	
		System.out.println("오늘은 "+ today + "요일입니다");
		
	}

}
