package taskPolymorphism;

public class Mobile {
	
	public  void samsung(int a) {
		System.out.println("starts with "+ a);
	}
	public void samsung(String name , long phNo) {
		System.out.println("starts with "+ name);
		System.out.println("phonenumber "+ phNo);
	}
//	public static void main(String[] args) {
//		Mobile m = new Mobile();
//		m.samsung("sanjay",9000383l);
//		m.samsung(007);
//	}

}
