package DateClassPractice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		System.out.println(d.toString());

		SimpleDateFormat dd = new SimpleDateFormat("d/mm/yyyy HH:MM:SS");
		System.out.println(dd.format(d));

	}

}
