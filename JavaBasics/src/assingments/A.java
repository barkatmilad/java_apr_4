
package assingments;

	//if we want to make Class A child of C class, we must write: (public void A extends C).
	//if we make Class A child of Class C, we can access to the methods from Class C (Pizza) and from Class A (Fries and Rice).
public class A extends C{
	
	public void fries() {
		System.out.println("1: I like fries.");
	}
	
	public void rice() {
		System.out.println("2: I like rice.");
	}
	public static void main(String[] args) {
		//object class = new class();
		// if we make Class A child of Class C, we can access to the methods from Class C (Pizza) and from Class A to (Fries and Rice).
		
		A a = new A();
		a.fries();
		a.rice();
		
		// We already made Class A child of Class C. Now we are going to acquire the properties of parent class and run their data in this class.
		// the idea behind of this method is , easy access to the data of another class without retyping the whole data in this class.
		//just follow inheritance method and easily access to data from another class.
		a.pizza();
		
	}

}
