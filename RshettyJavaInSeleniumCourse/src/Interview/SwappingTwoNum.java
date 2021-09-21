package Interview;

import java.util.Scanner;

public class SwappingTwoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter value for x and y");
		
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		x = x+y;
		y = x - y;
		x = x- y;
		
		System.out.println("After Swapping: " +x+ " "+y);
				
				
}
}