package numbers;

import java.util.Scanner;

public class AccountBalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int counter = 0;
		System.out.println("Enter initial balance:");
		double balance = input.nextDouble();
		do {

			System.out.println("Make a purchase");
			double transactionAmount = input.nextDouble();
			
			if(balance < transactionAmount) {
				System.out.println("no money");
				continue;
			}
				
			balance -= transactionAmount;
			counter++;
			System.out.println("Your balance: " + balance);

		} while (balance > 0);

		System.out.println("You are out of money");
		System.out.println("Your balance: " + balance);
		System.out.println("Transaction amount: " + counter);

	}

}
