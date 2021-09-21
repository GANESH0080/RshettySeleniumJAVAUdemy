package NonStatic;

public class NonStaticVariable {

	int a = 14;
	public static void main(String[] args) {
		// If you want to access non static variable in static method 
		// Then create Object for that class and access
		NonStaticVariable obj = new NonStaticVariable();
		System.out.println(obj.a);
	
	}

}
