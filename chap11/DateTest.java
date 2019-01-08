package chap11;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTest {
public static void main(String[] args) {
	
//	Date now = new Date();
//	System.out.println(now);
	
	Calendar cal = Calendar.getInstance();
	System.out.println(cal);
	
	int year = cal.get(Calendar.YEAR);
	int month = cal.get(Calendar.MONTH) + 1;
	int day = cal.get(Calendar.DAY_OF_MONTH);
	int hour = cal.get(Calendar.HOUR_OF_DAY);
	int min = cal.get(Calendar.MINUTE);
	int sec = cal.get(Calendar.SECOND);
	System.out.println("현재 시각은 " + year + "년도 " + month + "월 " + day + "일 " + hour + "시 " + min + "분 " + sec + "초입니다.");
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy / MM / dd / HH:mm:ss");
	String datestr = sdf.format(cal.getTime());
	System.out.println(datestr);
	
	double d = 500*Math.PI;
	System.out.println(d);
	DecimalFormat df = new DecimalFormat("#.##");
	String sd = df.format(d);
	System.out.println(sd);
}
}
