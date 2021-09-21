package NestedLoop;

public class NestedAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 3;
		for (int i = 0; i < 4; i++) {

			for (int j = 3; j <= 3 +i; j++) {

				System.out.print(k);

				System.out.print("\t");
				k = k + 3;

			}
			System.out.println("");

		}

	}
}
