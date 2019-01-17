package datesAndTimes;

/*
 * The new date, time, date time,zoned date, zoned time, zoned date time are immutable.
 * LocalTime does not have an epoch method.
 * Period is for dates
 * Duration is for time
 * It is valid for a Locale to be only a language. can have a language without a country, but not the reverse
 */
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Locale;

public class Dates {

	public static void main(String[] args) {

		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		System.out.println(ZonedDateTime.now() + "\n");

		LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20); // LocalDate of(int year, int month, int dayOfMonth)
		LocalDate date2 = LocalDate.of(2015, 1, 20); // LocalDate of(int year, Month month, int dayOfMonth)
		System.out.println(date1);
		System.out.println(date2 + "\n");

		LocalTime time1 = LocalTime.of(6, 15); // hour and minute
		LocalTime time2 = LocalTime.of(6, 15, 30); // + seconds
		LocalTime time3 = LocalTime.of(6, 15, 30, 200); // + nanoseconds
		System.out.println(time1);
		System.out.println(time2);
		System.out.println(time3 + "\n");

		LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30); //
		LocalDateTime dateTime2 = LocalDateTime.of(date1, time1); //
		System.out.println(dateTime1);
		System.out.println(dateTime2);

		ZoneId zone = ZoneId.of("US/Eastern");
		ZonedDateTime zoned1 = ZonedDateTime.of(2015, 1, 20, 6, 15, 30, 200, zone); // all of the fields individually
																					// passed in
		ZonedDateTime zoned2 = ZonedDateTime.of(date1, time1, zone); // local date object and local time object passed
																		// in
		ZonedDateTime zoned3 = ZonedDateTime.of(dateTime1, zone); // local dateTime object passed in
		System.out.println(zoned1);
		System.out.println(zoned2);
		System.out.println(zoned3);

		// LocalDate d = new LocalDate(); // DOES NOT COMPILE
		// LocalDate.of(2015, Month.JANUARY, 32) // throws DateTimeException

		LocalDate datePlus = LocalDate.of(2014, Month.JANUARY, 20);
		System.out.println(datePlus); // 2014–01–20
		datePlus = datePlus.plusDays(2);
		System.out.println(datePlus); // 2014–01–22
		datePlus = datePlus.plusWeeks(1);
		System.out.println(datePlus); // 2014–01–29
		datePlus = datePlus.plusMonths(1);
		System.out.println(datePlus); // 2014–02–28
		datePlus = datePlus.plusYears(5);
		System.out.println(datePlus); // // 2019–02–28

		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(5, 15);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		System.out.println(dateTime); // 2020–01–20T05:15
		dateTime = dateTime.minusDays(1);
		System.out.println(dateTime); // 2020–01–19T05:15
		dateTime = dateTime.minusHours(10);
		System.out.println(dateTime); // 2020–01–18T19:15
		dateTime = dateTime.minusSeconds(30);
		System.out.println(dateTime); // 2020–01–18T19:14:30

		// LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		// date = date.plusMinutes(1); // DOES NOT COMPILE

		LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
		LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
		performAnimalEnrichment(start, end);

		long epochDate = LocalDate.now().toEpochDay(); // The number of days since jan 1 1970
		long epochTime = LocalDateTime.now().toEpochSecond(ZoneOffset.UTC); // The number of seconds since jan 1 1970
		// LocalTime does not have an epoch method.

		Period period = Period.ofMonths(1); // create a period
		performAnimalEnrichment(start, end, period);
		
		
		Period annually = Period.ofYears(1);               // every 1 year
		Period quarterly = Period.ofMonths(3);             // every 3 months
		Period everyThreeWeeks = Period.ofWeeks(3);        // every 3 weeks
		Period everyOtherDay = Period.ofDays(2);           // every 2 days
		Period everyYearAndAWeek = Period.of(1, 0, 7);     // every year and 7 days
		
		Period wrong = Period.ofYears(1).ofWeeks(1);          // is the same as writing
		//Period wrong = Period.ofYears(1);
		//wrong = Period.ofWeeks(1);
		
		Locale locale = Locale.getDefault();
		System.out.println(locale);
		
	}

	private static void performAnimalEnrichment(LocalDate start, LocalDate end) {
		LocalDate upTo = start;
		while (upTo.isBefore(end)) { // check if still before end
			System.out.println("give new toy: " + upTo + "\n\n");
			upTo = upTo.plusMonths(1); // add a month
		}
	}
	
	private static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period) { 
		// uses the generic period
		LocalDate upTo = start;
		while (upTo.isBefore(end)) {
			System.out.println("give new toy: " + upTo + "\n\n");
			upTo = upTo.plus(period); // adds the period
		}
	}
	

}
