package assignmentLoops;

import java.util.Scanner;

public class Nine153 {
	public static void main(String[] args) {
		System.out.println(" Please multiply 17 to 9 and write down the answer.");
		Scanner scanner = new Scanner(System.in);
		int multiply17to9 = scanner.nextInt();
		int multiply17to9INDB = 153;
		
		while( multiply17to9 != multiply17to9INDB) {
			System.out.println(" The answer is incorrect. Please write the correct answer.");
			multiply17to9 = scanner.nextInt();
		}
		System.out.println(" The answer is correct. best of luck buddy.");
	}
}
