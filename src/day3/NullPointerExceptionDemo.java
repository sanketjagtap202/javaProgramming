package day3;

public class NullPointerExceptionDemo {

	public static NullPointerExceptionDemo method1() {
		return null;
	}

	public void method2() {
		System.out.println("Hello world");
	}

	public static void main(String[] args) {
		NullPointerExceptionDemo npe = NullPointerExceptionDemo.method1();
		npe.method2();
	}

}
