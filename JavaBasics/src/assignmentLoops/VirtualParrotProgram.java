package assignmentLoops;

import java.util.Scanner;

public class VirtualParrotProgram {
	public static void main(String[] args) {
		System.out.println(" Ask a user to type something on the console");
		
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		
		while (! word.equals("quit")) {
			System.out.println(word);
			System.out.println(" Please type a new words");
			word = scanner.nextLine();
		}
		
		
		
	}

}
