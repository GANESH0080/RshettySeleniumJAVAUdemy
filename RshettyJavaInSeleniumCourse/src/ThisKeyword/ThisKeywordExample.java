package ThisKeyword;

public class ThisKeywordExample {
	int a = 10;

	public void methodOne() {
		int a = 5;
		System.out.println(a);
		System.out.println(this.a);
	}

	public static void main(String[] args) {

		ThisKeywordExample cd = new ThisKeywordExample();
		cd.methodOne();
	}

}
