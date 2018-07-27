package arrays;

public class SearchResults {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// extract the count and print separately
		String googleSearchResult = "About 13,500,000 results (0.57 seconds)";
		String result[] = googleSearchResult.split(" ");
		System.out.println(result.length);
		System.out.println(result[1]);
		System.out.println(result[3].replace("(", ""));
		// 0.57 seconds
		String[] seconds = googleSearchResult.split("results");
		System.out.println(seconds.length);
		System.out.println(seconds[0]);
			 // "results" is gone
		System.out.println(seconds[1]);
		System.out.println(seconds[1].replace("(", "").replace(")", ""));

	}

}
