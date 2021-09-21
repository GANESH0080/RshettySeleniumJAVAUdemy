package VariableTypes;

public class VariableTypeExample {

	String name; // name and address are the instance variable because both are changing once the
					// new object created
	String address;
	static String city = "Mumbai"; // City is comman for all the object then we can define as static and static is
									// applicable for whole class
	// city is class variable

	static int i = 0;
	int b = 0;

	public VariableTypeExample(String name, String address) {
		this.name = name;
		this.address = address;
		i++;
		b++;
		System.out.println("I value is:" + i);
		System.out.println("B value is:" + b);
	}

	public void getaddress() {
		System.out.println(address + " " + city);
	}

	public static void getCity() {
		// We cant access non static varibale in static method
		System.out.println(city);
	}

	public static void main(String[] args) {

		VariableTypeExample cd = new VariableTypeExample("Ganesh", "Kalamboli");
		VariableTypeExample cd1 = new VariableTypeExample("Deepak", "Vashi");
		cd.getaddress();
		cd1.getaddress();
		// We can access static method using classname
		VariableTypeExample.getCity();

	}

}
