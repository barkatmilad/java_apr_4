package abstraction;

public class Elephant1 extends Abstract1 implements Interface1 {

	@Override
	public void color() {
		System.out.println(" Elephant color is black");
	}

	@Override
	public void weight() {
		System.out.println(" Elephant weight is 500kg");	
	}

	@Override
	public void height() {
		System.out.println(" Elephant heiht is 3m");		
	}

	@Override
	public void friendly() {
		System.out.println(" Elephants are very friendly animals");
		
	}
}
