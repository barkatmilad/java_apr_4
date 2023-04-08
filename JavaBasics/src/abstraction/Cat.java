package abstraction;

public class Cat extends Animal implements SpecialBehavior {
	
	public void eats() {
		System.out.println(" A cat ests 1 kg Feash daily.");
	}
	
	public void sleep() {
		System.out.println(" A cat sleeps 13 hour daily");
	}
	
	public void runs() {
		System.out.println(" A cat can run maximum 76 KmPH");
	}
	
	public void pet() {
		System.out.println(" Cat is funny");
	}


}
