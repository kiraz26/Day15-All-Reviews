package strings;

import java.util.Scanner;

public class Chopper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("String to chop:");
		
		String word = input.next();
		
		for (int index = 0; index < word.length(); index++) {
			//System.out.println(word.substring(index, index+=2));
			if(index+1 < word.length()) {
				System.out.println(word.charAt(index)+""+word.charAt(index+1));
				index++;
			}else {
				System.out.println(word.charAt(index));
			}
		}
		
	}

}
