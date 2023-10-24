package taskControlStatements;

public class Dummy {
	public int amd() {
		int a =200;
		int b =20;
		int c = a+b;
		return c;
		
	}
	public static void main(String[] args) {
		Dummy d=new Dummy();
		int count = d.amd();
		
		if (count==220) {
			System.out.println("Equals "+ count);
			

		}
	}
	
}
