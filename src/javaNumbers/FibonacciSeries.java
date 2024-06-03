package javaNumbers;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your input: ");
		int nth = scanner.nextInt();
		int n1 = 0;
		int n2 = 1 ;
		int n3 = 0;
		System.out.print(n1+", "+n2);
		for (int i = 1; i < nth; i++)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(", "+n3);
		}
	}

}
