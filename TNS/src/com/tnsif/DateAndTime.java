package com.tnsif.streamdemo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateAndTime {
	    public static void main(String[] args) {
	        // Current Date
	        LocalDate date = LocalDate.now();
	        System.out.println("Current Date: " + date);

	        // Current Time
	        LocalTime time = LocalTime.now();
	        System.out.println("Current Time: " + time);

	        // Current Date and Time
	        LocalDateTime dateTime = LocalDateTime.now();
	        System.out.println("Current Date & Time: " + dateTime);

	        // Custom Date
	        LocalDate customDate = LocalDate.of(2025, Month.MAY, 21);
	        System.out.println("Custom Date: " + customDate);

	        // Adding days to a date
	        LocalDate futureDate = date.plusDays(10);
	        System.out.println("Date after 10 days: " + futureDate);

	        // Formatting Date and Time
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	        String formattedDateTime = dateTime.format(formatter);
	        System.out.println("Formatted Date & Time: " + formattedDateTime);
	    }
	}

