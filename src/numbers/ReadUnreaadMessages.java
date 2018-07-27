package numbers;

import java.util.Scanner;

public class ReadUnreaadMessages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("How many unread messages: ");
		int unread=input.nextInt();
		System.out.println("How many read messages: ");
		int read=input.nextInt();
	
		while(unread > 0) {
			System.out.println("Reading a message...");
			unread--;
			read++;
			System.out.println("Total unread: "+unread);
			System.out.println("Total read: "+read);

		}
		

	
	}

}
