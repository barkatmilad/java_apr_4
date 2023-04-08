package assingments;

	// if we want to make Class D child of C class, we must write: (public void D extends C).
	// if we make Class D child of Class C, we can access to the methods from Class C (Pizza) and from Class D (Burger and Roll).
public class D extends C {
	
	public void burger() {
		System.out.println(" burger is made of vegetable and fries.");
	}
	
	public void roll() {
		System.out.println( " We have Chicken Roll.");
	}
	
	public static void main(String[] args) {
		//object class = new Class();
		D d = new D();
		
		// We already made Class D child of Class C, Now we can access to the methods from Class C (Pizza) and from Class D to (Burger and Roll).
		
		d.burger();
		d.roll();
		
		// We already made Class D child of Class C. Now we are going to acquire the properties of parent class and run their data in this class.
		d.pizza();
	}
}
