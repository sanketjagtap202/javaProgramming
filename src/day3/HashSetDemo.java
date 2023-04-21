package day3;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {

		// 1. Creation of HashSet:
		// HashSet mySet = new HashSet();
		// Set<Integer> mySet = new HashSet<Integer>();
		Set mySet = new HashSet();

		// Adding value to hashset: indexing not follow, duplicate not allowed.
		mySet.add("Welcome");
		mySet.add(100);
		mySet.add(10.2);
		mySet.add(100);
		mySet.add(null);
		mySet.add(true);
		System.out.println(mySet);

		// removing value from hashset: directly pass the value.
		mySet.remove(null);
		System.out.println("After removing value:" + mySet);

		// To get all values from hashset:

		// TO insert value in the middle of hashset: no possible
		// Get specific value from hashset: not possible
		// To get/read all values from hashset: by using for loop

		for (Object object : mySet) {
			System.out.println(object);
		}
	}

}
