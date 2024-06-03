package javaNumbers;

public class CountOfDigit {
	
	public static void main(String[] args) 
	{
		int num = 125;
		int count= 0;
		while (num > 0)
		{
			count++;
			num /= 10;
		}
		System.out.println(count);
	}

}
