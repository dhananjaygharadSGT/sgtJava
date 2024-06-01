package OOPs.interfaceEx;

public class GroceryCustomer {
	
	public static void main(String[] args) {
		
		Grocery grocery = new GroceryApp();
		
		grocery.signup();
		System.out.println("========================");
		grocery.login();
		System.out.println("========================");
		grocery.cart();
		System.out.println("========================");
		grocery.purchase();
	}

}
