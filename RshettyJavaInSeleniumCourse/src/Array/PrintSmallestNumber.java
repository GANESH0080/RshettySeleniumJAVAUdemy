package Array;

public class PrintSmallestNumber {

	public static void main(String[] args) {

		int b[][] = { { 100, 29, 30 }, { 20, 5, 60 }, { 7, 8, 90 } };
		int min = b[0][0];

		for (int i = 0; i < 3; i++) { // Outer for loop stands for ROW

			for (int j = 0; j < 3; j++) { // Inner for loop stands for column

				if (b[i][j] < min) {

					min = b[i][j];
					System.out.println("Lowest values:" + min);

				}
				else {
					System.out.println(b[i][j]);
				}

			}

		}

	}

}