package demo;

import practice.C3;

public class Calculator {
	public void add (int a, int b) {
		System.out.println(a+b);
	}
	
	public void multiply(int a, int b) {
		System.out.println(a * b);
		
	}
	
	public void subtract(int a, int b) {
		System.out.println(a-b);
	}
	
	public void divide(int a, int b) {
		System.out.println(a/b);
	}
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		Calculator pincel = new Calculator();
		cal.add(45, 5);
		cal.multiply(3, 4);
		cal.subtract(4, 2);
		cal.divide(100, 20);
		cal.divide (100, 3);
		
		C3 c3 = new C3();
		c3.cup();
	}
//	 I want to make this change and see if i can see any change in GitGub.

}
