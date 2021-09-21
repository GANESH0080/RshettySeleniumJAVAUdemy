package Interview;

import java.util.ArrayList;

public class PrintUniqueNumber 
{
	public static void main(String[] args) 
	{
		int a[] = { 3, 4, 4, 4, 0, 3, 5, 7, 7, 0 };
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			int k = 0;
			if (!al.contains(a[i])) {
				al.add(a[i]);
               k++;
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						k++;
					}
				}
				System.out.println("Element values is: " + a[i]);
				System.out.println("Element " + a[i] + " repeated : " + k + " times");
				if (k == 1) {
					System.out.println("Unique number is: " + a[i]);
				}
			}
		}
	}
}