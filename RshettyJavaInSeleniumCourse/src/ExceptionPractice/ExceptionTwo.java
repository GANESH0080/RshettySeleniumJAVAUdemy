package ExceptionPractice;

public class ExceptionTwo {

	public static void main(String[] args) {
		int a = 9;
		int b = 0;

		try {
			int k = a / b;
			System.out.println(k);

		} 
		catch(ArithmeticException et)
		{
			System.out.println(et);
			System.out.println("Handled Arithmatic Exceltion");
		}
		catch (Exception e) {
			System.out.println(e);
			System.out.println("Handled Exceltion");
		}
	}

}
