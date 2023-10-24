package taskControlStatements;

import java.util.Scanner;

public class VotingIfElse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if (age>=60) {
			System.out.println("Senior Citizen " + age);
			
		} else {
			System.out.println("Citizen " + age);

		}
	}

	


}
