package day2;

public class StaticExample {

	static int a = 10;
	int b = 20;

	static void m1() {
		System.out.println("Static method");
	}

	void m2() {
		System.out.println("Non-static method");
	}

	/*
	 * public static void main(String[] args) { System.out.println(a); //
	 * System.out.println(b); m1(); // m2(); StaticExample se = new StaticExample();
	 * se.m2(); }
	 */
}
