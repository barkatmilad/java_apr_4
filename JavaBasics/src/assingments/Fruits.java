package assingments;

public class Fruits extends  {
	String color;
	String taste;
	
	public Fruits (String color, String taste) {
		this.color = color;
		this.taste = taste;
	}
	
	public void fruitsInfo() {
		System.out.println(" color =" + color);
		System.out.println(" taste ="+ taste);
	}
	public static void main(String[] args) {
		Fruits mango = new Fruits(" Yellow", "Sweet");
		Fruits orange = new Fruits(" Orange", " tangy");
		
		mango.fruitsInfo();
		orange.fruitsInfo();
	}

}
