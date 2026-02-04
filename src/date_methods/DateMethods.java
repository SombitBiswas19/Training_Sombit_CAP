package date_methods;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LocalDate
		LocalDate date=LocalDate.now();
		System.out.println(date);
		//LocalTime
		LocalTime time=LocalTime.now();
		System.out.println(time);
		//LocalDateTime
		LocalDateTime datetime=LocalDateTime.now();
		System.out.println(datetime);
		//UTC Timestamp
		Instant instant=Instant.now();
		System.out.println(instant);

	}

}
