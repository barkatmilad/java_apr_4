package assignmentLoops;

import java.util.Scanner;

public class Five85 {
	public static void main(String[] args) {
		System.out.println(" Please multiply 17 to 5 and write down the answer");
		Scanner scanner = new Scanner(System.in);
		int multiply17IsEqualTo = scanner.nextInt();
		int multiply17InDB = 85;
		
		while (multiply17IsEqualTo != multiply17InDB) {
			System.out.println(" The answer is incorrect. Please try agian");
			multiply17IsEqualTo = scanner.nextInt();
			
		}
		System.out.println(" The answer is correct. Good luck with next step.");
		
	}

}
