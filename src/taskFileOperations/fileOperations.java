package taskFileOperations;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileOperations {
	
	public static void main(String[] args) {
		
		File at=new File("C:\\Users\\ASUS\\eclipse-workspace\\Intro\\NewFolder\\tamil\\songs\\story.txt");

		// To create file with sub folders 
		
//		boolean mt=  at.mkdirs();
//		System.out.println(mt);
		
		// Write a context in file
//		try {
//			FileWriter some = new FileWriter(at);
//			some.write("Sounds like a Ghost");;
//			some.close();
//		} catch (Exception e) {
//			
//			e.printStackTrace();
//		}
		
		// To read or get the context from file
		
		try {
			FileReader some = new FileReader(at);
			char[] s =new char[30];
			some.read(s);
			for (char c : s) {
				System.out.println(c);
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

		
		
		
		
	}

}
