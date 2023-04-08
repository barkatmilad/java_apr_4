package Inheritance;

public class C extends F {
	public void day() {
		System.out.println(" Today is Saturday");
	}
	public static void main(String[] args) {
		C c = new C();
		c.date();
		c.day();
		c.nextYear();
	}

}
