//Test class to create Complex no.s and adding them
package televisionAssignment;

import java.util.Scanner;

public class ComplexTest {

	float realResult;
	float imagineryResult;

	public static void main(String[] args) {

		Complex complex1 = new Complex();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter real and imaginery part of the complex number");
		float real = scanner.nextFloat();
		float imaginery = scanner.nextFloat();
		complex1.set(real, imaginery);

		Complex complex2 = new Complex();

		System.out.println("Enter real and imaginery part of the 2nd complex number");
		float real2 = scanner.nextFloat();
		float imaginery2 = scanner.nextFloat();
		complex2.set(real2, imaginery2);

		Complex complexSum = new Complex();

		complexSum = complexSum.sum(complex1, complex2);

		System.out.println("Complex no. 1 is: ");
		complex1.disp();
		System.out.println("Complex no. 2 is: ");
		complex2.disp();
		System.out.println("Complex no. after addition is: ");
		complexSum.disp();

	}
}
