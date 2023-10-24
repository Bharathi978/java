package bharathi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TimeString1 {

//Convert String to Date using pattern formatters 
    public static void main(String[] args) {
        String string = "May 16, 2018";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse(string, formatter);

        System.out.println(date);
    }
	
	
	//In the above program, our date is in the format MMMM d, yyyy. So, we create a formatter of the given pattern.

  //Now, we can parse the date using LocalDate.parse() function and get the LocalDate object.
	
	
	
	
	
	
	
	
	
	
	
}
