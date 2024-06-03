package javaNumbers;

public class CountOfNumWith0 {
	
	public static void main(String[] args) 
	{
		int s = 1;
		int e = 1000;
		int count = 0;
		while (s <= e)
		{
			if (s %10 == 0)
			{
				System.out.println(s);
				count++;
			}
			s++;
		}
		System.out.println("Count of the numbers which has atleast one 0 in it: "+count);
	}

}
