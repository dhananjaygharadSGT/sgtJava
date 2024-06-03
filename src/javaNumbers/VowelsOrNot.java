package javaNumbers;

import java.util.Scanner;

public class VowelsOrNot {
	
	public static void main(String[] args) 
	{
		System.out.println("Enter the alphabet : ");
		
		Scanner scanner = new Scanner(System.in);
		
		char ch = scanner.next().charAt(0);
		ch= (ch>='A' && ch<='Z')?(char)(ch+32):ch;
		System.out.println((ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')?"Vovel":"Not a vowel");
	}

}
