package assignmentLoops;

import java.util.Scanner;

public class Four68 {
	public static void main(String[] args) {
		System.out.println(" Please multiply 17 * 4 and write the answer below");
		Scanner scanner = new Scanner(System.in);
		int Multiply4To17 = scanner.nextInt();
		int AnswerMultiply4to17 = 68;
		
		while (Multiply4To17 != AnswerMultiply4to17 ) {
			System.out.println(" The answer is incorrect. Please write the correct answer.");
			Multiply4To17 = scanner.nextInt();
		}
		System.out.println(" Yaaa, you found the correct answer. Good luck with the next step");
	}

}
