package javaNumbers;

import java.util.Scanner;

public class AddDiff {
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number 1: ");
		int num1 = scanner.nextInt();
		System.out.println("Enter Number 2: ");
		int num2 = scanner.nextInt();
		int addition = num1+num2;
		int difference = (num1>=num2)?num1-num2:num2-num1;
		System.out.println((num1%2==0 && num2%2==0)?"Addition is: "+addition:"Differene is: "+difference);
	}

}
