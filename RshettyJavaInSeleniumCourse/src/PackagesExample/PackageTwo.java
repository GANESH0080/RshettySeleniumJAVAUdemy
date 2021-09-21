package PackagesExample;

public class PackageTwo {
	
	public void packageTwoMethod() {
		System.out.println("Mehod Two");
	}

	public static void main(String[] args) {
		PackageOne one = new PackageOne();
		one.packageOneMethod(); 

	}

}
