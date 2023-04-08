package demo;

public class Test { 
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		Test test = new Test();
		Seasons seasons = new Seasons();
		seasons.fall();
		
		cal.add(40, 40);
		cal.subtract(12,6);
		cal.multiply(3, 40);
		cal.divide(20,2);
	}

}
