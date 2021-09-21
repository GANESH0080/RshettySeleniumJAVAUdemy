package HashMapPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapOne {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(0, "Hello");
		hm.put(1, "Ganesh");
		hm.put(3, "Hi");
		hm.put(5, "Salunkhe");
		hm.put(8, "Shri");
		hm.put(10, "Ganesh");

		System.out.println(hm);

		System.out.println("Get the value of number 1 key:" + " " + hm.get(10));

		hm.remove(10);

		System.out.println(hm);

		System.out.println("Get the value of number 1 key:" + " " + hm.get(10));

		Set sn = hm.entrySet();

		Iterator it = sn.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
