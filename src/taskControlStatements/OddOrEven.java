package taskControlStatements;

public class OddOrEven {
		
	public static void main(String[] args) {
		
		for (int i = 10; i <10; i++) {
			if (i%2==0) {
				System.out.println("Even Number " +i );
				if (i==6) {
					//System.out.println("Even Number " +i);
					continue;

				}
				System.out.println("Even Number " +i);
			}
		}
		
	}

}
