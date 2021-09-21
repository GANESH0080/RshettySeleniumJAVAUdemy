package SuperKeyword;

public class ChildDemo extends ParentDemo {
  String name = "QA Child";
 
	public ChildDemo() {
		super();
	}

	public void varAccess() {
		System.out.println(name);
		System.out.println(super.name);
	}
	public void MethodOne(){
		super.MethodOne();
		System.out.println("Child Method");
	}

	public static void main(String[] args) {
		ChildDemo c = new ChildDemo();
		c.varAccess();
		c.MethodOne();
		
		

	}

}
