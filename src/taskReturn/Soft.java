package taskReturn;

public class Soft {
	int amount;
	String place ;
	String name;
	
	public void amountPrice(int amount) {
		System.out.println("Amount received is "+amount);	
	}
	public String person(int amount,String name) {
		System.out.println("Amount got from "+name + " Cost is "+ amount);
		return name;
	}
	public static void main(String[] args) {
		Soft s =new Soft();
		s.amountPrice(2000);
		String f =s.person(1000, "Soundhar");
		System.out.println("Got if from "+ f);
	}

}
