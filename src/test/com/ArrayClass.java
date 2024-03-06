package test.com;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// int[] numbers = new int[5]; // Declaration and initialization with size 5
		

	// Initializing with values new dataaaaa  132132131313131313
	int[] numbers = { 1, 2, 3, 4, 5 };
	
	System.out.println(numbers[4]);

	int[] numberr = { 8, 9, 4, 5, 6 };
	System.out.println(numberr[3]);
	String[] names = { "Alice", "Bob", "Charlie", "qq", "ww", "ee", "rr", "tt" };
	for (String name : names) {
	    System.out.println(name);

	//System.out.println(names[1]   +" "+names[2] + " "+ names[3] + " "+ names[4] + " "+ names[5] + " "+ names[2]);

	LocalDateTime currentDateTime = LocalDateTime.now();
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	String formattedDateTime = currentDateTime.format(formatter);

	System.out.println(formattedDateTime); // Print the formatted date and time

	}
	/*
	 * DayOfWeek today = DayOfWeek.MONDAY; System.out.println(DayOfWeek.WEDNESDAY);
	 */
	for (DayOfWeek day : DayOfWeek.values()) {
		System.out.println(day);
		System.out.println(day.ordinal());
	}
	

}
	public enum DayOfWeek {
	    MONDAY,
	    TUESDAY,
	    WEDNESDAY,
	    THURSDAY,
	    FRIDAY,
	    SATURDAY,
	    SUNDAY
	}
	
}