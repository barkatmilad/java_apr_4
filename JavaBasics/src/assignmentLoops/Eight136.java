package assignmentLoops;

import java.util.Scanner;

public class Eight136 {
	
	public static void main(String[] args) {
		System.out.println(" Please multiply 17 to 8 and write down the answer.");
		Scanner scanner = new Scanner(System.in);
		int multiply17to8 = scanner.nextInt();
		int multiply17to8INDB = 136;
		
		while( multiply17to8 != multiply17to8INDB) {
			System.out.println(" The answer is incorrect. Please write the correct answer.");
			multiply17to8 = scanner.nextInt();
		}
		System.out.println(" The answer is correct. best of luck buddy.");
	}
}
