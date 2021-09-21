package NonStatic;

public class NonStaticVariableMethod {

	int a = 50;

	public void methodA() {
		int x = 20;
		System.out.println(x);
	}

	public static void main(String[] args) {

		NonStaticVariableMethod obj = new NonStaticVariableMethod();
		System.out.println(obj.a);
		obj.methodA();
		
	}

}
