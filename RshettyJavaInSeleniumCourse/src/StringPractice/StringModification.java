package StringPractice;

public class StringModification {

	public static void main(String[] args) {
		String str = "  Hello Ganesh Salunkhe ";
		System.out.println("Character at index 2 is : " +str.charAt(2));
		
		System.out.println("Index of 'o' Character is" +str.indexOf("o"));
		System.out.println(str.substring(1, 7));
		System.out.println(str.substring(4));
		System.out.println(str.concat(" your trainee is 'Rahul Shetty'  "));
		System.out.println("String length is " +str.length());
		System.out.println(str.trim());
		System.out.println(str.toUpperCase());
		String arr [] = str.split("e");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(str.replace("G", "g"));
		System.out.println(str.replace("G", "M"));
				

	}

}
