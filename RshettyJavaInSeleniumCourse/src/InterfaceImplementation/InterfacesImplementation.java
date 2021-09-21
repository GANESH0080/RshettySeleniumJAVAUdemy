package InterfaceImplementation;

import Interface.InterfaceOne;
import Interface.InterfaceTwo;

public class InterfacesImplementation implements InterfaceOne, InterfaceTwo {

	public static void main(String[] args) {

		InterfaceOne one = new InterfacesImplementation();
		one.InterfaceOneMethod1();
		one.InterfaceOneMethod2();
		one.InterfaceOneMethod3();
		

		InterfaceTwo two = new InterfacesImplementation();
		two.InterfaceTwoMethod1();
		two.InterfaceTwoMethod2();
		two.InterfaceTwoMethod3();
		
		InterfacesImplementation cm = new InterfacesImplementation();
		cm.ClassMethodOne();
		cm.ClassMethodTwo();

	}

	@Override
	public void InterfaceTwoMethod1() {
		System.out.println("InterfaceTwoMethod1");

	}

	@Override
	public void InterfaceTwoMethod2() {
		System.out.println("InterfaceTwoMethod2");

	}

	@Override
	public void InterfaceTwoMethod3() {
		System.out.println("InterfaceTwoMethod3");

	}

	@Override
	public void InterfaceOneMethod1() {
		System.out.println("InterfaceOneMethod1");

	}

	@Override
	public void InterfaceOneMethod2() {
		System.out.println("InterfaceOneMethod2");

	}

	@Override
	public void InterfaceOneMethod3() {
		System.out.println("InterfaceOneMethod3");

	}

	public void ClassMethodOne() {
		System.out.println("ClassMethodOne");
	}

	public void ClassMethodTwo() {
		System.out.println("ClassMethodTwo");
	}

}
