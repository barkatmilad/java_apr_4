package assingments;


public class Birds {
	
	// First Step: We should make object ( make variable)
	String color;
	boolean canFly;
	
	// Step 2: Make a constructor.
	// Note Constructor does not have data type and must be as same as class name.
	public Birds(String color, boolean canFly) {
		this.color = color;
		this.canFly = canFly;
	}
	// Step 3: Create method.
	public void birdsInfo() {
		System.out.println(" color ="+ color);
		System.out.println(" canFly ="+ canFly);
	}
	
	public static void main(String[] args) {
		// Step 4: Make method.
				Birds parrot = new Birds(" Green",true);
				Birds eagle = new Birds(" Brown", true);
				Birds ostrich = new Birds(" Brown", false);
				//Step 5: Call the method. 
				// How to call the method? First Write the Object you created and then write the method name. parrot.birdsInfo();
				parrot.birdsInfo();
				eagle.birdsInfo();
				ostrich.birdsInfo();		
	}
}
