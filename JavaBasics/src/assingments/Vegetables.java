package assingments;

public class Vegetables {
	
	String color;
	String shape;
	
	public Vegetables(String color , String shape) {
		this.color= color;
		this.shape= shape;
	}
	
	public void vegetableInfo() {
		System.out.println(" Color =" +color);
		System.out.println(" Shape =" +shape);
	}
	
	public static void main(String[] args) {
		Vegetables onion = new Vegetables(" Pink"," Round");
		Vegetables potato = new Vegetables(" Brown", " Circle");
		
		onion.vegetableInfo();
		potato.vegetableInfo();
	}
}
