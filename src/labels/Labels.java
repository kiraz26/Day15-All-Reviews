package labels;

public class Labels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CONSTRUCTION: //labels are usually uppercase

		for (int i = 1; i <= 2; i++) {
			// if (i == 4) {
			// continue CONSTRUCTION;
			// }

			for (int j = 1; j <= 7; j++) {
				if (j > 3) {
					continue CONSTRUCTION; // go to label (CONSTRUCTION)
					// break (CONSTRUCTION); go out to label (CONSTRUCTION)
				}

				System.out.println(j);

			}

		}

	}

}
