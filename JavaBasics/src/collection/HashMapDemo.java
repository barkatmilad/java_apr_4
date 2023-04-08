package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap< String, Integer> namephone = new HashMap<>();
		namephone.put(" Barkat",202);
		namephone.put(" milad", 918);
		namephone.put(" Latif", 7744);
		namephone.put(" Afghan", +93);
		namephone.put(" usa", +1);
		
		for( Map.Entry m : namephone.entrySet()) {
			System.out.println(m.getKey() + "- " + m.getValue());
		}
		
		HashMap < String, Integer> learn = new HashMap<>();
		learn.put(" I should learn this code in one time" , 1);
		learn.put(" what time is it?", 233);
		learn.put(" How much time do you need to learn this", 1);
		
		for(Map.Entry b : learn.entrySet()) {
			System.out.println(b.getKey() + " - " + b.getValue());
		}
		
	}
}
