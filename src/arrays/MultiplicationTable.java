package arrays;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number for multiplication:");
		int number;
		number = input.nextInt();

		for (int a = number; a <= 10; a++) {
			//nested for loop
			
			for (int i = 1; i <= 10; i++) {
				int result = a * i;
				System.out.println(a + " * " + i + " = " + result);
			}
			System.out.println("=====================");
		}
		
		
		//I would like to see only for 3 and 5 and 7
		for (int a = number; a <= 10; a++) {
			if(a!=3 && a!=5 && a!=7) {
				continue;
			}
			//nested for loop
			for (int i = 1; i <= 10; i++) {
				int result = a * i;
				System.out.println(a + " * " + i + " = " + result);
			}
			System.out.println("=====================");
		}
	}

}
