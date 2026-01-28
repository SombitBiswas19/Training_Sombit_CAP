package date_currency;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class NewDateExample {
	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		LocalTime time=LocalTime.now();
		LocalDateTime datetime=LocalDateTime.now();
		
		System.out.println(date);
		System.out.println(time);
		System.out.println(datetime);
		
		//Formatting
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatted=datetime.format(format);
		System.out.println(formatted);
	}
}
