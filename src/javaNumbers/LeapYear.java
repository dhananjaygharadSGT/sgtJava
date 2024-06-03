package javaNumbers;

import java.util.Scanner;

public class LeapYear {
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter year to check wheather it is leap year or not: ");
		int year = scanner.nextInt();
		String res = (year%4==0 || year%400==2)?year+" is a leap year.":year+" is not a leap year.";
		System.out.println(res);
	}

}
