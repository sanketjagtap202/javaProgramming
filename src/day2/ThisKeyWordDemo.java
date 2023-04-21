package day2;

public class ThisKeyWordDemo {

	String name;
	int id;

	void setData(String name, int id) {

		this.name = name;
		this.id = id;
	}

	void displayData() {
		System.out.println("Name of student is: " + name);
		System.out.println("Id of student is: " + id);
	}

	public static void main(String[] args) {

		ThisKeyWordDemo tk = new ThisKeyWordDemo();
		tk.setData("Sanket", 10);
		tk.displayData();

	}

}
