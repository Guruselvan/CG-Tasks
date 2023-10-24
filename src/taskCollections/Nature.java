
package taskCollections;

// List pgrm
import java.util.*;

public class Nature {
	
	private static int size;

	public static void main(String[] args) {
		List <String>li = new ArrayList<>();
		li.add("sound");
		li.add("like");
		li.add("a");
		li.add("horror");
		li.add("movie");
		li.add("movie");
		li.add("a");
		System.out.println(li);
		
		Integer size = li.size();
		System.out.println(size);
		
//		String got = li.get(4);
//		System.out.println(got);
		
//		for (int i = 0; i <li.size(); i++) {
//			String st= li.get(i);
//			System.out.println(st);
//			
//		}
//		for (String sms : li) {
//			System.out.println(sms);	
//		}
//		Collections.sort(li);
//		System.out.println(li);
//		

		
		ListIterator<String> std = li.listIterator();
		while (std.hasNext()) {
			System.out.println(std.next());		
		}
		Collections.reverse(li);
		System.out.println(li);
		
		while(std.hasPrevious()) {
			System.out.println(std.previous());
		}
		int al =li.lastIndexOf("a");
		System.out.println(al);
		
		int am= li.indexOf("a");
		System.out.println(am);
		
		boolean as= li.contains("a");
		System.out.println(as);
		
		List<String> le = new LinkedList<>();
		le.add(0, "horror");
		le.add(1, "sound");
		le.add(2, "galaxy");
		
		int ab = le.size();
		System.out.println(ab);
		
		boolean check =le.equals(li);
		System.out.println(check);
	}

}
