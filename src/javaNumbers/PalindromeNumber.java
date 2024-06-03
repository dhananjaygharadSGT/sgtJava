package javaNumbers;

import java.util.Scanner;

public class PalindromeNumber {
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Any Number: ");
		int num = scanner.nextInt();
		int copyNum = num;
		int reverse = 0;
		while (num>0)
		{
			int rem = num%10;
			reverse = (reverse*10)+rem;
			num/=10;
		}
		if (reverse==copyNum)
		{
			System.out.print(copyNum+" is a palindrome number.");
		}
		else
		{
			System.out.print(copyNum+" is not a palindrome number.");
		}
	}

}
