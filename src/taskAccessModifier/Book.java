package taskAccessModifier;

//pgrm for static in variable;

public class Book {
	
	final String c ="Speaker";
	static int a=30;
	static String  s ="Sound";
	
	public void dome() {
		int f=20;
		System.out.println(s+f);
	}
	
	public static void main (String[]args) {
		Book d = new Book();
		d.dome();
		System.out.println(s);
		System.out.println(a);
	}

}
