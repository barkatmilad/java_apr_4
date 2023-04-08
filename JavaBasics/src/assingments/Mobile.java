package assingments;

public class Mobile {
	int batteryBackup;
	String color;
	double screenSize;
	
	public Mobile (int batteryBackup, String color, double screenSize) {
		this. batteryBackup = batteryBackup;
		this.color = color;
		this.screenSize = screenSize;
	}
	
	public void mobileInfo() {
		System.out.println(" batteryBackup =" + batteryBackup);
		System.out.println(" color="+ color);
		System.out.println(" screenSize =" + screenSize);
	}
	public static void main(String[] args) {
		Mobile apple = new Mobile( 15, " White", 6);
		Mobile samsung = new Mobile( 17," Black", 6.5);
		
		apple.mobileInfo();
		samsung.mobileInfo();
	}
	

}
