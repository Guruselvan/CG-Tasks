package taskString;

import java.util.Iterator;

public class StringMethods {
	
	public static void main(String[] args) {
		
		String st="Sound like a King";
		String mt ="SOunds like a Elephant";
		String at = " Sound like a KinG ";
		
		System.out.println(at.charAt(15));
		System.out.println(at.equals(st));
		System.out.println(at.equalsIgnoreCase(st));
		
		System.out.println(at.contains("Sound"));
		
		System.out.println(at.trim()); 
		
		System.out.println(at.toUpperCase());
		
		System.out.println(at.toLowerCase()); 
		
		System.out.println(at.startsWith(" Sound"));
		
		System.out.println(mt.endsWith("Elephant ")); 
		
		String[] ad = at.split(" ");

		for (String atm : ad) {
			
			System.out.println(atm);
			
		}
		System.out.println(ad.hashCode());
		System.out.println(st.concat(at)); 
		System.out.println(st.hashCode());
	}
	

}
