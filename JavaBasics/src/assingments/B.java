package assingments;
	
	//if we want to make B Class child of E Class, we must write (public void class B extends E.
	//if we make Class B child of Class E, we can access to the methods from Class E (Chips, Sandwich and Spring_Roll) and from Class B (Coke and Pepsi).
public class B extends E {
	
	public void coke() {
		System.out.println(" I like coke");
	}
	
	public void pepsi() {
		System.out.println(" I do not like pepsi");
	}
	public static void main(String[] args) {
		//object class = new class():
		//we already made Class B child of Class E, Now we can access to the methods from Class E (Chips, Sandwich and Spring_Roll), from Class B (Coke and Pepsi)...
		// and from class C ( Pizza).
		B b = new B();
		b.coke();
		b.pepsi();
		
	// now we are going to call the data from parent class in the bottom.
		b.chips();
		b.sandwich();
		b.spring_roll();
		b.pizza();
		// How we could access to Pizza from Class C even we did not made Class B child of Class C ?
		// so we have had make Class E child of Class C and now Class B is son of class E and grandson of class C.
		
	}

}
