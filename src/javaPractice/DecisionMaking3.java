package javaPractice;

import java.util.Scanner;

public class DecisionMaking3 {
	
	public static void main(String[] args) {
		
		// Switch Statement 
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter 1st value : ");
		int value1 = scanner.nextInt();
		
		char operator = '+';
		
		System.out.println("Enter 2nd value : ");
		int value2 = scanner.nextInt();
		
		switch (operator) {
		case '+':
			System.out.println("Addition : "+ (value1+value2));
			break;
			
		case '-':
			System.out.println("Subtraction : "+ (value1+value2));
			break;
			
		case '*':
			System.out.println("Multiplication : "+ (value1+value2));
			break;
			
		case '/':
			System.out.println("Division : "+ (value1+value2));
			break;
			
		case '%':
			System.out.println("Modulus : "+ (value1+value2));
			break;

		default:
			System.out.println("Invalid operator!");
		}
	}

}
