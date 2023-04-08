package demo2;

public class Car {
	String color;
	String engineType;
	
	public Car(String colorOfCar, String engineOfCar) {
		color = colorOfCar;
		engineType= engineOfCar;
	}
	public void printCarinfo() {
		System.out.println("Color of car ="+ color);
		System.out.println("Type of engine = + engineType");
	}
	
	public static void main(String[] args) {
	}

}
