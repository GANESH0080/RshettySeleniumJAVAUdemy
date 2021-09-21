package StaticKeyword;

public class StaticVariable {

	static int a = 4;

	public static void main(String[] args) {
		// We are not able to access non static variable in static method
		// So we created that variable as static so that we can access that in static
		// method
		// If the static method is in same class then we can access static variable
		// directly
		// No need to create object for accessing
		System.out.println("Variable A value is:" + a);

	}

}
