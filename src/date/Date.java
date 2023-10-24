package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Date {




	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		System.out.println(date);

				
		LocalTime time2 = LocalTime.now();
		System.out.println(time2);

		LocalDateTime time = LocalDateTime.now();
		System.out.println("before formating :" + time);
		
		
		
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		String format = time.format(pattern);
		System.out.println("After format:"+ format);
		
		
		
	}
	










}
