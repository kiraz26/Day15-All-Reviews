package numbers;

import java.util.Scanner;

public class PrintEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a first number:");
		int number1 = input.nextInt();
		System.out.println("Enter a first number:");
		int number2 = input.nextInt();

		System.out.println("Even or odd mode:");
		String mode = input.next();

		if (number1 < number2) {
			for (int i = number1; i <= number2; i++) {
				if (mode.equalsIgnoreCase("even") && i % 2 == 0) {

					System.out.print(i+" ");
				} else if (mode.equalsIgnoreCase("odd") && i % 2 == 1) {
					System.out.print(i+" ");
				}

			}
		} else if (number1 > number2) {
			for (int i = number1; i >= number2; i--) {
				if (mode.equalsIgnoreCase("even") && i % 2 == 0) {

					System.out.print(i+" ");
				} else if (mode.equalsIgnoreCase("odd") && i % 2 == 1) {
					System.out.print(i+" ");
				}
			}
		} else {
			System.out.println(number1);
		}

	}

}
