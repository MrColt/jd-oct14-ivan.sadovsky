package day8;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Calendar; // if name of class will be Calendar our import java.util.Calendar doesn't work; 



public class WorkWithDate {

	public static void main(String[] args) throws Exception {

		Calendar c = new GregorianCalendar();
		
		c.set(Calendar.YEAR, 1992);
		c.set(Calendar.DATE, 9);
		c.set(Calendar.MONTH, 3);
		
		
		SimpleDateFormat format;
		
		format = new SimpleDateFormat("EEEE"); // if EEE = Чт if EEEE = Четверг
		
		System.out.println("The day of my born " + format.format(c.getTime()));
		
	}

}
