//Test class to input distances and adding them
package televisionAssignment;

import java.util.Scanner;

public class DistanceTest {

	int feetResult;
	float inchesResult;

	public static void main(String[] args) {

		Distance distance1 = new Distance();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter feet and inches part of the 1st distance");
		int feet = scanner.nextInt();
		float inches = scanner.nextFloat();
		distance1.set(feet, inches);

		Distance distance2 = new Distance();

		System.out.println("Enter feet and inches part of the 2nd distance");
		int feet2 = scanner.nextInt();
		float inches2 = scanner.nextFloat();
		distance2.set(feet2, inches2);

		Distance distanceSum = new Distance();

		distanceSum = distanceSum.sum(distance1, distance2);

		System.out.println("Distance no. 1 is: ");
		distance1.disp();
		System.out.println("Distance no. 2 is: ");
		distance2.disp();
		System.out.println("Distance no. after addition is: ");
		distanceSum.disp();

	}
}
