//Test class to input Time & get sum of 2 different Times
package televisionAssignment;

import java.util.Scanner;

public class TimeTest {

	int hoursResult;
	int minutesResult;

	public static void main(String[] args) {

		Time time1 = new Time();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter hours and minutes of the 1st time");
		int hours = scanner.nextInt();
		int minutes = scanner.nextInt();
		time1.setTime(hours, minutes);

		Time time2 = new Time();

		System.out.println("Enter hours and minutes of the 2nd time");
		int hours2 = scanner.nextInt();
		int minutes2 = scanner.nextInt();
		time2.setTime(hours2, minutes2);

		Time timeSum = new Time();

		timeSum = timeSum.sum(time1, time2);

		System.out.println("Time 1 is: ");
		time1.showTime();
		System.out.println("Time 2 is: ");
		time2.showTime();
		System.out.println("Time after addition is: ");
		timeSum.showTime();

	}
}
