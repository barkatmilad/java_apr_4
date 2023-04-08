package abstraction;

public class Deer1 extends Abstract1 implements Interface1 {

	@Override
	public void color() {
		System.out.println(" Deer color is brown");
		
	}

	@Override
	public void weight() {
		System.out.println(" Deer weight is 28kg");
		
	}

	@Override
	public void height() {
		System.out.println(" Deer height is 1m ");
		
	}

	@Override
	public void friendly() {
		System.out.println(" Deer is the friendlyest animal in the world");
		
	}

}
