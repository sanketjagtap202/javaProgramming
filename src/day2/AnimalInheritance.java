package day2;

public class AnimalInheritance {

	String name;
	String color;

	public AnimalInheritance(String name, String color) {
		this.name = name;
		this.color = color;
	}

	void eat() {
		System.out.println(name + " is eating");
		System.out.println("Color is " + color);
	}

	void sleep() {
		System.out.println(name + " sleeps in night");
		System.out.println("Color is " + color);
	}

}
