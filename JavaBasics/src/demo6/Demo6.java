package demo6;

public class Demo6 {
	
	public String getName() {
		String name = "James Bonds";
		return  name;
	}
	
	public static void main(String[] args) {
		Demo6 demo6 = new Demo6();
		String output = demo6.getName();
		System.out.println("My name is " + output);
	}

}
