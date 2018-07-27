package numbers;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {

		Scanner input= new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=input.nextInt();

		boolean prime=true;
		
		if (num <= 1) {
			System.out.println("Number is not prime");
		}else if(num >=2) {
			
			for (int div = 2; num > div; div++) {
				if(num%div == 0) {
					prime=false;
					break;
				}

			}
			
			if(prime) {
				System.out.println("Prime number");
			}else {
				System.out.println("not prime");
			}
		}
		
		
		
		
		
		
		
		
	}
}