package demo3;

public class Calculator{
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public void add(double a, double b) {
		System.out.println(a+b);
	}
	
	public void add(int a , int b, int c) {
		System.out.println(a+b+c);
	}
	public void add(int a, int b, int c, int d) {
		System.out.println(a+b+c+d);
	}
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.add(5.5, 3.3);
		calculator.add(20, 30);
		calculator.add(20, 30,40);
		calculator.add(20, 30,40,50);
	}

}
