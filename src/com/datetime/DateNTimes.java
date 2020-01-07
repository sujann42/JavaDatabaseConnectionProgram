package com.datetime;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateNTimes {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now(); // Current date
		System.out.println(today); // calls date.toString()
		LocalDate df = LocalDate.of(2019, Month.FEBRUARY, 12); // Custom date
		System.out.println(df);
		LocalDate dff = LocalDate.of(2019, 9, 19); // Custom date
		System.out.println(dff);

		System.out.println(today.minusDays(10));
		System.out.println(today.minusWeeks(2));
		System.out.println(today.minusDays(10));
		System.out.println(today.plusYears(10));
		System.out.println(today.minusMonths(5));
		System.out.println("++++");

		System.out.println("++It will not change as the date object is immutable++");
		LocalDate no1Date = LocalDate.of(2017, Month.NOVEMBER, 23);
		System.out.println(no1Date);
		no1Date.plusYears(2);
		System.out.println(no1Date);
		no1Date.plusMonths(3);
		System.out.println(no1Date);
		no1Date.plusDays(2);
		System.out.println(no1Date);

		System.out.println("++It changes as we are assigning to new one++");
		LocalDate noDate = LocalDate.of(2017, Month.NOVEMBER, 23);
		System.out.println(noDate);
		noDate = noDate.plusYears(2);
		System.out.println(noDate);
		noDate = noDate.plusMonths(3);
		System.out.println(noDate);
		noDate = noDate.plusDays(2);
		System.out.println(noDate);
		System.out.println("UTC Time");
		// UTC Time
		LocalDate utctime = LocalDate.now(ZoneId.of("UTC"));
		System.out.println(utctime);

		System.out.println("Local Time");
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		LocalTime llt = LocalTime.of(23, 59, 23, 5322);
		System.out.println(llt);

		ZonedDateTime zt = ZonedDateTime.now();
		System.out.println("Zoned Date time: " + zt);

		ZonedDateTime dttt = ZonedDateTime.now(Clock.systemDefaultZone());
		System.out.println(dttt);

		ZonedDateTime currentdatetime = ZonedDateTime.of(LocalDateTime.of(2019, 05, 23, 8, 23), ZoneId.of("Asia/Kolkata"));
		System.out.println(currentdatetime);

	}

}
