package taskString;

public class StringReverse {
	
	public static void main(String[] args) {
		String s ="Welcome to IT World";

		for (int i = s.length()-1; i >=0; i--) {
			char sm =  s.charAt(i);
			System.out.println(sm);
			
		}
	}
}
