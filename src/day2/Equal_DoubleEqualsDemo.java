package day2;

public class Equal_DoubleEqualsDemo {

	public static void main(String[] args) {

		String s1 = new String("    Welcome    ");

		String s2 = new String("WELCOME");

		System.out.println(s1 == s2);
		System.out.println(s1.contains("X"));
		System.out.println(s1.replace("come", "Done"));
		System.out.println(s1.trim());
	}

}
