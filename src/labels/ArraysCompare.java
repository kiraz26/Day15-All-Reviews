package labels;

public class ArraysCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] box1 = { "apples", "bananas", "carrots" };
		String[] box2 = { "bananas", "strawberries", "apples", "kiwis" };

		
		for (String fruit1 : box1) {
			boolean found = false;
			for (String fruit2 : box2) {
				if (fruit1.equals(fruit2)) {
					found = true;
					break;
				}
			}
			if (found) {
				System.out.println(fruit1 + " is in box2");
			} else {
				System.out.println(fruit1 + " is not in box2");
				
			}
		}

	}

}
