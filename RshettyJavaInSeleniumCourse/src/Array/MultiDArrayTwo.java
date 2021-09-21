package Array;

public class MultiDArrayTwo {

	public static void main(String[] args) {
		int b[][] = { { 10, 20, 30 }, { 40, 50, 60 } };
		System.out.println(b[1][1]);

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		for (int i = 0; i < 2; i++) {  // Outer for loop stands for ROW
			for (int j = 0; j < 3; j++) { // Inner for loop stands for column
				System.out.print(b[i][j]);
				System.out.print("\t");
			}
			System.out.println("");
		}

	}

}

// 10 20 30  0th row
// 40 50 60  1st row