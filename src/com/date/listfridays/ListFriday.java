//List all Fridays, the 13 th in the twentieth century
package com.date.listfridays;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ListFriday {
	
	public static void main(String[] args) {
		
		final LocalDate startDate=LocalDate.of(1900, 1, 13); //Start of twentieth century
		final LocalDate endDate=LocalDate.of(2000, 1, 13); //End of twentieth century
		
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("List of Fridays, the 13 th in the 20th century is:");
		
		//Check for end date and increment date by one month
		for (LocalDate date = startDate; date.isBefore(endDate); date = date.plusMonths(1L)) {  
			if(date.getDayOfWeek().equals(DayOfWeek.FRIDAY))
					System.out.println(formatter.format(date));	//Display all Fridays the 13th	
		}
	}
}