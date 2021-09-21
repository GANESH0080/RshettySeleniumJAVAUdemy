package ArrayListExamples;

import java.util.ArrayList;

public class ArrayListOne {

	public static void main(String[] args) {
		ArrayList<Integer> st = new ArrayList<Integer>();
		st.add(10);
		st.add(20);
		st.add(30);
		st.add(40);
		st.add(50);
		st.add(60);
		st.add(40);
		System.out.println("ArrayList before Editing/ Removing" + st);
		st.remove(2);
		System.out.println("ArrayList after Editing / Removing" + st);
		System.out.println("Checking arraylist is Empty or not:" + st.isEmpty());
		System.out.println("Get the value of index 1 is: " + st.get(1));
		st.set(0, 5);
		System.out.println("Printing the arraylist once we added 5 at index 0" + st);
		System.out.println("Checking specific value avaialble in Arralisty or not:" + st.contains(59));
		System.out.println("index of 60 is:" + st.indexOf(60));
		System.out.println("Size of Arraylist is: " + st.size());
	}
}
