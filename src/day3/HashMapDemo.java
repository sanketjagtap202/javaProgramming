package day3;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapDemo {

	public static void main(String[] args) {

		// Adding data to the hashMap:
		HashMap hm = new HashMap();
		hm.put(1, 100);
		hm.put(2, "Welcome");
		hm.put(3, "Welcome");
		hm.put(3, 100);
		hm.put(4, 100);
		hm.put(5, null);
		System.out.println(hm);

		// Removing the pair:
		hm.remove(3);
		System.out.println(hm);

		// To get a specific key:

		System.out.println(hm.get(4));

		// To get all keys:
		System.out.println(hm.keySet());

		// to get all values:
		for (Object k : hm.keySet()) {
			System.out.println(hm.get(k));
		}

	}

}
