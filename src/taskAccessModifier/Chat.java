package taskAccessModifier;
//pgrm for Global variable declaration or Instance variable

public class Chat {
	
	int a = 10; 
	String s = "Soft";
	//above int a & string s are global variables
	
	public void fb() {
		//Below int b is local variable
		int b = 20;
		System.out.println(a+b);
	}
	public void insta() {
		int c=100;
		System.out.println(s+c);
	}
	public static void main(String[]args) {
		Chat few = new Chat();
		few.fb();
		few.insta();
	}
}
