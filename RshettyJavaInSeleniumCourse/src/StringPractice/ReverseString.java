package StringPractice;

public class ReverseString {

	public static void main(String[] args) {

		String str = "madam";
		String res = " ";

		for (int i = str.length() - 1; i >= 0; i--) {
			res = res + str.charAt(i);

		}
		System.out.println(res);

		if (res.contains(str)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

	}

}
