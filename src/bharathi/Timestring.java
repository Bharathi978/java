package bharathi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Timestring {
	
	
	
	
	
	// Convert String to Date using predefined formatters :
	
	
	

    public static void main(String[] args) {
        // Format y-M-d or yyyy-MM-d
        String string = "2018-05-16";
       LocalDate date = LocalDate.parse(string,DateTimeFormatter.ISO_DATE);

        System.out.println(date);
    }

}
