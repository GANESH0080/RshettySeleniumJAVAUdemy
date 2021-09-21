package CalenderPractice;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderOne {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();

		SimpleDateFormat dd = new SimpleDateFormat("d/mm/yyyy HH:MM:SS");

		System.out.println(dd.format(cal.getTime()));
		
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
		System.out.println(cal.get(Calendar.AM_PM));
		
		System.out.println(cal.get(Calendar.MINUTE));

	}

}
