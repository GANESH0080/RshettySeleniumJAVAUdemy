package NestedLoop;

public class NestedLoopone {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			System.out.println("Outer loop started");
			System.out.println("I values is : " + i);
			for (int j = 0; j < 10; j = j + 2) {
				System.out.println("Inner loop started");
				System.out.println("J value is : " + j);
			}
			System.out.println("Outer loop finished");
		}

	}

}

/*
 * 1 0 2 4 6 8
 * 
 * 2 0 2 4 6 8
 * 
 * 3 0 2 4 6 8
 * 
 * 4 0 2 4 6 8
 * 
 * 5 0 2 4 6 8
 * 
 * 6 0 2 4 6 8
 * 
 * 7 0 2 4 6 8
 * 
 * 8 0 2 4 6 8
 * 
 * 9 0 2 4 6 8
 * 
 */