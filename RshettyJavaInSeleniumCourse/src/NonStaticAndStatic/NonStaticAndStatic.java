package NonStaticAndStatic;

public class NonStaticAndStatic {

	static int a = 50;
	int b = 66;

	public static void methodA() {
		// We can declared non static variable in static method
		int x = 20;
		System.out.println(x);

		// We cant declared static variable in static method
		// static int m = 20;

		// We can access static variable in static method
		System.out.println(a);

		// Cant access non static variable in static method
		// System.out.println(b);

	}

	public void methodB() {

		// We cant declared static variable in Non Static method
		// static int z = 90;

		// Can access static variable in non static method
		System.out.println(a);

		System.out.println(b);

	}

	public static void main(String[] args) {
		
	}

}
