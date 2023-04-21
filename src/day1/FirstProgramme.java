package day1;

import java.util.Arrays;

public class FirstProgramme {

	String name;
	int age;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {

//		FirstProgramme firstprog = new FirstProgramme();
//		firstprog.setName("Sanket");
//		firstprog.setAge(20);
//		System.out.println(firstprog.name);
//		System.out.println(firstprog.age);

//		ConstrucctorDemo cd = new ConstrucctorDemo("Sanket", 20);
//		cd.lname = "jagtap";
//		cd.construct();

//		ConstrucctorDemo constructordemo = new ConstrucctorDemo();
//		constructordemo.setLname("Jagtap");
//		constructordemo.setDob(1995);
//		System.out.println(constructordemo.dob);
//		System.out.println(constructordemo.lname);

//		int a[] = { 10, 20, 13, 52, 12, 425, 45 };
//
//		Arrays.sort(a);
//		for (int i : a) {
//			System.out.println(i);
//		}

		// reverse String:

//		String s1 = "Hello";
//		String reStr = "";
//		for (int i = 0; i < s1.length(); i++) {
//			reStr = s1.charAt(i) + reStr;
//		}
//		System.out.println(reStr);

		// Swapping:

//		String str1 = "Good";
//		String str2 = "Morning";
//		str1 = str1 + str2;
//		System.out.println(str1); //// goodMorning
//		str2 = str1.substring(0, str1.length() - str2.length());
//		System.out.println(str2); // Good
//		str1 = str1.substring(str2.length());
//		System.out.println(str1); // Morning
//		System.out.println(str1.concat(str2)); // MorningGood

//		String s1 = "Welocome";
//		String s2 = "Back";
//		s1 = s1 + s2;
//		s2 = s1.substring(0, s1.length() - s2.length());
//		s1 = s1.substring(s2.length());
//		System.out.println(s1 + s2);

		// split:

//		String s1 = "Aman, suraj, chetan, ashish, prem";
//		String[] s2 = s1.split(",");
//		for (String string : s2) {
//			System.out.println(string);
//		}

		String x = "John";
		String y = "david";
		x = x + y;
		System.out.println(x);

		y = x.substring(0, x.length() - y.length());
		System.out.println(y);
		x = x.substring(y.length());
		System.out.println(x);
		System.out.println(x.concat(y));
	}

}
