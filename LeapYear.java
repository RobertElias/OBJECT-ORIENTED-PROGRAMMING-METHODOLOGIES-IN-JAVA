import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args){
	// Create a Scanner to input year
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a year: ");
	int year = input.nextInt();
	
	//Check if the year is a leap year on input
	boolean inLeapYear =
			(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	
	//Display the results
	System.out.println(year + " is a leap year? " + inLeapYear);
	}
}
