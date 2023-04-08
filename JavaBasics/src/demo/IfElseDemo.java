package demo;

public class IfElseDemo {
	public static void main(String[] args) {
	
		int time = 17; 
		
		if (time < 12) {
			System.out.println("Good Morning");
		}
		else if (time < 16) {
			System.out.println("Good Afrernoon");
		}
		else if (time < 20) {
			System.out.println("Good Evening");
		}
		else {
			System.out.println("Good Night");
		}
	}
}
