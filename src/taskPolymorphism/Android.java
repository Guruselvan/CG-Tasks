package taskPolymorphism;

public class Android extends Mobile {
	
	public void samsung(double rollNo) {
		System.out.println("Roll No "+ rollNo);
	}
	public void samsung(String name,long price) {
		System.out.println("moblie "+ name);
		System.out.println("Price " + price);
		
	}
	public static void main(String[] args) {
		Android m = new Android();
		m.samsung(234.56);
		m.samsung("Sound", 20989l);
	}

}
