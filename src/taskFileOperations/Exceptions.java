package taskFileOperations;

import java.io.FileReader;
import java.io.IOException;

public class Exceptions {
	
	public static void main(String[] args) {
		
		int a[] = new int[2];
		a[0] = 1;
		a[1]= 2;
		
		try {
			System.out.println(a[2]);
		} 
		catch (Exception e) {
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Good");
	}

}

