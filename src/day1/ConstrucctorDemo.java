package day1;

public class ConstrucctorDemo {

	String lname;
	int dob;

	public ConstrucctorDemo(String lname, int dob) {
		this.lname = lname;
		this.dob = dob;
	}

	public void construct() {

		System.out.println(lname + "I am a consrtuct method");
	};

}
