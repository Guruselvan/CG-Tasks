package taskConvertionOfDatatypes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemovalOfDuplicates {
	
	public static void main(String[]args) {
		
		String am[] = {"Welcome", "To", "IT" ,"World","World","IT"};
		System.out.println(am[2]);
		
		List<String> pm = Arrays.asList(am);
		

		Set<String> ac = new HashSet<>(pm);
	
		System.out.println(ac);
		
		
		
	}

}
