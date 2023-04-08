package Inheritance;

public class D extends F {
	public void months() {
		System.out.println( " It is March");
	}
	public static void main(String[] args) {
		D d = new D();
		d.date();
		d.months();
		d.nextYear();
	}

}
