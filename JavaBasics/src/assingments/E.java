package assingments;

	// if we want to make E Class child of C Class, we must write (public void class E extends C).
	//if we make Class E child of Class C, we can access to the methods from Class C (Pizza) and from Class E to (Chips, Sandwich and Spring_Roll).
public class E extends C {
	
	public void chips() {
		System.out.println(" 1: Chips made of potato");
	}
	
	public void sandwich() {
		System.out.println(" 2: We have different types of Sandwich");
	}
	
	public void spring_roll () {
		System.out.println(" 3: I do not know what is Spring_Roll");
	}
	
	public static void main(String[] args) {
		//object class = new Class();
		// We already made Class E child of Class C, now we can access to the methods from Class C (Pizza) and from Class E to (Chips, Sandwich and Spring_Roll).
		E e = new E();
		// Running the methods.
		e.chips();
		e.sandwich();
		e.spring_roll();
		
		// Now we want to acquire to parent in Child class . we already made the Class of E child of Class C and now want to run the date from C class in E class.
		e.pizza();
		// I like homemade pizza, The result we got in the bottom is from parent class.
		e.pizza();
		
	}

}
