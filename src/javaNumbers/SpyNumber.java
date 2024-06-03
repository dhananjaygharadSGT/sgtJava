package javaNumbers;

import java.util.Scanner;

public class SpyNumber {
	
	// 1+2+3=6 && 1*2*3=6 ==> SPY NUMBER 
    // Sum of number equals to product of number -> spy number.
	
	public static void main(String[] args) 
	{
		System.out.println("Enter Number : ");
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int numCopy = num;
		int sum =0;
		int prod =1;

		while (num>0)
		{
			int rem = num%10;
			sum +=rem;
			prod *= rem;
			num/=10;
		}
		if (sum==prod)
		{
			System.out.println(numCopy+" is a spy number.");
		}
		else
		{
			System.out.println(numCopy+" is not a spy number.");
		}
	}

}
