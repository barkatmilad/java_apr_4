package arrays;

import java.util.Scanner;

public class WhileLoops2 {
	
	public static void main(String[] args) {
		System.out.println(" Please enter your username: ");
		Scanner scanner = new Scanner(System.in);
		int PINenteredByUser = scanner.nextInt();
		int PINinDataBase = 12345;
		
		while (PINenteredByUser != PINinDataBase) {
			System.out.println(" Theyou intered is incorret. please try again");
			PINenteredByUser = scanner.nextInt();
			
		}
		System.out.println(" Welcome to your account");
	}

}
