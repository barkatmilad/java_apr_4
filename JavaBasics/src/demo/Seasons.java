package demo;

public class Seasons {
	protected void winter() {
		System.out.println("Winter are so clod");
	}
	
	protected void summers(){
		System.out.println("summers are so hot");
	}
	public void spring() {
		System.out.println("This is the season that all the Plant and vegetable become green");
	}
	
	
	
	public void fall() {
		System.out.println("I love fall seasons");
	}
	
	
	
	public static void main(String[] args) {
		Seasons seasons = new Seasons();
		seasons.winter();
		seasons.summers();
		seasons.fall();
		seasons.fall();
		seasons.spring();
	}

}
