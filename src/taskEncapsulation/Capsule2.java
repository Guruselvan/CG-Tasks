package taskEncapsulation;

public class Capsule2 {
	public static void main(String[] args) {
		
		Capsule a1 = new Capsule();
		a1.setData("Soundhar");
		a1.setDigit(124.56f);
		a1.setPhNo(9004904l);
		
		System.out.println(a1.getData()+" "+ a1.getPhNo() +" "+ a1.getDigit()+"");
	}

}
