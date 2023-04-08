package assignmentLoops;

import java.util.Scanner;

public class Six102 {
	public static void main(String[] args) {
		System.out.println(" Please multiply 17 to 6 and write down the answer.");
		Scanner scanner = new Scanner(System.in);
		int multiply17to6 = scanner.nextInt();
		int multiply17to6InDB = 102;
		
		while(multiply17to6 != multiply17to6InDB) {
			System.out.println(" The answer is incorrect. Please try agian.");
			multiply17to6 = scanner.nextInt();
		}
		System.out.println(" Excellent. The answer is correct.");
		
	}

}
