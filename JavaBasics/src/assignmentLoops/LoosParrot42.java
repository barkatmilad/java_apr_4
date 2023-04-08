package assignmentLoops;

import java.util.Scanner;

public class LoosParrot42 {
	public static void main(String[] args) {
		System.out.println(" Ask a user to type somethig on the console");
		Scanner scanner = new Scanner(System.in);
		String stop = scanner.nextLine();
		
		while(! stop.equals("Do not move")) {
			System.out.println(stop);
			System.out.println(" keep typing");
			stop = scanner.nextLine();
		}
		
		
	}
}
