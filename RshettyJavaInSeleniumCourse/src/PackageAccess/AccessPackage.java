package PackageAccess;

import PackagesExample.*;

public class AccessPackage {

	public static void main(String[] args) {
		PackageOne c = new PackageOne();
		c.packageOneMethod();
		
		PackageTwo t = new PackageTwo();
		t.packageTwoMethod();
		

	}

}
