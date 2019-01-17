package formatting;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZonedDateTime;
import java.util.Date;

public class StringFormatting {
	

	public static void main(String[] args) {
		String str;
		String afterFormat;
		LocalDateTime date = LocalDateTime.now();
		String dateFormated;
		
		String datePattern = "yyyy-MM-dd EEEEE";
		dateFormated = new SimpleDateFormat(datePattern).format(date);
		
		str = "my name is %s and I am %d years old%nI and this is a float %f. Today's date is %tF";
		
		afterFormat = String.format(str, "Andrew", 31, 2.2, date);
		
		System.out.println(afterFormat);
		
		System.out.println(dateFormated);
		
	}

}
