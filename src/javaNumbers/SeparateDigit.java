package javaNumbers;

public class SeparateDigit {
	
	public static void main(String[] args) 
	{
		int num = 1250;
		while (num>0)
		{
			System.out.println(num%10);
			num/=10;
		}
	}

}
