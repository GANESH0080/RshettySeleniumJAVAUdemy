package ConstructorExamples;

public class ParameterizedConstructor {

	public ParameterizedConstructor() {
		System.out.println("Constrctor");
	}

	public ParameterizedConstructor(int i, int b) {
		System.out.println(i+b);
	}

	public static void main(String[] args) {

		ParameterizedConstructor cd = new ParameterizedConstructor(5, 12);
		
		ParameterizedConstructor gh = new ParameterizedConstructor();
	}

}
