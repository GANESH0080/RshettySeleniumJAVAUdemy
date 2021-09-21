package AbstractClassExamples;

public class ChildAirEmirates extends ParentAirCraft {

	public static void main(String[] args) {
		ChildAirEmirates child = new ChildAirEmirates();
		child.sefetyGuideline();
		child.bodyColor();
		child.engine();

	}

	@Override
	public void bodyColor() {
		System.out.println("Follow Body color Guidelines");

	}

}
