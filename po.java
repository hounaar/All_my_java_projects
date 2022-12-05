// Java program to find the 
// difference between two dates 
import java.util.Scanner;
import java.sql.Time;
import java.text.ParseException; 
import java.text.SimpleDateFormat; 
import java.util.concurrent.TimeUnit;
import java.util.Date; 
import java.time.LocalDateTime;

public class po { 
 
  
	// Driver Code 
	public static void main(final String[] args) { 
		// Given start_date 
	// Function to print difference in 
	// time start_date and end_date 
	
		// SimpleDateFormat converts the 
		// string format to date object 
		 SimpleDateFormat sdf = new SimpleDateFormat( "dd-MM-yyyy HH:mm:ss"); 
		 LocalDateTime myObj = LocalDateTime.now(); 
		 Scanner in = new Scanner(System.in);
		// Try Class 
		 int a = in.nextInt();
		System.out.println("meghdar bede");

		if( a != (int) a){
			System.out.println("meghdar eshtebas");
		} else {


		try { 

			// parse method is used to parse 
			// the text from a string to 
			// produce the date 

			final String start_date;
			final String end_date;
			final Date d1 = sdf.parse(start_date); 
			final Date d2 = sdf.parse(end_date); 

			// Calucalte time difference 
			// in milliseconds 
			final long difference_In_Time 
				= d2.getTime() - d1.getTime(); 

			// Calucalte time difference in seconds, 
			// minutes, hours, years, and days 
			final long difference_In_Seconds 
				= TimeUnit.MILLISECONDS 
					.toSeconds(difference_In_Time) 
				% 60; 

			final long difference_In_Minutes 
				= TimeUnit 
					.MILLISECONDS 
					.toMinutes(difference_In_Time) 
				% 60; 

			final long difference_In_Hours 
				= TimeUnit 
					.MILLISECONDS 
					.toHours(difference_In_Time) 
				% 24; 

			final long difference_In_Days 
				= TimeUnit 
					.MILLISECONDS 
					.toDays(difference_In_Time) 
				% 365; 

			final long difference_In_Years 
				= TimeUnit 
					.MILLISECONDS 
					.toDays(difference_In_Time) 
				/ 365l; 

			// Print the date difference in 
			// years, in days, in hours, in 
			// minutes, and in seconds 
			System.out.print( 
				"Difference"
				+ " between two dates is: "); 

			// Print result 
			System.out.println( 
				difference_In_Years 
				+ " years, "
				+ difference_In_Days 
				+ " days, "
				+ difference_In_Hours 
				+ " hours, "
				+ difference_In_Minutes 
				+ " minutes, "
				+ difference_In_Seconds 
				+ " seconds"); 
		} 
		catch (final ParseException e) { 
			e.printStackTrace(); 
		} 
	}

	
	} 
} 

