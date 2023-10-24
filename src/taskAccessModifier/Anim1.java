package taskAccessModifier;

public class Anim1 extends Animal{ 
		
		static int a =150;
	public void method() {
		//s="Track"; // We can't override the value if mentioned as final
		
		System.out.println("Time is "+ a);
		System.out.println("Name is "+s);
	}
//	public void getSome() { // Can't override the method if we mention as final but we can call the method
//		System.out.println("Oct 18");
//	}
	public static void main(String[] args) {
		Anim1 f = new Anim1();
		f.method();
		f.getSome();
		System.out.println(a);
	}
		
	

}
