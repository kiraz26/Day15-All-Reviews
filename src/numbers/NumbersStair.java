package numbers;

public class NumbersStair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int outer = 1; outer <= 9; outer++) {
			// inner loop
			// System.out.println(outer);
			for (int inner = 1; inner <= outer; inner++) {
				System.out.print(inner);
			}

			System.out.println();

		}

	}

}
