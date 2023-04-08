package assignmentLoops;

import java.util.Scanner;

public class Three51 {
	
	public static void main(String[] args) {
		
		System.out.println(" Please multiply 2 * 17 and write down the answer ");
		Scanner scanner = new Scanner(System.in);
		int TwoMultiply17 = scanner.nextInt();
		int Answer2Multiply17 = 51;
		
		while(TwoMultiply17 !=Answer2Multiply17) {
			System.out.println(" The answer is incorrect. Please multiply correctly");
			TwoMultiply17 = scanner.nextInt();
		}
		System.out.println(" The answer is correct. good luck with next step");
		
	}

}
