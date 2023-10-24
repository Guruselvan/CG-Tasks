package taskConstructor;

public class School {
	
	static final int id =100;
	
	public School() {
		System.out.println("Par Default Constructor");
	}
	public School(int id) {
		this();
		System.out.println("Par Integer Constructor");
	}
	public static void main(String[]args) {
		School a = new School();

	}
}
