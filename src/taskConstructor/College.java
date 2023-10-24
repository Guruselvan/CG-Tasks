package taskConstructor;

public class College extends School{
	
	public College() {
		this("xyz");
		System.out.println("Default Constructor");	
	}
	public College(int id) {
		this(123.67f);
		System.out.println("Interger Constructor");
	}
	public College(String name) {
		this(22);
		System.out.println("String Constructor");
	}
	public College(Float id) {
		this(true);
		System.out.println("Float Constructor");
	}
	public College(Boolean doubt) {
		super();
		System.out.println("Boolean Constructor");
	}

	public static void main(String[] args) {
		College st=new College();
		
	}
}
