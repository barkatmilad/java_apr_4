package demo;

public class Mobile {
	String color;
	int bettryBackup;
	double screenSize;
	
	public Mobile(String mobilecolor, int bettryTime, double screenOfSize) {
		color = mobilecolor;
		bettryBackup = bettryTime;
		screenSize = screenOfSize;
	}
	public void printMobleProperties() {
		System.out.println("color of mobile ="+ color);

	}
	
	
	
	
	public static void main(String[] args) {
		Mobile apple = new Mobile("White", 15,6);
	}

}
