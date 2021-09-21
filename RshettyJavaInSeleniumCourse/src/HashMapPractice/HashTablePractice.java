package HashMapPractice;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTablePractice {

	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();

		ht.put(0, "Ganesh");
		ht.put(1, "Jay");
		ht.put(2, "Mitendra");
		ht.put(3, "Sushil");
		ht.put(4, "Chandni");
		ht.put(5, "Rushikesh");
		ht.put(6, "Ayan");

		System.out.println(ht);

		Set sn = ht.entrySet();
		System.out.println(sn);

		Iterator it = sn.iterator();

		while (it.hasNext()) {
			Map.Entry mp = (Map.Entry) it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}

	}

}
