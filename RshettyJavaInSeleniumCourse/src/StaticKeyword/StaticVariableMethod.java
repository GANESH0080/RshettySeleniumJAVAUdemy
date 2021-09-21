package StaticKeyword;

public class StaticVariableMethod {
	static String str = "abd";

	public static int getData() {
		int a = 10;
		return a;
	}

	public static void main(String[] args) {

		System.out.println(str);
		getData();
	}

}
