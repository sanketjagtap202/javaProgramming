package day2;

public class MethodConstructor {

	String name;
	int age;
	char grade;
	/*
	 * MethodConstructor(String n, int a, char g) { name = n; age = a; grade = g;
	 * 
	 * }
	 */

	public MethodConstructor() {
		name = "Sanket";
		age = 20;
		grade = 'B';
	}

	void show() {
		System.out.println("name of student: " + name);
		System.out.println("Age of student is: " + age);
		System.out.println("Grade of student is: " + grade);
	}

	String greeting1() {
		return "How are you?";
	}

}
