package assignmentLoops;

import java.util.Scanner;

public class White11 {
	
	public static void main(String[] args) {
		System.out.println(" Please type a new word");
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		String Word = "quit";
		
		while (word != Word) {
			System.out.println(word);
			System.err.println(" Please type a new word");
			word = scanner.nextLine();
		}
	}

}
