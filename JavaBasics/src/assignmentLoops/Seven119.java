package assignmentLoops;

import java.util.Scanner;

public class Seven119 {
	public static void main(String[] args) {
		System.out.println(" Please multiply 17 to 7 and write down the answer.");
		Scanner scanner = new Scanner(System.in);
		int multiply17to7 = scanner.nextInt();
		int multiply17to7INDB = 119;
		
		while( multiply17to7 != multiply17to7INDB) {
			System.out.println(" The answer is incorrect. Please write the correct answer.");
			multiply17to7 = scanner.nextInt();
		}
		System.out.println(" The answer is correct. best of luck buddy.");
	}

}
