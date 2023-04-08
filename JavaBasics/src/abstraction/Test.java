package abstraction;

public class Test {
	
	public static void main(String[] args) {
		
		Animal aa = new Cat();
		aa.eats();
		aa.sleep();
		aa.runs();
		
		Animal dd = new Dog();
		dd.eats();
		dd.sleep();
		dd.runs();
		
		Animal lo = new Loin();
		lo.eats();
		lo.sleep();
		lo.runs();
		
		SpecialBehavior b = new Cat();
		b.pet();
		
		SpecialBehavior d = new Dog();
		d.pet();
	}

}
