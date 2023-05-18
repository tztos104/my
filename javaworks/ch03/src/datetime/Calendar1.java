package datetime;

import java.util.Calendar;

public class Calendar1 {

	public static void main(String[] args) {
		//Calendar 클래스 사용
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		System.out.println(cal.getCalendarType());
		
		//날짜
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		//월이 10미만이면 두자리 문자로 표기함
		String strMonth = (month < 10) ? ("0" + month) : (""+ month);
		int date = cal.get(Calendar.DATE);
		String strdate = (date < 10) ? ("0" + date) : (""+ date);
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
	
		int hour = cal.get(Calendar.HOUR);
		String strhour = (hour < 10) ? ("0" + hour) : (""+ hour);
		int minute = cal.get(Calendar.MINUTE);
		String strminute = (minute < 10) ? ("0" + minute) : (""+ minute);
		int second = cal.get(Calendar.SECOND);
		String strsecond = (second < 10) ? ("0" + second) : (""+second);
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);

		
		System.out.printf("%d년 %s월 %s일\n", year, strMonth, strdate  );
		System.out.printf("%d시 %s분 %s초\n", hour, strminute, strsecond  );
		
		int day =cal.get(Calendar.DAY_OF_WEEK);
		String[] days = new String[]{"월","화","수","목","금","토","일"};
		System.out.println("오늘은"+days[day-1]+"요일입니다");
		
		
	}
	

}
