package abstraction;

public class Dog extends Animal implements SpecialBehavior {
	
	public void eats() {
		System.out.println(" A dog ests 2 kg Feash daily.");
	}
	
	public void sleep() {
		System.out.println(" A dog sleeps 11 hour daily");
	}
	
	public void runs() {
		System.out.println(" A dog can run maximum 75 KmPH");
	}
	
	public void pet() {
		System.out.println(" People like pets");
	}

	
	

}
