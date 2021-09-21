package Array;

public class MultiDArray {

	public static void main(String[] args) {
		int a[][] = new int[3][3];
		// a[row][column]
		a[0][0] = 10;
		a[0][1] = 20;
		a[0][2] = 30;

		a[1][0] = 40;
		a[1][1] = 50;
		a[1][2] = 60;

		a[2][0] = 70;
		a[2][1] = 80;
		a[2][2] = 90;

		System.out.println(a[2][2]);
		System.out.println(a[0][1]);
		System.out.println(a[1][2]);

		System.out.println("___________________________________________________________________");
		// 10 20 30
		// 40 50 60
		// 70 80 90

		for (int i = 0; i < 3; i++) { // Outer for loop stands for ROW
			for (int j = 0; j < 3; j++) {   // Inner for loop stands for column
				System.out.print(a[i][j]);
				System.out.print("\t");
			}
			System.out.println("");
		}
	}

}
