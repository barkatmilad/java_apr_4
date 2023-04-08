package abstraction;

public class Method1 {
	
	public static void main(String[] args) {
		Abstract1 ae = new Elephant1();
		ae.color();
		ae.weight();
		ae.height();
		
		Abstract1 ad = new Deer1();
		ad.color();
		ad.weight();
		ad.height();
		
		Abstract1 az = new Zebra1();
		az.color();
		az.weight();
		az.height();
		
		Interface1 af = new Elephant1();
		af.friendly();
		
		Interface1 da = new Deer1();
		da.friendly();
	}
}
