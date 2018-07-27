package strings;

import java.util.Scanner;

public class PrintsNTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = input.next();
		System.out.println("How many times");
		int count = input.nextInt();

		String accumulator = "";
		for (int i = 1; i <= count; i++) {
			// System.out.print(str);
			accumulator += str;
		}
		System.out.println(accumulator);

	}

}
