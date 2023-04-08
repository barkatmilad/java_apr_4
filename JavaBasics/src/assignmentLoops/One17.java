package assignmentLoops;

import java.util.Scanner;

public class One17 {
	
	public static void main(String[] args) {
		System.out.println(" Please enter the number for muntiply");
		Scanner scanner = new Scanner(System.in);
		int SeventeenMultiplyOne = scanner.nextInt();
		int SeventeenMultiplyOneInDB = 17;
		
		
		
		while(SeventeenMultiplyOne != SeventeenMultiplyOneInDB) {
			System.out.println(" The answer is incorrect. Please write the correct answer");
			SeventeenMultiplyOne = scanner.nextInt();
		}	
			System.out.println(" Your answer is correct. Thank you");
	}

}
