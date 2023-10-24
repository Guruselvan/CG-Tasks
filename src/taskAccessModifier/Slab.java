package taskAccessModifier;

//Static in variable execution:
public class Slab extends Book {
	
	public void lib() {
		int m = 50;
		
		System.out.println(m+Book.s);
	}
	public static void main(String[]args) {
		Slab some = new Slab();
		some.lib();
		Book.s = "Some";
		Book.a = 70;
		System.out.println(Book.s); // If we mentioned as static it can use in any class and we can change the value also
		System.out.println(Book.a);
	}

}
