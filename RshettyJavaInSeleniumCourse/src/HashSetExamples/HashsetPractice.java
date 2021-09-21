package HashSetExamples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashsetPractice {

	public static void main(String[] args) {
		HashSet<String> st = new HashSet<String>();
		st.add("Ganesh");
		st.add("Mahadev");
		st.add("Salunkhe");
		st.add("Om");
		st.add("Shri");
		st.add("Latika");
		st.add("Om");

		System.out.println(st);

		st.clear();

		System.out.println(st.isEmpty());

		System.out.println(st);

		System.out.println(st.size());

		st.add("Ganesh");
		st.add("Mahadev");
		st.add("Salunkhe");
		st.add("Om");
		st.add("Shri");
		st.add("Latika");
		st.add("Om");

		System.out.println(st);

		Iterator<String> it = st.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());
		}

	}
}
