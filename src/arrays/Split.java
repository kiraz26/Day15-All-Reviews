package arrays;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "find out how many spaces";
		int first = sentence.length();
		int second = sentence.replaceAll(" ", "").length();

		int result = first - second;
		int numberOfWord = result + 1;
		System.out.println("Number of words in sentence: " + numberOfWord);

		// Using split method in String class

		String[] arrWords = sentence.split(" ");
		System.out.println("Number of words: " + arrWords.length);
		for (String word : arrWords) {
			System.out.println(word);
		}

	}

}
