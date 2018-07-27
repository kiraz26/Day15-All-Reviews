package numbers;

import java.util.Scanner;

public class ForwardOrBackward {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a first number:");
		int number1 = input.nextInt();
		System.out.println("Enter a first number:");
		int number2 = input.nextInt();

		if (number1 < number2) {
			for (int i = number1; i <= number2; i++) {
				System.out.print(i + " ");
			}
		}  else if(number1 > number2) {
			for (int i = number1; i >= number2; i--) {
				System.out.print(i + " ");
			}
		}else {
			System.out.println(number1);
		}
		
		
		

		/*System.out.println();

		if (number1 == number2) {
			System.out.print(number1 + " ");
			System.out.println();
			if (number1 % 2 == 0) {
				System.out.println(number1+" even ");
			} else {
				System.out.println(number1+" odd ");

			}

		} else {
			while (number1 < number2) {
				System.out.print(number1 + " ");
				number1++;
				if (number1 % 2 == 0) {
					System.out.println(number1+" even ");
				} else {
					System.out.println(number1+ " odd ");

				}

			}
			while (number2 < number1) {
				System.out.print(number1 + " ");
				number1--;
				if (number1 % 2 == 0) {
					System.out.println(number1+" even ");
				} else {
					System.out.println(number1+ " odd ");

				}

			}
		}*/
	}

}
