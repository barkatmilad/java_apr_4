package assignmentLoops;

import java.util.Scanner;

public class Ten170 {
	
	public static void main(String[] args) {
		System.out.println(" Please multiply 17 to 10 and write down the answer.");
		Scanner scanner = new Scanner(System.in);
		int multiply17to10 = scanner.nextInt();
		int multiply17to10INDB = 170;
		
		while( multiply17to10 != multiply17to10INDB) {
			System.out.println(" The answer is incorrect. Please write the correct answer.");
			multiply17to10 = scanner.nextInt();
		}
		System.out.println(" The answer is correct. best of luck buddy.");
	}
}
