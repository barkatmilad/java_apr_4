package assignmentLoops;

import java.util.Scanner;

public class Two34 {
	public static void main(String[] args) {
		System.out.println(" Please enter the number for muntiply");
		Scanner scanner = new Scanner(System.in);
		int SeventeenMultiplytwo = scanner.nextInt();
		int SeventeenMultiplytwoInDB = 34;
		
		
		
		while(SeventeenMultiplytwo != SeventeenMultiplytwoInDB) {
			System.out.println(" The answer is incorrect. Please write the correct answer");
			SeventeenMultiplytwo = scanner.nextInt();
		}	
			System.out.println(" Your answer is correct. Thank you");
	}

}
