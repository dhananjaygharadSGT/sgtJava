package javaPractice;

public class ParameterizedMethod {
	
	public static void add(int a, int b) {
		int sum = a+b;
		System.out.println(sum);
	}
	
	public static void sub(int x , int y) {
		int diff = x+y;
		System.out.println(diff);
	}
	
	public static void main(String[] args) {
		
		add(10,46);
		sub(37,17);
	}

}
