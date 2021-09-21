package FinallyBlockPractices;

public class FinallyPractice {

	public static void main(String[] args) {

		int a = 9;
		int b = 0;

		try {
			int k = a / b;
			System.out.println(k);

		} finally {
			System.out.println("Closing");
		}

	}

}
