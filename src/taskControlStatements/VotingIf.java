package taskControlStatements;

import java.util.Scanner;

public class VotingIf {
	public static void main(String[] args) {
		Scanner b = new Scanner(System.in);
		int age = b.nextInt();
		if (age<=18) {
			System.out.println("Not Eligible for Voting");
			
		}
	}

}
