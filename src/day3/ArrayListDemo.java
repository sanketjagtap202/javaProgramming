package day3;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList mylist = new ArrayList();
		mylist.add("welcome");
		mylist.add(120);
		mylist.add(true);
		mylist.add(10.39);
		mylist.add(10.23f);
		mylist.add(null);
		mylist.add(120);
		System.out.println(mylist);
		System.out.println(mylist.size());
		mylist.remove(6);
		System.out.println(mylist);
		mylist.add(1, "Hello");
		System.out.println(mylist);
		System.out.println(mylist.get(3));
		for (Object object : mylist) {
			System.out.println(object);
		}
	}

}
