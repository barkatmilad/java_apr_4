package collection;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
//		class    Data type  object = new class<> ();   
		ArrayList <String> good = new ArrayList<>();
	
		good.add(" Rahmat");
		good.add(" Barkat");
		good.add(" Latif");
		good.add(" Monser");
		good.add(" English Class");
		good.add(" Persian Class");
		good.add(" Store element");
		good.add(" Arraylist dinamic in siza");
		good.add(" I should learn this");
		good.add(" I am practicing Arraylist");
		good.add(" how does it run");
		
		for( String b : good) {
			System.out.println(b);
		}
//			How many items are stored in arraylist?
			System.out.println(" Total items are stored in arraylist is " + good.size());
//			which items are stored in endex 1?
			System.out.println(" Item which is stored in index one is" + good.get(1));
//			what is the index of Barkat?
			System.out.println(" index of Barkat is " + good.indexOf("Barkat"));
//			Does barkat is stored in the list?
			System.out.println(" Does Barkat is stored in the list " + good.contains(" Barkat"));
		
		
	}

}
