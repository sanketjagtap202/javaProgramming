package day2;

public class StaticMain {
	public static void main(String[] args) {
		System.out.println(StaticExample.a);
//		System.out.println(b);
		StaticExample.m1();
//		m2();
		StaticExample se = new StaticExample();
		se.m2();
		System.out.println(se.b);
	}
}
