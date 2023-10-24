package taskControlStatements;

//import java.util.Scanner;

public class EvenOrOdd {
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int year = sc.nextInt();
		int evenCount =0;
		int oddCount = 0;
		
		for (int i = 1; i <=10; i++) {
			if (i%2==0){
				System.out.println("Even "+ i);
				evenCount=evenCount+i;
			}
			else {
				System.out.println("Odd " + i);
				oddCount=oddCount+i;
			}
			System.out.println("Even Count"+ evenCount);
			System.out.println("Odd Count "+ oddCount);
		}
		
	}

}
