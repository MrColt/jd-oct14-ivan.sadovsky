package day8;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class DateOfBirth {

	public static void main(String[] args) throws Exception {
		Date day = new Date();
		System.out.println(day);
		
		SimpleDateFormat simple = new SimpleDateFormat("dd MMM yyyy");
		System.out.println(simple.format(day));
		
		Date date = simple.parse("9 Мар 1992"); // Нужно писать только русскими иначе Unparseable date
		System.out.println(simple.format(date));

	}

}
