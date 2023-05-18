package datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date1 {

	public static void main(String[] args) {
		//날짜와 시간 객체 생성
		Date now = new Date();
		System.out.println(now);
		
		SimpleDateFormat datetime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		System.out.println(datetime.format(now));
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(date.format(now));
		
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
		System.out.println(time.format(now));
	}

}
