package taskString;

public class StringReversePgrm {
	
	public static void main(String[] args) {
		
		String am = "Welcome To The IT World";
		String rev ="";
		
		String[] split= am.split(" ");
		
//		System.out.println(split);
		
		for (int i = split[4].length()-1; i >=0; i--) {
		 char fine = split[4].charAt(i);
		 
		 rev = rev+fine;
			
		}
		System.out.println(split[0]+" "+split[1]+" " +split[2]+" "+split[3]+" "+rev);
	}
	
}
