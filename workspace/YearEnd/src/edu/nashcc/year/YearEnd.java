/*Name: Matthew S. Coley
 * Assignments: chapter 4 programs
 * Date: 10 March 2015
 */


package edu.nashcc.year;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class YearEnd {

	public static void main(String[] args) {

		
		// how it should be done
		int now = LocalDate.now().getDayOfYear();
		int endOfYear = LocalDate.of(2015, 12, 31).getDayOfYear();
		System.out.println(endOfYear - now + " days until the end of the year.");
		
		
		
		// how the book wants it done
		Calendar cal1 = Calendar.getInstance();
		int currentDay = cal1.get(Calendar.DAY_OF_YEAR);
		
		Calendar cal2 = new GregorianCalendar(2015, 11, 31); // 11th month is not December, gg GregorianCalendar
		int lastDayOfYear = cal2.get(Calendar.DAY_OF_YEAR);
		
		int totalDays = lastDayOfYear - currentDay;
		System.out.println(totalDays + " days until the end of the year.");
		
	}

}
