package collection;

import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		 LinkedList < String> afghanistan = new LinkedList<>();
		 
		 afghanistan.add(" kabul jan");
		 afghanistan.add(" Ghazni");
		 afghanistan.add(" jaghori");
		 afghanistan.add(" mazar");
		 afghanistan.add(" Paktika");
		 afghanistan.add(" bamiyan");
		 afghanistan.add(" all the nation");
		 
		 for(String t: afghanistan) {
			 System.out.println(t);
		 }
		 System.out.println( " total number of items are = " + afghanistan.size());
		 System.out.println("  The items which is stored in index 5 is " + afghanistan.get(5));
		 System.out.println(" do we have jaghori in our list " + afghanistan.contains(" jaghori"));
		 System.out.println( " Do we have DC in your list " + afghanistan.contains(" Dc"));
		 System.out.println(" in which index does the jaghori stored? " + afghanistan.indexOf(" jaghori"));
	}
}
