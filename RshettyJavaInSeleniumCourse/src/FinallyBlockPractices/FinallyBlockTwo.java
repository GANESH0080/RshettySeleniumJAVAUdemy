package FinallyBlockPractices;

public class FinallyBlockTwo {

	public static void main(String[] args) {
		int a = 9;
		int b = 0;

		try {
			int k = a / b;
			System.out.println(k);

		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Handled Exceltion");
		} finally {
			System.out.println("Closing");
		}

	}

}
