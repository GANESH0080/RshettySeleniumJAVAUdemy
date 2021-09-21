package Array;

public class PrintMaxNumberInCol {

	public static void main(String[] args) {
		int mincolumn = 0;
		// Find the minimum number and in that same column find the maximum number
		// 2 8 5
		// 3 4 7
		// 11 12 0

		int b[][] = { { 2, 8, 5 }, { 3, 4, 7 }, { 11, 12, 0 } };
		int min = b[0][0];

		for (int i = 0; i < 3; i++) { // Outer for loop stands for ROW

			for (int j = 0; j < 3; j++) { // Inner for loop stands for column

				if (b[i][j] < min) {

					min = b[i][j];
					System.out.println("Lowest values:" + min);
					System.out.println("Row number of Lowest value is: " + i);
					System.out.println("Column number of Lowest value is: " + j);

					mincolumn = j;

				}

			}

		}
		int max = b[0][mincolumn];

		int k = 0;
		while (k < 3) {

			if (b[k][mincolumn] > max) {
				max = b[k][mincolumn];

			}
			k++;
		}
		System.out.println("Max Number is :" + max);

	}

}
//2 8 5
// 3 4 7
// 11 12 0