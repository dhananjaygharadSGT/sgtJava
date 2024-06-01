package OOPs.abstraction;

public class CalciDriver {
	
	public static void main(String[] args) {
		
		AbsCalci absCalci = new Calci();
		int a = 24;
		int b = 30;
		int c = 10;
		int d = 9;
		
		absCalci.add(a, b);
		absCalci.add(a, b, c);
		absCalci.add(a, b, c, d);
		
	}
}
