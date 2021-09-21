package ExceptionPractice;

public class ExceptionFive {

	public static void main(String[] args) {
		int a = 9;
		int b = 0;

		try {
			int k = a / b;
			System.out.println(k);

		}

		catch (IndexOutOfBoundsException ab) {
			System.out.println(ab);
			System.out.println("Handled IndexOutOfBound Exceltion");
		}

		catch (Exception e) {
			System.out.println(e);
			System.out.println("Handled Exceltion");
		}

	}
}