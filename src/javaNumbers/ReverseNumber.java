package javaNumbers;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = scanner.nextInt();
		
		int rev =0;

			while (num>0)
		    {
		    	int rem = num%10;
		    	rev = (rev*10)+rem;
		    	num/=10;
		    }
		    System.out.print(rev);
			
	}

}
