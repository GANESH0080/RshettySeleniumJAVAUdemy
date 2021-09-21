package ConstructorExamples;

public class ConstrctorOne {

	public ConstrctorOne() {
		System.out.println("Constrctor");
	}

	public void getData() {
		System.out.println("Method");
	}

	public static void main(String[] args) {

		ConstrctorOne cd = new ConstrctorOne();
		cd.getData();
	}

}
