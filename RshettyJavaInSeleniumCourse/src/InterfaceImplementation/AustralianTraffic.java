package InterfaceImplementation;

import Interface.CentralTrafficInterface;

public class AustralianTraffic implements CentralTrafficInterface {

	public static void main(String[] args) {
		CentralTrafficInterface as = new AustralianTraffic();
		as.greenGo();
		as.redStop();
		as.yellowFlash();
		System.out.println(as.i);
		
		AustralianTraffic OC = new AustralianTraffic();
		OC.ownClassMethod();

	}

	@Override
	public void greenGo() {
		System.out.println("Please GO");

	}

	@Override
	public void redStop() {
		System.out.println("Please STOP");

	}

	@Override
	public void yellowFlash() {
		System.out.println("Please FLASH");
		
	}
	public void ownClassMethod()
	{
		System.out.println("Own class methods");
	}

}
