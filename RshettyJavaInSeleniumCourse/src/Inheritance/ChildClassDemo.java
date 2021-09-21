package Inheritance;

public class ChildClassDemo extends ParentClassDemo {

	public void engine() {
		System.out.println("Child Class engine method");
	}

	public void colour()
	{
		System.out.println(color);
	}
	public static void main(String[] args) {
		System.out.println("Calling Parent class methods - variables using Parent class object ");
		ParentClassDemo p = new ParentClassDemo();
		System.out.println(p.color);
		p.audioSystems();
		p.brakes();
		p.Gear();
		
		
	
		System.out.println("Calling Parent and Child class methods - variables using Child class object ");
		
		ChildClassDemo c = new ChildClassDemo();
		c.engine();
		c.colour();
		c.audioSystems();
		c.brakes();
		c.Gear();
		
	}

}
