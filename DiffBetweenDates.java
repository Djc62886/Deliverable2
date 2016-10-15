
/* This is Deliverable2 of the Java Pre Work. The task is to calculate the
 * duration between TWO dates in Years, Months, and Days. Also, the USER should be
 * able to enter the two dates as INPUT. The program should show the RESULT of the 
 * difference in TIME between these two dates.
 * @author DanielChristiansen
 */
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DiffBetweenDates {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter the the first date in the format YYYY-MM-DD: ");

		String firstDateString = scanner.nextLine();

		LocalDate firstDate = LocalDate.parse(firstDateString);

		System.out.print("Please enter the second date in the format YYYY-MM-DD: ");
		
		String secondDateString = scanner.nextLine();
		
		LocalDate secondDate = LocalDate.parse(secondDateString);
		
		Period difference = firstDate.until(secondDate);
		
		int years = difference.getYears();
		int months = difference.getMonths();
		int days = difference.getDays();
		scanner.close();

		System.out.print("The time difference between the two dates is: " + years + " Year(s), " + months + " Month(s), and " + days +" Day(s).");
	}

}
