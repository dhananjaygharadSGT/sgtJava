package OOPs.interfaceEx;

public class GroceryApp implements Grocery{

	@Override
	public void signup() {
		System.out.println("Signup successful!");
		
	}

	@Override
	public void login() {
		System.out.println("Logged-in successful!");
		
	}

	@Override
	public void cart() {
		System.out.println("Products added to cart.");
		
	}

	@Override
	public void purchase() {
		System.out.println("Bill generated!");
	}
	
	

}
