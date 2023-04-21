package day3;
/*
 * NumberFormatException
 */

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		System.out.println("Main:Start");
		m1();
		System.out.println("Main:ends");

	}

	private static void m1() {
		System.out.println("M1: Start");
		m2();
		System.out.println("m1:Ends");

	}

	private static void m2() {
		System.out.println("m2 Start");

		String s = "Welcome";
		int num = Integer.parseInt(s);
		System.out.println(num);
		System.out.println("m2 Ends");

	}

}
