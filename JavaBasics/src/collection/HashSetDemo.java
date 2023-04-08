package collection;

import java.util.HashSet;

public class HashSetDemo {
	
	public static void main(String[] args) {
		HashSet < String> usa = new HashSet<>();
		
		usa.add(" washington dc");
		usa.add(" marylan");
		usa.add(" verginia");
		usa.add(" colifornia");
		usa.add(" new york");
		
		for( String t : usa) {
			System.out.println(t);
		}
		System.out.println(" how many items i stored in this list " + usa.size());
		System.out.println(" do we have barkat in our list? "+ usa.contains(" new york"));
		System.out.println(" find items stored in index5 " + usa.IndexOf(" new york"));
	}

}
