package taskAbstarction;

public class GetTheSamsungPrice implements Samsung{

	@Override
	public void galaxy21() {
		int m = 10;
		int n = 12;
		String o = "k";
		String p = m + n + o ;
		System.out.println("Price is " + p );
		
	}

	@Override
	public void a17() {
		System.out.println("Price drop by 10k ");
		
	}

//	public String flip(int a,String b) {
//		String c = a+b;
//		return c;
//	}
	
	@Override
	public String flip(int a, String b) {
		String c = a+b;
		return c;
	}

	

	public static void main(String[] args) {
		GetTheSamsungPrice stuf = new GetTheSamsungPrice();
		stuf.a17();
		String still =stuf.flip(14,"k");
		System.out.println(still);
		stuf.galaxy21();
		
	}





	

}
