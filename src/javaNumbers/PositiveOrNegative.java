package javaNumbers;

import java.util.Scanner;

public class PositiveOrNegative {
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = scanner.nextInt();
		String res = (num >= 0)?num+" is a positive number.":num+" is a negative number.";
		System.out.println(res);
	}

}
