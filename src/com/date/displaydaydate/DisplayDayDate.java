//Display date in the form week day, month, date and year
package com.date.displaydaydate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DisplayDayDate {

	public static void main(String[] args) {
		
		LocalDate date;
		date=LocalDate.now(); //Store current date
		
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy");
		System.out.println(formatter.format(date)); //Display date in desired format
	}
}