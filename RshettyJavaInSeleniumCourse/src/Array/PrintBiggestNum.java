package Array;

public class PrintBiggestNum {

	public static void main(String[] args) {
		int b[][] = { { 9, 2, 3 }, { 8, 5, 6 }, { 7, 3, 10 } };
		int max = b[0][0];

		for (int i = 0; i < 3; i++) { // Outer for loop stands for ROW

			for (int j = 0; j < 3; j++) { // Inner for loop stands for column

				if (b[i][j] > max) {

					max = b[i][j];
					System.out.println("Highest Value is :" + max);

				} else {
					System.out.println(b[i][j]);
				}

			}
		}
	}
}
