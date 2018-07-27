package arrays;

public class ReplaceB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String words[]= {"Bananas","Blueberries", "Cherries", "Broccoli","Butternut Squash", "Green bean", "Peanut"};
		
		for(int i = 0; i < words.length; i++) {
			words[i]=words[i].replaceAll("B", "V");
			words[i]=words[i].replaceAll("b", "v");
			System.out.println(words[i]);
		}
		
		for(String word : words) {
			System.out.print(word+", ");
		}
		
		
		
	}

}
