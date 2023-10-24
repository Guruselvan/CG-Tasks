package taskAbstarction;

public class Mahendira implements Intel  {
	public void track() {
		System.out.println("price is 20L");
	}

//	@Override
//	public void harrier() {
//		// TODO Auto-generated method stub
//		System.out.println("price is 2L");
//	}
//
//	@Override
//	public void nexon() {
//		// TODO Auto-generated method stub
//		System.out.println("price is 1L");
//	}
//
//	@Override
//	public void punch() {
//		// TODO Auto-generated method stub
//		System.out.println("price is 10L");
//	}
	
	public static void main(String[] args) {
		Mahendira m = new Mahendira();
		m.amd();
		m.intel7();
	}

@Override
public void amd() {
	// TODO Auto-generated method stub
	System.out.println("price is 8k");
}

@Override
public void intel7() {
	// TODO Auto-generated method stub
	System.out.println("price is 12k");
}
}
