package day2;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {

		System.out.println("Start: main");
		m1();
		System.out.println("End: Main");

	}

	private static void m1() {
		System.out.println("Start: m1");
		m2();
		System.out.println("end: m1");

	}

	private static void m2() {
		System.out.println("Start: m2");
		try {
			int result = 10 / 0;
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("End: m2");
	}

}
