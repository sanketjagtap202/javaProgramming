package day2;

public class OverloadingDemo {

	void add(int a, int b) {

		System.out.println((a + b));
	}

	void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	void add(String a, String b) {
		System.out.println(a + " " + b);
	}

}
