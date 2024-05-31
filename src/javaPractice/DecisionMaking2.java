package javaPractice;

import java.util.Scanner;

public class DecisionMaking2 {
	
	public static void main(String[] args) {
		
		System.out.println("Enter marks obtained : ");
		
		Scanner scanner = new Scanner(System.in);

		int marks = scanner.nextInt();
		
		//int marks = 80;
		
		//else-if statement
		
		if (marks >= 90 && marks <= 100) {
			
			System.out.println("A+ grade");
			
		}
		else if (marks < 90 && marks > 70) {
			
			System.out.println("A grade");
			
		}
		else if (marks <= 70 && marks > 50) {
			
			System.out.println("B grade");
			
		}
		else if (marks <= 50 && marks >= 35) {
			
			System.out.println("C grade");
			
		}else {
			System.out.println("Fail");

		}
	}

}
