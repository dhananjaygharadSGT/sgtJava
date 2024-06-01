package OOPs.abstraction;

public class Calci extends  AbsCalci{

	@Override
	public void add(int a, int b) {
		int res = a+b;
		System.out.println(res);
		
	}

	@Override
	public void add(int a, int b, int c) {
		int res = a+b+c;
		System.out.println(res);
		
	}

	@Override
	public void add(int a, int b, int c, int d) {
		int res = a+b+c+d;
		System.out.println(res);
		
	}

}
