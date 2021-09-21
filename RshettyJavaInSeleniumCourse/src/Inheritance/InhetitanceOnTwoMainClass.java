package Inheritance;

public class InhetitanceOnTwoMainClass {

	public static void main(String[] args) {
		
		InheritanceChild c = new InheritanceChild(); 
		System.out.println(c.i);
		
		InheritanceParent p = new InheritanceParent();
		System.out.println(p.i);
		
		
		InheritanceParent pc = new InheritanceChild();
		System.out.println(pc.i);
		
	}

}
