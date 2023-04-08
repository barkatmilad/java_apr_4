package exceptionHandling;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	try {
		System.out.println(" Tell the user to enter the number");
		int num1 = scanner.nextInt();
		
		System.out.println(" Please tell the user to enter another number");
		int num2 = scanner.nextInt();
		
		System.out.println(" Show us the division of the number entered by the user = " +  ( num1/num2));
	}
	catch(Exception e) {
		System.out.println(" please inter valid number");
	}
	}

}
