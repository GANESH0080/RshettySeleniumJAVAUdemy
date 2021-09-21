package NestedLoop;

public class NestedOneMore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 4; i++) {

			for (int j = 1; j <= 1 + i; j++) {

				System.out.print(j);

				System.out.print("\t");

			}
			System.out.println("");

		}

	}
}

/*
 * 1 1 2 1 2 3 1 2 3 4
 */